package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.RequestPayload;
import java.io.Closeable;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonParser implements Closeable {
    protected int _features;
    protected transient RequestPayload _requestPayload;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);
        
        private final boolean _defaultState;
        private final int _mask;

        private Feature(boolean z) {
            this._mask = 1 << ordinal();
            this._defaultState = z;
        }

        public static int collectDefaults() {
            Feature[] values;
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        public final boolean enabledByDefault() {
            return this._defaultState;
        }

        public final boolean enabledIn(int i) {
            return (i & this._mask) != 0;
        }

        public final int getMask() {
            return this._mask;
        }
    }

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    protected JsonParser() {
    }

    protected JsonParser(int i) {
        this._features = i;
    }

    /* access modifiers changed from: protected */
    public ObjectCodec _codec() {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec;
        }
        throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
    }

    /* access modifiers changed from: protected */
    public JsonParseException _constructError(String str) {
        return new JsonParseException(this, str).withRequestPayload(this._requestPayload);
    }

    /* access modifiers changed from: protected */
    public void _reportUnsupportedOperation() {
        StringBuilder sb = new StringBuilder("Operation not supported by parser of type ");
        sb.append(getClass().getName());
        throw new UnsupportedOperationException(sb.toString());
    }

    public boolean canReadObjectId() {
        return false;
    }

    public boolean canReadTypeId() {
        return false;
    }

    public abstract void clearCurrentToken();

    public abstract void close();

    public JsonToken currentToken() {
        return getCurrentToken();
    }

    public abstract BigInteger getBigIntegerValue();

    public byte[] getBinaryValue() {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public abstract byte[] getBinaryValue(Base64Variant base64Variant);

    public boolean getBooleanValue() {
        JsonToken currentToken = currentToken();
        if (currentToken == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (currentToken == JsonToken.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException(this, String.format("Current token (%s) not of boolean type", new Object[]{currentToken})).withRequestPayload(this._requestPayload);
    }

    public byte getByteValue() {
        int intValue = getIntValue();
        if (intValue >= -128 && intValue <= 255) {
            return (byte) intValue;
        }
        StringBuilder sb = new StringBuilder("Numeric value (");
        sb.append(getText());
        sb.append(") out of range of Java byte");
        throw _constructError(sb.toString());
    }

    public abstract ObjectCodec getCodec();

    public abstract JsonLocation getCurrentLocation();

    public abstract String getCurrentName();

    public abstract JsonToken getCurrentToken();

    public abstract int getCurrentTokenId();

    public abstract BigDecimal getDecimalValue();

    public abstract double getDoubleValue();

    public Object getEmbeddedObject() {
        return null;
    }

    public abstract float getFloatValue();

    public abstract int getIntValue();

    public abstract long getLongValue();

    public abstract NumberType getNumberType();

    public abstract Number getNumberValue();

    public Object getObjectId() {
        return null;
    }

    public abstract JsonStreamContext getParsingContext();

    public short getShortValue() {
        int intValue = getIntValue();
        if (intValue >= -32768 && intValue <= 32767) {
            return (short) intValue;
        }
        StringBuilder sb = new StringBuilder("Numeric value (");
        sb.append(getText());
        sb.append(") out of range of Java short");
        throw _constructError(sb.toString());
    }

    public abstract String getText();

    public abstract char[] getTextCharacters();

    public abstract int getTextLength();

    public abstract int getTextOffset();

    public abstract JsonLocation getTokenLocation();

    public Object getTypeId() {
        return null;
    }

    public int getValueAsInt() {
        return getValueAsInt(0);
    }

    public int getValueAsInt(int i) {
        return i;
    }

    public long getValueAsLong() {
        return getValueAsLong(0);
    }

    public long getValueAsLong(long j) {
        return j;
    }

    public String getValueAsString() {
        return getValueAsString(null);
    }

    public abstract String getValueAsString(String str);

    public abstract boolean hasCurrentToken();

    public abstract boolean hasTextCharacters();

    public abstract boolean hasToken(JsonToken jsonToken);

    public abstract boolean hasTokenId(int i);

    public boolean isEnabled(Feature feature) {
        return feature.enabledIn(this._features);
    }

    public boolean isExpectedStartArrayToken() {
        return currentToken() == JsonToken.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return currentToken() == JsonToken.START_OBJECT;
    }

    public boolean isNaN() {
        return false;
    }

    public String nextFieldName() {
        if (nextToken() == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return null;
    }

    public String nextTextValue() {
        if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    public abstract JsonToken nextToken();

    public abstract JsonToken nextValue();

    public JsonParser overrideFormatFeatures(int i, int i2) {
        StringBuilder sb = new StringBuilder("No FormatFeatures defined for parser of type ");
        sb.append(getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public JsonParser overrideStdFeatures(int i, int i2) {
        return setFeatureMask((i & i2) | (this._features & (i2 ^ -1)));
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        _reportUnsupportedOperation();
        return 0;
    }

    public <T> T readValueAs(Class<T> cls) {
        return _codec().readValue(this, cls);
    }

    public <T extends TreeNode> T readValueAsTree() {
        return _codec().readTree(this);
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public void setCurrentValue(Object obj) {
        JsonStreamContext parsingContext = getParsingContext();
        if (parsingContext != null) {
            parsingContext.setCurrentValue(obj);
        }
    }

    @Deprecated
    public JsonParser setFeatureMask(int i) {
        this._features = i;
        return this;
    }

    public void setSchema(FormatSchema formatSchema) {
        StringBuilder sb = new StringBuilder("Parser of type ");
        sb.append(getClass().getName());
        sb.append(" does not support schema of type '");
        sb.append(formatSchema.getSchemaType());
        sb.append("'");
        throw new UnsupportedOperationException(sb.toString());
    }

    public abstract JsonParser skipChildren();
}
