package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;

public abstract class StdScalarDeserializer<T> extends StdDeserializer<T> {
    private static final long serialVersionUID = 1;

    protected StdScalarDeserializer(StdScalarDeserializer<?> stdScalarDeserializer) {
        super((StdDeserializer<?>) stdScalarDeserializer);
    }

    protected StdScalarDeserializer(Class<?> cls) {
        super(cls);
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) {
        deserializationContext.reportBadMerge(this);
        return deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromScalar(jsonParser, deserializationContext);
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.ALWAYS_NULL;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }
}
