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

    /* access modifiers changed from: protected */
    public abstract b<Object> createBuilder();

    GuavaImmutableCollectionDeserializer(CollectionType collectionType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(collectionType, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    public T _deserializeContents(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._typeDeserializerForValue;
        b createBuilder = createBuilder();
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                return createBuilder.a();
            }
            if (nextToken == JsonToken.VALUE_NULL) {
                obj = null;
            } else if (typeDeserializer == null) {
                obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            }
            createBuilder.b(obj);
        }
    }

    /* access modifiers changed from: protected */
    public T _deserializeFromSingleValue(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._typeDeserializerForValue;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            obj = null;
        } else if (typeDeserializer == null) {
            obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        } else {
            obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        }
        return createBuilder().b(obj).a();
    }
}
