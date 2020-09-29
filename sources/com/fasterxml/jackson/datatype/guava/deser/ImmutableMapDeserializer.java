package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;

public class ImmutableMapDeserializer extends GuavaImmutableMapDeserializer<ImmutableMap<Object, Object>> {
    public ImmutableMapDeserializer(MapType mapType, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(mapType, keyDeserializer, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    public a<Object, Object> createBuilder() {
        return ImmutableMap.g();
    }

    public ImmutableMapDeserializer withResolved(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return new ImmutableMapDeserializer(this._mapType, keyDeserializer, typeDeserializer, jsonDeserializer);
    }
}
