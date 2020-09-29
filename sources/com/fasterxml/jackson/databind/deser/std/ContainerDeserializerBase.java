package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class ContainerDeserializerBase<T> extends StdDeserializer<T> {
    protected final JavaType _containerType;
    protected final NullValueProvider _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    protected ContainerDeserializerBase(JavaType javaType) {
        this(javaType, (NullValueProvider) null, (Boolean) null);
    }

    protected ContainerDeserializerBase(JavaType javaType, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType);
        this._containerType = javaType;
        this._unwrapSingle = bool;
        this._nullProvider = nullValueProvider;
        this._skipNullValues = NullsConstantProvider.isSkipper(nullValueProvider);
    }

    protected ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase) {
        this(containerDeserializerBase, containerDeserializerBase._nullProvider, containerDeserializerBase._unwrapSingle);
    }

    protected ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase, NullValueProvider nullValueProvider, Boolean bool) {
        super(containerDeserializerBase._containerType);
        this._containerType = containerDeserializerBase._containerType;
        this._nullProvider = nullValueProvider;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(nullValueProvider);
    }

    public SettableBeanProperty findBackReference(String str) {
        JsonDeserializer contentDeserializer = getContentDeserializer();
        if (contentDeserializer != null) {
            return contentDeserializer.findBackReference(str);
        }
        throw new IllegalArgumentException(String.format("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", new Object[]{str, getClass().getName()}));
    }

    public abstract JsonDeserializer<Object> getContentDeserializer();

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) {
        ValueInstantiator valueInstantiator = getValueInstantiator();
        if (valueInstantiator == null || !valueInstantiator.canCreateUsingDefault()) {
            JavaType valueType = getValueType();
            deserializationContext.reportBadDefinition(valueType, String.format("Cannot create empty instance of %s, no default Creator", new Object[]{valueType}));
        }
        try {
            return valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return ClassUtil.throwAsMappingException(deserializationContext, e);
        }
    }

    public ValueInstantiator getValueInstantiator() {
        return null;
    }

    public JavaType getValueType() {
        return this._containerType;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    /* access modifiers changed from: protected */
    public <BOGUS> BOGUS wrapAndThrow(Throwable th, Object obj, String str) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        if (!(th instanceof IOException) || (th instanceof JsonMappingException)) {
            throw JsonMappingException.wrapWithPath(th, obj, (String) ClassUtil.nonNull(str, "N/A"));
        }
        throw ((IOException) th);
    }
}
