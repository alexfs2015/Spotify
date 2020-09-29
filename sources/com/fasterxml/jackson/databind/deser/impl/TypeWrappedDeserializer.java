package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.Serializable;
import java.util.Collection;

public final class TypeWrappedDeserializer extends JsonDeserializer<Object> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final JsonDeserializer<Object> _deserializer;
    protected final TypeDeserializer _typeDeserializer;

    public TypeWrappedDeserializer(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        this._typeDeserializer = typeDeserializer;
        this._deserializer = jsonDeserializer;
    }

    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return this._deserializer.deserializeWithType(jsonParser, deserializationContext, this._typeDeserializer);
    }

    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return this._deserializer.deserialize(jsonParser, deserializationContext, obj);
    }

    public final Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    public final JsonDeserializer<?> getDelegatee() {
        return this._deserializer.getDelegatee();
    }

    public final Object getEmptyValue(DeserializationContext deserializationContext) {
        return this._deserializer.getEmptyValue(deserializationContext);
    }

    public final Collection<Object> getKnownPropertyNames() {
        return this._deserializer.getKnownPropertyNames();
    }

    public final Object getNullValue(DeserializationContext deserializationContext) {
        return this._deserializer.getNullValue(deserializationContext);
    }

    public final Class<?> handledType() {
        return this._deserializer.handledType();
    }

    public final Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._deserializer.supportsUpdate(deserializationConfig);
    }
}
