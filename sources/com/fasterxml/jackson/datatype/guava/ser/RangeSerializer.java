package com.fasterxml.jackson.datatype.guava.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.collect.BoundType;
import com.google.common.collect.Range;

public class RangeSerializer extends StdSerializer<Range<?>> implements ContextualSerializer {
    protected final JsonSerializer<Object> _endpointSerializer;
    protected final JavaType _rangeType;

    public RangeSerializer(JavaType javaType) {
        this(javaType, null);
    }

    public RangeSerializer(JavaType javaType, JsonSerializer<?> jsonSerializer) {
        super(javaType);
        this._rangeType = javaType;
        this._endpointSerializer = jsonSerializer;
    }

    @Deprecated
    public boolean isEmpty(Range<?> range) {
        return isEmpty((SerializerProvider) null, range);
    }

    public boolean isEmpty(SerializerProvider serializerProvider, Range<?> range) {
        return range.d();
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer<Object> jsonSerializer = this._endpointSerializer;
        if (jsonSerializer == null) {
            JavaType containedTypeOrUnknown = this._rangeType.containedTypeOrUnknown(0);
            if (containedTypeOrUnknown != null && !containedTypeOrUnknown.hasRawClass(Object.class)) {
                return new RangeSerializer(this._rangeType, serializerProvider.findValueSerializer(containedTypeOrUnknown, beanProperty));
            }
        } else if (jsonSerializer instanceof ContextualSerializer) {
            JsonSerializer<Object> createContextual = ((ContextualSerializer) jsonSerializer).createContextual(serializerProvider, beanProperty);
            if (createContextual != this._endpointSerializer) {
                return new RangeSerializer(this._rangeType, createContextual);
            }
        }
        return this;
    }

    public void serialize(Range<?> range, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartObject(range);
        _writeContents(range, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndObject();
    }

    public void serializeWithType(Range<?> range, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonGenerator.setCurrentValue(range);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(range, JsonToken.START_OBJECT));
        _writeContents(range, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    private void _writeContents(Range<?> range, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (range.b()) {
            String str = "lowerEndpoint";
            if (this._endpointSerializer != null) {
                jsonGenerator.writeFieldName(str);
                this._endpointSerializer.serialize(range.lowerBound.c(), jsonGenerator, serializerProvider);
            } else {
                serializerProvider.defaultSerializeField(str, range.lowerBound.c(), jsonGenerator);
            }
            jsonGenerator.writeStringField("lowerBoundType", range.lowerBound.a().name());
        }
        if (range.c()) {
            String str2 = "upperEndpoint";
            if (this._endpointSerializer != null) {
                jsonGenerator.writeFieldName(str2);
                this._endpointSerializer.serialize(range.upperBound.c(), jsonGenerator, serializerProvider);
            } else {
                serializerProvider.defaultSerializeField(str2, range.upperBound.c(), jsonGenerator);
            }
            jsonGenerator.writeStringField("upperBoundType", range.upperBound.b().name());
        }
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            JsonObjectFormatVisitor expectObjectFormat = jsonFormatVisitorWrapper.expectObjectFormat(javaType);
            if (expectObjectFormat != null && this._endpointSerializer != null) {
                JavaType containedType = this._rangeType.containedType(0);
                JavaType constructType = jsonFormatVisitorWrapper.getProvider().constructType(BoundType.class);
                JsonSerializer findValueSerializer = jsonFormatVisitorWrapper.getProvider().findValueSerializer(constructType, (BeanProperty) null);
                expectObjectFormat.property("lowerEndpoint", this._endpointSerializer, containedType);
                expectObjectFormat.property("lowerBoundType", findValueSerializer, constructType);
                expectObjectFormat.property("upperEndpoint", this._endpointSerializer, containedType);
                expectObjectFormat.property("upperBoundType", findValueSerializer, constructType);
            }
        }
    }
}
