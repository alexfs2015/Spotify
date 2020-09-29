package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

public class ConstantValueInstantiator extends ValueInstantiator {
    protected final Object _value;

    public boolean canCreateUsingDefault() {
        return true;
    }

    public boolean canInstantiate() {
        return true;
    }

    public ConstantValueInstantiator(Object obj) {
        this._value = obj;
    }

    public Class<?> getValueClass() {
        return this._value.getClass();
    }

    public Object createUsingDefault(DeserializationContext deserializationContext) {
        return this._value;
    }
}
