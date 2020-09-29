package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

public class PropertyBasedObjectIdGenerator extends PropertyGenerator {
    private static final long serialVersionUID = 1;
    protected final BeanPropertyWriter _property;

    public PropertyBasedObjectIdGenerator(ObjectIdInfo objectIdInfo, BeanPropertyWriter beanPropertyWriter) {
        this(objectIdInfo.getScope(), beanPropertyWriter);
    }

    protected PropertyBasedObjectIdGenerator(Class<?> cls, BeanPropertyWriter beanPropertyWriter) {
        super(cls);
        this._property = beanPropertyWriter;
    }

    public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
        if (objectIdGenerator.getClass() == getClass()) {
            PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = (PropertyBasedObjectIdGenerator) objectIdGenerator;
            if (propertyBasedObjectIdGenerator.getScope() == this._scope && propertyBasedObjectIdGenerator._property == this._property) {
                return true;
            }
        }
        return false;
    }

    public ObjectIdGenerator<Object> forScope(Class<?> cls) {
        return cls == this._scope ? this : new PropertyBasedObjectIdGenerator(cls, this._property);
    }

    public Object generateId(Object obj) {
        try {
            return this._property.get(obj);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Problem accessing property '");
            sb.append(this._property.getName());
            sb.append("': ");
            sb.append(e2.getMessage());
            throw new IllegalStateException(sb.toString(), e2);
        }
    }

    public IdKey key(Object obj) {
        if (obj == null) {
            return null;
        }
        return new IdKey(getClass(), this._scope, obj);
    }

    public ObjectIdGenerator<Object> newForSerialization(Object obj) {
        return this;
    }
}
