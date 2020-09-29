package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.util.List;

@JacksonStdImpl
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();
    private static final long serialVersionUID = 1;

    protected IndexedStringListSerializer() {
        super(List.class);
    }

    public IndexedStringListSerializer(IndexedStringListSerializer indexedStringListSerializer, Boolean bool) {
        super(indexedStringListSerializer, bool);
    }

    private final void serializeContents(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, int i) {
        jsonGenerator.setCurrentValue(list);
        int i2 = 0;
        while (i2 < i) {
            try {
                String str = (String) list.get(i2);
                if (str == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.writeString(str);
                }
                i2++;
            } catch (Exception e) {
                wrapAndThrow(serializerProvider, (Throwable) e, (Object) list, i2);
                return;
            }
        }
    }

    public final JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new IndexedStringListSerializer(this, bool);
    }

    public final void acceptContentVisitor(JsonArrayFormatVisitor jsonArrayFormatVisitor) {
        jsonArrayFormatVisitor.itemsFormat(JsonFormatTypes.STRING);
    }

    public final void serialize(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        int size = list.size();
        if (size != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.writeStartArray(size);
            serializeContents(list, jsonGenerator, serializerProvider, size);
            jsonGenerator.writeEndArray();
            return;
        }
        serializeContents(list, jsonGenerator, serializerProvider, 1);
    }

    public final void serializeWithType(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(list, JsonToken.START_ARRAY));
        serializeContents(list, jsonGenerator, serializerProvider, list.size());
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }
}
