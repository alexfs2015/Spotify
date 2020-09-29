package com.fasterxml.jackson.datatype.guava.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Map;

public class TableSerializer extends ContainerSerializer<fdv<?, ?, ?>> implements ContextualSerializer {
    private static final long serialVersionUID = 1;
    private final JsonSerializer<Object> _columnSerializer;
    private final BeanProperty _property;
    private final MapSerializer _rowMapSerializer;
    private final JsonSerializer<Object> _rowSerializer;
    private final JavaType _type;
    private final JsonSerializer<Object> _valueSerializer;
    private final TypeSerializer _valueTypeSerializer;

    public TableSerializer(JavaType javaType) {
        super(javaType);
        this._type = javaType;
        this._property = null;
        this._rowSerializer = null;
        this._columnSerializer = null;
        this._valueTypeSerializer = null;
        this._valueSerializer = null;
        this._rowMapSerializer = null;
    }

    protected TableSerializer(TableSerializer tableSerializer, BeanProperty beanProperty, TypeFactory typeFactory, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer3) {
        TypeFactory typeFactory2 = typeFactory;
        super((ContainerSerializer<?>) tableSerializer);
        this._type = tableSerializer._type;
        this._property = beanProperty;
        this._rowSerializer = jsonSerializer;
        this._columnSerializer = jsonSerializer2;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer3;
        MapType constructMapType = typeFactory.constructMapType(Map.class, this._type.containedTypeOrUnknown(1), this._type.containedTypeOrUnknown(2));
        MapSerializer construct = MapSerializer.construct(null, constructMapType, false, this._valueTypeSerializer, this._columnSerializer, this._valueSerializer, null);
        this._rowMapSerializer = MapSerializer.construct(null, typeFactory.constructMapType(Map.class, this._type.containedTypeOrUnknown(0), (JavaType) constructMapType), false, null, this._rowSerializer, construct, null);
    }

    protected TableSerializer(TableSerializer tableSerializer, TypeSerializer typeSerializer) {
        super((ContainerSerializer<?>) tableSerializer);
        this._type = tableSerializer._type;
        this._property = tableSerializer._property;
        this._rowSerializer = tableSerializer._rowSerializer;
        this._columnSerializer = tableSerializer._columnSerializer;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = tableSerializer._valueSerializer;
        this._rowMapSerializer = tableSerializer._rowMapSerializer;
    }

    private final void serializeFields(fdv<?, ?, ?> fdv, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        this._rowMapSerializer.serializeFields(fdv.c(), jsonGenerator, serializerProvider);
    }

    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new TableSerializer(this, typeSerializer);
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            JavaType containedTypeOrUnknown = this._type.containedTypeOrUnknown(2);
            if (containedTypeOrUnknown.isFinal()) {
                jsonSerializer = serializerProvider.findValueSerializer(containedTypeOrUnknown, beanProperty);
            }
        } else if (jsonSerializer instanceof ContextualSerializer) {
            jsonSerializer = ((ContextualSerializer) jsonSerializer).createContextual(serializerProvider, beanProperty);
        }
        JsonSerializer<Object> jsonSerializer2 = jsonSerializer;
        JsonSerializer<Object> jsonSerializer3 = this._rowSerializer;
        if (jsonSerializer3 == null) {
            jsonSerializer3 = serializerProvider.findKeySerializer(this._type.containedTypeOrUnknown(0), beanProperty);
        } else if (jsonSerializer3 instanceof ContextualSerializer) {
            jsonSerializer3 = ((ContextualSerializer) jsonSerializer3).createContextual(serializerProvider, beanProperty);
        }
        JsonSerializer<Object> jsonSerializer4 = jsonSerializer3;
        JsonSerializer<Object> jsonSerializer5 = this._columnSerializer;
        if (jsonSerializer5 == null) {
            jsonSerializer5 = serializerProvider.findKeySerializer(this._type.containedTypeOrUnknown(1), beanProperty);
        } else if (jsonSerializer5 instanceof ContextualSerializer) {
            jsonSerializer5 = ((ContextualSerializer) jsonSerializer5).createContextual(serializerProvider, beanProperty);
        }
        JsonSerializer<Object> jsonSerializer6 = jsonSerializer5;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        return withResolved(beanProperty, serializerProvider.getTypeFactory(), jsonSerializer4, jsonSerializer6, typeSerializer, jsonSerializer2);
    }

    public boolean hasSingleElement(fdv<?, ?, ?> fdv) {
        return fdv.b() == 1;
    }

    public boolean isEmpty(SerializerProvider serializerProvider, fdv<?, ?, ?> fdv) {
        return fdv.a();
    }

    public void serialize(fdv<?, ?, ?> fdv, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartObject(fdv);
        if (!fdv.a()) {
            serializeFields(fdv, jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndObject();
    }

    public void serializeWithType(fdv<?, ?, ?> fdv, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonGenerator.setCurrentValue(fdv);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(fdv, JsonToken.START_OBJECT));
        serializeFields(fdv, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    /* access modifiers changed from: protected */
    public TableSerializer withResolved(BeanProperty beanProperty, TypeFactory typeFactory, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer3) {
        TableSerializer tableSerializer = new TableSerializer(this, beanProperty, typeFactory, jsonSerializer, jsonSerializer2, typeSerializer, jsonSerializer3);
        return tableSerializer;
    }
}
