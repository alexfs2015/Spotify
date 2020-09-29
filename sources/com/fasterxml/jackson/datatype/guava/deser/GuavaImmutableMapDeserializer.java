package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;

abstract class GuavaImmutableMapDeserializer<T extends ImmutableMap<Object, Object>> extends GuavaMapDeserializer<T> {
    GuavaImmutableMapDeserializer(MapType mapType, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(mapType, keyDeserializer, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    public T _deserializeEntries(JsonParser jsonParser, DeserializationContext deserializationContext) {
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._typeDeserializerForValue;
        a createBuilder = createBuilder();
        while (jsonParser.getCurrentToken() == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            if (keyDeserializer != null) {
                currentName = keyDeserializer.deserializeKey(currentName, deserializationContext);
            }
            if (jsonParser.nextToken() == JsonToken.VALUE_NULL) {
                _handleNull(deserializationContext, currentName, this._valueDeserializer, createBuilder);
            } else {
                createBuilder.b(currentName, typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer));
            }
            jsonParser.nextToken();
        }
        return createBuilder.b();
    }

    /* access modifiers changed from: protected */
    public void _handleNull(DeserializationContext deserializationContext, Object obj, JsonDeserializer<?> jsonDeserializer, a<Object, Object> aVar) {
        Object nullValue = jsonDeserializer.getNullValue(deserializationContext);
        if (nullValue != null) {
            aVar.b(obj, nullValue);
        }
    }

    /* access modifiers changed from: protected */
    public abstract a<Object, Object> createBuilder();
}
