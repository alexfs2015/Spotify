package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

public class MergingSettableBeanProperty extends Delegating {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMember _accessor;

    protected MergingSettableBeanProperty(SettableBeanProperty settableBeanProperty, AnnotatedMember annotatedMember) {
        super(settableBeanProperty);
        this._accessor = annotatedMember;
    }

    public static MergingSettableBeanProperty construct(SettableBeanProperty settableBeanProperty, AnnotatedMember annotatedMember) {
        return new MergingSettableBeanProperty(settableBeanProperty, annotatedMember);
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object value = this._accessor.getValue(obj);
        Object deserialize = value == null ? this.delegate.deserialize(jsonParser, deserializationContext) : this.delegate.deserializeWith(jsonParser, deserializationContext, value);
        if (deserialize != value) {
            this.delegate.set(obj, deserialize);
        }
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object value = this._accessor.getValue(obj);
        Object deserialize = value == null ? this.delegate.deserialize(jsonParser, deserializationContext) : this.delegate.deserializeWith(jsonParser, deserializationContext, value);
        return (deserialize == value || deserialize == null) ? obj : this.delegate.setAndReturn(obj, deserialize);
    }

    public void set(Object obj, Object obj2) {
        if (obj2 != null) {
            this.delegate.set(obj, obj2);
        }
    }

    public Object setAndReturn(Object obj, Object obj2) {
        return obj2 != null ? this.delegate.setAndReturn(obj, obj2) : obj;
    }

    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        return new MergingSettableBeanProperty(settableBeanProperty, this._accessor);
    }
}