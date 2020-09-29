package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

@JacksonStdImpl
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements ContextualDeserializer {
    private static final String[] NO_STRINGS = new String[0];
    public static final StringArrayDeserializer instance = new StringArrayDeserializer();
    private static final long serialVersionUID = 2;
    protected JsonDeserializer<String> _elementDeserializer;
    protected final NullValueProvider _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    public StringArrayDeserializer() {
        this(null, null, null);
    }

    protected StringArrayDeserializer(JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super(String[].class);
        this._elementDeserializer = jsonDeserializer;
        this._nullProvider = nullValueProvider;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(nullValueProvider);
    }

    private final String[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._unwrapSingle == Boolean.TRUE || (this._unwrapSingle == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return new String[]{jsonParser.hasToken(JsonToken.VALUE_NULL) ? (String) this._nullProvider.getNullValue(deserializationContext) : _parseString(jsonParser, deserializationContext)};
        } else if (!jsonParser.hasToken(JsonToken.VALUE_STRING) || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) || jsonParser.getText().length() != 0) {
            return (String[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String[] _deserializeCustom(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) {
        Object[] objArr;
        int i;
        String str;
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        if (strArr == null) {
            objArr = leaseObjectBuffer.resetAndStart();
            i = 0;
        } else {
            i = strArr.length;
            objArr = leaseObjectBuffer.resetAndStart(strArr, i);
        }
        JsonDeserializer<String> jsonDeserializer = this._elementDeserializer;
        while (true) {
            try {
                if (jsonParser.nextTextValue() == null) {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        String[] strArr2 = (String[]) leaseObjectBuffer.completeAndClearBuffer(objArr, i, String.class);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr2;
                    } else if (currentToken != JsonToken.VALUE_NULL) {
                        str = (String) jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        str = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                } else {
                    str = (String) jsonDeserializer.deserialize(jsonParser, deserializationContext);
                }
                if (i >= objArr.length) {
                    objArr = leaseObjectBuffer.appendCompletedChunk(objArr);
                    i = 0;
                }
                int i2 = i + 1;
                try {
                    objArr[i] = str;
                    i = i2;
                } catch (Exception e) {
                    e = e;
                    i = i2;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) String.class, i);
                }
            } catch (Exception e2) {
                e = e2;
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) String.class, i);
            }
        }
    }

    public final JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._elementDeserializer);
        JavaType constructType = deserializationContext.constructType(String.class);
        JsonDeserializer<String> findContextualValueDeserializer = findConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(constructType, beanProperty) : deserializationContext.handleSecondaryContextualization(findConvertingContentDeserializer, beanProperty, constructType);
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, String[].class, Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        NullValueProvider findContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, findContextualValueDeserializer);
        if (findContextualValueDeserializer != null && isDefaultDeserializer(findContextualValueDeserializer)) {
            findContextualValueDeserializer = null;
        }
        return (this._elementDeserializer == findContextualValueDeserializer && this._unwrapSingle == findFormatFeature && this._nullProvider == findContentNullProvider) ? this : new StringArrayDeserializer(findContextualValueDeserializer, findContentNullProvider, findFormatFeature);
    }

    public final String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, null);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        int i = 0;
        while (true) {
            try {
                String nextTextValue = jsonParser.nextTextValue();
                if (nextTextValue == null) {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        String[] strArr = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i, String.class);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr;
                    } else if (currentToken != JsonToken.VALUE_NULL) {
                        nextTextValue = _parseString(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        nextTextValue = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                }
                if (i >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i = 0;
                }
                int i2 = i + 1;
                try {
                    resetAndStart[i] = nextTextValue;
                    i = i2;
                } catch (Exception e) {
                    e = e;
                    i = i2;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) resetAndStart, leaseObjectBuffer.bufferedSize() + i);
                }
            } catch (Exception e2) {
                e = e2;
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) resetAndStart, leaseObjectBuffer.bufferedSize() + i);
            }
        }
    }

    public final String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            String[] handleNonArray = handleNonArray(jsonParser, deserializationContext);
            if (handleNonArray == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[(handleNonArray.length + length)];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(handleNonArray, 0, strArr2, length, handleNonArray.length);
            return strArr2;
        } else if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, strArr);
        } else {
            ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            int length2 = strArr.length;
            Object[] resetAndStart = leaseObjectBuffer.resetAndStart(strArr, length2);
            while (true) {
                String nextTextValue = jsonParser.nextTextValue();
                if (nextTextValue == null) {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        String[] strArr3 = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, length2, String.class);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr3;
                    } else if (currentToken != JsonToken.VALUE_NULL) {
                        nextTextValue = _parseString(jsonParser, deserializationContext);
                    } else if (this._skipNullValues) {
                        return NO_STRINGS;
                    } else {
                        nextTextValue = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                }
                try {
                    if (length2 >= resetAndStart.length) {
                        resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                        length2 = 0;
                    }
                    int i = length2 + 1;
                    try {
                        resetAndStart[length2] = nextTextValue;
                        length2 = i;
                    } catch (Exception e) {
                        e = e;
                        length2 = i;
                        throw JsonMappingException.wrapWithPath((Throwable) e, (Object) resetAndStart, leaseObjectBuffer.bufferedSize() + length2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) resetAndStart, leaseObjectBuffer.bufferedSize() + length2);
                }
            }
        }
    }

    public final Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public final AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    public final Object getEmptyValue(DeserializationContext deserializationContext) {
        return NO_STRINGS;
    }

    public final Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }
}
