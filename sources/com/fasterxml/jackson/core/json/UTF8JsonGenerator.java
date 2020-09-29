package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.spotify.mobile.android.core.internal.AudioDriver;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class UTF8JsonGenerator extends JsonGeneratorImpl {
    private static final byte[] FALSE_BYTES = {102, 97, 108, 115, 101};
    private static final byte[] HEX_CHARS = CharTypes.copyHexBytes();
    private static final byte[] NULL_BYTES = {110, 117, 108, 108};
    private static final byte[] TRUE_BYTES = {116, 114, 117, 101};
    protected boolean _bufferRecyclable;
    protected char[] _charBuffer;
    protected final int _charBufferLength;
    protected byte[] _outputBuffer;
    protected final int _outputEnd;
    protected final int _outputMaxContiguous;
    protected final OutputStream _outputStream;
    protected int _outputTail;
    protected byte _quoteChar = 34;

    public UTF8JsonGenerator(IOContext iOContext, int i, ObjectCodec objectCodec, OutputStream outputStream) {
        super(iOContext, i, objectCodec);
        this._outputStream = outputStream;
        this._bufferRecyclable = true;
        this._outputBuffer = iOContext.allocWriteEncodingBuffer();
        this._outputEnd = this._outputBuffer.length;
        this._outputMaxContiguous = this._outputEnd >> 3;
        this._charBuffer = iOContext.allocConcatBuffer();
        this._charBufferLength = this._charBuffer.length;
        if (isEnabled(Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    private final int _handleLongCustomEscape(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int length = bArr2.length;
        if (i + length > i2) {
            this._outputTail = i;
            _flushBuffer();
            int i4 = this._outputTail;
            if (length > bArr.length) {
                this._outputStream.write(bArr2, 0, length);
                return i4;
            }
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i = i4 + length;
        }
        if ((i3 * 6) + i <= i2) {
            return i;
        }
        _flushBuffer();
        return this._outputTail;
    }

    private final int _outputMultiByteChar(int i, int i2) {
        byte[] bArr = this._outputBuffer;
        if (i < 55296 || i > 57343) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | 224);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i & 63) | 128);
            return i5;
        }
        int i6 = i2 + 1;
        bArr[i2] = 92;
        int i7 = i6 + 1;
        bArr[i6] = 117;
        int i8 = i7 + 1;
        byte[] bArr2 = HEX_CHARS;
        bArr[i7] = bArr2[(i >> 12) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i >> 8) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[(i >> 4) & 15];
        int i11 = i10 + 1;
        bArr[i10] = bArr2[i & 15];
        return i11;
    }

    private final int _outputRawMultiByteChar(int i, char[] cArr, int i2, int i3) {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this._outputBuffer;
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            bArr[i4] = (byte) ((i >> 12) | 224);
            int i5 = this._outputTail;
            this._outputTail = i5 + 1;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            int i6 = this._outputTail;
            this._outputTail = i6 + 1;
            bArr[i6] = (byte) ((i & 63) | 128);
            return i2;
        }
        if (i2 >= i3 || cArr == null) {
            _reportError(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", new Object[]{Integer.valueOf(i)}));
        }
        _outputSurrogates(i, cArr[i2]);
        return i2 + 1;
    }

    private final int _readMore(InputStream inputStream, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 + 1;
            int i6 = i + 1;
            bArr[i4] = bArr[i];
            i4 = i5;
            i = i6;
        }
        int min = Math.min(i3, bArr.length);
        do {
            int i7 = min - i4;
            if (i7 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i4, i7);
            if (read < 0) {
                return i4;
            }
            i4 += read;
        } while (i4 < 3);
        return i4;
    }

    private final void _writeBytes(byte[] bArr) {
        int length = bArr.length;
        if (this._outputTail + length > this._outputEnd) {
            _flushBuffer();
            if (length > 512) {
                this._outputStream.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    private final int _writeCustomEscape(byte[] bArr, int i, SerializableString serializableString, int i2) {
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        int length = asUnquotedUTF8.length;
        if (length > 6) {
            return _handleLongCustomEscape(bArr, i, this._outputEnd, asUnquotedUTF8, i2);
        }
        System.arraycopy(asUnquotedUTF8, 0, bArr, i, length);
        return i + length;
    }

    private final void _writeCustomStringSegment2(String str, int i, int i2) {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar <= 0 ? AudioDriver.SPOTIFY_MAX_VOLUME : this._maximumNonEscapedChar;
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i < i2) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[charAt];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else if (i7 == -2) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(charAt);
                        if (escapeSequence == null) {
                            StringBuilder sb = new StringBuilder("Invalid custom escape definitions; custom escape not found for character code 0x");
                            sb.append(Integer.toHexString(charAt));
                            sb.append(", although was supposed to have one");
                            _reportError(sb.toString());
                        }
                        i3 = _writeCustomEscape(bArr, i3, escapeSequence, i2 - i5);
                    } else {
                        i3 = _writeGenericEscape(charAt, i3);
                    }
                }
            } else if (charAt > i4) {
                i3 = _writeGenericEscape(charAt, i3);
            } else {
                SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(charAt);
                if (escapeSequence2 != null) {
                    i3 = _writeCustomEscape(bArr, i3, escapeSequence2, i2 - i5);
                } else if (charAt <= 2047) {
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((charAt >> 6) | 192);
                    i3 = i9 + 1;
                    bArr[i9] = (byte) ((charAt & '?') | 128);
                } else {
                    i3 = _outputMultiByteChar(charAt, i3);
                }
            }
            i = i5;
        }
        this._outputTail = i3;
    }

    private final void _writeCustomStringSegment2(char[] cArr, int i, int i2) {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar <= 0 ? AudioDriver.SPOTIFY_MAX_VOLUME : this._maximumNonEscapedChar;
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[c];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else if (i7 == -2) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c);
                        if (escapeSequence == null) {
                            StringBuilder sb = new StringBuilder("Invalid custom escape definitions; custom escape not found for character code 0x");
                            sb.append(Integer.toHexString(c));
                            sb.append(", although was supposed to have one");
                            _reportError(sb.toString());
                        }
                        i3 = _writeCustomEscape(bArr, i3, escapeSequence, i2 - i5);
                    } else {
                        i3 = _writeGenericEscape(c, i3);
                    }
                }
            } else if (c > i4) {
                i3 = _writeGenericEscape(c, i3);
            } else {
                SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(c);
                if (escapeSequence2 != null) {
                    i3 = _writeCustomEscape(bArr, i3, escapeSequence2, i2 - i5);
                } else if (c <= 2047) {
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((c >> 6) | 192);
                    i3 = i9 + 1;
                    bArr[i9] = (byte) ((c & '?') | 128);
                } else {
                    i3 = _outputMultiByteChar(c, i3);
                }
            }
            i = i5;
        }
        this._outputTail = i3;
    }

    private int _writeGenericEscape(int i, int i2) {
        int i3;
        byte[] bArr = this._outputBuffer;
        int i4 = i2 + 1;
        bArr[i2] = 92;
        int i5 = i4 + 1;
        bArr[i4] = 117;
        if (i > 255) {
            int i6 = 255 & (i >> 8);
            int i7 = i5 + 1;
            byte[] bArr2 = HEX_CHARS;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= 255;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = 48;
            i3 = i8 + 1;
            bArr[i8] = 48;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = HEX_CHARS;
        bArr[i3] = bArr3[i >> 4];
        int i10 = i9 + 1;
        bArr[i9] = bArr3[i & 15];
        return i10;
    }

    private final void _writeNull() {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(NULL_BYTES, 0, this._outputBuffer, this._outputTail, 4);
        this._outputTail += 4;
    }

    private final void _writeQuotedInt(int i) {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = this._quoteChar;
        this._outputTail = NumberOutput.outputInt(i, bArr, this._outputTail);
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
    }

    private final void _writeQuotedLong(long j) {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = this._quoteChar;
        this._outputTail = NumberOutput.outputLong(j, bArr, this._outputTail);
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
    }

    private final void _writeQuotedRaw(String str) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
    }

    private final void _writeQuotedShort(short s) {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = this._quoteChar;
        this._outputTail = NumberOutput.outputInt((int) s, bArr, this._outputTail);
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r0 = r6 + 1;
        r6 = r5[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r6 >= 2048) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r1 = r4._outputBuffer;
        r2 = r4._outputTail;
        r4._outputTail = r2 + 1;
        r1[r2] = (byte) ((r6 >> 6) | 192);
        r2 = r4._outputTail;
        r4._outputTail = r2 + 1;
        r1[r2] = (byte) ((r6 & '?') | 128);
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        r6 = _outputRawMultiByteChar(r6, r5, r0, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _writeRawSegment(char[] r5, int r6, int r7) {
        /*
            r4 = this;
        L_0x0000:
            if (r6 >= r7) goto L_0x0043
        L_0x0002:
            char r0 = r5[r6]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L_0x0018
            byte[] r1 = r4._outputBuffer
            int r2 = r4._outputTail
            int r3 = r2 + 1
            r4._outputTail = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r6 = r6 + 1
            if (r6 >= r7) goto L_0x0043
            goto L_0x0002
        L_0x0018:
            int r0 = r6 + 1
            char r6 = r5[r6]
            r1 = 2048(0x800, float:2.87E-42)
            if (r6 >= r1) goto L_0x003e
            byte[] r1 = r4._outputBuffer
            int r2 = r4._outputTail
            int r3 = r2 + 1
            r4._outputTail = r3
            int r3 = r6 >> 6
            r3 = r3 | 192(0xc0, float:2.69E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r4._outputTail
            int r3 = r2 + 1
            r4._outputTail = r3
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r1[r2] = r6
            r6 = r0
            goto L_0x0000
        L_0x003e:
            int r6 = r4._outputRawMultiByteChar(r6, r5, r0, r7)
            goto L_0x0000
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeRawSegment(char[], int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if ((r6._outputTail + 3) < r6._outputEnd) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        _flushBuffer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r2 = r8 + 1;
        r8 = r7[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r8 >= 2048) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r4 = r6._outputTail;
        r6._outputTail = r4 + 1;
        r1[r4] = (byte) ((r8 >> 6) | 192);
        r4 = r6._outputTail;
        r6._outputTail = r4 + 1;
        r1[r4] = (byte) ((r8 & '?') | 128);
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r8 = _outputRawMultiByteChar(r8, r7, r2, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void _writeSegmentedRaw(char[] r7, int r8, int r9) {
        /*
            r6 = this;
            int r0 = r6._outputEnd
            byte[] r1 = r6._outputBuffer
            int r9 = r9 + r8
        L_0x0005:
            if (r8 >= r9) goto L_0x0055
        L_0x0007:
            char r2 = r7[r8]
            r3 = 128(0x80, float:1.794E-43)
            if (r2 >= r3) goto L_0x0022
            int r3 = r6._outputTail
            if (r3 < r0) goto L_0x0014
            r6._flushBuffer()
        L_0x0014:
            int r3 = r6._outputTail
            int r4 = r3 + 1
            r6._outputTail = r4
            byte r2 = (byte) r2
            r1[r3] = r2
            int r8 = r8 + 1
            if (r8 >= r9) goto L_0x0055
            goto L_0x0007
        L_0x0022:
            int r2 = r6._outputTail
            int r2 = r2 + 3
            int r4 = r6._outputEnd
            if (r2 < r4) goto L_0x002d
            r6._flushBuffer()
        L_0x002d:
            int r2 = r8 + 1
            char r8 = r7[r8]
            r4 = 2048(0x800, float:2.87E-42)
            if (r8 >= r4) goto L_0x0050
            int r4 = r6._outputTail
            int r5 = r4 + 1
            r6._outputTail = r5
            int r5 = r8 >> 6
            r5 = r5 | 192(0xc0, float:2.69E-43)
            byte r5 = (byte) r5
            r1[r4] = r5
            int r4 = r6._outputTail
            int r5 = r4 + 1
            r6._outputTail = r5
            r8 = r8 & 63
            r8 = r8 | r3
            byte r8 = (byte) r8
            r1[r4] = r8
            r8 = r2
            goto L_0x0005
        L_0x0050:
            int r8 = r6._outputRawMultiByteChar(r8, r7, r2, r9)
            goto L_0x0005
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeSegmentedRaw(char[], int, int):void");
    }

    private final void _writeStringSegment(String str, int i, int i2) {
        int i3 = i2 + i;
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i3) {
            char charAt = str.charAt(i);
            if (charAt > 127 || iArr[charAt] != 0) {
                break;
            }
            int i5 = i4 + 1;
            bArr[i4] = (byte) charAt;
            i++;
            i4 = i5;
        }
        this._outputTail = i4;
        if (i < i3) {
            if (this._characterEscapes != null) {
                _writeCustomStringSegment2(str, i, i3);
            } else if (this._maximumNonEscapedChar == 0) {
                _writeStringSegment2(str, i, i3);
            } else {
                _writeStringSegmentASCII2(str, i, i3);
            }
        }
    }

    private final void _writeStringSegment(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i3) {
            char c = cArr[i];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            int i5 = i4 + 1;
            bArr[i4] = (byte) c;
            i++;
            i4 = i5;
        }
        this._outputTail = i4;
        if (i < i3) {
            if (this._characterEscapes != null) {
                _writeCustomStringSegment2(cArr, i, i3);
            } else if (this._maximumNonEscapedChar == 0) {
                _writeStringSegment2(cArr, i, i3);
            } else {
                _writeStringSegmentASCII2(cArr, i, i3);
            }
        }
    }

    private final void _writeStringSegment2(String str, int i, int i2) {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    int i5 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    i = i4;
                    i3 = i5;
                } else {
                    int i6 = iArr[charAt];
                    if (i6 > 0) {
                        int i7 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i7 + 1;
                        bArr[i7] = (byte) i6;
                    } else {
                        i3 = _writeGenericEscape(charAt, i3);
                    }
                }
            } else if (charAt <= 2047) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 = i8 + 1;
                bArr[i8] = (byte) ((charAt & '?') | 128);
            } else {
                i3 = _outputMultiByteChar(charAt, i3);
            }
            i = i4;
        }
        this._outputTail = i3;
    }

    private final void _writeStringSegment2(char[] cArr, int i, int i2) {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i2) {
            int i4 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    int i5 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i4;
                    i3 = i5;
                } else {
                    int i6 = iArr[c];
                    if (i6 > 0) {
                        int i7 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i7 + 1;
                        bArr[i7] = (byte) i6;
                    } else {
                        i3 = _writeGenericEscape(c, i3);
                    }
                }
            } else if (c <= 2047) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i8 + 1;
                bArr[i8] = (byte) ((c & '?') | 128);
            } else {
                i3 = _outputMultiByteChar(c, i3);
            }
            i = i4;
        }
        this._outputTail = i3;
    }

    private final void _writeStringSegmentASCII2(String str, int i, int i2) {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        while (i < i2) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[charAt];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else {
                        i3 = _writeGenericEscape(charAt, i3);
                    }
                }
            } else if (charAt > i4) {
                i3 = _writeGenericEscape(charAt, i3);
            } else if (charAt <= 2047) {
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 = i9 + 1;
                bArr[i9] = (byte) ((charAt & '?') | 128);
            } else {
                i3 = _outputMultiByteChar(charAt, i3);
            }
            i = i5;
        }
        this._outputTail = i3;
    }

    private final void _writeStringSegmentASCII2(char[] cArr, int i, int i2) {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[c];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else {
                        i3 = _writeGenericEscape(c, i3);
                    }
                }
            } else if (c > i4) {
                i3 = _writeGenericEscape(c, i3);
            } else if (c <= 2047) {
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i9 + 1;
                bArr[i9] = (byte) ((c & '?') | 128);
            } else {
                i3 = _outputMultiByteChar(c, i3);
            }
            i = i5;
        }
        this._outputTail = i3;
    }

    private final void _writeStringSegments(String str, int i, int i2) {
        do {
            int min = Math.min(this._outputMaxContiguous, i2);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private final void _writeStringSegments(String str, boolean z) {
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = this._quoteChar;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int min = Math.min(this._outputMaxContiguous, length);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i2, min);
            i2 += min;
            length -= min;
        }
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr2[i3] = this._quoteChar;
        }
    }

    private final void _writeStringSegments(char[] cArr, int i, int i2) {
        do {
            int min = Math.min(this._outputMaxContiguous, i2);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private final void _writeUnq(SerializableString serializableString) {
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
    }

    /* access modifiers changed from: protected */
    public final void _flushBuffer() {
        int i = this._outputTail;
        if (i > 0) {
            this._outputTail = 0;
            this._outputStream.write(this._outputBuffer, 0, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void _outputSurrogates(int i, int i2) {
        int _decodeSurrogate = _decodeSurrogate(i, i2);
        if (this._outputTail + 4 > this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) ((_decodeSurrogate >> 18) | 240);
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr[i4] = (byte) (((_decodeSurrogate >> 12) & 63) | 128);
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr[i5] = (byte) (((_decodeSurrogate >> 6) & 63) | 128);
        int i6 = this._outputTail;
        this._outputTail = i6 + 1;
        bArr[i6] = (byte) ((_decodeSurrogate & 63) | 128);
    }

    public void _releaseBuffers() {
        byte[] bArr = this._outputBuffer;
        if (bArr != null && this._bufferRecyclable) {
            this._outputBuffer = null;
            this._ioContext.releaseWriteEncodingBuffer(bArr);
        }
        char[] cArr = this._charBuffer;
        if (cArr != null) {
            this._charBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    public final void _verifyValueWrite(String str) {
        byte b;
        int writeValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, writeValue);
            return;
        }
        if (writeValue == 1) {
            b = 44;
        } else if (writeValue == 2) {
            b = 58;
        } else if (writeValue == 3) {
            if (this._rootValueSeparator != null) {
                byte[] asUnquotedUTF8 = this._rootValueSeparator.asUnquotedUTF8();
                if (asUnquotedUTF8.length > 0) {
                    _writeBytes(asUnquotedUTF8);
                }
            }
            return;
        } else if (writeValue == 5) {
            _reportCantWriteValueExpectName(str);
            return;
        } else {
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = b;
    }

    /* access modifiers changed from: protected */
    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) {
        int _readMore;
        int i = this._outputEnd - 6;
        int i2 = -3;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 > i2) {
                _readMore = _readMore(inputStream, bArr, i4, i5, bArr.length);
                if (_readMore < 3) {
                    break;
                }
                i5 = _readMore;
                i2 = _readMore - 3;
                i4 = 0;
            }
            if (this._outputTail > i) {
                _flushBuffer();
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] << 8;
            int i8 = i6 + 1;
            i4 = i8 + 1;
            i3 += 3;
            this._outputTail = base64Variant.encodeBase64Chunk((int) (((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this._outputBuffer, this._outputTail);
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i9 = this._outputTail;
                this._outputTail = i9 + 1;
                bArr2[i9] = 92;
                int i10 = this._outputTail;
                this._outputTail = i10 + 1;
                bArr2[i10] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (_readMore <= 0) {
            return i3;
        }
        if (this._outputTail > i) {
            _flushBuffer();
        }
        int i11 = bArr[0] << 16;
        int i12 = 1;
        if (1 < _readMore) {
            i11 |= (bArr[1] & 255) << 8;
            i12 = 2;
        }
        int i13 = i3 + i12;
        this._outputTail = base64Variant.encodeBase64Partial(i11, i12, this._outputBuffer, this._outputTail);
        return i13;
    }

    /* access modifiers changed from: protected */
    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) {
        int i2 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i3 = -3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i <= 2) {
                break;
            }
            if (i4 > i3) {
                int _readMore = _readMore(inputStream, bArr, i4, i5, i);
                if (_readMore < 3) {
                    i5 = _readMore;
                    i4 = 0;
                    break;
                }
                i5 = _readMore;
                i3 = _readMore - 3;
                i4 = 0;
            }
            if (this._outputTail > i2) {
                _flushBuffer();
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] << 8;
            int i8 = i6 + 1;
            i4 = i8 + 1;
            i -= 3;
            this._outputTail = base64Variant.encodeBase64Chunk((int) (((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this._outputBuffer, this._outputTail);
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i9 = this._outputTail;
                this._outputTail = i9 + 1;
                bArr2[i9] = 92;
                int i10 = this._outputTail;
                this._outputTail = i10 + 1;
                bArr2[i10] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i <= 0) {
            return i;
        }
        int _readMore2 = _readMore(inputStream, bArr, i4, i5, i);
        if (_readMore2 <= 0) {
            return i;
        }
        if (this._outputTail > i2) {
            _flushBuffer();
        }
        int i11 = bArr[0] << 16;
        int i12 = 1;
        if (1 < _readMore2) {
            i11 |= (bArr[1] & 255) << 8;
            i12 = 2;
        }
        this._outputTail = base64Variant.encodeBase64Partial(i11, i12, this._outputBuffer, this._outputTail);
        return i - i12;
    }

    /* access modifiers changed from: protected */
    public final void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        int i3 = i2 - 3;
        int i4 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i <= i3) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            this._outputTail = base64Variant.encodeBase64Chunk((int) (((bArr[i] << 8) | (bArr[i5] & 255)) << 8) | (bArr[i6] & 255), this._outputBuffer, this._outputTail);
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i8 = this._outputTail;
                this._outputTail = i8 + 1;
                bArr2[i8] = 92;
                int i9 = this._outputTail;
                this._outputTail = i9 + 1;
                bArr2[i9] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i = i7;
        }
        int i10 = i2 - i;
        if (i10 > 0) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            int i11 = i + 1;
            int i12 = bArr[i] << 16;
            if (i10 == 2) {
                i12 |= (bArr[i11] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i12, i10, this._outputBuffer, this._outputTail);
        }
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(SerializableString serializableString) {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        boolean z = !this._cfgUnqNames;
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = this._quoteChar;
        }
        _writeBytes(serializableString.asQuotedUTF8());
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr2[i2] = this._quoteChar;
        }
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(String str) {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = this._quoteChar;
        str.getChars(0, length, this._charBuffer, 0);
        if (length <= this._outputMaxContiguous) {
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(this._charBuffer, 0, length);
        } else {
            _writeStringSegments(this._charBuffer, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
    }

    public void close() {
        super.close();
        if (this._outputBuffer != null && isEnabled(Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    }
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        this._outputTail = 0;
        if (this._outputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(Feature.AUTO_CLOSE_TARGET)) {
                this._outputStream.close();
            } else if (isEnabled(Feature.FLUSH_PASSED_TO_STREAM)) {
                this._outputStream.flush();
            }
        }
        _releaseBuffers();
    }

    public void flush() {
        _flushBuffer();
        if (this._outputStream != null && isEnabled(Feature.FLUSH_PASSED_TO_STREAM)) {
            this._outputStream.flush();
        }
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = this._quoteChar;
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        if (i < 0) {
            try {
                i = _writeBinary(base64Variant, inputStream, allocBase64Buffer);
            } catch (Throwable th) {
                this._ioContext.releaseBase64Buffer(allocBase64Buffer);
                throw th;
            }
        } else {
            int _writeBinary = _writeBinary(base64Variant, inputStream, allocBase64Buffer, i);
            if (_writeBinary > 0) {
                StringBuilder sb = new StringBuilder("Too few bytes available: missing ");
                sb.append(_writeBinary);
                sb.append(" bytes (out of ");
                sb.append(i);
                sb.append(")");
                _reportError(sb.toString());
            }
        }
        this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
        return i;
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i, i2 + i);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr3[i4] = this._quoteChar;
    }

    public void writeBoolean(boolean z) {
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = z ? TRUE_BYTES : FALSE_BYTES;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    public final void writeEndArray() {
        if (!this._writeContext.inArray()) {
            StringBuilder sb = new StringBuilder("Current context not Array but ");
            sb.append(this._writeContext.typeDesc());
            _reportError(sb.toString());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = 93;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    public final void writeEndObject() {
        if (!this._writeContext.inObject()) {
            StringBuilder sb = new StringBuilder("Current context not Object but ");
            sb.append(this._writeContext.typeDesc());
            _reportError(sb.toString());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = 125;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    public void writeFieldName(SerializableString serializableString) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = 44;
        }
        if (this._cfgUnqNames) {
            _writeUnq(serializableString);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr2, this._outputTail);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr3[i3] = this._quoteChar;
    }

    public void writeFieldName(String str) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = 44;
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
        if (length <= this._outputMaxContiguous) {
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, 0, length);
        } else {
            _writeStringSegments(str, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr3[i3] = this._quoteChar;
    }

    public void writeNull() {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    public void writeNumber(double d) {
        if (this._cfgNumbersAsStrings || ((Double.isNaN(d) || Double.isInfinite(d)) && Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            writeString(String.valueOf(d));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(d));
    }

    public void writeNumber(float f) {
        if (this._cfgNumbersAsStrings || ((Float.isNaN(f) || Float.isInfinite(f)) && Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            writeString(String.valueOf(f));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(f));
    }

    public void writeNumber(int i) {
        _verifyValueWrite("write a number");
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i);
        } else {
            this._outputTail = NumberOutput.outputInt(i, this._outputBuffer, this._outputTail);
        }
    }

    public void writeNumber(long j) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j, this._outputBuffer, this._outputTail);
    }

    public void writeNumber(String str) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    public void writeNumber(BigDecimal bigDecimal) {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    public void writeNumber(BigInteger bigInteger) {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    public void writeNumber(short s) {
        _verifyValueWrite("write a number");
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
        } else {
            this._outputTail = NumberOutput.outputInt((int) s, this._outputBuffer, this._outputTail);
        }
    }

    public void writeRaw(char c) {
        if (this._outputTail + 3 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        if (c <= 127) {
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 2048) {
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = (byte) ((c >> 6) | 192);
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr[i3] = (byte) ((c & '?') | 128);
        } else {
            _outputRawMultiByteChar(c, null, 0, 0);
        }
    }

    public void writeRaw(SerializableString serializableString) {
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            _writeBytes(asUnquotedUTF8);
        }
    }

    public void writeRaw(String str) {
        int length = str.length();
        char[] cArr = this._charBuffer;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            writeRaw(cArr, 0, length);
            return;
        }
        writeRaw(str, 0, length);
    }

    public void writeRaw(String str, int i, int i2) {
        char[] cArr = this._charBuffer;
        int length = cArr.length;
        if (i2 <= length) {
            str.getChars(i, i + i2, cArr, 0);
            writeRaw(cArr, 0, i2);
            return;
        }
        int i3 = this._outputEnd;
        int min = Math.min(length, (i3 >> 2) + (i3 >> 4));
        int i4 = min * 3;
        while (i2 > 0) {
            int min2 = Math.min(min, i2);
            str.getChars(i, i + min2, cArr, 0);
            if (this._outputTail + i4 > this._outputEnd) {
                _flushBuffer();
            }
            if (min2 > 1) {
                char c = cArr[min2 - 1];
                if (c >= 55296 && c <= 56319) {
                    min2--;
                }
            }
            _writeRawSegment(cArr, 0, min2);
            i += min2;
            i2 -= min2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = r6 + 1;
        r6 = r5[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r6 >= 2048) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r1 = r4._outputBuffer;
        r2 = r4._outputTail;
        r4._outputTail = r2 + 1;
        r1[r2] = (byte) ((r6 >> 6) | 192);
        r2 = r4._outputTail;
        r4._outputTail = r2 + 1;
        r1[r2] = (byte) ((r6 & '?') | 128);
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        r6 = _outputRawMultiByteChar(r6, r5, r0, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeRaw(char[] r5, int r6, int r7) {
        /*
            r4 = this;
            int r0 = r7 + r7
            int r0 = r0 + r7
            int r1 = r4._outputTail
            int r1 = r1 + r0
            int r2 = r4._outputEnd
            if (r1 <= r2) goto L_0x0013
            if (r2 >= r0) goto L_0x0010
            r4._writeSegmentedRaw(r5, r6, r7)
            return
        L_0x0010:
            r4._flushBuffer()
        L_0x0013:
            int r7 = r7 + r6
        L_0x0014:
            if (r6 >= r7) goto L_0x0057
        L_0x0016:
            char r0 = r5[r6]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L_0x002c
            byte[] r1 = r4._outputBuffer
            int r2 = r4._outputTail
            int r3 = r2 + 1
            r4._outputTail = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r6 = r6 + 1
            if (r6 >= r7) goto L_0x0057
            goto L_0x0016
        L_0x002c:
            int r0 = r6 + 1
            char r6 = r5[r6]
            r1 = 2048(0x800, float:2.87E-42)
            if (r6 >= r1) goto L_0x0052
            byte[] r1 = r4._outputBuffer
            int r2 = r4._outputTail
            int r3 = r2 + 1
            r4._outputTail = r3
            int r3 = r6 >> 6
            r3 = r3 | 192(0xc0, float:2.69E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r4._outputTail
            int r3 = r2 + 1
            r4._outputTail = r3
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r1[r2] = r6
            r6 = r0
            goto L_0x0014
        L_0x0052:
            int r6 = r4._outputRawMultiByteChar(r6, r5, r0, r7)
            goto L_0x0014
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(char[], int, int):void");
    }

    public void writeRawValue(SerializableString serializableString) {
        _verifyValueWrite("write a raw (unencoded) value");
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            _writeBytes(asUnquotedUTF8);
        }
    }

    public final void writeStartArray() {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = 91;
    }

    public final void writeStartObject() {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = 123;
    }

    public void writeStartObject(Object obj) {
        _verifyValueWrite("start an object");
        JsonWriteContext createChildObjectContext = this._writeContext.createChildObjectContext();
        this._writeContext = createChildObjectContext;
        if (obj != null) {
            createChildObjectContext.setCurrentValue(obj);
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = 123;
    }

    public final void writeString(SerializableString serializableString) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = this._quoteChar;
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr, this._outputTail);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
    }

    public void writeString(String str) {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        int length = str.length();
        if (length > this._outputMaxContiguous) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail + length >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = this._quoteChar;
        _writeStringSegment(str, 0, length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
    }

    public void writeString(char[] cArr, int i, int i2) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = this._quoteChar;
        if (i2 <= this._outputMaxContiguous) {
            if (this._outputTail + i2 > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i, i2);
        } else {
            _writeStringSegments(cArr, i, i2);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
    }
}
