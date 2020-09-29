package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.collect.LinkedHashMultiset;

public class LinkedHashMultisetDeserializer extends GuavaMultisetDeserializer<LinkedHashMultiset<Object>> {
    private static final long serialVersionUID = 1;

    public LinkedHashMultisetDeserializer(CollectionType collectionType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(collectionType, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    public LinkedHashMultiset<Object> createMultiset() {
        return LinkedHashMultiset.g();
    }

    public GuavaCollectionDeserializer<LinkedHashMultiset<Object>> withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return new LinkedHashMultisetDeserializer(this._containerType, typeDeserializer, jsonDeserializer);
    }
}
