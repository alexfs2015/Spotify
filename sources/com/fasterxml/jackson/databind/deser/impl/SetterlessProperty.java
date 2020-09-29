package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.reflect.Method;

public final class SetterlessProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMethod _annotated;
    protected final Method _getter;

    protected SetterlessProperty(SetterlessProperty setterlessProperty, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(setterlessProperty, jsonDeserializer, nullValueProvider);
        this._annotated = setterlessProperty._annotated;
        this._getter = setterlessProperty._getter;
    }

    protected SetterlessProperty(SetterlessProperty setterlessProperty, PropertyName propertyName) {
        super(setterlessProperty, propertyName);
        this._annotated = setterlessProperty._annotated;
        this._getter = setterlessProperty._getter;
    }

    public SetterlessProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedMethod annotatedMethod) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this._annotated = annotatedMethod;
        this._getter = annotatedMethod.getAnnotated();
    }

    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
            if (this._valueTypeDeserializer != null) {
                deserializationContext.reportBadDefinition(getType(), String.format("Problem deserializing 'setterless' property (\"%s\"): no way to handle typed deser with setterless yet", new Object[]{getName()}));
            }
            try {
                Object invoke = this._getter.invoke(obj, null);
                if (invoke == null) {
                    deserializationContext.reportBadDefinition(getType(), String.format("Problem deserializing 'setterless' property '%s': get method returned null", new Object[]{getName()}));
                }
                this._valueDeserializer.deserialize(jsonParser, deserializationContext, invoke);
            } catch (Exception e) {
                _throwAsIOE(jsonParser, e);
            }
        }
    }

    public final Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        deserializeAndSet(jsonParser, deserializationContext, obj);
        return obj;
    }

    public final void fixAccess(DeserializationConfig deserializationConfig) {
        this._annotated.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public final AnnotatedMember getMember() {
        return this._annotated;
    }

    public final void set(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder("Should never call `set()` on setterless property ('");
        sb.append(getName());
        sb.append("')");
        throw new UnsupportedOperationException(sb.toString());
    }

    public final Object setAndReturn(Object obj, Object obj2) {
        set(obj, obj2);
        return obj;
    }

    public final SettableBeanProperty withName(PropertyName propertyName) {
        return new SetterlessProperty(this, propertyName);
    }

    public final SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new SetterlessProperty(this, this._valueDeserializer, nullValueProvider);
    }

    public final SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        return this._valueDeserializer == jsonDeserializer ? this : new SetterlessProperty(this, jsonDeserializer, this._nullProvider);
    }
}
