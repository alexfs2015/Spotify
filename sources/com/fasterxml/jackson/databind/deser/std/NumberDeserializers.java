package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

public class NumberDeserializers {
    private static final HashSet<String> _classNames = new HashSet<>();

    /* renamed from: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = new int[NumberType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.fasterxml.jackson.core.JsonParser$NumberType[] r0 = com.fasterxml.jackson.core.JsonParser.NumberType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = r0
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.core.JsonParser$NumberType r1 = com.fasterxml.jackson.core.JsonParser.NumberType.INT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.core.JsonParser$NumberType r1 = com.fasterxml.jackson.core.JsonParser.NumberType.LONG     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.core.JsonParser$NumberType r1 = com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers.AnonymousClass1.<clinit>():void");
        }
    }

    @JacksonStdImpl
    public static class BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
        public static final BigDecimalDeserializer instance = new BigDecimalDeserializer();

        public BigDecimalDeserializer() {
            super(BigDecimal.class);
        }

        public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int currentTokenId = jsonParser.getCurrentTokenId();
            if (currentTokenId == 3) {
                return (BigDecimal) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId != 6) {
                return (currentTokenId == 7 || currentTokenId == 8) ? jsonParser.getDecimalValue() : (BigDecimal) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String trim = jsonParser.getText().trim();
            if (_isEmptyOrTextualNull(trim)) {
                _verifyNullForScalarCoercion(deserializationContext, trim);
                return (BigDecimal) getNullValue(deserializationContext);
            }
            _verifyStringForScalarCoercion(deserializationContext, trim);
            try {
                return new BigDecimal(trim);
            } catch (IllegalArgumentException unused) {
                return (BigDecimal) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid representation", new Object[0]);
            }
        }

        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }
    }

    @JacksonStdImpl
    public static class BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
        public static final BigIntegerDeserializer instance = new BigIntegerDeserializer();

        public BigIntegerDeserializer() {
            super(BigInteger.class);
        }

        public BigInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int currentTokenId = jsonParser.getCurrentTokenId();
            if (currentTokenId == 3) {
                return (BigInteger) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId != 6) {
                if (currentTokenId == 7) {
                    int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[jsonParser.getNumberType().ordinal()];
                    if (i == 1 || i == 2 || i == 3) {
                        return jsonParser.getBigIntegerValue();
                    }
                } else if (currentTokenId == 8) {
                    if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                        _failDoubleToIntCoercion(jsonParser, deserializationContext, "java.math.BigInteger");
                    }
                    return jsonParser.getDecimalValue().toBigInteger();
                }
                return (BigInteger) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String trim = jsonParser.getText().trim();
            if (_isEmptyOrTextualNull(trim)) {
                _verifyNullForScalarCoercion(deserializationContext, trim);
                return (BigInteger) getNullValue(deserializationContext);
            }
            _verifyStringForScalarCoercion(deserializationContext, trim);
            try {
                return new BigInteger(trim);
            } catch (IllegalArgumentException unused) {
                return (BigInteger) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid representation", new Object[0]);
            }
        }

        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }
    }

    @JacksonStdImpl
    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {
        static final BooleanDeserializer primitiveInstance = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        private static final long serialVersionUID = 1;
        static final BooleanDeserializer wrapperInstance = new BooleanDeserializer(Boolean.class, null);

        public BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
            super(cls, bool, Boolean.FALSE);
        }

        /* access modifiers changed from: protected */
        public final Boolean _parseBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_NULL) {
                return (Boolean) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (currentToken == JsonToken.START_ARRAY) {
                return (Boolean) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentToken == JsonToken.VALUE_NUMBER_INT) {
                return Boolean.valueOf(_parseBooleanFromInt(jsonParser, deserializationContext));
            }
            if (currentToken != JsonToken.VALUE_STRING) {
                return currentToken == JsonToken.VALUE_TRUE ? Boolean.TRUE : currentToken == JsonToken.VALUE_FALSE ? Boolean.FALSE : (Boolean) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String trim = jsonParser.getText().trim();
            if ("true".equals(trim) || "True".equals(trim)) {
                _verifyStringForScalarCoercion(deserializationContext, trim);
                return Boolean.TRUE;
            } else if ("false".equals(trim) || "False".equals(trim)) {
                _verifyStringForScalarCoercion(deserializationContext, trim);
                return Boolean.FALSE;
            } else if (trim.length() == 0) {
                return (Boolean) _coerceEmptyString(deserializationContext, this._primitive);
            } else {
                if (_hasTextualNull(trim)) {
                    return (Boolean) _coerceTextualNull(deserializationContext, this._primitive);
                }
                return (Boolean) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "only \"true\" or \"false\" recognized", new Object[0]);
            }
        }

        public final Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            return currentToken == JsonToken.VALUE_TRUE ? Boolean.TRUE : currentToken == JsonToken.VALUE_FALSE ? Boolean.FALSE : _parseBoolean(jsonParser, deserializationContext);
        }

        public final Boolean deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            return currentToken == JsonToken.VALUE_TRUE ? Boolean.TRUE : currentToken == JsonToken.VALUE_FALSE ? Boolean.FALSE : _parseBoolean(jsonParser, deserializationContext);
        }

        public final /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) {
            return super.getEmptyValue(deserializationContext);
        }

        public final /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @JacksonStdImpl
    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {
        static final ByteDeserializer primitiveInstance = new ByteDeserializer(Byte.TYPE, Byte.valueOf(0));
        private static final long serialVersionUID = 1;
        static final ByteDeserializer wrapperInstance = new ByteDeserializer(Byte.class, null);

        public ByteDeserializer(Class<Byte> cls, Byte b) {
            super(cls, b, Byte.valueOf(0));
        }

        /* access modifiers changed from: protected */
        public Byte _parseByte(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_STRING) {
                String trim = jsonParser.getText().trim();
                if (_hasTextualNull(trim)) {
                    return (Byte) _coerceTextualNull(deserializationContext, this._primitive);
                }
                if (trim.length() == 0) {
                    return (Byte) _coerceEmptyString(deserializationContext, this._primitive);
                }
                _verifyStringForScalarCoercion(deserializationContext, trim);
                try {
                    int parseInt = NumberInput.parseInt(trim);
                    if (!_byteOverflow(parseInt)) {
                        return Byte.valueOf((byte) parseInt);
                    }
                    return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                } catch (IllegalArgumentException unused) {
                    return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid Byte value", new Object[0]);
                }
            } else if (currentToken != JsonToken.VALUE_NUMBER_FLOAT) {
                return currentToken == JsonToken.VALUE_NULL ? (Byte) _coerceNullToken(deserializationContext, this._primitive) : currentToken == JsonToken.START_ARRAY ? (Byte) _deserializeFromArray(jsonParser, deserializationContext) : currentToken == JsonToken.VALUE_NUMBER_INT ? Byte.valueOf(jsonParser.getByteValue()) : (Byte) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            } else {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "Byte");
                }
                return Byte.valueOf(jsonParser.getByteValue());
            }
        }

        public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT) ? Byte.valueOf(jsonParser.getByteValue()) : _parseByte(jsonParser, deserializationContext);
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @JacksonStdImpl
    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {
        static final CharacterDeserializer primitiveInstance = new CharacterDeserializer(Character.TYPE, Character.valueOf(0));
        private static final long serialVersionUID = 1;
        static final CharacterDeserializer wrapperInstance = new CharacterDeserializer(Character.class, null);

        public CharacterDeserializer(Class<Character> cls, Character ch) {
            super(cls, ch, Character.valueOf(0));
        }

        public Character deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int currentTokenId = jsonParser.getCurrentTokenId();
            if (currentTokenId == 3) {
                return (Character) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId == 11) {
                return (Character) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (currentTokenId == 6) {
                String text = jsonParser.getText();
                if (text.length() == 1) {
                    return Character.valueOf(text.charAt(0));
                }
                if (text.length() == 0) {
                    return (Character) _coerceEmptyString(deserializationContext, this._primitive);
                }
            } else if (currentTokenId == 7) {
                _verifyNumberForScalarCoercion(deserializationContext, jsonParser);
                int intValue = jsonParser.getIntValue();
                if (intValue >= 0 && intValue <= 65535) {
                    return Character.valueOf((char) intValue);
                }
            }
            return (Character) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @JacksonStdImpl
    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {
        static final DoubleDeserializer primitiveInstance = new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0d));
        private static final long serialVersionUID = 1;
        static final DoubleDeserializer wrapperInstance = new DoubleDeserializer(Double.class, null);

        public DoubleDeserializer(Class<Double> cls, Double d) {
            super(cls, d, Double.valueOf(0.0d));
        }

        /* access modifiers changed from: protected */
        public final Double _parseDouble(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
                return Double.valueOf(jsonParser.getDoubleValue());
            }
            if (currentToken != JsonToken.VALUE_STRING) {
                return currentToken == JsonToken.VALUE_NULL ? (Double) _coerceNullToken(deserializationContext, this._primitive) : currentToken == JsonToken.START_ARRAY ? (Double) _deserializeFromArray(jsonParser, deserializationContext) : (Double) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return (Double) _coerceEmptyString(deserializationContext, this._primitive);
            }
            if (_hasTextualNull(trim)) {
                return (Double) _coerceTextualNull(deserializationContext, this._primitive);
            }
            char charAt = trim.charAt(0);
            if (charAt != '-') {
                if (charAt != 'I') {
                    if (charAt == 'N' && _isNaN(trim)) {
                        return Double.valueOf(Double.NaN);
                    }
                } else if (_isPosInf(trim)) {
                    return Double.valueOf(Double.POSITIVE_INFINITY);
                }
            } else if (_isNegInf(trim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            _verifyStringForScalarCoercion(deserializationContext, trim);
            try {
                return Double.valueOf(parseDouble(trim));
            } catch (IllegalArgumentException unused) {
                return (Double) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid Double value", new Object[0]);
            }
        }

        public Double deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return _parseDouble(jsonParser, deserializationContext);
        }

        public Double deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
            return _parseDouble(jsonParser, deserializationContext);
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @JacksonStdImpl
    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {
        static final FloatDeserializer primitiveInstance = new FloatDeserializer(Float.TYPE, Float.valueOf(0.0f));
        private static final long serialVersionUID = 1;
        static final FloatDeserializer wrapperInstance = new FloatDeserializer(Float.class, null);

        public FloatDeserializer(Class<Float> cls, Float f) {
            super(cls, f, Float.valueOf(0.0f));
        }

        /* access modifiers changed from: protected */
        public final Float _parseFloat(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_NUMBER_FLOAT || currentToken == JsonToken.VALUE_NUMBER_INT) {
                return Float.valueOf(jsonParser.getFloatValue());
            }
            if (currentToken != JsonToken.VALUE_STRING) {
                return currentToken == JsonToken.VALUE_NULL ? (Float) _coerceNullToken(deserializationContext, this._primitive) : currentToken == JsonToken.START_ARRAY ? (Float) _deserializeFromArray(jsonParser, deserializationContext) : (Float) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return (Float) _coerceEmptyString(deserializationContext, this._primitive);
            }
            if (_hasTextualNull(trim)) {
                return (Float) _coerceTextualNull(deserializationContext, this._primitive);
            }
            char charAt = trim.charAt(0);
            if (charAt != '-') {
                if (charAt != 'I') {
                    if (charAt == 'N' && _isNaN(trim)) {
                        return Float.valueOf(Float.NaN);
                    }
                } else if (_isPosInf(trim)) {
                    return Float.valueOf(Float.POSITIVE_INFINITY);
                }
            } else if (_isNegInf(trim)) {
                return Float.valueOf(Float.NEGATIVE_INFINITY);
            }
            _verifyStringForScalarCoercion(deserializationContext, trim);
            try {
                return Float.valueOf(Float.parseFloat(trim));
            } catch (IllegalArgumentException unused) {
                return (Float) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid Float value", new Object[0]);
            }
        }

        public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return _parseFloat(jsonParser, deserializationContext);
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @JacksonStdImpl
    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {
        static final IntegerDeserializer primitiveInstance = new IntegerDeserializer(Integer.TYPE, Integer.valueOf(0));
        private static final long serialVersionUID = 1;
        static final IntegerDeserializer wrapperInstance = new IntegerDeserializer(Integer.class, null);

        public IntegerDeserializer(Class<Integer> cls, Integer num) {
            super(cls, num, Integer.valueOf(0));
        }

        /* access modifiers changed from: protected */
        public final Integer _parseInteger(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int currentTokenId = jsonParser.getCurrentTokenId();
            if (currentTokenId == 3) {
                return (Integer) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId == 11) {
                return (Integer) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (currentTokenId == 6) {
                String trim = jsonParser.getText().trim();
                int length = trim.length();
                if (length == 0) {
                    return (Integer) _coerceEmptyString(deserializationContext, this._primitive);
                }
                if (_hasTextualNull(trim)) {
                    return (Integer) _coerceTextualNull(deserializationContext, this._primitive);
                }
                _verifyStringForScalarCoercion(deserializationContext, trim);
                if (length <= 9) {
                    return Integer.valueOf(NumberInput.parseInt(trim));
                }
                try {
                    long parseLong = Long.parseLong(trim);
                    if (!_intOverflow(parseLong)) {
                        return Integer.valueOf((int) parseLong);
                    }
                    return (Integer) deserializationContext.handleWeirdStringValue(this._valueClass, trim, String.format("Overflow: numeric value (%s) out of range of Integer (%d - %d)", new Object[]{trim, Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(Integer.MAX_VALUE)}), new Object[0]);
                } catch (IllegalArgumentException unused) {
                    return (Integer) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid Integer value", new Object[0]);
                }
            } else if (currentTokenId == 7) {
                return Integer.valueOf(jsonParser.getIntValue());
            } else {
                if (currentTokenId != 8) {
                    return (Integer) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
                }
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "Integer");
                }
                return Integer.valueOf(jsonParser.getValueAsInt());
            }
        }

        public final Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT) ? Integer.valueOf(jsonParser.getIntValue()) : _parseInteger(jsonParser, deserializationContext);
        }

        public final Integer deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT) ? Integer.valueOf(jsonParser.getIntValue()) : _parseInteger(jsonParser, deserializationContext);
        }

        public final /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) {
            return super.getEmptyValue(deserializationContext);
        }

        public final /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public final boolean isCachable() {
            return true;
        }
    }

    @JacksonStdImpl
    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {
        static final LongDeserializer primitiveInstance = new LongDeserializer(Long.TYPE, Long.valueOf(0));
        private static final long serialVersionUID = 1;
        static final LongDeserializer wrapperInstance = new LongDeserializer(Long.class, null);

        public LongDeserializer(Class<Long> cls, Long l) {
            super(cls, l, Long.valueOf(0));
        }

        /* access modifiers changed from: protected */
        public final Long _parseLong(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int currentTokenId = jsonParser.getCurrentTokenId();
            if (currentTokenId == 3) {
                return (Long) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId == 11) {
                return (Long) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (currentTokenId == 6) {
                String trim = jsonParser.getText().trim();
                if (trim.length() == 0) {
                    return (Long) _coerceEmptyString(deserializationContext, this._primitive);
                }
                if (_hasTextualNull(trim)) {
                    return (Long) _coerceTextualNull(deserializationContext, this._primitive);
                }
                _verifyStringForScalarCoercion(deserializationContext, trim);
                try {
                    return Long.valueOf(NumberInput.parseLong(trim));
                } catch (IllegalArgumentException unused) {
                    return (Long) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid Long value", new Object[0]);
                }
            } else if (currentTokenId == 7) {
                return Long.valueOf(jsonParser.getLongValue());
            } else {
                if (currentTokenId != 8) {
                    return (Long) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
                }
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "Long");
                }
                return Long.valueOf(jsonParser.getValueAsLong());
            }
        }

        public final Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT) ? Long.valueOf(jsonParser.getLongValue()) : _parseLong(jsonParser, deserializationContext);
        }

        public final /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) {
            return super.getEmptyValue(deserializationContext);
        }

        public final /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public final boolean isCachable() {
            return true;
        }
    }

    @JacksonStdImpl
    public static class NumberDeserializer extends StdScalarDeserializer<Object> {
        public static final NumberDeserializer instance = new NumberDeserializer();

        public NumberDeserializer() {
            super(Number.class);
        }

        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int currentTokenId = jsonParser.getCurrentTokenId();
            if (currentTokenId == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId != 6) {
                return currentTokenId != 7 ? currentTokenId != 8 ? deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser) : (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) || jsonParser.isNaN()) ? jsonParser.getNumberValue() : jsonParser.getDecimalValue() : deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.getNumberValue();
            }
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return getNullValue(deserializationContext);
            }
            if (_hasTextualNull(trim)) {
                return getNullValue(deserializationContext);
            }
            if (_isPosInf(trim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (_isNegInf(trim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if (_isNaN(trim)) {
                return Double.valueOf(Double.NaN);
            }
            _verifyStringForScalarCoercion(deserializationContext, trim);
            try {
                if (!_isIntNumber(trim)) {
                    return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? new BigDecimal(trim) : Double.valueOf(trim);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                    return new BigInteger(trim);
                }
                long parseLong = Long.parseLong(trim);
                return (deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) || parseLong > 2147483647L || parseLong < -2147483648L) ? Long.valueOf(parseLong) : Integer.valueOf((int) parseLong);
            } catch (IllegalArgumentException unused) {
                return deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid number", new Object[0]);
            }
        }

        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
            int currentTokenId = jsonParser.getCurrentTokenId();
            return (currentTokenId == 6 || currentTokenId == 7 || currentTokenId == 8) ? deserialize(jsonParser, deserializationContext) : typeDeserializer.deserializeTypedFromScalar(jsonParser, deserializationContext);
        }
    }

    public static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        private static final long serialVersionUID = 1;
        protected final T _emptyValue;
        protected final T _nullValue;
        protected final boolean _primitive;

        protected PrimitiveOrWrapperDeserializer(Class<T> cls, T t, T t2) {
            super(cls);
            this._nullValue = t;
            this._emptyValue = t2;
            this._primitive = cls.isPrimitive();
        }

        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return this._emptyValue;
        }

        public AccessPattern getNullAccessPattern() {
            return this._primitive ? AccessPattern.DYNAMIC : this._nullValue == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
        }

        public final T getNullValue(DeserializationContext deserializationContext) {
            if (this._primitive && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                deserializationContext.reportInputMismatch((JsonDeserializer<?>) this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", handledType().toString());
            }
            return this._nullValue;
        }
    }

    @JacksonStdImpl
    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {
        static final ShortDeserializer primitiveInstance = new ShortDeserializer(Short.TYPE, Short.valueOf(0));
        private static final long serialVersionUID = 1;
        static final ShortDeserializer wrapperInstance = new ShortDeserializer(Short.class, null);

        public ShortDeserializer(Class<Short> cls, Short sh) {
            super(cls, sh, Short.valueOf(0));
        }

        /* access modifiers changed from: protected */
        public Short _parseShort(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_NUMBER_INT) {
                return Short.valueOf(jsonParser.getShortValue());
            }
            if (currentToken == JsonToken.VALUE_STRING) {
                String trim = jsonParser.getText().trim();
                if (trim.length() == 0) {
                    return (Short) _coerceEmptyString(deserializationContext, this._primitive);
                }
                if (_hasTextualNull(trim)) {
                    return (Short) _coerceTextualNull(deserializationContext, this._primitive);
                }
                _verifyStringForScalarCoercion(deserializationContext, trim);
                try {
                    int parseInt = NumberInput.parseInt(trim);
                    if (!_shortOverflow(parseInt)) {
                        return Short.valueOf((short) parseInt);
                    }
                    return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                } catch (IllegalArgumentException unused) {
                    return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid Short value", new Object[0]);
                }
            } else if (currentToken != JsonToken.VALUE_NUMBER_FLOAT) {
                return currentToken == JsonToken.VALUE_NULL ? (Short) _coerceNullToken(deserializationContext, this._primitive) : currentToken == JsonToken.START_ARRAY ? (Short) _deserializeFromArray(jsonParser, deserializationContext) : (Short) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            } else {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "Short");
                }
                return Short.valueOf(jsonParser.getShortValue());
            }
        }

        public Short deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return _parseShort(jsonParser, deserializationContext);
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i = 0; i < 11; i++) {
            _classNames.add(clsArr[i].getName());
        }
    }

    public static JsonDeserializer<?> find(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return IntegerDeserializer.primitiveInstance;
            }
            if (cls == Boolean.TYPE) {
                return BooleanDeserializer.primitiveInstance;
            }
            if (cls == Long.TYPE) {
                return LongDeserializer.primitiveInstance;
            }
            if (cls == Double.TYPE) {
                return DoubleDeserializer.primitiveInstance;
            }
            if (cls == Character.TYPE) {
                return CharacterDeserializer.primitiveInstance;
            }
            if (cls == Byte.TYPE) {
                return ByteDeserializer.primitiveInstance;
            }
            if (cls == Short.TYPE) {
                return ShortDeserializer.primitiveInstance;
            }
            if (cls == Float.TYPE) {
                return FloatDeserializer.primitiveInstance;
            }
        } else if (!_classNames.contains(str)) {
            return null;
        } else {
            if (cls == Integer.class) {
                return IntegerDeserializer.wrapperInstance;
            }
            if (cls == Boolean.class) {
                return BooleanDeserializer.wrapperInstance;
            }
            if (cls == Long.class) {
                return LongDeserializer.wrapperInstance;
            }
            if (cls == Double.class) {
                return DoubleDeserializer.wrapperInstance;
            }
            if (cls == Character.class) {
                return CharacterDeserializer.wrapperInstance;
            }
            if (cls == Byte.class) {
                return ByteDeserializer.wrapperInstance;
            }
            if (cls == Short.class) {
                return ShortDeserializer.wrapperInstance;
            }
            if (cls == Float.class) {
                return FloatDeserializer.wrapperInstance;
            }
            if (cls == Number.class) {
                return NumberDeserializer.instance;
            }
            if (cls == BigDecimal.class) {
                return BigDecimalDeserializer.instance;
            }
            if (cls == BigInteger.class) {
                return BigIntegerDeserializer.instance;
            }
        }
        StringBuilder sb = new StringBuilder("Internal error: can't find deserializer for ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }
}