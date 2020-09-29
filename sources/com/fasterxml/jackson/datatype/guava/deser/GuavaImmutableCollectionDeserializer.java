package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableCollection.b;

abstract class GuavaImmutableCollectionDeserializer<T extends ImmutableCollection<Object>> extends GuavaCollectionDeserializer<T> {
    private static final long serialVersionUID = 1;

    GuavaImmutableCollectionDeserializer(CollectionType collectionType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(collectionType, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    public T _deserializeContents(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._typeDeserializerForValue;
        b createBuilder = createBuilder();
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                return createBuilder.a();
            }
            Object obj = nextToken == JsonToken.VALUE_NULL ? null : typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            createBuilder.b(obj);
        }
    }

    /* access modifiers changed from: protected */
    public T _deserializeFromSingleValue(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._typeDeserializerForValue;
        Object obj = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        return createBuilder().b(obj).a();
    }

    /* access modifiers changed from: protected */
    public abstract b<Object> createBuilder();
}
