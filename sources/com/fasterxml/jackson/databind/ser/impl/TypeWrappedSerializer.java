package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;

public final class TypeWrappedSerializer extends JsonSerializer<Object> implements ContextualSerializer {
    protected final JsonSerializer<Object> _serializer;
    protected final TypeSerializer _typeSerializer;

    public TypeWrappedSerializer(TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer) {
        this._typeSerializer = typeSerializer;
        this._serializer = jsonSerializer;
    }

    public final JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer<Object> jsonSerializer = this._serializer;
        if (jsonSerializer instanceof ContextualSerializer) {
            jsonSerializer = serializerProvider.handleSecondaryContextualization(jsonSerializer, beanProperty);
        }
        return jsonSerializer == this._serializer ? this : new TypeWrappedSerializer(this._typeSerializer, jsonSerializer);
    }

    public final Class<Object> handledType() {
        return Object.class;
    }

    public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        this._serializer.serializeWithType(obj, jsonGenerator, serializerProvider, this._typeSerializer);
    }

    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        this._serializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
    }

    public final TypeSerializer typeSerializer() {
        return this._typeSerializer;
    }
}
