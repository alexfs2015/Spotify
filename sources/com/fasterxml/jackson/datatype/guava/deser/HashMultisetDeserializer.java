package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.collect.HashMultiset;

public class HashMultisetDeserializer extends GuavaMultisetDeserializer<HashMultiset<Object>> {
    private static final long serialVersionUID = 1;

    public HashMultisetDeserializer(CollectionType collectionType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(collectionType, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    public HashMultiset<Object> createMultiset() {
        return HashMultiset.g();
    }

    public HashMultisetDeserializer withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return new HashMultisetDeserializer(this._containerType, typeDeserializer, jsonDeserializer);
    }
}
