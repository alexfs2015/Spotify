package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NodeCursor.ArrayCursor;
import com.fasterxml.jackson.databind.node.NodeCursor.ObjectCursor;
import com.fasterxml.jackson.databind.node.NodeCursor.RootCursor;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TreeTraversingParser extends ParserMinimalBase {
    protected boolean _closed;
    protected JsonToken _nextToken;
    protected NodeCursor _nodeCursor;
    protected ObjectCodec _objectCodec;
    protected boolean _startContainer;

    /* renamed from: com.fasterxml.jackson.databind.node.TreeTraversingParser$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.fasterxml.jackson.core.JsonToken[] r0 = com.fasterxml.jackson.core.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$core$JsonToken = r0
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.TreeTraversingParser.AnonymousClass1.<clinit>():void");
        }
    }

    public TreeTraversingParser(JsonNode jsonNode, ObjectCodec objectCodec) {
        super(0);
        this._objectCodec = objectCodec;
        if (jsonNode.isArray()) {
            this._nextToken = JsonToken.START_ARRAY;
            this._nodeCursor = new ArrayCursor(jsonNode, null);
        } else if (jsonNode.isObject()) {
            this._nextToken = JsonToken.START_OBJECT;
            this._nodeCursor = new ObjectCursor(jsonNode, null);
        } else {
            this._nodeCursor = new RootCursor(jsonNode, null);
        }
    }

    public void _handleEOF() {
        _throwInternal();
    }

    public void close() {
        if (!this._closed) {
            this._closed = true;
            this._nodeCursor = null;
            this._currToken = null;
        }
    }

    /* access modifiers changed from: protected */
    public JsonNode currentNode() {
        if (!this._closed) {
            NodeCursor nodeCursor = this._nodeCursor;
            if (nodeCursor != null) {
                return nodeCursor.currentNode();
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonNode currentNumericNode() {
        JsonNode currentNode = currentNode();
        if (currentNode != null && currentNode.isNumber()) {
            return currentNode;
        }
        JsonToken asToken = currentNode == null ? null : currentNode.asToken();
        StringBuilder sb = new StringBuilder("Current token (");
        sb.append(asToken);
        sb.append(") not numeric, cannot use numeric value accessors");
        throw _constructError(sb.toString());
    }

    public BigInteger getBigIntegerValue() {
        return currentNumericNode().bigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        JsonNode currentNode = currentNode();
        if (currentNode != null) {
            byte[] binaryValue = currentNode.binaryValue();
            if (binaryValue != null) {
                return binaryValue;
            }
            if (currentNode.isPojo()) {
                Object pojo = ((POJONode) currentNode).getPojo();
                if (pojo instanceof byte[]) {
                    return (byte[]) pojo;
                }
            }
        }
        return null;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public JsonLocation getCurrentLocation() {
        return JsonLocation.NA;
    }

    public String getCurrentName() {
        NodeCursor nodeCursor = this._nodeCursor;
        if (nodeCursor == null) {
            return null;
        }
        return nodeCursor.getCurrentName();
    }

    public BigDecimal getDecimalValue() {
        return currentNumericNode().decimalValue();
    }

    public double getDoubleValue() {
        return currentNumericNode().doubleValue();
    }

    public Object getEmbeddedObject() {
        if (!this._closed) {
            JsonNode currentNode = currentNode();
            if (currentNode != null) {
                if (currentNode.isPojo()) {
                    return ((POJONode) currentNode).getPojo();
                }
                if (currentNode.isBinary()) {
                    return ((BinaryNode) currentNode).binaryValue();
                }
            }
        }
        return null;
    }

    public float getFloatValue() {
        return (float) currentNumericNode().doubleValue();
    }

    public int getIntValue() {
        return currentNumericNode().intValue();
    }

    public long getLongValue() {
        return currentNumericNode().longValue();
    }

    public NumberType getNumberType() {
        JsonNode currentNumericNode = currentNumericNode();
        if (currentNumericNode == null) {
            return null;
        }
        return currentNumericNode.numberType();
    }

    public Number getNumberValue() {
        return currentNumericNode().numberValue();
    }

    public JsonStreamContext getParsingContext() {
        return this._nodeCursor;
    }

    public String getText() {
        if (this._closed) {
            return null;
        }
        int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[this._currToken.ordinal()];
        if (i == 1) {
            return this._nodeCursor.getCurrentName();
        }
        if (i == 2) {
            return currentNode().textValue();
        }
        if (i == 3 || i == 4) {
            return String.valueOf(currentNode().numberValue());
        }
        if (i == 5) {
            JsonNode currentNode = currentNode();
            if (currentNode != null && currentNode.isBinary()) {
                return currentNode.asText();
            }
        }
        if (this._currToken == null) {
            return null;
        }
        return this._currToken.asString();
    }

    public char[] getTextCharacters() {
        return getText().toCharArray();
    }

    public int getTextLength() {
        return getText().length();
    }

    public int getTextOffset() {
        return 0;
    }

    public JsonLocation getTokenLocation() {
        return JsonLocation.NA;
    }

    public boolean hasTextCharacters() {
        return false;
    }

    public boolean isNaN() {
        if (!this._closed) {
            JsonNode currentNode = currentNode();
            if (currentNode instanceof NumericNode) {
                return ((NumericNode) currentNode).isNaN();
            }
        }
        return false;
    }

    public JsonToken nextToken() {
        JsonToken jsonToken = this._nextToken;
        if (jsonToken != null) {
            this._currToken = jsonToken;
            this._nextToken = null;
            return this._currToken;
        } else if (this._startContainer) {
            this._startContainer = false;
            if (!this._nodeCursor.currentHasChildren()) {
                this._currToken = this._currToken == JsonToken.START_OBJECT ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
                return this._currToken;
            }
            this._nodeCursor = this._nodeCursor.iterateChildren();
            this._currToken = this._nodeCursor.nextToken();
            if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
                this._startContainer = true;
            }
            return this._currToken;
        } else {
            NodeCursor nodeCursor = this._nodeCursor;
            if (nodeCursor == null) {
                this._closed = true;
                return null;
            }
            this._currToken = nodeCursor.nextToken();
            if (this._currToken != null) {
                if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
                    this._startContainer = true;
                }
                return this._currToken;
            }
            this._currToken = this._nodeCursor.endToken();
            this._nodeCursor = this._nodeCursor.getParent();
            return this._currToken;
        }
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        byte[] binaryValue = getBinaryValue(base64Variant);
        if (binaryValue == null) {
            return 0;
        }
        outputStream.write(binaryValue, 0, binaryValue.length);
        return binaryValue.length;
    }

    public JsonParser skipChildren() {
        if (this._currToken == JsonToken.START_OBJECT) {
            this._startContainer = false;
            this._currToken = JsonToken.END_OBJECT;
        } else if (this._currToken == JsonToken.START_ARRAY) {
            this._startContainer = false;
            this._currToken = JsonToken.END_ARRAY;
        }
        return this;
    }
}
