package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;

public class ReaderBasedJsonParser extends ParserBase {
    protected static final int FEAT_MASK_TRAILING_COMMA = Feature.ALLOW_TRAILING_COMMA.getMask();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    protected boolean _bufferRecyclable;
    protected final int _hashSeed;
    protected char[] _inputBuffer;
    protected int _nameStartCol;
    protected long _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    protected Reader _reader;
    protected final CharsToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public ReaderBasedJsonParser(IOContext iOContext, int i, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = true;
    }

    public ReaderBasedJsonParser(IOContext iOContext, int i, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer, char[] cArr, int i2, int i3, boolean z) {
        super(iOContext, i);
        this._reader = reader;
        this._inputBuffer = cArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = z;
    }

    private final void _checkMatchEnd(String str, int i, int i2) {
        if (Character.isJavaIdentifierPart((char) i2)) {
            _reportInvalidToken(str.substring(0, i));
        }
    }

    private void _closeScope(int i) {
        if (i == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
        }
    }

    private String _handleOddName2(int i, int i2, int[] iArr) {
        this._textBuffer.resetWithShared(this._inputBuffer, i, this._inputPtr - i);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c = this._inputBuffer[this._inputPtr];
            if (c > length) {
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
            } else if (iArr[c] != 0) {
                break;
            }
            this._inputPtr++;
            i2 = (i2 * 33) + c;
            int i3 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c;
            if (i3 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i3;
            }
        }
        this._textBuffer.setCurrentLength(currentSegmentSize);
        TextBuffer textBuffer = this._textBuffer;
        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i2);
    }

    private final void _matchFalse() {
        int i = this._inputPtr;
        if (i + 4 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i] == 'a') {
                int i2 = i + 1;
                if (cArr[i2] == 'l') {
                    int i3 = i2 + 1;
                    if (cArr[i3] == 's') {
                        int i4 = i3 + 1;
                        if (cArr[i4] == 'e') {
                            int i5 = i4 + 1;
                            char c = cArr[i5];
                            if (c < '0' || c == ']' || c == '}') {
                                this._inputPtr = i5;
                                return;
                            }
                        }
                    }
                }
            }
        }
        _matchToken("false", 1);
    }

    private final void _matchNull() {
        int i = this._inputPtr;
        if (i + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i] == 'u') {
                int i2 = i + 1;
                if (cArr[i2] == 'l') {
                    int i3 = i2 + 1;
                    if (cArr[i3] == 'l') {
                        int i4 = i3 + 1;
                        char c = cArr[i4];
                        if (c < '0' || c == ']' || c == '}') {
                            this._inputPtr = i4;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken("null", 1);
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
            char c = this._inputBuffer[this._inputPtr];
            if (!(c < '0' || c == ']' || c == '}')) {
                _checkMatchEnd(str, i, c);
            }
        }
    }

    private final void _matchTrue() {
        int i = this._inputPtr;
        if (i + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i] == 'r') {
                int i2 = i + 1;
                if (cArr[i2] == 'u') {
                    int i3 = i2 + 1;
                    if (cArr[i3] == 'e') {
                        int i4 = i3 + 1;
                        char c = cArr[i4];
                        if (c < '0' || c == ']' || c == '}') {
                            this._inputPtr = i4;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken("true", 1);
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
        }
        if (i != 44) {
            if (i == 45) {
                JsonToken _parseNegNumber = _parseNegNumber();
                this._currToken = _parseNegNumber;
                return _parseNegNumber;
            } else if (i == 91) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                JsonToken jsonToken2 = JsonToken.START_ARRAY;
                this._currToken = jsonToken2;
                return jsonToken2;
            } else if (i != 93) {
                if (i == 102) {
                    _matchToken("false", 1);
                    JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                } else if (i == 110) {
                    _matchToken("null", 1);
                    JsonToken jsonToken4 = JsonToken.VALUE_NULL;
                    this._currToken = jsonToken4;
                    return jsonToken4;
                } else if (i == 116) {
                    _matchToken("true", 1);
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
                    }
                    JsonToken _handleOddValue = _handleOddValue(i);
                    this._currToken = _handleOddValue;
                    return _handleOddValue;
                } else {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                    JsonToken jsonToken6 = JsonToken.START_OBJECT;
                    this._currToken = jsonToken6;
                    return jsonToken6;
                }
            }
        }
        if (isEnabled(Feature.ALLOW_MISSING_VALUES)) {
            this._inputPtr--;
            JsonToken jsonToken7 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken7;
            return jsonToken7;
        }
        JsonToken _handleOddValue2 = _handleOddValue(i);
        this._currToken = _handleOddValue2;
        return _handleOddValue2;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [int] */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2, types: [int] */
    /* JADX WARNING: type inference failed for: r7v5, types: [char[]] */
    /* JADX WARNING: type inference failed for: r7v6, types: [char] */
    /* JADX WARNING: type inference failed for: r7v7, types: [int] */
    /* JADX WARNING: type inference failed for: r7v8, types: [char[]] */
    /* JADX WARNING: type inference failed for: r7v9, types: [char] */
    /* JADX WARNING: type inference failed for: r7v11, types: [char[]] */
    /* JADX WARNING: type inference failed for: r7v12, types: [char] */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r4v3, types: [char[]] */
    /* JADX WARNING: type inference failed for: r9v11, types: [int, char] */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: type inference failed for: r7v23 */
    /* JADX WARNING: type inference failed for: r7v24 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=null, for r7v12, types: [char] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=null, for r7v6, types: [char] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=null, for r7v9, types: [char] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=null, for r9v11, types: [int, char] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char[], code=null, for r4v3, types: [char[]] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char[], code=null, for r7v11, types: [char[]] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char[], code=null, for r7v5, types: [char[]] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char[], code=null, for r7v8, types: [char[]] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=null, for r7v0, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v14
      assigns: []
      uses: []
      mth insns count: 69
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
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(int r7, int r8, int r9, boolean r10, int r11) {
        /*
            r6 = this;
            int r0 = r6._inputEnd
            r1 = 57
            r2 = 48
            r3 = 0
            r4 = 46
            if (r7 != r4) goto L_0x002c
            r7 = 0
        L_0x000c:
            if (r9 < r0) goto L_0x0013
            com.fasterxml.jackson.core.JsonToken r7 = r6._parseNumber2(r10, r8)
            return r7
        L_0x0013:
            char[] r4 = r6._inputBuffer
            int r5 = r9 + 1
            char r9 = r4[r9]
            if (r9 < r2) goto L_0x0021
            if (r9 > r1) goto L_0x0021
            int r7 = r7 + 1
            r9 = r5
            goto L_0x000c
        L_0x0021:
            if (r7 != 0) goto L_0x0028
            java.lang.String r4 = "Decimal point not followed by a digit"
            r6.reportUnexpectedNumberChar(r9, r4)
        L_0x0028:
            r4 = r7
            r7 = r9
            r9 = r5
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            r5 = 101(0x65, float:1.42E-43)
            if (r7 == r5) goto L_0x0035
            r5 = 69
            if (r7 != r5) goto L_0x007b
        L_0x0035:
            if (r9 < r0) goto L_0x003e
            r6._inputPtr = r8
            com.fasterxml.jackson.core.JsonToken r7 = r6._parseNumber2(r10, r8)
            return r7
        L_0x003e:
            char[] r7 = r6._inputBuffer
            int r5 = r9 + 1
            char r7 = r7[r9]
            r9 = 45
            if (r7 == r9) goto L_0x004f
            r9 = 43
            if (r7 != r9) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r9 = r5
            goto L_0x005e
        L_0x004f:
            if (r5 < r0) goto L_0x0058
            r6._inputPtr = r8
            com.fasterxml.jackson.core.JsonToken r7 = r6._parseNumber2(r10, r8)
            return r7
        L_0x0058:
            char[] r7 = r6._inputBuffer
            int r9 = r5 + 1
            char r7 = r7[r5]
        L_0x005e:
            if (r7 > r1) goto L_0x0074
            if (r7 < r2) goto L_0x0074
            int r3 = r3 + 1
            if (r9 < r0) goto L_0x006d
            r6._inputPtr = r8
            com.fasterxml.jackson.core.JsonToken r7 = r6._parseNumber2(r10, r8)
            return r7
        L_0x006d:
            char[] r7 = r6._inputBuffer
            int r5 = r9 + 1
            char r7 = r7[r9]
            goto L_0x004d
        L_0x0074:
            if (r3 != 0) goto L_0x007b
            java.lang.String r0 = "Exponent indicator not followed by a digit"
            r6.reportUnexpectedNumberChar(r7, r0)
        L_0x007b:
            int r9 = r9 + -1
            r6._inputPtr = r9
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r6._parsingContext
            boolean r0 = r0.inRoot()
            if (r0 == 0) goto L_0x008a
            r6._verifyRootSpace(r7)
        L_0x008a:
            int r9 = r9 - r8
            com.fasterxml.jackson.core.util.TextBuffer r7 = r6._textBuffer
            char[] r0 = r6._inputBuffer
            r7.resetWithShared(r0, r8, r9)
            com.fasterxml.jackson.core.JsonToken r7 = r6.resetFloat(r10, r11, r4, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._parseFloat(int, int, int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private String _parseName2(int i, int i2, int i3) {
        this._textBuffer.resetWithShared(this._inputBuffer, i, this._inputPtr - i);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            char c = cArr[i4];
            if (c <= '\\') {
                if (c == '\\') {
                    c = _decodeEscaped();
                } else if (c <= i3) {
                    if (c == i3) {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        TextBuffer textBuffer = this._textBuffer;
                        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i2);
                    } else if (c < ' ') {
                        _throwUnquotedSpace(c, "name");
                    }
                }
            }
            i2 = (i2 * 33) + c;
            int i5 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c;
            if (i5 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i5;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.fasterxml.jackson.core.JsonToken _parseNumber2(boolean r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 == 0) goto L_0x0009
            int r2 = r19 + 1
            goto L_0x000b
        L_0x0009:
            r2 = r19
        L_0x000b:
            r0._inputPtr = r2
            com.fasterxml.jackson.core.util.TextBuffer r2 = r0._textBuffer
            char[] r2 = r2.emptyAndGetCurrentSegment()
            r3 = 45
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x001d
            r2[r4] = r3
            r6 = 1
            goto L_0x001e
        L_0x001d:
            r6 = 0
        L_0x001e:
            int r7 = r0._inputPtr
            int r8 = r0._inputEnd
            if (r7 >= r8) goto L_0x002f
            char[] r7 = r0._inputBuffer
            int r8 = r0._inputPtr
            int r9 = r8 + 1
            r0._inputPtr = r9
            char r7 = r7[r8]
            goto L_0x0037
        L_0x002f:
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            java.lang.String r8 = "No digit following minus sign"
            char r7 = r0.getNextChar(r8, r7)
        L_0x0037:
            r8 = 48
            if (r7 != r8) goto L_0x003f
            char r7 = r17._verifyNoLeadingZeroes()
        L_0x003f:
            r9 = r2
            r2 = 0
        L_0x0041:
            r10 = 57
            if (r7 < r8) goto L_0x0074
            if (r7 > r10) goto L_0x0074
            int r2 = r2 + 1
            int r11 = r9.length
            if (r6 < r11) goto L_0x0054
            com.fasterxml.jackson.core.util.TextBuffer r6 = r0._textBuffer
            char[] r6 = r6.finishCurrentSegment()
            r9 = r6
            r6 = 0
        L_0x0054:
            int r11 = r6 + 1
            r9[r6] = r7
            int r6 = r0._inputPtr
            int r7 = r0._inputEnd
            if (r6 < r7) goto L_0x0068
            boolean r6 = r17._loadMore()
            if (r6 != 0) goto L_0x0068
            r6 = r11
            r7 = 0
            r11 = 1
            goto L_0x0075
        L_0x0068:
            char[] r6 = r0._inputBuffer
            int r7 = r0._inputPtr
            int r10 = r7 + 1
            r0._inputPtr = r10
            char r7 = r6[r7]
            r6 = r11
            goto L_0x0041
        L_0x0074:
            r11 = 0
        L_0x0075:
            if (r2 != 0) goto L_0x007c
            com.fasterxml.jackson.core.JsonToken r1 = r0._handleInvalidNumberStart(r7, r1)
            return r1
        L_0x007c:
            r12 = 46
            if (r7 != r12) goto L_0x00cb
            int r12 = r9.length
            if (r6 < r12) goto L_0x008a
            com.fasterxml.jackson.core.util.TextBuffer r6 = r0._textBuffer
            char[] r9 = r6.finishCurrentSegment()
            r6 = 0
        L_0x008a:
            int r12 = r6 + 1
            r9[r6] = r7
            r6 = 0
        L_0x008f:
            int r13 = r0._inputPtr
            int r14 = r0._inputEnd
            if (r13 < r14) goto L_0x009d
            boolean r13 = r17._loadMore()
            if (r13 != 0) goto L_0x009d
            r11 = 1
            goto L_0x00bd
        L_0x009d:
            char[] r7 = r0._inputBuffer
            int r13 = r0._inputPtr
            int r14 = r13 + 1
            r0._inputPtr = r14
            char r7 = r7[r13]
            if (r7 < r8) goto L_0x00bd
            if (r7 > r10) goto L_0x00bd
            int r6 = r6 + 1
            int r13 = r9.length
            if (r12 < r13) goto L_0x00b7
            com.fasterxml.jackson.core.util.TextBuffer r9 = r0._textBuffer
            char[] r9 = r9.finishCurrentSegment()
            r12 = 0
        L_0x00b7:
            int r13 = r12 + 1
            r9[r12] = r7
            r12 = r13
            goto L_0x008f
        L_0x00bd:
            if (r6 != 0) goto L_0x00c4
            java.lang.String r13 = "Decimal point not followed by a digit"
            r0.reportUnexpectedNumberChar(r7, r13)
        L_0x00c4:
            r16 = r11
            r11 = r6
            r6 = r12
            r12 = r16
            goto L_0x00cd
        L_0x00cb:
            r12 = r11
            r11 = 0
        L_0x00cd:
            r13 = 101(0x65, float:1.42E-43)
            if (r7 == r13) goto L_0x00dc
            r13 = 69
            if (r7 != r13) goto L_0x00d6
            goto L_0x00dc
        L_0x00d6:
            r3 = r1
            r1 = r12
            r12 = r2
            r2 = r0
            goto L_0x017b
        L_0x00dc:
            int r13 = r9.length
            if (r6 < r13) goto L_0x00e6
            com.fasterxml.jackson.core.util.TextBuffer r6 = r0._textBuffer
            char[] r9 = r6.finishCurrentSegment()
            r6 = 0
        L_0x00e6:
            int r13 = r6 + 1
            r9[r6] = r7
            int r6 = r0._inputPtr
            int r7 = r0._inputEnd
            java.lang.String r14 = "expected a digit for number exponent"
            if (r6 >= r7) goto L_0x00fd
            char[] r6 = r0._inputBuffer
            int r7 = r0._inputPtr
            int r15 = r7 + 1
            r0._inputPtr = r15
            char r6 = r6[r7]
            goto L_0x0101
        L_0x00fd:
            char r6 = r0.getNextChar(r14)
        L_0x0101:
            if (r6 == r3) goto L_0x010f
            r3 = 43
            if (r6 != r3) goto L_0x0108
            goto L_0x010f
        L_0x0108:
            r3 = r1
            r7 = r6
            r6 = r12
            r1 = 0
            r12 = r2
            r2 = r0
            goto L_0x013e
        L_0x010f:
            int r3 = r9.length
            if (r13 < r3) goto L_0x0119
            com.fasterxml.jackson.core.util.TextBuffer r3 = r0._textBuffer
            char[] r9 = r3.finishCurrentSegment()
            r13 = 0
        L_0x0119:
            int r3 = r13 + 1
            r9[r13] = r6
            int r6 = r0._inputPtr
            int r7 = r0._inputEnd
            if (r6 >= r7) goto L_0x012e
            char[] r6 = r0._inputBuffer
            int r7 = r0._inputPtr
            int r13 = r7 + 1
            r0._inputPtr = r13
            char r6 = r6[r7]
            goto L_0x0132
        L_0x012e:
            char r6 = r0.getNextChar(r14)
        L_0x0132:
            r7 = r1
            r13 = r12
            r1 = 0
            r12 = r2
            r2 = r0
        L_0x0137:
            r16 = r13
            r13 = r3
            r3 = r7
            r7 = r6
            r6 = r16
        L_0x013e:
            if (r7 > r10) goto L_0x0171
            if (r7 < r8) goto L_0x0171
            int r1 = r1 + 1
            int r14 = r9.length
            if (r13 < r14) goto L_0x014e
            com.fasterxml.jackson.core.util.TextBuffer r9 = r2._textBuffer
            char[] r9 = r9.finishCurrentSegment()
            r13 = 0
        L_0x014e:
            int r14 = r13 + 1
            r9[r13] = r7
            int r13 = r2._inputPtr
            int r15 = r2._inputEnd
            if (r13 < r15) goto L_0x0162
            boolean r13 = r2._loadMore()
            if (r13 != 0) goto L_0x0162
            r4 = r1
            r6 = r14
            r1 = 1
            goto L_0x0174
        L_0x0162:
            char[] r7 = r2._inputBuffer
            int r13 = r2._inputPtr
            int r15 = r13 + 1
            r2._inputPtr = r15
            char r7 = r7[r13]
            r13 = r6
            r6 = r7
            r7 = r3
            r3 = r14
            goto L_0x0137
        L_0x0171:
            r4 = r1
            r1 = r6
            r6 = r13
        L_0x0174:
            if (r4 != 0) goto L_0x017b
            java.lang.String r8 = "Exponent indicator not followed by a digit"
            r2.reportUnexpectedNumberChar(r7, r8)
        L_0x017b:
            if (r1 != 0) goto L_0x018d
            int r1 = r2._inputPtr
            int r1 = r1 - r5
            r2._inputPtr = r1
            com.fasterxml.jackson.core.json.JsonReadContext r1 = r2._parsingContext
            boolean r1 = r1.inRoot()
            if (r1 == 0) goto L_0x018d
            r2._verifyRootSpace(r7)
        L_0x018d:
            com.fasterxml.jackson.core.util.TextBuffer r1 = r2._textBuffer
            r1.setCurrentLength(r6)
            com.fasterxml.jackson.core.JsonToken r1 = r2.reset(r3, r12, r11, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._parseNumber2(boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private final int _skipAfterComma2() {
        char c;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        _skipComment();
                    } else if (c != '#' || !_skipYAMLComment()) {
                        return c;
                    }
                } else if (c < ' ') {
                    if (c == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (c == 13) {
                        _skipCR();
                    } else if (c != 9) {
                        _throwInvalidSpace(c);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder("Unexpected end-of-input within/between ");
                sb.append(this._parsingContext.typeDesc());
                sb.append(" entries");
                throw _constructError(sb.toString());
            }
        }
        return c;
    }

    private void _skipCComment() {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c <= '*') {
                if (c == '*') {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        break;
                    } else if (this._inputBuffer[this._inputPtr] == '/') {
                        this._inputPtr++;
                        return;
                    }
                } else if (c < ' ') {
                    if (c == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (c == 13) {
                        _skipCR();
                    } else if (c != 9) {
                        _throwInvalidSpace(c);
                    }
                }
            }
        }
        _reportInvalidEOF(" in a comment", null);
    }

    private final int _skipColon() {
        if (this._inputPtr + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        char c = this._inputBuffer[this._inputPtr];
        if (c == ':') {
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr + 1;
            this._inputPtr = i;
            char c2 = cArr[i];
            if (c2 <= ' ') {
                if (c2 == ' ' || c2 == 9) {
                    char[] cArr2 = this._inputBuffer;
                    int i2 = this._inputPtr + 1;
                    this._inputPtr = i2;
                    char c3 = cArr2[i2];
                    if (c3 > ' ') {
                        if (c3 == '/' || c3 == '#') {
                            return _skipColon2(true);
                        }
                        this._inputPtr++;
                        return c3;
                    }
                }
                return _skipColon2(true);
            } else if (c2 == '/' || c2 == '#') {
                return _skipColon2(true);
            } else {
                this._inputPtr++;
                return c2;
            }
        } else {
            if (c == ' ' || c == 9) {
                char[] cArr3 = this._inputBuffer;
                int i3 = this._inputPtr + 1;
                this._inputPtr = i3;
                c = cArr3[i3];
            }
            if (c != ':') {
                return _skipColon2(false);
            }
            char[] cArr4 = this._inputBuffer;
            int i4 = this._inputPtr + 1;
            this._inputPtr = i4;
            char c4 = cArr4[i4];
            if (c4 <= ' ') {
                if (c4 == ' ' || c4 == 9) {
                    char[] cArr5 = this._inputBuffer;
                    int i5 = this._inputPtr + 1;
                    this._inputPtr = i5;
                    char c5 = cArr5[i5];
                    if (c5 > ' ') {
                        if (c5 == '/' || c5 == '#') {
                            return _skipColon2(true);
                        }
                        this._inputPtr++;
                        return c5;
                    }
                }
                return _skipColon2(true);
            } else if (c4 == '/' || c4 == '#') {
                return _skipColon2(true);
            } else {
                this._inputPtr++;
                return c4;
            }
        }
    }

    private final int _skipColon2(boolean z) {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                char c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        _skipComment();
                    } else if (c != '#' || !_skipYAMLComment()) {
                        if (z) {
                            return c;
                        }
                        if (c != ':') {
                            _reportUnexpectedChar(c, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                    }
                } else if (c < ' ') {
                    if (c == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (c == 13) {
                        _skipCR();
                    } else if (c != 9) {
                        _throwInvalidSpace(c);
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

    private final int _skipComma(int i) {
        if (i != 44) {
            StringBuilder sb = new StringBuilder("was expecting comma to separate ");
            sb.append(this._parsingContext.typeDesc());
            sb.append(" entries");
            _reportUnexpectedChar(i, sb.toString());
        }
        while (this._inputPtr < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c = cArr[i2];
            if (c > ' ') {
                if (c != '/' && c != '#') {
                    return c;
                }
                this._inputPtr--;
                return _skipAfterComma2();
            } else if (c < ' ') {
                if (c == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (c == 13) {
                    _skipCR();
                } else if (c != 9) {
                    _throwInvalidSpace(c);
                }
            }
        }
        return _skipAfterComma2();
    }

    private void _skipComment() {
        if (!isEnabled(Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        char[] cArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        char c = cArr[i];
        if (c == '/') {
            _skipLine();
        } else if (c == '*') {
            _skipCComment();
        } else {
            _reportUnexpectedChar(c, "was expecting either '*' or '/' for a comment");
        }
    }

    private void _skipLine() {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                char c = cArr[i];
                if (c < ' ') {
                    if (c == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                        return;
                    } else if (c == 13) {
                        _skipCR();
                        return;
                    } else if (c != 9) {
                        _throwInvalidSpace(c);
                    }
                }
            } else {
                return;
            }
        }
    }

    private final int _skipWSOrEnd() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        char[] cArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        char c = cArr[i];
        if (c <= ' ') {
            if (c != ' ') {
                if (c == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (c == 13) {
                    _skipCR();
                } else if (c != 9) {
                    _throwInvalidSpace(c);
                }
            }
            while (this._inputPtr < this._inputEnd) {
                char[] cArr2 = this._inputBuffer;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                char c2 = cArr2[i2];
                if (c2 > ' ') {
                    if (c2 != '/' && c2 != '#') {
                        return c2;
                    }
                    this._inputPtr--;
                    return _skipWSOrEnd2();
                } else if (c2 != ' ') {
                    if (c2 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (c2 == 13) {
                        _skipCR();
                    } else if (c2 != 9) {
                        _throwInvalidSpace(c2);
                    }
                }
            }
            return _skipWSOrEnd2();
        } else if (c != '/' && c != '#') {
            return c;
        } else {
            this._inputPtr--;
            return _skipWSOrEnd2();
        }
    }

    private int _skipWSOrEnd2() {
        char c;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    _skipComment();
                } else if (c != '#' || !_skipYAMLComment()) {
                    return c;
                }
            } else if (c != ' ') {
                if (c == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (c == 13) {
                    _skipCR();
                } else if (c != 9) {
                    _throwInvalidSpace(c);
                }
            }
        }
        return c;
    }

    private boolean _skipYAMLComment() {
        if (!isEnabled(Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        int i = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i);
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        int i = this._inputPtr;
        this._nameStartOffset = (long) i;
        this._nameStartRow = this._currInputRow;
        this._nameStartCol = i - this._currInputRowStart;
    }

    private char _verifyNLZ2() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return '0';
        }
        char c = this._inputBuffer[this._inputPtr];
        if (c < '0' || c > '9') {
            return '0';
        }
        if (!isEnabled(Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (c == '0') {
            do {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    break;
                }
                c = this._inputBuffer[this._inputPtr];
                if (c < '0' || c > '9') {
                    return '0';
                }
                this._inputPtr++;
            } while (c == '0');
        }
        return c;
    }

    private final char _verifyNoLeadingZeroes() {
        if (this._inputPtr < this._inputEnd) {
            char c = this._inputBuffer[this._inputPtr];
            if (c < '0' || c > '9') {
                return '0';
            }
        }
        return _verifyNLZ2();
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

    public void _closeInput() {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    /* access modifiers changed from: protected */
    public byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c);
                if (decodeBase64Char < 0) {
                    if (c == '\"') {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                char c2 = cArr2[i2];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c2, 1);
                }
                int i3 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                char c3 = cArr3[i4];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c3 != '\"' || base64Variant.usesPadding()) {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, c3, 2);
                        } else {
                            _getByteArrayBuilder.append(i3 >> 4);
                            return _getByteArrayBuilder.toByteArray();
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i5 = this._inputPtr;
                        this._inputPtr = i5 + 1;
                        char c4 = cArr4[i5];
                        if (base64Variant.usesPaddingChar(c4)) {
                            _getByteArrayBuilder.append(i3 >> 4);
                        } else {
                            StringBuilder sb = new StringBuilder("expected padding character '");
                            sb.append(base64Variant.getPaddingChar());
                            sb.append("'");
                            throw reportInvalidBase64Char(base64Variant, c4, 3, sb.toString());
                        }
                    }
                }
                int i6 = (i3 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                char c5 = cArr5[i7];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c5 != '\"' || base64Variant.usesPadding()) {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, c5, 3);
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

    public char _decodeEscaped() {
        String str = " in character escape sequence";
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(str, JsonToken.VALUE_STRING);
        }
        char[] cArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        char c = cArr[i];
        if (!(c == '\"' || c == '/' || c == '\\')) {
            if (c == 'b') {
                c = 8;
            } else if (c == 'f') {
                return 12;
            } else {
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    return _handleUnrecognizedCharacterEscape(c);
                }
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        _reportInvalidEOF(str, JsonToken.VALUE_STRING);
                    }
                    char[] cArr2 = this._inputBuffer;
                    int i4 = this._inputPtr;
                    this._inputPtr = i4 + 1;
                    char c2 = cArr2[i4];
                    int charToHex = CharTypes.charToHex(c2);
                    if (charToHex < 0) {
                        _reportUnexpectedChar(c2, "expected a hex-digit for character escape sequence");
                    }
                    i2 = (i2 << 4) | charToHex;
                }
                return (char) i2;
            }
        }
        return c;
    }

    public final void _finishString() {
        int i = this._inputPtr;
        int i2 = this._inputEnd;
        if (i < i2) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            while (true) {
                char c = this._inputBuffer[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    TextBuffer textBuffer = this._textBuffer;
                    char[] cArr = this._inputBuffer;
                    int i3 = this._inputPtr;
                    textBuffer.resetWithShared(cArr, i3, i - i3);
                    this._inputPtr = i + 1;
                    return;
                }
            }
        }
        TextBuffer textBuffer2 = this._textBuffer;
        char[] cArr2 = this._inputBuffer;
        int i4 = this._inputPtr;
        textBuffer2.resetWithCopy(cArr2, i4, i - i4);
        this._inputPtr = i;
        _finishString2();
    }

    /* access modifiers changed from: protected */
    public void _finishString2() {
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int[] iArr = _icLatin1;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c < length && iArr[c] != 0) {
                if (c == '\"') {
                    this._textBuffer.setCurrentLength(currentSegmentSize);
                    return;
                } else if (c == '\\') {
                    c = _decodeEscaped();
                } else if (c < ' ') {
                    _throwUnquotedSpace(c, "string value");
                }
            }
            if (currentSegmentSize >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int i2 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c;
            currentSegmentSize = i2;
        }
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
    public JsonToken _handleApos() {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    c = _decodeEscaped();
                } else if (c <= '\'') {
                    if (c == '\'') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return JsonToken.VALUE_STRING;
                    } else if (c < ' ') {
                        _throwUnquotedSpace(c, "string value");
                    }
                }
            }
            if (currentSegmentSize >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int i2 = currentSegmentSize + 1;
            emptyAndGetCurrentSegment[currentSegmentSize] = c;
            currentSegmentSize = i2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=char, for r9v0, types: [int] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(char r9, boolean r10) {
        /*
            r8 = this;
            r0 = 73
            if (r9 != r0) goto L_0x008b
            int r9 = r8._inputPtr
            int r0 = r8._inputEnd
            if (r9 < r0) goto L_0x0015
            boolean r9 = r8._loadMore()
            if (r9 != 0) goto L_0x0015
            com.fasterxml.jackson.core.JsonToken r9 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r8._reportInvalidEOFInValue(r9)
        L_0x0015:
            char[] r9 = r8._inputBuffer
            int r0 = r8._inputPtr
            int r1 = r0 + 1
            r8._inputPtr = r1
            char r9 = r9[r0]
            r0 = 78
            r1 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r3 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            java.lang.String r5 = "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            java.lang.String r6 = "Non-standard token '"
            r7 = 3
            if (r9 != r0) goto L_0x005a
            if (r10 == 0) goto L_0x0031
            java.lang.String r0 = "-INF"
            goto L_0x0033
        L_0x0031:
            java.lang.String r0 = "+INF"
        L_0x0033:
            r8._matchToken(r0, r7)
            com.fasterxml.jackson.core.JsonParser$Feature r7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r7 = r8.isEnabled(r7)
            if (r7 == 0) goto L_0x0047
            if (r10 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r1 = r3
        L_0x0042:
            com.fasterxml.jackson.core.JsonToken r9 = r8.resetAsNaN(r0, r1)
            return r9
        L_0x0047:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            r10.append(r0)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            r8._reportError(r10)
            goto L_0x008b
        L_0x005a:
            r0 = 110(0x6e, float:1.54E-43)
            if (r9 != r0) goto L_0x008b
            if (r10 == 0) goto L_0x0063
            java.lang.String r0 = "-Infinity"
            goto L_0x0065
        L_0x0063:
            java.lang.String r0 = "+Infinity"
        L_0x0065:
            r8._matchToken(r0, r7)
            com.fasterxml.jackson.core.JsonParser$Feature r7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r7 = r8.isEnabled(r7)
            if (r7 == 0) goto L_0x0079
            if (r10 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r1 = r3
        L_0x0074:
            com.fasterxml.jackson.core.JsonToken r9 = r8.resetAsNaN(r0, r1)
            return r9
        L_0x0079:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            r10.append(r0)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            r8._reportError(r10)
        L_0x008b:
            java.lang.String r10 = "expected digit (0-9) to follow minus sign, for valid numeric value"
            r8.reportUnexpectedNumberChar(r9, r10)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleInvalidNumberStart(int, boolean):com.fasterxml.jackson.core.JsonToken");
    }

    /* access modifiers changed from: protected */
    public String _handleOddName(int i) {
        if (i == 39 && isEnabled(Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseAposName();
        }
        if (!isEnabled(Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            _reportUnexpectedChar(i, "was expecting double-quote to start field name");
        }
        int[] inputCodeLatin1JsNames = CharTypes.getInputCodeLatin1JsNames();
        int length = inputCodeLatin1JsNames.length;
        boolean z = i < length ? inputCodeLatin1JsNames[i] == 0 : Character.isJavaIdentifierPart((char) i);
        if (!z) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i2 = this._inputPtr;
        int i3 = this._hashSeed;
        int i4 = this._inputEnd;
        if (i2 < i4) {
            do {
                char c = this._inputBuffer[i2];
                if (c < length) {
                    if (inputCodeLatin1JsNames[c] != 0) {
                        int i5 = this._inputPtr - 1;
                        this._inputPtr = i2;
                        return this._symbols.findSymbol(this._inputBuffer, i5, i2 - i5, i3);
                    }
                } else if (!Character.isJavaIdentifierPart((char) c)) {
                    int i6 = this._inputPtr - 1;
                    this._inputPtr = i2;
                    return this._symbols.findSymbol(this._inputBuffer, i6, i2 - i6, i3);
                }
                i3 = (i3 * 33) + c;
                i2++;
            } while (i2 < i4);
        }
        int i7 = this._inputPtr - 1;
        this._inputPtr = i2;
        return _handleOddName2(i7, i3, inputCodeLatin1JsNames);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r4 != 44) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r3._parsingContext.inArray() != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken _handleOddValue(int r4) {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L_0x0088
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L_0x006e
            r0 = 78
            if (r4 == r0) goto L_0x0054
            r0 = 93
            if (r4 == r0) goto L_0x003c
            r0 = 43
            if (r4 == r0) goto L_0x001b
            r0 = 44
            if (r4 == r0) goto L_0x0044
            goto L_0x0095
        L_0x001b:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L_0x002c
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L_0x002c
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L_0x002c:
            char[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            char r4 = r4[r0]
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L_0x003c:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 == 0) goto L_0x0095
        L_0x0044:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0095
            int r4 = r3._inputPtr
            int r4 = r4 - r1
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L_0x0054:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L_0x0068
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L_0x0068:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L_0x0095
        L_0x006e:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L_0x0082
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L_0x0082:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L_0x0095
        L_0x0088:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0095
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L_0x0095:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00ad
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "('true', 'false' or 'null')"
            r3._reportInvalidToken(r0, r1)
        L_0x00ad:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* access modifiers changed from: protected */
    public boolean _loadMore() {
        int i = this._inputEnd;
        long j = (long) i;
        this._currInputProcessed += j;
        this._currInputRowStart -= i;
        this._nameStartOffset -= j;
        Reader reader = this._reader;
        if (reader != null) {
            char[] cArr = this._inputBuffer;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                StringBuilder sb = new StringBuilder("Reader returned 0 characters when trying to read ");
                sb.append(this._inputEnd);
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
        char c = this._inputBuffer[this._inputPtr];
        if (!(c < '0' || c == ']' || c == '}')) {
            _checkMatchEnd(str, i, c);
        }
    }

    /* access modifiers changed from: protected */
    public String _parseAposName() {
        int i = this._inputPtr;
        int i2 = this._hashSeed;
        int i3 = this._inputEnd;
        if (i < i3) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            do {
                char c = this._inputBuffer[i];
                if (c != '\'') {
                    if (c < length && iArr[c] != 0) {
                        break;
                    }
                    i2 = (i2 * 33) + c;
                    i++;
                } else {
                    int i4 = this._inputPtr;
                    this._inputPtr = i + 1;
                    return this._symbols.findSymbol(this._inputBuffer, i4, i - i4, i2);
                }
            } while (i < i3);
        }
        int i5 = this._inputPtr;
        this._inputPtr = i;
        return _parseName2(i5, i2, 39);
    }

    /* access modifiers changed from: protected */
    public final String _parseName() {
        int i = this._inputPtr;
        int i2 = this._hashSeed;
        int[] iArr = _icLatin1;
        while (true) {
            if (i >= this._inputEnd) {
                break;
            }
            char c = this._inputBuffer[i];
            if (c >= iArr.length || iArr[c] == 0) {
                i2 = (i2 * 33) + c;
                i++;
            } else if (c == '\"') {
                int i3 = this._inputPtr;
                this._inputPtr = i + 1;
                return this._symbols.findSymbol(this._inputBuffer, i3, i - i3, i2);
            }
        }
        int i4 = this._inputPtr;
        this._inputPtr = i;
        return _parseName2(i4, i2, 34);
    }

    /* access modifiers changed from: protected */
    public final JsonToken _parseNegNumber() {
        int i = this._inputPtr;
        int i2 = i - 1;
        int i3 = this._inputEnd;
        if (i >= i3) {
            return _parseNumber2(true, i2);
        }
        int i4 = i + 1;
        char c = this._inputBuffer[i];
        if (c > '9' || c < '0') {
            this._inputPtr = i4;
            return _handleInvalidNumberStart(c, true);
        } else if (c == '0') {
            return _parseNumber2(true, i2);
        } else {
            int i5 = 1;
            while (i4 < i3) {
                int i6 = i4 + 1;
                char c2 = this._inputBuffer[i4];
                if (c2 >= '0' && c2 <= '9') {
                    i5++;
                    i4 = i6;
                } else if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this._inputPtr = i6;
                    return _parseFloat(c2, i2, i6, true, i5);
                } else {
                    int i7 = i6 - 1;
                    this._inputPtr = i7;
                    if (this._parsingContext.inRoot()) {
                        _verifyRootSpace(c2);
                    }
                    this._textBuffer.resetWithShared(this._inputBuffer, i2, i7 - i2);
                    return resetInt(true, i5);
                }
            }
            return _parseNumber2(true, i2);
        }
    }

    /* access modifiers changed from: protected */
    public final JsonToken _parsePosNumber(int i) {
        int i2 = this._inputPtr;
        int i3 = i2 - 1;
        int i4 = this._inputEnd;
        if (i == 48) {
            return _parseNumber2(false, i3);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            char c = this._inputBuffer[i2];
            if (c >= '0' && c <= '9') {
                i5++;
                i2 = i6;
            } else if (c == '.' || c == 'e' || c == 'E') {
                this._inputPtr = i6;
                return _parseFloat(c, i3, i6, false, i5);
            } else {
                int i7 = i6 - 1;
                this._inputPtr = i7;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i3, i7 - i3);
                return resetInt(false, i5);
            }
        }
        this._inputPtr = i3;
        return _parseNumber2(false, i3);
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
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            char c = cArr[i4];
            if (c > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c);
                if (decodeBase64Char < 0) {
                    if (c == '\"') {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c, 0);
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
                char[] cArr2 = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                char c2 = cArr2[i5];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c2, 1);
                }
                int i6 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                char c3 = cArr3[i7];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c3 == '\"' && !base64Variant.usesPadding()) {
                            int i8 = i3 + 1;
                            bArr[i3] = (byte) (i6 >> 4);
                            i3 = i8;
                            break;
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, c3, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i9 = this._inputPtr;
                        this._inputPtr = i9 + 1;
                        char c4 = cArr4[i9];
                        if (base64Variant.usesPaddingChar(c4)) {
                            i = i3 + 1;
                            bArr[i3] = (byte) (i6 >> 4);
                            i3 = i;
                        } else {
                            StringBuilder sb = new StringBuilder("expected padding character '");
                            sb.append(base64Variant.getPaddingChar());
                            sb.append("'");
                            throw reportInvalidBase64Char(base64Variant, c4, 3, sb.toString());
                        }
                    }
                }
                int i10 = (i6 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                char c5 = cArr5[i11];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c5 == '\"' && !base64Variant.usesPadding()) {
                            int i12 = i10 >> 2;
                            int i13 = i3 + 1;
                            bArr[i3] = (byte) (i12 >> 8);
                            i3 = i13 + 1;
                            bArr[i13] = (byte) i12;
                            break;
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, c5, 3);
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
            char[] cArr = this._inputBuffer;
            if (cArr != null) {
                this._inputBuffer = null;
                this._ioContext.releaseTokenBuffer(cArr);
            }
        }
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
            char c = this._inputBuffer[this._inputPtr];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this._inputPtr++;
            sb.append(c);
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
    public final void _skipString() {
        this._tokenIncomplete = false;
        int i = this._inputPtr;
        int i2 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i >= i2) {
                this._inputPtr = i;
                if (!_loadMore()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this._inputPtr = i3;
                    _decodeEscaped();
                    i = this._inputPtr;
                    i2 = this._inputEnd;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this._inputPtr = i3;
                        return;
                    } else if (c < ' ') {
                        this._inputPtr = i3;
                        _throwUnquotedSpace(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT && this._binaryValue != null) {
            return this._binaryValue;
        }
        if (this._currToken != JsonToken.VALUE_STRING) {
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
        int i = (this._inputPtr - this._currInputRowStart) + 1;
        JsonLocation jsonLocation = new JsonLocation(_getSourceReference(), -1, ((long) this._inputPtr) + this._currInputProcessed, this._currInputRow, i);
        return jsonLocation;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public char getNextChar(String str) {
        return getNextChar(str, null);
    }

    /* access modifiers changed from: protected */
    public char getNextChar(String str, JsonToken jsonToken) {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(str, jsonToken);
        }
        char[] cArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return cArr[i];
    }

    public final String getText() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    public final char[] getTextCharacters() {
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

    public final int getTextLength() {
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
    public final int getTextOffset() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextOffset():int");
    }

    public JsonLocation getTokenLocation() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            JsonLocation jsonLocation = new JsonLocation(_getSourceReference(), -1, this._currInputProcessed + (this._nameStartOffset - 1), this._nameStartRow, this._nameStartCol);
            return jsonLocation;
        }
        JsonLocation jsonLocation2 = new JsonLocation(_getSourceReference(), -1, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
        return jsonLocation2;
    }

    public final String getValueAsString() {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return this._currToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    public final String getValueAsString(String str) {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return this._currToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(str);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
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
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return null;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
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
        String _parseName = _skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd);
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
                    jsonToken = _handleOddValue(_skipColon);
                    break;
            }
        } else {
            jsonToken = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken;
        return _parseName;
    }

    public final String nextTextValue() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.contentsAsString();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        } else if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        } else {
            return null;
        }
    }

    public final JsonToken nextToken() {
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
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return this._currToken;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return this._currToken;
            }
        }
        boolean inObject = this._parsingContext.inObject();
        if (inObject) {
            _updateNameLocation();
            this._parsingContext.setCurrentName(_skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd));
            this._currToken = JsonToken.FIELD_NAME;
            _skipWSOrEnd = _skipColon();
        }
        _updateLocation();
        if (_skipWSOrEnd == 34) {
            this._tokenIncomplete = true;
            jsonToken = JsonToken.VALUE_STRING;
        } else if (_skipWSOrEnd == 45) {
            jsonToken = _parseNegNumber();
        } else if (_skipWSOrEnd == 91) {
            if (!inObject) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            }
            jsonToken = JsonToken.START_ARRAY;
        } else if (_skipWSOrEnd == 102) {
            _matchFalse();
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (_skipWSOrEnd != 110) {
            if (_skipWSOrEnd != 116) {
                if (_skipWSOrEnd == 123) {
                    if (!inObject) {
                        this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                    }
                    jsonToken = JsonToken.START_OBJECT;
                } else if (_skipWSOrEnd != 125) {
                    switch (_skipWSOrEnd) {
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
                            jsonToken = _parsePosNumber(_skipWSOrEnd);
                            break;
                        default:
                            jsonToken = _handleOddValue(_skipWSOrEnd);
                            break;
                    }
                } else {
                    _reportUnexpectedChar(_skipWSOrEnd, "expected a value");
                }
            }
            _matchTrue();
            jsonToken = JsonToken.VALUE_TRUE;
        } else {
            _matchNull();
            jsonToken = JsonToken.VALUE_NULL;
        }
        if (inObject) {
            this._nextToken = jsonToken;
            return this._currToken;
        }
        this._currToken = jsonToken;
        return jsonToken;
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
}
