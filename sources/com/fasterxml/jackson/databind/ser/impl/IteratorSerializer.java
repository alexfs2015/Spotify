package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.Iterator;

@JacksonStdImpl
public class IteratorSerializer extends AsArraySerializerBase<Iterator<?>> {
    public IteratorSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer) {
        super(Iterator.class, javaType, z, typeSerializer, null);
    }

    public IteratorSerializer(IteratorSerializer iteratorSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super((AsArraySerializerBase<?>) iteratorSerializer, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    /* access modifiers changed from: protected */
    public void _serializeDynamicContents(Iterator<?> it, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
        do {
            Object next = it.next();
            if (next == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            } else {
                Class cls = next.getClass();
                JsonSerializer serializerFor = propertySerializerMap.serializerFor(cls);
                if (serializerFor == null) {
                    serializerFor = this._elementType.hasGenericTypes() ? _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._elementType, cls), serializerProvider) : _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                    propertySerializerMap = this._dynamicSerializers;
                }
                if (typeSerializer == null) {
                    serializerFor.serialize(next, jsonGenerator, serializerProvider);
                } else {
                    serializerFor.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                }
            }
        } while (it.hasNext());
    }

    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        IteratorSerializer iteratorSerializer = new IteratorSerializer(this, this._property, typeSerializer, this._elementSerializer, this._unwrapSingle);
        return iteratorSerializer;
    }

    public boolean hasSingleElement(Iterator<?> it) {
        return false;
    }

    public boolean isEmpty(SerializerProvider serializerProvider, Iterator<?> it) {
        return !it.hasNext();
    }

    public final void serialize(Iterator<?> it, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartArray();
        serializeContents(it, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    public void serializeContents(Iterator<?> it, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (it.hasNext()) {
            JsonSerializer jsonSerializer = this._elementSerializer;
            if (jsonSerializer == null) {
                _serializeDynamicContents(it, jsonGenerator, serializerProvider);
                return;
            }
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            do {
                Object next = it.next();
                if (next == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else if (typeSerializer == null) {
                    jsonSerializer.serialize(next, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                }
            } while (it.hasNext());
        }
    }

    public IteratorSerializer withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        IteratorSerializer iteratorSerializer = new IteratorSerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
        return iteratorSerializer;
    }
}
