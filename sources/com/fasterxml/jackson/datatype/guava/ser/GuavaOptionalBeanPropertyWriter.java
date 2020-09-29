package com.fasterxml.jackson.datatype.guava.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.google.common.base.Optional;

public class GuavaOptionalBeanPropertyWriter extends BeanPropertyWriter {
    private static final long serialVersionUID = 1;

    protected GuavaOptionalBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter) {
        super(beanPropertyWriter);
    }

    protected GuavaOptionalBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, PropertyName propertyName) {
        super(beanPropertyWriter, propertyName);
    }

    public BeanPropertyWriter _new(PropertyName propertyName) {
        return new GuavaOptionalBeanPropertyWriter(this, propertyName);
    }

    public BeanPropertyWriter unwrappingWriter(NameTransformer nameTransformer) {
        return new GuavaUnwrappingOptionalBeanPropertyWriter(this, nameTransformer);
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._nullSerializer == null) {
            Object obj2 = get(obj);
            if (obj2 == null || Optional.e().equals(obj2)) {
                return;
            }
        }
        super.serializeAsField(obj, jsonGenerator, serializerProvider);
    }
}
