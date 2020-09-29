package com.fasterxml.jackson.datatype.guava.deser.multimap.list;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer;
import com.google.common.collect.LinkedListMultimap;
import java.lang.reflect.Method;

public class LinkedListMultimapDeserializer extends GuavaMultimapDeserializer<LinkedListMultimap<Object, Object>> {
    private static final long serialVersionUID = 1;

    public LinkedListMultimapDeserializer(MapLikeType mapLikeType, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(mapLikeType, keyDeserializer, typeDeserializer, jsonDeserializer);
    }

    public LinkedListMultimapDeserializer(MapLikeType mapLikeType, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, Method method, NullValueProvider nullValueProvider) {
        super(mapLikeType, keyDeserializer, typeDeserializer, jsonDeserializer, method, nullValueProvider);
    }

    public JsonDeserializer<?> _createContextual(MapLikeType mapLikeType, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, Method method, NullValueProvider nullValueProvider) {
        LinkedListMultimapDeserializer linkedListMultimapDeserializer = new LinkedListMultimapDeserializer(mapLikeType, keyDeserializer, typeDeserializer, jsonDeserializer, method, nullValueProvider);
        return linkedListMultimapDeserializer;
    }

    /* access modifiers changed from: protected */
    public LinkedListMultimap<Object, Object> createMultimap() {
        return LinkedListMultimap.a();
    }
}
