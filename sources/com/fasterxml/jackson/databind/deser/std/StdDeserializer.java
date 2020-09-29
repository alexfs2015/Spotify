package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public abstract class StdDeserializer<T> extends JsonDeserializer<T> implements Serializable {
    protected static final int F_MASK_ACCEPT_ARRAYS = (DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.getMask() | DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.getMask());
    protected static final int F_MASK_INT_COERCIONS = (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask() | DeserializationFeature.USE_LONG_FOR_INTS.getMask());
    private static final long serialVersionUID = 1;
    protected final Class<?> _valueClass;

    protected StdDeserializer(JavaType javaType) {
        this._valueClass = javaType == null ? Object.class : javaType.getRawClass();
    }

    protected StdDeserializer(StdDeserializer<?> stdDeserializer) {
        this._valueClass = stdDeserializer._valueClass;
    }

    protected StdDeserializer(Class<?> cls) {
        this._valueClass = cls;
    }

    protected static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    protected static final double parseDouble(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_NORMAL;
        }
        return Double.parseDouble(str);
    }

    /* access modifiers changed from: protected */
    public final boolean _byteOverflow(int i) {
        return i < -128 || i > 255;
    }

    /* access modifiers changed from: protected */
    public Object _coerceEmptyString(DeserializationContext deserializationContext, boolean z) {
        Enum enumR;
        boolean z2;
        if (!deserializationContext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
            enumR = MapperFeature.ALLOW_COERCION_OF_SCALARS;
            z2 = true;
        } else if (!z || !deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            return getNullValue(deserializationContext);
        } else {
            enumR = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
            z2 = false;
        }
        _reportFailedNullCoerce(deserializationContext, z2, enumR, "empty String (\"\")");
        return null;
    }

    /* access modifiers changed from: protected */
    public Object _coerceIntegral(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        return DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures) ? jsonParser.getBigIntegerValue() : DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures) ? Long.valueOf(jsonParser.getLongValue()) : jsonParser.getBigIntegerValue();
    }

    /* access modifiers changed from: protected */
    public Object _coerceNullToken(DeserializationContext deserializationContext, boolean z) {
        if (z) {
            _verifyNullForPrimitive(deserializationContext);
        }
        return getNullValue(deserializationContext);
    }

    /* access modifiers changed from: protected */
    public Object _coerceTextualNull(DeserializationContext deserializationContext, boolean z) {
        Enum enumR;
        boolean z2;
        if (!deserializationContext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
            enumR = MapperFeature.ALLOW_COERCION_OF_SCALARS;
            z2 = true;
        } else if (!z || !deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            return getNullValue(deserializationContext);
        } else {
            enumR = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
            z2 = false;
        }
        _reportFailedNullCoerce(deserializationContext, z2, enumR, "String \"null\"");
        return null;
    }

    /* access modifiers changed from: protected */
    public String _coercedTypeDesc() {
        String str;
        JavaType valueType = getValueType();
        boolean z = false;
        if (valueType == null || valueType.isPrimitive()) {
            Class handledType = handledType();
            if (handledType.isArray() || Collection.class.isAssignableFrom(handledType) || Map.class.isAssignableFrom(handledType)) {
                z = true;
            }
            str = ClassUtil.nameOf(handledType);
        } else {
            if (valueType.isContainerType() || valueType.isReferenceType()) {
                z = true;
            }
            String str2 = "'";
            StringBuilder sb = new StringBuilder(str2);
            sb.append(valueType.toString());
            sb.append(str2);
            str = sb.toString();
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder("as content of type ");
            sb2.append(str);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("for type ");
        sb3.append(str);
        return sb3.toString();
    }

    /* access modifiers changed from: protected */
    public T _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken jsonToken;
        if (deserializationContext.hasSomeOfFeatures(F_MASK_ACCEPT_ARRAYS)) {
            jsonToken = jsonParser.nextToken();
            if (jsonToken == JsonToken.END_ARRAY && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return getNullValue(deserializationContext);
            }
            if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                T deserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return deserialize;
            }
        } else {
            jsonToken = jsonParser.getCurrentToken();
        }
        return deserializationContext.handleUnexpectedToken(this._valueClass, jsonToken, jsonParser, null, new Object[0]);
    }

    /* access modifiers changed from: protected */
    public T _deserializeFromEmpty(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_ARRAY) {
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                    return null;
                }
                return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
        } else if (currentToken == JsonToken.VALUE_STRING && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().trim().isEmpty()) {
            return null;
        }
        return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
    }

    /* access modifiers changed from: protected */
    public T _deserializeWrappedValue(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.hasToken(JsonToken.START_ARRAY)) {
            return deserialize(jsonParser, deserializationContext);
        }
        return deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser.getCurrentToken(), jsonParser, String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", new Object[]{ClassUtil.nameOf(this._valueClass), JsonToken.START_ARRAY, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"}), new Object[0]);
    }

    /* access modifiers changed from: protected */
    public void _failDoubleToIntCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        deserializationContext.reportInputMismatch(handledType(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", jsonParser.getValueAsString(), str);
    }

    /* access modifiers changed from: protected */
    public final NullValueProvider _findNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, Nulls nulls, JsonDeserializer<?> jsonDeserializer) {
        if (nulls == Nulls.FAIL) {
            return beanProperty == null ? NullsFailProvider.constructForRootValue(deserializationContext.constructType(jsonDeserializer.handledType())) : NullsFailProvider.constructForProperty(beanProperty);
        }
        if (nulls == Nulls.AS_EMPTY) {
            if (jsonDeserializer == null) {
                return null;
            }
            if ((jsonDeserializer instanceof BeanDeserializerBase) && !((BeanDeserializerBase) jsonDeserializer).getValueInstantiator().canCreateUsingDefault()) {
                JavaType type = beanProperty.getType();
                deserializationContext.reportBadDefinition(type, String.format("Cannot create empty instance of %s, no default Creator", new Object[]{type}));
            }
            AccessPattern emptyAccessPattern = jsonDeserializer.getEmptyAccessPattern();
            return emptyAccessPattern == AccessPattern.ALWAYS_NULL ? NullsConstantProvider.nuller() : emptyAccessPattern == AccessPattern.CONSTANT ? NullsConstantProvider.forValue(jsonDeserializer.getEmptyValue(deserializationContext)) : new NullsAsEmptyProvider(jsonDeserializer);
        } else if (nulls == Nulls.SKIP) {
            return NullsConstantProvider.skipper();
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    /* access modifiers changed from: protected */
    public final boolean _intOverflow(long j) {
        return j < -2147483648L || j > 2147483647L;
    }

    /* access modifiers changed from: protected */
    public boolean _isEmptyOrTextualNull(String str) {
        return str.isEmpty() || "null".equals(str);
    }

    /* access modifiers changed from: protected */
    public final boolean _isIntNumber(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        char charAt = str.charAt(0);
        for (int i = (charAt == '-' || charAt == '+') ? 1 : 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 > '9' || charAt2 < '0') {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean _isNaN(String str) {
        return "NaN".equals(str);
    }

    /* access modifiers changed from: protected */
    public final boolean _isNegInf(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    /* access modifiers changed from: protected */
    public final boolean _isPosInf(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    /* access modifiers changed from: protected */
    public Number _nonNullNumber(Number number) {
        return number == null ? Integer.valueOf(0) : number;
    }

    /* access modifiers changed from: protected */
    public boolean _parseBooleanFromInt(JsonParser jsonParser, DeserializationContext deserializationContext) {
        _verifyNumberForScalarCoercion(deserializationContext, jsonParser);
        return !Ad.DEFAULT_SKIPPABLE_AD_DELAY.equals(jsonParser.getText());
    }

    /* access modifiers changed from: protected */
    public final boolean _parseBooleanPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (currentToken == JsonToken.VALUE_FALSE) {
            return false;
        }
        if (currentToken == JsonToken.VALUE_NULL) {
            _verifyNullForPrimitive(deserializationContext);
            return false;
        } else if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return _parseBooleanFromInt(jsonParser, deserializationContext);
        } else {
            if (currentToken == JsonToken.VALUE_STRING) {
                String trim = jsonParser.getText().trim();
                if ("true".equals(trim) || "True".equals(trim)) {
                    return true;
                }
                if ("false".equals(trim) || "False".equals(trim)) {
                    return false;
                }
                if (_isEmptyOrTextualNull(trim)) {
                    _verifyNullForPrimitiveCoercion(deserializationContext, trim);
                    return false;
                }
                return Boolean.TRUE.equals((Boolean) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "only \"true\" or \"false\" recognized", new Object[0]));
            } else if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return ((Boolean) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).booleanValue();
            } else {
                jsonParser.nextToken();
                boolean _parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseBooleanPrimitive;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final byte _parseBytePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int _parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
        if (!_byteOverflow(_parseIntPrimitive)) {
            return (byte) _parseIntPrimitive;
        }
        return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, String.valueOf(_parseIntPrimitive), "overflow, value cannot be represented as 8-bit value", new Object[0])).byteValue();
    }

    /* access modifiers changed from: protected */
    public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) {
        long j;
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId == 3) {
            return _parseDateFromArray(jsonParser, deserializationContext);
        }
        if (currentTokenId == 11) {
            return (Date) getNullValue(deserializationContext);
        }
        if (currentTokenId == 6) {
            return _parseDate(jsonParser.getText().trim(), deserializationContext);
        }
        if (currentTokenId != 7) {
            return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        try {
            j = jsonParser.getLongValue();
        } catch (JsonParseException unused) {
            j = ((Number) deserializationContext.handleWeirdNumberValue(this._valueClass, jsonParser.getNumberValue(), "not a valid 64-bit long for creating `java.util.Date`", new Object[0])).longValue();
        }
        return new Date(j);
    }

    /* access modifiers changed from: protected */
    public Date _parseDate(String str, DeserializationContext deserializationContext) {
        try {
            return _isEmptyOrTextualNull(str) ? (Date) getNullValue(deserializationContext) : deserializationContext.parseDate(str);
        } catch (IllegalArgumentException e) {
            return (Date) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid representation (error: %s)", e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public Date _parseDateFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken jsonToken;
        if (deserializationContext.hasSomeOfFeatures(F_MASK_ACCEPT_ARRAYS)) {
            jsonToken = jsonParser.nextToken();
            if (jsonToken == JsonToken.END_ARRAY && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return (Date) getNullValue(deserializationContext);
            }
            if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                Date _parseDate = _parseDate(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseDate;
            }
        } else {
            jsonToken = jsonParser.getCurrentToken();
        }
        return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, jsonToken, jsonParser, null, new Object[0]);
    }

    /* access modifiers changed from: protected */
    public final double _parseDoublePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT)) {
            return jsonParser.getDoubleValue();
        }
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 3) {
            if (currentTokenId == 11) {
                _verifyNullForPrimitive(deserializationContext);
                return 0.0d;
            } else if (currentTokenId == 6) {
                String trim = jsonParser.getText().trim();
                if (!_isEmptyOrTextualNull(trim)) {
                    return _parseDoublePrimitive(deserializationContext, trim);
                }
                _verifyNullForPrimitiveCoercion(deserializationContext, trim);
                return 0.0d;
            } else if (currentTokenId == 7) {
                return jsonParser.getDoubleValue();
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.nextToken();
            double _parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return _parseDoublePrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).doubleValue();
    }

    /* access modifiers changed from: protected */
    public final double _parseDoublePrimitive(DeserializationContext deserializationContext, String str) {
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt != 'I') {
                if (charAt == 'N' && _isNaN(str)) {
                    return Double.NaN;
                }
            } else if (_isPosInf(str)) {
                return Double.POSITIVE_INFINITY;
            }
        } else if (_isNegInf(str)) {
            return Double.NEGATIVE_INFINITY;
        }
        try {
            return parseDouble(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid double value (as String to convert)", new Object[0])).doubleValue();
        }
    }

    /* access modifiers changed from: protected */
    public final float _parseFloatPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT)) {
            return jsonParser.getFloatValue();
        }
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 3) {
            if (currentTokenId == 11) {
                _verifyNullForPrimitive(deserializationContext);
                return 0.0f;
            } else if (currentTokenId == 6) {
                String trim = jsonParser.getText().trim();
                if (!_isEmptyOrTextualNull(trim)) {
                    return _parseFloatPrimitive(deserializationContext, trim);
                }
                _verifyNullForPrimitiveCoercion(deserializationContext, trim);
                return 0.0f;
            } else if (currentTokenId == 7) {
                return jsonParser.getFloatValue();
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.nextToken();
            float _parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return _parseFloatPrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).floatValue();
    }

    /* access modifiers changed from: protected */
    public final float _parseFloatPrimitive(DeserializationContext deserializationContext, String str) {
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt != 'I') {
                if (charAt == 'N' && _isNaN(str)) {
                    return Float.NaN;
                }
            } else if (_isPosInf(str)) {
                return Float.POSITIVE_INFINITY;
            }
        } else if (_isNegInf(str)) {
            return Float.NEGATIVE_INFINITY;
        }
        try {
            return Float.parseFloat(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid float value", new Object[0])).floatValue();
        }
    }

    /* access modifiers changed from: protected */
    public final int _parseIntPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
            return jsonParser.getIntValue();
        }
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 3) {
            if (currentTokenId == 6) {
                String trim = jsonParser.getText().trim();
                if (!_isEmptyOrTextualNull(trim)) {
                    return _parseIntPrimitive(deserializationContext, trim);
                }
                _verifyNullForPrimitiveCoercion(deserializationContext, trim);
                return 0;
            } else if (currentTokenId == 8) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "int");
                }
                return jsonParser.getValueAsInt();
            } else if (currentTokenId == 11) {
                _verifyNullForPrimitive(deserializationContext);
                return 0;
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.nextToken();
            int _parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return _parseIntPrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).intValue();
    }

    /* access modifiers changed from: protected */
    public final int _parseIntPrimitive(DeserializationContext deserializationContext, String str) {
        try {
            if (str.length() <= 9) {
                return NumberInput.parseInt(str);
            }
            long parseLong = Long.parseLong(str);
            if (!_intOverflow(parseLong)) {
                return (int) parseLong;
            }
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue();
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid int value", new Object[0])).intValue();
        }
    }

    /* access modifiers changed from: protected */
    public final long _parseLongPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
            return jsonParser.getLongValue();
        }
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 3) {
            if (currentTokenId == 6) {
                String trim = jsonParser.getText().trim();
                if (!_isEmptyOrTextualNull(trim)) {
                    return _parseLongPrimitive(deserializationContext, trim);
                }
                _verifyNullForPrimitiveCoercion(deserializationContext, trim);
                return 0;
            } else if (currentTokenId == 8) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "long");
                }
                return jsonParser.getValueAsLong();
            } else if (currentTokenId == 11) {
                _verifyNullForPrimitive(deserializationContext);
                return 0;
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.nextToken();
            long _parseLongPrimitive = _parseLongPrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return _parseLongPrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).longValue();
    }

    /* access modifiers changed from: protected */
    public final long _parseLongPrimitive(DeserializationContext deserializationContext, String str) {
        try {
            return NumberInput.parseLong(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid long value", new Object[0])).longValue();
        }
    }

    /* access modifiers changed from: protected */
    public final short _parseShortPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int _parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
        if (!_shortOverflow(_parseIntPrimitive)) {
            return (short) _parseIntPrimitive;
        }
        return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, String.valueOf(_parseIntPrimitive), "overflow, value cannot be represented as 16-bit value", new Object[0])).shortValue();
    }

    /* access modifiers changed from: protected */
    public final String _parseString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
            return jsonParser.getText();
        }
        String valueAsString = jsonParser.getValueAsString();
        return valueAsString != null ? valueAsString : (String) deserializationContext.handleUnexpectedToken(String.class, jsonParser);
    }

    /* access modifiers changed from: protected */
    public void _reportFailedNullCoerce(DeserializationContext deserializationContext, boolean z, Enum<?> enumR, String str) {
        deserializationContext.reportInputMismatch((JsonDeserializer<?>) this, "Cannot coerce %s to Null value %s (%s `%s.%s` to allow)", str, _coercedTypeDesc(), z ? "enable" : "disable", enumR.getClass().getSimpleName(), enumR.name());
    }

    /* access modifiers changed from: protected */
    public final boolean _shortOverflow(int i) {
        return i < -32768 || i > 32767;
    }

    /* access modifiers changed from: protected */
    public void _verifyEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
    }

    /* access modifiers changed from: protected */
    public final void _verifyNullForPrimitive(DeserializationContext deserializationContext) {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            deserializationContext.reportInputMismatch((JsonDeserializer<?>) this, "Cannot coerce `null` %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", _coercedTypeDesc());
        }
    }

    /* access modifiers changed from: protected */
    public final void _verifyNullForPrimitiveCoercion(DeserializationContext deserializationContext, String str) {
        Enum enumR;
        boolean z;
        String str2;
        if (!deserializationContext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
            enumR = MapperFeature.ALLOW_COERCION_OF_SCALARS;
            z = true;
        } else if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            enumR = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
            z = false;
        } else {
            return;
        }
        if (str.isEmpty()) {
            str2 = "empty String (\"\")";
        } else {
            str2 = String.format("String \"%s\"", new Object[]{str});
        }
        _reportFailedNullCoerce(deserializationContext, z, enumR, str2);
    }

    /* access modifiers changed from: protected */
    public final void _verifyNullForScalarCoercion(DeserializationContext deserializationContext, String str) {
        String str2;
        if (!deserializationContext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
            if (str.isEmpty()) {
                str2 = "empty String (\"\")";
            } else {
                str2 = String.format("String \"%s\"", new Object[]{str});
            }
            _reportFailedNullCoerce(deserializationContext, true, MapperFeature.ALLOW_COERCION_OF_SCALARS, str2);
        }
    }

    /* access modifiers changed from: protected */
    public void _verifyNumberForScalarCoercion(DeserializationContext deserializationContext, JsonParser jsonParser) {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (!deserializationContext.isEnabled(mapperFeature)) {
            deserializationContext.reportInputMismatch((JsonDeserializer<?>) this, "Cannot coerce Number (%s) %s (enable `%s.%s` to allow)", jsonParser.getText(), _coercedTypeDesc(), mapperFeature.getClass().getSimpleName(), mapperFeature.name());
        }
    }

    /* access modifiers changed from: protected */
    public void _verifyStringForScalarCoercion(DeserializationContext deserializationContext, String str) {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (!deserializationContext.isEnabled(mapperFeature)) {
            deserializationContext.reportInputMismatch((JsonDeserializer<?>) this, "Cannot coerce String \"%s\" %s (enable `%s.%s` to allow)", str, _coercedTypeDesc(), mapperFeature.getClass().getSimpleName(), mapperFeature.name());
        }
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: protected */
    public NullValueProvider findContentNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer<?> jsonDeserializer) {
        Nulls findContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (findContentNullStyle == Nulls.SKIP) {
            return NullsConstantProvider.skipper();
        }
        NullValueProvider _findNullProvider = _findNullProvider(deserializationContext, beanProperty, findContentNullStyle, jsonDeserializer);
        return _findNullProvider != null ? _findNullProvider : jsonDeserializer;
    }

    /* access modifiers changed from: protected */
    public Nulls findContentNullStyle(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        if (beanProperty != null) {
            return beanProperty.getMetadata().getContentNulls();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> findConvertingContentDeserializer(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer<?> jsonDeserializer) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (_neitherNull(annotationIntrospector, beanProperty)) {
            AnnotatedMember member = beanProperty.getMember();
            if (member != null) {
                Object findDeserializationContentConverter = annotationIntrospector.findDeserializationContentConverter(member);
                if (findDeserializationContentConverter != null) {
                    Converter converterInstance = deserializationContext.converterInstance(beanProperty.getMember(), findDeserializationContentConverter);
                    JavaType inputType = converterInstance.getInputType(deserializationContext.getTypeFactory());
                    if (jsonDeserializer == null) {
                        jsonDeserializer = deserializationContext.findContextualValueDeserializer(inputType, beanProperty);
                    }
                    return new StdDelegatingDeserializer(converterInstance, inputType, jsonDeserializer);
                }
            }
        }
        return jsonDeserializer;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> findDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanProperty beanProperty) {
        return deserializationContext.findContextualValueDeserializer(javaType, beanProperty);
    }

    /* access modifiers changed from: protected */
    public Boolean findFormatFeature(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls, Feature feature) {
        Value findFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, cls);
        if (findFormatOverrides != null) {
            return findFormatOverrides.getFeature(feature);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Value findFormatOverrides(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyFormat(deserializationContext.getConfig(), cls) : deserializationContext.getDefaultPropertyFormat(cls);
    }

    /* access modifiers changed from: protected */
    public final NullValueProvider findValueNullProvider(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) {
        if (settableBeanProperty != null) {
            return _findNullProvider(deserializationContext, settableBeanProperty, propertyMetadata.getValueNulls(), settableBeanProperty.getValueDeserializer());
        }
        return null;
    }

    @Deprecated
    public final Class<?> getValueClass() {
        return this._valueClass;
    }

    public JavaType getValueType() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void handleMissingEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) {
        deserializationContext.reportWrongTokenException((JsonDeserializer<?>) this, JsonToken.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", handledType().getName());
    }

    /* access modifiers changed from: protected */
    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        if (obj == null) {
            obj = handledType();
        }
        if (!deserializationContext.handleUnknownProperty(jsonParser, this, obj, str)) {
            jsonParser.skipChildren();
        }
    }

    public Class<?> handledType() {
        return this._valueClass;
    }

    /* access modifiers changed from: protected */
    public boolean isDefaultDeserializer(JsonDeserializer<?> jsonDeserializer) {
        return ClassUtil.isJacksonStdImpl((Object) jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    public boolean isDefaultKeyDeserializer(KeyDeserializer keyDeserializer) {
        return ClassUtil.isJacksonStdImpl((Object) keyDeserializer);
    }
}
