package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

public class NullsConstantProvider implements NullValueProvider, Serializable {
    private static final NullsConstantProvider NULLER = new NullsConstantProvider(null);
    private static final NullsConstantProvider SKIPPER = new NullsConstantProvider(null);
    private static final long serialVersionUID = 1;
    protected final AccessPattern _access;
    protected final Object _nullValue;

    protected NullsConstantProvider(Object obj) {
        this._nullValue = obj;
        this._access = this._nullValue == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
    }

    public static NullsConstantProvider forValue(Object obj) {
        return obj == null ? NULLER : new NullsConstantProvider(obj);
    }

    public static boolean isSkipper(NullValueProvider nullValueProvider) {
        return nullValueProvider == SKIPPER;
    }

    public static NullsConstantProvider nuller() {
        return NULLER;
    }

    public static NullsConstantProvider skipper() {
        return SKIPPER;
    }

    public Object getNullValue(DeserializationContext deserializationContext) {
        return this._nullValue;
    }
}
