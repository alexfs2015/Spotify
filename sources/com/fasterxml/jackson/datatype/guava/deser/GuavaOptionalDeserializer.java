package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.google.common.base.Optional;

public class GuavaOptionalDeserializer extends ReferenceTypeDeserializer<Optional<?>> {
    private static final long serialVersionUID = 1;

    public GuavaOptionalDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(javaType, valueInstantiator, typeDeserializer, jsonDeserializer);
    }

    public GuavaOptionalDeserializer withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return new GuavaOptionalDeserializer(this._fullType, this._valueInstantiator, typeDeserializer, jsonDeserializer);
    }

    public Optional<?> getNullValue(DeserializationContext deserializationContext) {
        return Optional.e();
    }

    public Optional<?> referenceValue(Object obj) {
        return Optional.c(obj);
    }

    public Object getReferenced(Optional<?> optional) {
        return optional.c();
    }

    public Optional<?> updateReference(Optional<?> optional, Object obj) {
        return Optional.c(obj);
    }
}
