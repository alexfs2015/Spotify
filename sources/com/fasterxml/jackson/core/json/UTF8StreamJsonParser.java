package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class UTF8StreamJsonParser extends ParserBase {
    protected static final int FEAT_MASK_TRAILING_COMMA = Feature.ALLOW_TRAILING_COMMA.getMask();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected boolean _bufferRecyclable;
    protected byte[] _inputBuffer;
    protected InputStream _inputStream;
    protected int _nameStartCol;
    protected int _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    private int _quad1;
    protected int[] _quadBuffer = new int[16];
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public UTF8StreamJsonParser(IOContext iOContext, int i, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i2, int i3, boolean z) {
        super(iOContext, i);
        this._inputStream = inputStream;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._currInputRowStart = i2;
        this._currInputProcessed = (long) (-i2);
        this._bufferRecyclable = z;
    }

    private final void _checkMatchEnd(String str, int i, int i2) {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i2))) {
            _reportInvalidToken(str.substring(0, i));
        }
    }

    private final void _closeArrayScope() {
        _updateLocation();
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final void _closeObjectScope() {
        _updateLocation();
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, ']');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final JsonToken _closeScope(int i) {
        if (i == 125) {
            _closeObjectScope();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this._currToken = jsonToken;
            return jsonToken;
        }
        _closeArrayScope();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final int _decodeUtf8_2(int i) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    private final int _decodeUtf8_3(int i) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        byte b2 = (i2 << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        byte b3 = bArr2[i4];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, this._inputPtr);
        }
        return (b2 << 6) | (b3 & 63);
    }

    private final int _decodeUtf8_3fast(int i) {
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        byte b2 = (i2 << 6) | (b & 63);
        byte[] bArr2 = this._inputBuffer;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        byte b3 = bArr2[i4];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, this._inputPtr);
        }
        return (b2 << 6) | (b3 & 63);
    }

    private final int _decodeUtf8_4(int i) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        byte b2 = ((i & 7) << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b3 = bArr2[i3];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, this._inputPtr);
        }
        byte b4 = (b2 << 6) | (b3 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        byte b5 = bArr3[i4];
        if ((b5 & 192) != 128) {
            _reportInvalidOther(b5 & 255, this._inputPtr);
        }
        return ((b4 << 6) | (b5 & 63)) - 65536;
    }

    private final void _finishString2(char[] cArr, int i) {
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i2 = this._inputPtr;
            }
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int min = Math.min(this._inputEnd, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= min) {
                    this._inputPtr = i2;
                    break;
                }
                int i3 = i2 + 1;
                int i4 = bArr[i2] & 255;
                if (iArr[i4] != 0) {
                    this._inputPtr = i3;
                    if (i4 != 34) {
                        int i5 = iArr[i4];
                        if (i5 == 1) {
                            i4 = _decodeEscaped();
                        } else if (i5 == 2) {
                            i4 = _decodeUtf8_2(i4);
                        } else if (i5 == 3) {
                            i4 = this._inputEnd - this._inputPtr >= 2 ? _decodeUtf8_3fast(i4) : _decodeUtf8_3(i4);
                        } else if (i5 == 4) {
                            int _decodeUtf8_4 = _decodeUtf8_4(i4);
                            int i6 = i + 1;
                            cArr[i] = (char) (55296 | (_decodeUtf8_4 >> 10));
                            if (i6 >= cArr.length) {
                                cArr = this._textBuffer.finishCurrentSegment();
                                i6 = 0;
                            }
                            i4 = (_decodeUtf8_4 & 1023) | 56320;
                            i = i6;
                        } else if (i4 < 32) {
                            _throwUnquotedSpace(i4, "string value");
                        } else {
                            _reportInvalidChar(i4);
                        }
                        if (i >= cArr.length) {
                            cArr = this._textBuffer.finishCurrentSegment();
                            i = 0;
                        }
                        int i7 = i + 1;
                        cArr[i] = (char) i4;
                        i = i7;
                    } else {
                        this._textBuffer.setCurrentLength(i);
                        return;
                    }
                } else {
                    int i8 = i + 1;
                    cArr[i] = (char) i4;
                    i2 = i3;
                    i = i8;
                }
            }
        }
    }

    private final void _matchToken2(String str, int i) {
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            this._inputPtr++;
            i++;
        } while (i < length);
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte b = this._inputBuffer[this._inputPtr] & 255;
            if (!(b < 48 || b == 93 || b == 125)) {
                _checkMatchEnd(str, i, b);
            }
        }
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i) {
        if (i == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        } else if (i == 45) {
            JsonToken _parseNegNumber = _parseNegNumber();
            this._currToken = _parseNegNumber;
            return _parseNegNumber;
        } else if (i == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        } else if (i == 102) {
            _matchFalse();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        } else if (i == 110) {
            _matchNull();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        } else if (i == 116) {
            _matchTrue();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        } else if (i != 123) {
            switch (i) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    JsonToken _parsePosNumber = _parsePosNumber(i);
                    this._currToken = _parsePosNumber;
                    return _parsePosNumber;
                default:
                    JsonToken _handleUnexpectedValue = _handleUnexpectedValue(i);
                    this._currToken = _handleUnexpectedValue;
                    return _handleUnexpectedValue;
            }
        } else {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
    }

    private static final int _padLastQuad(int i, int i2) {
        return i2 == 4 ? i : i | (-1 << (i2 << 3));
    }

    private final JsonToken _parseFloat(char[] cArr, int i, int i2, boolean z, int i3) {
        boolean z2;
        int i4;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i6 = i + 1;
            cArr[i] = (char) i2;
            i = i6;
            i4 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                i2 = bArr[i7] & 255;
                if (i2 < 48 || i2 > 57) {
                    z2 = false;
                } else {
                    i4++;
                    if (i >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        i = 0;
                    }
                    int i8 = i + 1;
                    cArr[i] = (char) i2;
                    i = i8;
                }
            }
            z2 = false;
            if (i4 == 0) {
                reportUnexpectedNumberChar(i2, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if (r12 == 101 || r12 == 69) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i9 = i + 1;
            cArr[i] = (char) r12;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            byte b = bArr2[i10] & 255;
            if (b == 45 || b == 43) {
                if (i9 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i9 = 0;
                }
                int i11 = i9 + 1;
                cArr[i9] = (char) b;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                b = bArr3[i12] & 255;
                i9 = i11;
            }
            r12 = b;
            char[] cArr2 = cArr;
            int i13 = 0;
            while (true) {
                if (r12 >= 48 && r12 <= 57) {
                    i13++;
                    if (i9 >= cArr2.length) {
                        cArr2 = this._textBuffer.finishCurrentSegment();
                        i9 = 0;
                    }
                    int i14 = i9 + 1;
                    cArr2[i9] = (char) r12;
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        i5 = i13;
                        r11 = i14;
                        z2 = true;
                        break;
                    }
                    byte[] bArr4 = this._inputBuffer;
                    int i15 = this._inputPtr;
                    this._inputPtr = i15 + 1;
                    r12 = bArr4[i15] & 255;
                    i9 = i14;
                } else {
                    i5 = i13;
                    r11 = i9;
                }
            }
            i5 = i13;
            r11 = i9;
            if (i5 == 0) {
                reportUnexpectedNumberChar(r12, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(r12);
            }
        }
        this._textBuffer.setCurrentLength(i);
        return resetFloat(z, i3, i4, i5);
    }

    private final JsonToken _parseNumber2(char[] cArr, int i, boolean z, int i2) {
        byte b;
        char[] cArr2 = cArr;
        int i3 = i;
        int i4 = i2;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                b = bArr[i5] & 255;
                if (b <= 57 && b >= 48) {
                    if (i3 >= cArr2.length) {
                        i3 = 0;
                        cArr2 = this._textBuffer.finishCurrentSegment();
                    }
                    int i6 = i3 + 1;
                    cArr2[i3] = (char) b;
                    i4++;
                    i3 = i6;
                }
            } else {
                this._textBuffer.setCurrentLength(i3);
                return resetInt(z, i4);
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return _parseFloat(cArr2, i3, b, z, i4);
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(i3);
        if (this._parsingContext.inRoot()) {
            byte[] bArr2 = this._inputBuffer;
            int i7 = this._inputPtr;
            this._inputPtr = i7 + 1;
            _verifyRootSpace(bArr2[i7] & 255);
        }
        return resetInt(z, i4);
    }

    private final void _skipCComment() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            byte b = bArr[i] & 255;
            int i2 = inputCodeComment[b];
            if (i2 != 0) {
                if (i2 == 2) {
                    _skipUtf8_2();
                } else if (i2 == 3) {
                    _skipUtf8_3();
                } else if (i2 == 4) {
                    _skipUtf8_4(b);
                } else if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 != 13) {
                    if (i2 == 42) {
                        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                            break;
                        } else if (this._inputBuffer[this._inputPtr] == 47) {
                            this._inputPtr++;
                            return;
                        }
                    } else {
                        _reportInvalidChar(b);
                    }
                } else {
                    _skipCR();
                }
            }
        }
        _reportInvalidEOF(" in a comment", null);
    }

    private final int _skipColon() {
        if (this._inputPtr + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        byte b = this._inputBuffer[this._inputPtr];
        if (b == 58) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr + 1;
            this._inputPtr = i;
            byte b2 = bArr[i];
            if (b2 <= 32) {
                if (b2 == 32 || b2 == 9) {
                    byte[] bArr2 = this._inputBuffer;
                    int i2 = this._inputPtr + 1;
                    this._inputPtr = i2;
                    byte b3 = bArr2[i2];
                    if (b3 > 32) {
                        if (b3 == 47 || b3 == 35) {
                            return _skipColon2(true);
                        }
                        this._inputPtr++;
                        return b3;
                    }
                }
                return _skipColon2(true);
            } else if (b2 == 47 || b2 == 35) {
                return _skipColon2(true);
            } else {
                this._inputPtr++;
                return b2;
            }
        } else {
            if (b == 32 || b == 9) {
                byte[] bArr3 = this._inputBuffer;
                int i3 = this._inputPtr + 1;
                this._inputPtr = i3;
                b = bArr3[i3];
            }
            if (b != 58) {
                return _skipColon2(false);
            }
            byte[] bArr4 = this._inputBuffer;
            int i4 = this._inputPtr + 1;
            this._inputPtr = i4;
            byte b4 = bArr4[i4];
            if (b4 <= 32) {
                if (b4 == 32 || b4 == 9) {
                    byte[] bArr5 = this._inputBuffer;
                    int i5 = this._inputPtr + 1;
                    this._inputPtr = i5;
                    byte b5 = bArr5[i5];
                    if (b5 > 32) {
                        if (b5 == 47 || b5 == 35) {
                            return _skipColon2(true);
                        }
                        this._inputPtr++;
                        return b5;
                    }
                }
                return _skipColon2(true);
            } else if (b4 == 47 || b4 == 35) {
                return _skipColon2(true);
            } else {
                this._inputPtr++;
                return b4;
            }
        }
    }

    private final int _skipColon2(boolean z) {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                byte b = bArr[i] & 255;
                if (b > 32) {
                    if (b == 47) {
                        _skipComment();
                    } else if (b != 35 || !_skipYAMLComment()) {
                        if (z) {
                            return b;
                        }
                        if (b != 58) {
                            _reportUnexpectedChar(b, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                    }
                } else if (b != 32) {
                    if (b == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (b == 13) {
                        _skipCR();
                    } else if (b != 9) {
                        _throwInvalidSpace(b);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder(" within/between ");
                sb.append(this._parsingContext.typeDesc());
                sb.append(" entries");
                _reportInvalidEOF(sb.toString(), null);
                return -1;
            }
        }
    }

    private final void _skipComment() {
        if (!isEnabled(Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i] & 255;
        if (b == 47) {
            _skipLine();
        } else if (b == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(b, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipLine() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                byte b = bArr[i] & 255;
                int i2 = inputCodeComment[b];
                if (i2 != 0) {
                    if (i2 == 2) {
                        _skipUtf8_2();
                    } else if (i2 == 3) {
                        _skipUtf8_3();
                    } else if (i2 == 4) {
                        _skipUtf8_4(b);
                    } else if (i2 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                        return;
                    } else if (i2 == 13) {
                        _skipCR();
                        return;
                    } else if (i2 != 42 && i2 < 0) {
                        _reportInvalidChar(b);
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void _skipUtf8_2() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
    }

    private final void _skipUtf8_3() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b2 = bArr2[i2];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, this._inputPtr);
        }
    }

    private final void _skipUtf8_4(int i) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        byte b3 = bArr3[i4];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, this._inputPtr);
        }
    }

    private final int _skipWS() {
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            byte b = bArr[i] & 255;
            if (b > 32) {
                if (b != 47 && b != 35) {
                    return b;
                }
                this._inputPtr--;
                return _skipWS2();
            } else if (b != 32) {
                if (b == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (b == 13) {
                    _skipCR();
                } else if (b != 9) {
                    _throwInvalidSpace(b);
                }
            }
        }
        return _skipWS2();
    }

    private final int _skipWS2() {
        byte b;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                b = bArr[i] & 255;
                if (b > 32) {
                    if (b == 47) {
                        _skipComment();
                    } else if (b != 35 || !_skipYAMLComment()) {
                        return b;
                    }
                } else if (b != 32) {
                    if (b == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (b == 13) {
                        _skipCR();
                    } else if (b != 9) {
                        _throwInvalidSpace(b);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder("Unexpected end-of-input within/between ");
                sb.append(this._parsingContext.typeDesc());
                sb.append(" entries");
                throw _constructError(sb.toString());
            }
        }
        return b;
    }

    private final int _skipWSOrEnd() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i] & 255;
        if (b <= 32) {
            if (b != 32) {
                if (b == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (b == 13) {
                    _skipCR();
                } else if (b != 9) {
                    _throwInvalidSpace(b);
                }
            }
            while (this._inputPtr < this._inputEnd) {
                byte[] bArr2 = this._inputBuffer;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                byte b2 = bArr2[i2] & 255;
                if (b2 > 32) {
                    if (b2 != 47 && b2 != 35) {
                        return b2;
                    }
                    this._inputPtr--;
                    return _skipWSOrEnd2();
                } else if (b2 != 32) {
                    if (b2 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (b2 == 13) {
                        _skipCR();
                    } else if (b2 != 9) {
                        _throwInvalidSpace(b2);
                    }
                }
            }
            return _skipWSOrEnd2();
        } else if (b != 47 && b != 35) {
            return b;
        } else {
            this._inputPtr--;
            return _skipWSOrEnd2();
        }
    }

    private final int _skipWSOrEnd2() {
        byte b;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            b = bArr[i] & 255;
            if (b > 32) {
                if (b == 47) {
                    _skipComment();
                } else if (b != 35 || !_skipYAMLComment()) {
                    return b;
                }
            } else if (b != 32) {
                if (b == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (b == 13) {
                    _skipCR();
                } else if (b != 9) {
                    _throwInvalidSpace(b);
                }
            }
        }
        return b;
    }

    private final boolean _skipYAMLComment() {
        if (!isEnabled(Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i);
        this._tokenInputCol = i - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        this._nameStartRow = this._currInputRow;
        int i = this._inputPtr;
        this._nameStartOffset = i;
        this._nameStartCol = i - this._currInputRowStart;
    }

    private final int _verifyNoLeadingZeroes() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return 48;
        }
        byte b = this._inputBuffer[this._inputPtr] & 255;
        if (b < 48 || b > 57) {
            return 48;
        }
        if (!isEnabled(Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (b == 48) {
            do {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    break;
                }
                b = this._inputBuffer[this._inputPtr] & 255;
                if (b < 48 || b > 57) {
                    return 48;
                }
                this._inputPtr++;
            } while (b == 48);
        }
        return b;
    }

    private final void _verifyRootSpace(int i) {
        this._inputPtr++;
        if (i != 9) {
            if (i == 10) {
                this._currInputRow++;
                this._currInputRowStart = this._inputPtr;
            } else if (i == 13) {
                _skipCR();
            } else if (i != 32) {
                _reportMissingRootWS(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String addName(int[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r2 << 2
            r5 = 4
            int r4 = r4 - r5
            int r4 = r4 + r3
            r7 = 3
            if (r3 >= r5) goto L_0x001c
            int r8 = r2 + -1
            r9 = r1[r8]
            int r10 = 4 - r3
            int r10 = r10 << r7
            int r10 = r9 << r10
            r1[r8] = r10
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            com.fasterxml.jackson.core.util.TextBuffer r8 = r0._textBuffer
            char[] r8 = r8.emptyAndGetCurrentSegment()
            r10 = r8
            r8 = 0
            r11 = 0
        L_0x0026:
            if (r8 >= r4) goto L_0x00f7
            int r12 = r8 >> 2
            r12 = r1[r12]
            r13 = r8 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r12 = r12 >> r13
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r8 = r8 + 1
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x00e4
            r13 = r12 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            r5 = 1
            if (r13 != r14) goto L_0x0046
            r12 = r12 & 31
            r13 = r12
            r12 = 1
            goto L_0x0061
        L_0x0046:
            r13 = r12 & 240(0xf0, float:3.36E-43)
            r14 = 224(0xe0, float:3.14E-43)
            if (r13 != r14) goto L_0x0051
            r12 = r12 & 15
            r13 = r12
            r12 = 2
            goto L_0x0061
        L_0x0051:
            r13 = r12 & 248(0xf8, float:3.48E-43)
            r14 = 240(0xf0, float:3.36E-43)
            if (r13 != r14) goto L_0x005c
            r12 = r12 & 7
            r13 = r12
            r12 = 3
            goto L_0x0061
        L_0x005c:
            r0._reportInvalidInitial(r12)
            r12 = 1
            r13 = 1
        L_0x0061:
            int r14 = r8 + r12
            if (r14 <= r4) goto L_0x006c
            com.fasterxml.jackson.core.JsonToken r14 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            java.lang.String r6 = " in field name"
            r0._reportInvalidEOF(r6, r14)
        L_0x006c:
            int r6 = r8 >> 2
            r6 = r1[r6]
            r14 = r8 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r6 = r6 >> r14
            int r8 = r8 + 1
            r14 = r6 & 192(0xc0, float:2.69E-43)
            r15 = 128(0x80, float:1.794E-43)
            if (r14 == r15) goto L_0x0081
            r0._reportInvalidOther(r6)
        L_0x0081:
            int r13 = r13 << 6
            r6 = r6 & 63
            r6 = r6 | r13
            if (r12 <= r5) goto L_0x00be
            int r5 = r8 >> 2
            r5 = r1[r5]
            r13 = r8 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r5 = r5 >> r13
            int r8 = r8 + 1
            r13 = r5 & 192(0xc0, float:2.69E-43)
            if (r13 == r15) goto L_0x009b
            r0._reportInvalidOther(r5)
        L_0x009b:
            int r6 = r6 << 6
            r5 = r5 & 63
            r5 = r5 | r6
            r6 = 2
            if (r12 <= r6) goto L_0x00c0
            int r6 = r8 >> 2
            r6 = r1[r6]
            r13 = r8 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r6 = r6 >> r13
            int r8 = r8 + 1
            r13 = r6 & 192(0xc0, float:2.69E-43)
            if (r13 == r15) goto L_0x00b8
            r13 = r6 & 255(0xff, float:3.57E-43)
            r0._reportInvalidOther(r13)
        L_0x00b8:
            int r5 = r5 << 6
            r6 = r6 & 63
            r5 = r5 | r6
            goto L_0x00bf
        L_0x00be:
            r5 = r6
        L_0x00bf:
            r6 = 2
        L_0x00c0:
            if (r12 <= r6) goto L_0x00e3
            r6 = 65536(0x10000, float:9.18355E-41)
            int r5 = r5 - r6
            int r6 = r10.length
            if (r11 < r6) goto L_0x00cf
            com.fasterxml.jackson.core.util.TextBuffer r6 = r0._textBuffer
            char[] r6 = r6.expandCurrentSegment()
            r10 = r6
        L_0x00cf:
            int r6 = r11 + 1
            r12 = 55296(0xd800, float:7.7486E-41)
            int r13 = r5 >> 10
            int r13 = r13 + r12
            char r12 = (char) r13
            r10[r11] = r12
            r11 = 56320(0xdc00, float:7.8921E-41)
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            r12 = r5 | r11
            r11 = r6
            goto L_0x00e4
        L_0x00e3:
            r12 = r5
        L_0x00e4:
            int r5 = r10.length
            if (r11 < r5) goto L_0x00ee
            com.fasterxml.jackson.core.util.TextBuffer r5 = r0._textBuffer
            char[] r5 = r5.expandCurrentSegment()
            r10 = r5
        L_0x00ee:
            int r5 = r11 + 1
            char r6 = (char) r12
            r10[r11] = r6
            r11 = r5
            r5 = 4
            goto L_0x0026
        L_0x00f7:
            java.lang.String r4 = new java.lang.String
            r5 = 0
            r4.<init>(r10, r5, r11)
            r5 = 4
            if (r3 >= r5) goto L_0x0104
            int r3 = r2 + -1
            r1[r3] = r9
        L_0x0104:
            com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer r3 = r0._symbols
            java.lang.String r1 = r3.addName(r4, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.addName(int[], int, int):java.lang.String");
    }

    private final String findName(int i, int i2) {
        int _padLastQuad = _padLastQuad(i, i2);
        String findName = this._symbols.findName(_padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = _padLastQuad;
        return addName(iArr, 1, i2);
    }

    private final String findName(int i, int i2, int i3) {
        int _padLastQuad = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(i, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = _padLastQuad;
        return addName(iArr, 2, i3);
    }

    private final String findName(int i, int i2, int i3, int i4) {
        int _padLastQuad = _padLastQuad(i3, i4);
        String findName = this._symbols.findName(i, i2, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = _padLastQuad(_padLastQuad, i4);
        return addName(iArr, 3, i4);
    }

    private final String findName(int[] iArr, int i, int i2, int i3) {
        if (i >= iArr.length) {
            iArr = growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i4 = i + 1;
        iArr[i] = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(iArr, i4);
        return findName == null ? addName(iArr, i4, i3) : findName;
    }

    private int nextByte() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return bArr[i] & 255;
    }

    private final String parseName(int i, int i2, int i3) {
        return parseEscapedName(this._quadBuffer, 0, i, i2, i3);
    }

    private final String parseName(int i, int i2, int i3, int i4) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        return parseEscapedName(iArr, 1, i2, i3, i4);
    }

    private final String parseName(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        return parseEscapedName(iArr, 2, i3, i4, i5);
    }

    public void _closeInput() {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    /* access modifiers changed from: protected */
    public final byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            byte b = bArr[i] & 255;
            if (b > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char((int) b);
                if (decodeBase64Char < 0) {
                    if (b == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, (int) b, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                byte b2 = bArr2[i2] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char((int) b2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, (int) b2, 1);
                }
                int i3 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                byte b3 = bArr3[i4] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char((int) b3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (b3 != 34 || base64Variant.usesPadding()) {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, (int) b3, 2);
                        } else {
                            _getByteArrayBuilder.append(i3 >> 4);
                            return _getByteArrayBuilder.toByteArray();
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i5 = this._inputPtr;
                        this._inputPtr = i5 + 1;
                        byte b4 = bArr4[i5] & 255;
                        if (base64Variant.usesPaddingChar((int) b4)) {
                            _getByteArrayBuilder.append(i3 >> 4);
                        } else {
                            StringBuilder sb = new StringBuilder("expected padding character '");
                            sb.append(base64Variant.getPaddingChar());
                            sb.append("'");
                            throw reportInvalidBase64Char(base64Variant, b4, 3, sb.toString());
                        }
                    }
                }
                int i6 = (i3 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                byte b5 = bArr5[i7] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char((int) b5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (b5 != 34 || base64Variant.usesPadding()) {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, (int) b5, 3);
                        } else {
                            _getByteArrayBuilder.appendTwoBytes(i6 >> 2);
                            return _getByteArrayBuilder.toByteArray();
                        }
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i6 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i6 << 6) | decodeBase64Char4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int _decodeCharForError(int r7) {
        /*
            r6 = this;
            r7 = r7 & 255(0xff, float:3.57E-43)
            r0 = 127(0x7f, float:1.78E-43)
            if (r7 <= r0) goto L_0x0068
            r0 = r7 & 224(0xe0, float:3.14E-43)
            r1 = 2
            r2 = 1
            r3 = 192(0xc0, float:2.69E-43)
            if (r0 != r3) goto L_0x0012
            r7 = r7 & 31
        L_0x0010:
            r0 = 1
            goto L_0x002c
        L_0x0012:
            r0 = r7 & 240(0xf0, float:3.36E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r0 != r3) goto L_0x001c
            r7 = r7 & 15
            r0 = 2
            goto L_0x002c
        L_0x001c:
            r0 = r7 & 248(0xf8, float:3.48E-43)
            r3 = 240(0xf0, float:3.36E-43)
            if (r0 != r3) goto L_0x0026
            r7 = r7 & 7
            r0 = 3
            goto L_0x002c
        L_0x0026:
            r0 = r7 & 255(0xff, float:3.57E-43)
            r6._reportInvalidInitial(r0)
            goto L_0x0010
        L_0x002c:
            int r3 = r6.nextByte()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x003b
            r4 = r3 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r4)
        L_0x003b:
            int r7 = r7 << 6
            r3 = r3 & 63
            r7 = r7 | r3
            if (r0 <= r2) goto L_0x0068
            int r2 = r6.nextByte()
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L_0x004f
            r3 = r2 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r3)
        L_0x004f:
            int r7 = r7 << 6
            r2 = r2 & 63
            r7 = r7 | r2
            if (r0 <= r1) goto L_0x0068
            int r0 = r6.nextByte()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L_0x0063
            r1 = r0 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r1)
        L_0x0063:
            int r7 = r7 << 6
            r0 = r0 & 63
            r7 = r7 | r0
        L_0x0068:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._decodeCharForError(int):int");
    }

    public char _decodeEscaped() {
        String str = " in character escape sequence";
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(str, JsonToken.VALUE_STRING);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return 8;
        }
        if (b == 102) {
            return 12;
        }
        if (b == 110) {
            return 10;
        }
        if (b == 114) {
            return 13;
        }
        if (b == 116) {
            return 9;
        }
        if (b != 117) {
            return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(b));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(str, JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            byte b2 = bArr2[i4];
            int charToHex = CharTypes.charToHex(b2);
            if (charToHex < 0) {
                _reportUnexpectedChar(b2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | charToHex;
        }
        return (char) i2;
    }

    /* access modifiers changed from: protected */
    public String _finishAndReturnString() {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        int i2 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & 255;
            if (iArr[b] == 0) {
                i++;
                int i3 = i2 + 1;
                emptyAndGetCurrentSegment[i2] = (char) b;
                i2 = i3;
            } else if (b == 34) {
                this._inputPtr = i + 1;
                return this._textBuffer.setCurrentAndReturn(i2);
            }
        }
        this._inputPtr = i;
        _finishString2(emptyAndGetCurrentSegment, i2);
        return this._textBuffer.contentsAsString();
    }

    public void _finishString() {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        int i2 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & 255;
            if (iArr[b] == 0) {
                i++;
                int i3 = i2 + 1;
                emptyAndGetCurrentSegment[i2] = (char) b;
                i2 = i3;
            } else if (b == 34) {
                this._inputPtr = i + 1;
                this._textBuffer.setCurrentLength(i2);
                return;
            }
        }
        this._inputPtr = i;
        _finishString2(emptyAndGetCurrentSegment, i2);
    }

    /* access modifiers changed from: protected */
    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        return id != 5 ? (id == 6 || id == 7 || id == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken _handleApos() {
        /*
            r10 = this;
            com.fasterxml.jackson.core.util.TextBuffer r0 = r10._textBuffer
            char[] r0 = r0.emptyAndGetCurrentSegment()
            int[] r1 = _icUTF8
            byte[] r2 = r10._inputBuffer
            r3 = 0
            r4 = 0
        L_0x000c:
            int r5 = r10._inputPtr
            int r6 = r10._inputEnd
            if (r5 < r6) goto L_0x0015
            r10._loadMoreGuaranteed()
        L_0x0015:
            int r5 = r0.length
            if (r4 < r5) goto L_0x001f
            com.fasterxml.jackson.core.util.TextBuffer r0 = r10._textBuffer
            char[] r0 = r0.finishCurrentSegment()
            r4 = 0
        L_0x001f:
            int r5 = r10._inputEnd
            int r6 = r10._inputPtr
            int r7 = r0.length
            int r7 = r7 - r4
            int r6 = r6 + r7
            if (r6 >= r5) goto L_0x0029
            r5 = r6
        L_0x0029:
            int r6 = r10._inputPtr
            if (r6 >= r5) goto L_0x000c
            int r6 = r10._inputPtr
            int r7 = r6 + 1
            r10._inputPtr = r7
            byte r6 = r2[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 39
            if (r6 == r7) goto L_0x0046
            r8 = r1[r6]
            if (r8 != 0) goto L_0x0046
            int r7 = r4 + 1
            char r6 = (char) r6
            r0[r4] = r6
            r4 = r7
            goto L_0x0029
        L_0x0046:
            if (r6 == r7) goto L_0x00b2
            r5 = r1[r6]
            r7 = 1
            if (r5 == r7) goto L_0x009c
            r7 = 2
            if (r5 == r7) goto L_0x0097
            r8 = 3
            if (r5 == r8) goto L_0x0086
            r7 = 4
            if (r5 == r7) goto L_0x0063
            r5 = 32
            if (r6 >= r5) goto L_0x005f
            java.lang.String r5 = "string value"
            r10._throwUnquotedSpace(r6, r5)
        L_0x005f:
            r10._reportInvalidChar(r6)
            goto L_0x00a0
        L_0x0063:
            int r5 = r10._decodeUtf8_4(r6)
            int r6 = r4 + 1
            r7 = 55296(0xd800, float:7.7486E-41)
            int r8 = r5 >> 10
            r7 = r7 | r8
            char r7 = (char) r7
            r0[r4] = r7
            int r4 = r0.length
            if (r6 < r4) goto L_0x007c
            com.fasterxml.jackson.core.util.TextBuffer r0 = r10._textBuffer
            char[] r0 = r0.finishCurrentSegment()
            r6 = 0
        L_0x007c:
            r4 = 56320(0xdc00, float:7.8921E-41)
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            r4 = r4 | r5
            r9 = r6
            r6 = r4
            r4 = r9
            goto L_0x00a0
        L_0x0086:
            int r5 = r10._inputEnd
            int r8 = r10._inputPtr
            int r5 = r5 - r8
            if (r5 < r7) goto L_0x0092
            int r6 = r10._decodeUtf8_3fast(r6)
            goto L_0x00a0
        L_0x0092:
            int r6 = r10._decodeUtf8_3(r6)
            goto L_0x00a0
        L_0x0097:
            int r6 = r10._decodeUtf8_2(r6)
            goto L_0x00a0
        L_0x009c:
            char r6 = r10._decodeEscaped()
        L_0x00a0:
            int r5 = r0.length
            if (r4 < r5) goto L_0x00aa
            com.fasterxml.jackson.core.util.TextBuffer r0 = r10._textBuffer
            char[] r0 = r0.finishCurrentSegment()
            r4 = 0
        L_0x00aa:
            int r5 = r4 + 1
            char r6 = (char) r6
            r0[r4] = r6
            r4 = r5
            goto L_0x000c
        L_0x00b2:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r10._textBuffer
            r0.setCurrentLength(r4)
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleApos():com.fasterxml.jackson.core.JsonToken");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Incorrect condition in loop: B:1:0x0002 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(int r3, boolean r4) {
        /*
            r2 = this;
        L_0x0000:
            r0 = 73
            if (r3 != r0) goto L_0x0054
            int r3 = r2._inputPtr
            int r0 = r2._inputEnd
            if (r3 < r0) goto L_0x0015
            boolean r3 = r2._loadMore()
            if (r3 != 0) goto L_0x0015
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            r2._reportInvalidEOFInValue(r3)
        L_0x0015:
            byte[] r3 = r2._inputBuffer
            int r0 = r2._inputPtr
            int r1 = r0 + 1
            r2._inputPtr = r1
            byte r3 = r3[r0]
            r0 = 78
            if (r3 != r0) goto L_0x002b
            if (r4 == 0) goto L_0x0028
            java.lang.String r0 = "-INF"
            goto L_0x0036
        L_0x0028:
            java.lang.String r0 = "+INF"
            goto L_0x0036
        L_0x002b:
            r0 = 110(0x6e, float:1.54E-43)
            if (r3 != r0) goto L_0x0054
            if (r4 == 0) goto L_0x0034
            java.lang.String r0 = "-Infinity"
            goto L_0x0036
        L_0x0034:
            java.lang.String r0 = "+Infinity"
        L_0x0036:
            r1 = 3
            r2._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r2.isEnabled(r1)
            if (r1 == 0) goto L_0x004e
            if (r4 == 0) goto L_0x0047
            r3 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            goto L_0x0049
        L_0x0047:
            r3 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
        L_0x0049:
            com.fasterxml.jackson.core.JsonToken r3 = r2.resetAsNaN(r0, r3)
            return r3
        L_0x004e:
            java.lang.String r1 = "Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r2._reportError(r1, r0)
            goto L_0x0000
        L_0x0054:
            java.lang.String r4 = "expected digit (0-9) to follow minus sign, for valid numeric value"
            r2.reportUnexpectedNumberChar(r3, r4)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleInvalidNumberStart(int, boolean):com.fasterxml.jackson.core.JsonToken");
    }

    /* access modifiers changed from: protected */
    public String _handleOddName(int i) {
        if (i == 39 && isEnabled(Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseAposName();
        }
        if (!isEnabled(Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            _reportUnexpectedChar((char) _decodeCharForError(i), "was expecting double-quote to start field name");
        }
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        if (inputCodeUtf8JsNames[i] != 0) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this._quadBuffer;
        int i2 = 0;
        byte b = i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i4 = (i4 << 8) | b;
            } else {
                if (i3 >= iArr.length) {
                    iArr = growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                int i5 = i3 + 1;
                iArr[i3] = i4;
                i3 = i5;
                i4 = b;
                i2 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            b = this._inputBuffer[this._inputPtr] & 255;
            if (inputCodeUtf8JsNames[b] != 0) {
                break;
            }
            this._inputPtr++;
        }
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                int[] growArrayBy = growArrayBy(iArr, iArr.length);
                this._quadBuffer = growArrayBy;
                iArr = growArrayBy;
            }
            int i6 = i3 + 1;
            iArr[i3] = i4;
            i3 = i6;
        }
        String findName = this._symbols.findName(iArr, i3);
        if (findName == null) {
            findName = addName(iArr, i3, i2);
        }
        return findName;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r4 != 44) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3._parsingContext.inArray() != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L_0x0094
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L_0x007a
            r0 = 78
            if (r4 == r0) goto L_0x0060
            r0 = 93
            if (r4 == r0) goto L_0x0042
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x005a
            r0 = 43
            if (r4 == r0) goto L_0x001f
            r0 = 44
            if (r4 == r0) goto L_0x004a
            goto L_0x00a1
        L_0x001f:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L_0x0030
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L_0x0030
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L_0x0030:
            byte[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            byte r4 = r4[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L_0x0042:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 == 0) goto L_0x00a1
        L_0x004a:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x005a
            int r4 = r3._inputPtr
            int r4 = r4 - r1
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L_0x005a:
            java.lang.String r0 = "expected a value"
            r3._reportUnexpectedChar(r4, r0)
            goto L_0x0094
        L_0x0060:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L_0x0074
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L_0x0074:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L_0x00a1
        L_0x007a:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L_0x008e
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L_0x008e:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L_0x00a1
        L_0x0094:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x00a1
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L_0x00a1:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00b9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "('true', 'false' or 'null')"
            r3._reportInvalidToken(r0, r1)
        L_0x00b9:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* access modifiers changed from: protected */
    public final boolean _loadMore() {
        int i = this._inputEnd;
        this._currInputProcessed += (long) this._inputEnd;
        this._currInputRowStart -= this._inputEnd;
        this._nameStartOffset -= i;
        InputStream inputStream = this._inputStream;
        if (inputStream != null) {
            byte[] bArr = this._inputBuffer;
            int length = bArr.length;
            if (length == 0) {
                return false;
            }
            int read = inputStream.read(bArr, 0, length);
            if (read > 0) {
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                StringBuilder sb = new StringBuilder("InputStream.read() returned 0 characters when trying to read ");
                sb.append(this._inputBuffer.length);
                sb.append(" bytes");
                throw new IOException(sb.toString());
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void _loadMoreGuaranteed() {
        if (!_loadMore()) {
            _reportInvalidEOF();
        }
    }

    /* access modifiers changed from: protected */
    public final void _matchFalse() {
        int i = this._inputPtr;
        if (i + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i2 = i + 1;
            if (bArr[i] == 97) {
                int i3 = i2 + 1;
                if (bArr[i2] == 108) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 115) {
                        int i5 = i4 + 1;
                        if (bArr[i4] == 101) {
                            byte b = bArr[i5] & 255;
                            if (b < 48 || b == 93 || b == 125) {
                                this._inputPtr = i5;
                                return;
                            }
                        }
                    }
                }
            }
        }
        _matchToken2("false", 1);
    }

    /* access modifiers changed from: protected */
    public final void _matchNull() {
        int i = this._inputPtr;
        if (i + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i2 = i + 1;
            if (bArr[i] == 117) {
                int i3 = i2 + 1;
                if (bArr[i2] == 108) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 108) {
                        byte b = bArr[i4] & 255;
                        if (b < 48 || b == 93 || b == 125) {
                            this._inputPtr = i4;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2("null", 1);
    }

    /* access modifiers changed from: protected */
    public final void _matchToken(String str, int i) {
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            this._inputPtr++;
            i++;
        } while (i < length);
        byte b = this._inputBuffer[this._inputPtr] & 255;
        if (!(b < 48 || b == 93 || b == 125)) {
            _checkMatchEnd(str, i, b);
        }
    }

    /* access modifiers changed from: protected */
    public final void _matchTrue() {
        int i = this._inputPtr;
        if (i + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i2 = i + 1;
            if (bArr[i] == 114) {
                int i3 = i2 + 1;
                if (bArr[i2] == 117) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 101) {
                        byte b = bArr[i4] & 255;
                        if (b < 48 || b == 93 || b == 125) {
                            this._inputPtr = i4;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2("true", 1);
    }

    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v3
      assigns: []
      uses: []
      mth insns count: 121
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String _parseAposName() {
        /*
            r11 = this;
            int r0 = r11._inputPtr
            int r1 = r11._inputEnd
            if (r0 < r1) goto L_0x0013
            boolean r0 = r11._loadMore()
            if (r0 != 0) goto L_0x0013
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            java.lang.String r1 = ": was expecting closing ''' for field name"
            r11._reportInvalidEOF(r1, r0)
        L_0x0013:
            byte[] r0 = r11._inputBuffer
            int r1 = r11._inputPtr
            int r2 = r1 + 1
            r11._inputPtr = r2
            byte r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 39
            if (r0 != r1) goto L_0x0026
            java.lang.String r0 = ""
            return r0
        L_0x0026:
            int[] r2 = r11._quadBuffer
            int[] r3 = _icLatin1
            r4 = 0
            r6 = r2
            r2 = 0
            r5 = 0
            r7 = 0
        L_0x002f:
            if (r0 == r1) goto L_0x00d4
            r8 = r3[r0]
            r9 = 4
            r10 = 1
            if (r8 == 0) goto L_0x0099
            r8 = 34
            if (r0 == r8) goto L_0x0099
            r8 = 92
            if (r0 == r8) goto L_0x0045
            java.lang.String r8 = "name"
            r11._throwUnquotedSpace(r0, r8)
            goto L_0x0049
        L_0x0045:
            char r0 = r11._decodeEscaped()
        L_0x0049:
            r8 = 127(0x7f, float:1.78E-43)
            if (r0 <= r8) goto L_0x0099
            if (r2 < r9) goto L_0x0060
            int r2 = r6.length
            if (r5 < r2) goto L_0x0059
            int r2 = r6.length
            int[] r6 = growArrayBy(r6, r2)
            r11._quadBuffer = r6
        L_0x0059:
            int r2 = r5 + 1
            r6[r5] = r7
            r5 = r2
            r2 = 0
            r7 = 0
        L_0x0060:
            r8 = 2048(0x800, float:2.87E-42)
            if (r0 >= r8) goto L_0x006e
            int r7 = r7 << 8
            int r8 = r0 >> 6
            r8 = r8 | 192(0xc0, float:2.69E-43)
            r7 = r7 | r8
            int r2 = r2 + 1
            goto L_0x0095
        L_0x006e:
            int r7 = r7 << 8
            int r8 = r0 >> 12
            r8 = r8 | 224(0xe0, float:3.14E-43)
            r7 = r7 | r8
            int r2 = r2 + 1
            if (r2 < r9) goto L_0x008b
            int r2 = r6.length
            if (r5 < r2) goto L_0x0084
            int r2 = r6.length
            int[] r2 = growArrayBy(r6, r2)
            r11._quadBuffer = r2
            r6 = r2
        L_0x0084:
            int r2 = r5 + 1
            r6[r5] = r7
            r5 = r2
            r2 = 0
            r7 = 0
        L_0x008b:
            int r7 = r7 << 8
            int r8 = r0 >> 6
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            r7 = r7 | r8
            int r2 = r2 + r10
        L_0x0095:
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x0099:
            if (r2 >= r9) goto L_0x00a2
            int r2 = r2 + 1
            int r7 = r7 << 8
            r0 = r0 | r7
            r7 = r0
            goto L_0x00b3
        L_0x00a2:
            int r2 = r6.length
            if (r5 < r2) goto L_0x00ac
            int r2 = r6.length
            int[] r6 = growArrayBy(r6, r2)
            r11._quadBuffer = r6
        L_0x00ac:
            int r2 = r5 + 1
            r6[r5] = r7
            r7 = r0
            r5 = r2
            r2 = 1
        L_0x00b3:
            int r0 = r11._inputPtr
            int r8 = r11._inputEnd
            if (r0 < r8) goto L_0x00c6
            boolean r0 = r11._loadMore()
            if (r0 != 0) goto L_0x00c6
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            java.lang.String r8 = " in field name"
            r11._reportInvalidEOF(r8, r0)
        L_0x00c6:
            byte[] r0 = r11._inputBuffer
            int r8 = r11._inputPtr
            int r9 = r8 + 1
            r11._inputPtr = r9
            byte r0 = r0[r8]
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L_0x002f
        L_0x00d4:
            if (r2 <= 0) goto L_0x00ea
            int r0 = r6.length
            if (r5 < r0) goto L_0x00e1
            int r0 = r6.length
            int[] r0 = growArrayBy(r6, r0)
            r11._quadBuffer = r0
            r6 = r0
        L_0x00e1:
            int r0 = r5 + 1
            int r1 = _padLastQuad(r7, r2)
            r6[r5] = r1
            goto L_0x00eb
        L_0x00ea:
            r0 = r5
        L_0x00eb:
            com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer r1 = r11._symbols
            java.lang.String r1 = r1.findName(r6, r0)
            if (r1 != 0) goto L_0x00f7
            java.lang.String r1 = r11.addName(r6, r0, r2)
        L_0x00f7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._parseAposName():java.lang.String");
    }

    /* access modifiers changed from: protected */
    public final String _parseName(int i) {
        if (i != 34) {
            return _handleOddName(i);
        }
        if (this._inputPtr + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2] & 255;
        if (iArr[b] != 0) {
            return b == 34 ? "" : parseName(0, b, 0);
        }
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b2 = bArr[i3] & 255;
        if (iArr[b2] != 0) {
            return b2 == 34 ? findName(b, 1) : parseName(b, b2, 1);
        }
        byte b3 = (b << 8) | b2;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        byte b4 = bArr[i4] & 255;
        if (iArr[b4] != 0) {
            return b4 == 34 ? findName(b3, 2) : parseName(b3, b4, 2);
        }
        byte b5 = (b3 << 8) | b4;
        int i5 = this._inputPtr;
        this._inputPtr = i5 + 1;
        byte b6 = bArr[i5] & 255;
        if (iArr[b6] != 0) {
            return b6 == 34 ? findName(b5, 3) : parseName(b5, b6, 3);
        }
        byte b7 = (b5 << 8) | b6;
        int i6 = this._inputPtr;
        this._inputPtr = i6 + 1;
        byte b8 = bArr[i6] & 255;
        if (iArr[b8] != 0) {
            return b8 == 34 ? findName(b7, 4) : parseName(b7, b8, 4);
        }
        this._quad1 = b7;
        return parseMediumName(b8);
    }

    /* access modifiers changed from: protected */
    public JsonToken _parseNegNumber() {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 <= 48) {
            if (i2 != 48) {
                return _handleInvalidNumberStart(i2, true);
            }
            i2 = _verifyNoLeadingZeroes();
        } else if (i2 > 57) {
            return _handleInvalidNumberStart(i2, true);
        }
        emptyAndGetCurrentSegment[1] = (char) i2;
        int i3 = 2;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 2);
        int i4 = 1;
        while (this._inputPtr < min) {
            byte[] bArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            byte b = bArr2[i5] & 255;
            if (b >= 48 && b <= 57) {
                i4++;
                int i6 = i3 + 1;
                emptyAndGetCurrentSegment[i3] = (char) b;
                i3 = i6;
            } else if (b == 46 || b == 101 || b == 69) {
                return _parseFloat(emptyAndGetCurrentSegment, i3, b, true, i4);
            } else {
                this._inputPtr--;
                this._textBuffer.setCurrentLength(i3);
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(b);
                }
                return resetInt(true, i4);
            }
        }
        return _parseNumber2(emptyAndGetCurrentSegment, i3, true, i4);
    }

    /* access modifiers changed from: protected */
    public JsonToken _parsePosNumber(int i) {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i == 48) {
            i = _verifyNoLeadingZeroes();
        }
        emptyAndGetCurrentSegment[0] = (char) i;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 1);
        int i2 = 1;
        int i3 = 1;
        while (this._inputPtr < min) {
            byte[] bArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            byte b = bArr[i4] & 255;
            if (b >= 48 && b <= 57) {
                i3++;
                int i5 = i2 + 1;
                emptyAndGetCurrentSegment[i2] = (char) b;
                i2 = i5;
            } else if (b == 46 || b == 101 || b == 69) {
                return _parseFloat(emptyAndGetCurrentSegment, i2, b, false, i3);
            } else {
                this._inputPtr--;
                this._textBuffer.setCurrentLength(i2);
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(b);
                }
                return resetInt(false, i3);
            }
        }
        return _parseNumber2(emptyAndGetCurrentSegment, i2, false, i3);
    }

    /* access modifiers changed from: protected */
    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) {
        int i;
        int length = bArr.length - 3;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            byte b = bArr2[i4] & 255;
            if (b > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char((int) b);
                if (decodeBase64Char < 0) {
                    if (b == 34) {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, (int) b, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i3 > length) {
                    i2 += i3;
                    outputStream.write(bArr, 0, i3);
                    i3 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                byte b2 = bArr3[i5] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char((int) b2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, (int) b2, 1);
                }
                int i6 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr4 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                byte b3 = bArr4[i7] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char((int) b3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (b3 == 34 && !base64Variant.usesPadding()) {
                            int i8 = i3 + 1;
                            bArr[i3] = (byte) (i6 >> 4);
                            i3 = i8;
                            break;
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, (int) b3, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr5 = this._inputBuffer;
                        int i9 = this._inputPtr;
                        this._inputPtr = i9 + 1;
                        byte b4 = bArr5[i9] & 255;
                        if (base64Variant.usesPaddingChar((int) b4)) {
                            i = i3 + 1;
                            bArr[i3] = (byte) (i6 >> 4);
                            i3 = i;
                        } else {
                            StringBuilder sb = new StringBuilder("expected padding character '");
                            sb.append(base64Variant.getPaddingChar());
                            sb.append("'");
                            throw reportInvalidBase64Char(base64Variant, b4, 3, sb.toString());
                        }
                    }
                }
                int i10 = (i6 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr6 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                byte b5 = bArr6[i11] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char((int) b5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (b5 == 34 && !base64Variant.usesPadding()) {
                            int i12 = i10 >> 2;
                            int i13 = i3 + 1;
                            bArr[i3] = (byte) (i12 >> 8);
                            i3 = i13 + 1;
                            bArr[i13] = (byte) i12;
                            break;
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, (int) b5, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        int i14 = i10 >> 2;
                        int i15 = i3 + 1;
                        bArr[i3] = (byte) (i14 >> 8);
                        i3 = i15 + 1;
                        bArr[i15] = (byte) i14;
                    }
                }
                int i16 = (i10 << 6) | decodeBase64Char4;
                int i17 = i3 + 1;
                bArr[i3] = (byte) (i16 >> 16);
                int i18 = i17 + 1;
                bArr[i17] = (byte) (i16 >> 8);
                i = i18 + 1;
                bArr[i18] = (byte) i16;
                i3 = i;
            }
        }
        this._tokenIncomplete = false;
        if (i3 <= 0) {
            return i2;
        }
        int i19 = i2 + i3;
        outputStream.write(bArr, 0, i3);
        return i19;
    }

    public void _releaseBuffers() {
        super._releaseBuffers();
        this._symbols.release();
        if (this._bufferRecyclable) {
            byte[] bArr = this._inputBuffer;
            if (bArr != null) {
                this._inputBuffer = NO_BYTES;
                this._ioContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidChar(int i) {
        if (i < 32) {
            _throwInvalidSpace(i);
        }
        _reportInvalidInitial(i);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidInitial(int i) {
        StringBuilder sb = new StringBuilder("Invalid UTF-8 start byte 0x");
        sb.append(Integer.toHexString(i));
        _reportError(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidOther(int i) {
        StringBuilder sb = new StringBuilder("Invalid UTF-8 middle byte 0x");
        sb.append(Integer.toHexString(i));
        _reportError(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidOther(int i, int i2) {
        this._inputPtr = i2;
        _reportInvalidOther(i);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str) {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char _decodeCharForError = (char) _decodeCharForError(bArr[i]);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                break;
            }
            sb.append(_decodeCharForError);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    /* access modifiers changed from: protected */
    public final void _skipCR() {
        if ((this._inputPtr < this._inputEnd || _loadMore()) && this._inputBuffer[this._inputPtr] == 10) {
            this._inputPtr++;
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    /* access modifiers changed from: protected */
    public void _skipString() {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i = this._inputPtr;
            int i2 = this._inputEnd;
            if (i >= i2) {
                _loadMoreGuaranteed();
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            while (true) {
                if (i >= i2) {
                    this._inputPtr = i;
                    break;
                }
                int i3 = i + 1;
                byte b = bArr[i] & 255;
                if (iArr[b] != 0) {
                    this._inputPtr = i3;
                    if (b != 34) {
                        int i4 = iArr[b];
                        if (i4 == 1) {
                            _decodeEscaped();
                        } else if (i4 == 2) {
                            _skipUtf8_2();
                        } else if (i4 == 3) {
                            _skipUtf8_3();
                        } else if (i4 == 4) {
                            _skipUtf8_4(b);
                        } else if (b < 32) {
                            _throwUnquotedSpace(b, "string value");
                        } else {
                            _reportInvalidChar(b);
                        }
                    } else {
                        return;
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        if (this._currToken != JsonToken.VALUE_STRING && (this._currToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            StringBuilder sb = new StringBuilder("Current token (");
            sb.append(this._currToken);
            sb.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            _reportError(sb.toString());
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e) {
                StringBuilder sb2 = new StringBuilder("Failed to decode VALUE_STRING as base64 (");
                sb2.append(base64Variant);
                sb2.append("): ");
                sb2.append(e.getMessage());
                throw _constructError(sb2.toString());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public JsonLocation getCurrentLocation() {
        JsonLocation jsonLocation = new JsonLocation(_getSourceReference(), this._currInputProcessed + ((long) this._inputPtr), -1, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
        return jsonLocation;
    }

    public String getText() {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return _getText2(this._currToken);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    public char[] getTextCharacters() {
        if (this._currToken == null) {
            return null;
        }
        int id = this._currToken.id();
        if (id != 5) {
            if (id != 6) {
                if (!(id == 7 || id == 8)) {
                    return this._currToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            if (this._nameCopyBuffer == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (this._nameCopyBuffer.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    public int getTextLength() {
        if (this._currToken == null) {
            return 0;
        }
        int id = this._currToken.id();
        if (id == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (id != 6) {
            if (!(id == 7 || id == 8)) {
                return this._currToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != 8) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getTextOffset() {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L_0x0029
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            int r0 = r0.id()
            r2 = 5
            if (r0 == r2) goto L_0x0029
            r2 = 6
            if (r0 == r2) goto L_0x0019
            r2 = 7
            if (r0 == r2) goto L_0x0022
            r2 = 8
            if (r0 == r2) goto L_0x0022
            goto L_0x0029
        L_0x0019:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L_0x0022
            r3._tokenIncomplete = r1
            r3._finishString()
        L_0x0022:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3._textBuffer
            int r0 = r0.getTextOffset()
            return r0
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTextOffset():int");
    }

    public JsonLocation getTokenLocation() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            JsonLocation jsonLocation = new JsonLocation(_getSourceReference(), this._currInputProcessed + ((long) (this._nameStartOffset - 1)), -1, this._nameStartRow, this._nameStartCol);
            return jsonLocation;
        }
        JsonLocation jsonLocation2 = new JsonLocation(_getSourceReference(), this._tokenInputTotal - 1, -1, this._tokenInputRow, this._tokenInputCol);
        return jsonLocation2;
    }

    public int getValueAsInt() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
        if ((this._numTypesValid & 1) == 0) {
            if (this._numTypesValid == 0) {
                return _parseIntValue();
            }
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    public int getValueAsInt(int i) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i);
        }
        if ((this._numTypesValid & 1) == 0) {
            if (this._numTypesValid == 0) {
                return _parseIntValue();
            }
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    public String getValueAsString() {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return this._currToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    public String getValueAsString(String str) {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return this._currToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(str);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    public String nextFieldName() {
        JsonToken jsonToken;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        } else if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd != 44) {
                    StringBuilder sb = new StringBuilder("was expecting comma to separate ");
                    sb.append(this._parsingContext.typeDesc());
                    sb.append(" entries");
                    _reportUnexpectedChar(_skipWSOrEnd, sb.toString());
                }
                _skipWSOrEnd = _skipWS();
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                    _closeScope(_skipWSOrEnd);
                    return null;
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return null;
            }
            _updateNameLocation();
            String _parseName = _parseName(_skipWSOrEnd);
            this._parsingContext.setCurrentName(_parseName);
            this._currToken = JsonToken.FIELD_NAME;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return _parseName;
            }
            if (_skipColon == 45) {
                jsonToken = _parseNegNumber();
            } else if (_skipColon == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchFalse();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchNull();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchTrue();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (_skipColon != 123) {
                switch (_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = _parsePosNumber(_skipColon);
                        break;
                    default:
                        jsonToken = _handleUnexpectedValue(_skipColon);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this._nextToken = jsonToken;
            return _parseName;
        }
    }

    public String nextTextValue() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken != JsonToken.VALUE_STRING) {
                if (jsonToken == JsonToken.START_ARRAY) {
                    this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                } else if (jsonToken == JsonToken.START_OBJECT) {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                }
                return null;
            } else if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            } else {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
        } else if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        } else {
            return null;
        }
    }

    public JsonToken nextToken() {
        JsonToken jsonToken;
        if (this._currToken == JsonToken.FIELD_NAME) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            JsonToken jsonToken2 = JsonToken.END_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        } else if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            JsonToken jsonToken3 = JsonToken.END_OBJECT;
            this._currToken = jsonToken3;
            return jsonToken3;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd != 44) {
                    StringBuilder sb = new StringBuilder("was expecting comma to separate ");
                    sb.append(this._parsingContext.typeDesc());
                    sb.append(" entries");
                    _reportUnexpectedChar(_skipWSOrEnd, sb.toString());
                }
                _skipWSOrEnd = _skipWS();
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                    return _closeScope(_skipWSOrEnd);
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                return _nextTokenNotInObject(_skipWSOrEnd);
            }
            _updateNameLocation();
            this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
            this._currToken = JsonToken.FIELD_NAME;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return this._currToken;
            }
            if (_skipColon == 45) {
                jsonToken = _parseNegNumber();
            } else if (_skipColon == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchFalse();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchNull();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchTrue();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (_skipColon != 123) {
                switch (_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = _parsePosNumber(_skipColon);
                        break;
                    default:
                        jsonToken = _handleUnexpectedValue(_skipColon);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this._nextToken = jsonToken;
            return this._currToken;
        }
    }

    /* access modifiers changed from: protected */
    public final String parseEscapedName(int[] iArr, int i, int i2, int i3, int i4) {
        int[] iArr2 = _icLatin1;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    _throwUnquotedSpace(i3, "name");
                } else {
                    i3 = _decodeEscaped();
                }
                if (i3 > 127) {
                    if (r10 >= 4) {
                        if (i >= iArr.length) {
                            iArr = growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        int i5 = i + 1;
                        iArr[i] = r8;
                        i = i5;
                        r8 = 0;
                        r10 = 0;
                    }
                    if (i3 < 2048) {
                        r8 = (r8 << 8) | (i3 >> 6) | 192;
                        r10++;
                    } else {
                        int i6 = (r8 << 8) | (i3 >> 12) | 224;
                        int i7 = r10 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            int i8 = i + 1;
                            iArr[i] = i6;
                            i = i8;
                            i6 = 0;
                            i7 = 0;
                        }
                        r8 = (i6 << 8) | ((i3 >> 6) & 63) | 128;
                        r10 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (r10 < 4) {
                i4 = r10 + 1;
                i2 = (r8 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                int i9 = i + 1;
                iArr[i] = r8;
                i2 = i3;
                i = i9;
                i4 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            i3 = bArr[i10] & 255;
        }
        if (r10 > 0) {
            if (i >= iArr.length) {
                iArr = growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            int i11 = i + 1;
            iArr[i] = _padLastQuad(r8, r10);
            i = i11;
        }
        String findName = this._symbols.findName(iArr, i);
        return findName == null ? addName(iArr, i, r10) : findName;
    }

    /* access modifiers changed from: protected */
    public final String parseLongName(int i, int i2, int i3) {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i2;
        iArr[2] = i3;
        byte[] bArr = this._inputBuffer;
        int[] iArr2 = _icLatin1;
        byte b = i;
        int i4 = 3;
        while (this._inputPtr + 4 <= this._inputEnd) {
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            byte b2 = bArr[i5] & 255;
            if (iArr2[b2] == 0) {
                byte b3 = b2 | (b << 8);
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                byte b4 = bArr[i6] & 255;
                if (iArr2[b4] == 0) {
                    byte b5 = (b3 << 8) | b4;
                    int i7 = this._inputPtr;
                    this._inputPtr = i7 + 1;
                    byte b6 = bArr[i7] & 255;
                    if (iArr2[b6] == 0) {
                        int i8 = (b5 << 8) | b6;
                        int i9 = this._inputPtr;
                        this._inputPtr = i9 + 1;
                        b = bArr[i9] & 255;
                        if (iArr2[b] == 0) {
                            int[] iArr3 = this._quadBuffer;
                            if (i4 >= iArr3.length) {
                                this._quadBuffer = growArrayBy(iArr3, i4);
                            }
                            int i10 = i4 + 1;
                            this._quadBuffer[i4] = i8;
                            i4 = i10;
                        } else if (b == 34) {
                            return findName(this._quadBuffer, i4, i8, 4);
                        } else {
                            return parseEscapedName(this._quadBuffer, i4, i8, b, 4);
                        }
                    } else if (b6 == 34) {
                        return findName(this._quadBuffer, i4, (int) b5, 3);
                    } else {
                        return parseEscapedName(this._quadBuffer, i4, b5, b6, 3);
                    }
                } else if (b4 == 34) {
                    return findName(this._quadBuffer, i4, (int) b3, 2);
                } else {
                    return parseEscapedName(this._quadBuffer, i4, b3, b4, 2);
                }
            } else if (b2 == 34) {
                return findName(this._quadBuffer, i4, b, 1);
            } else {
                return parseEscapedName(this._quadBuffer, i4, b, b2, 1);
            }
        }
        return parseEscapedName(this._quadBuffer, i4, 0, b, 0);
    }

    /* access modifiers changed from: protected */
    public final String parseMediumName(int i) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2] & 255;
        if (iArr[b] != 0) {
            return b == 34 ? findName(this._quad1, i, 1) : parseName(this._quad1, i, b, 1);
        }
        byte b2 = (i << 8) | b;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b3 = bArr[i3] & 255;
        if (iArr[b3] != 0) {
            return b3 == 34 ? findName(this._quad1, b2, 2) : parseName(this._quad1, b2, b3, 2);
        }
        byte b4 = (b2 << 8) | b3;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        byte b5 = bArr[i4] & 255;
        if (iArr[b5] != 0) {
            return b5 == 34 ? findName(this._quad1, b4, 3) : parseName(this._quad1, b4, b5, 3);
        }
        byte b6 = (b4 << 8) | b5;
        int i5 = this._inputPtr;
        this._inputPtr = i5 + 1;
        byte b7 = bArr[i5] & 255;
        return iArr[b7] != 0 ? b7 == 34 ? findName(this._quad1, b6, 4) : parseName(this._quad1, b6, b7, 4) : parseMediumName2(b7, b6);
    }

    /* access modifiers changed from: protected */
    public final String parseMediumName2(int i, int i2) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b = bArr[i3] & 255;
        if (iArr[b] == 0) {
            byte b2 = (i << 8) | b;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            byte b3 = bArr[i4] & 255;
            if (iArr[b3] == 0) {
                byte b4 = (b2 << 8) | b3;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                byte b5 = bArr[i5] & 255;
                if (iArr[b5] == 0) {
                    byte b6 = (b4 << 8) | b5;
                    int i6 = this._inputPtr;
                    this._inputPtr = i6 + 1;
                    byte b7 = bArr[i6] & 255;
                    if (iArr[b7] == 0) {
                        return parseLongName(b7, i2, b6);
                    }
                    if (b7 == 34) {
                        return findName(this._quad1, i2, (int) b6, 4);
                    }
                    return parseName(this._quad1, i2, b6, b7, 4);
                } else if (b5 == 34) {
                    return findName(this._quad1, i2, (int) b4, 3);
                } else {
                    return parseName(this._quad1, i2, b4, b5, 3);
                }
            } else if (b3 == 34) {
                return findName(this._quad1, i2, (int) b2, 2);
            } else {
                return parseName(this._quad1, i2, b2, b3, 2);
            }
        } else if (b == 34) {
            return findName(this._quad1, i2, i, 1);
        } else {
            return parseName(this._quad1, i2, i, b, 1);
        }
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            int _readBinary = _readBinary(base64Variant, outputStream, allocBase64Buffer);
            return _readBinary;
        } finally {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        }
    }

    /* access modifiers changed from: protected */
    public String slowParseName() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i] & 255;
        if (b == 34) {
            return "";
        }
        return parseEscapedName(this._quadBuffer, 0, 0, b, 0);
    }
}
