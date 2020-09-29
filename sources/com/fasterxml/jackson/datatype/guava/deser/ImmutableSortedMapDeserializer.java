package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.google.common.collect.ImmutableMap.a;
import com.google.common.collect.ImmutableSortedMap;

public class ImmutableSortedMapDeserializer extends GuavaImmutableMapDeserializer<ImmutableSortedMap<Object, Object>> {
    public ImmutableSortedMapDeserializer(MapType mapType, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(mapType, keyDeserializer, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    public a<Object, Object> createBuilder() {
        return ImmutableSortedMap.b();
    }

    public GuavaMapDeserializer<ImmutableSortedMap<Object, Object>> withResolved(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return new ImmutableSortedMapDeserializer(this._mapType, keyDeserializer, typeDeserializer, jsonDeserializer);
    }
}
