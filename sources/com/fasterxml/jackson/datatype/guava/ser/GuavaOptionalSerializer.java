package com.fasterxml.jackson.datatype.guava.ser;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.google.common.base.Optional;

public class GuavaOptionalSerializer extends ReferenceTypeSerializer<Optional<?>> {
    private static final long serialVersionUID = 1;

    public GuavaOptionalSerializer(ReferenceType referenceType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(referenceType, z, typeSerializer, jsonSerializer);
    }

    public GuavaOptionalSerializer(GuavaOptionalSerializer guavaOptionalSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer, Object obj, boolean z) {
        super(guavaOptionalSerializer, beanProperty, typeSerializer, jsonSerializer, nameTransformer, obj, z);
    }

    public ReferenceTypeSerializer<Optional<?>> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer) {
        if (this._property == beanProperty && this._valueTypeSerializer == typeSerializer && this._valueSerializer == jsonSerializer && this._unwrapper == nameTransformer) {
            return this;
        }
        GuavaOptionalSerializer guavaOptionalSerializer = new GuavaOptionalSerializer(this, beanProperty, typeSerializer, jsonSerializer, nameTransformer, this._suppressableValue, this._suppressNulls);
        return guavaOptionalSerializer;
    }

    public ReferenceTypeSerializer<Optional<?>> withContentInclusion(Object obj, boolean z) {
        GuavaOptionalSerializer guavaOptionalSerializer = new GuavaOptionalSerializer(this, this._property, this._valueTypeSerializer, this._valueSerializer, this._unwrapper, obj, z);
        return guavaOptionalSerializer;
    }

    /* access modifiers changed from: protected */
    public boolean _isValuePresent(Optional<?> optional) {
        return optional.b();
    }

    /* access modifiers changed from: protected */
    public Object _getReferenced(Optional<?> optional) {
        return optional.c();
    }

    /* access modifiers changed from: protected */
    public Object _getReferencedIfPresent(Optional<?> optional) {
        if (optional.b()) {
            return optional.c();
        }
        return null;
    }
}
