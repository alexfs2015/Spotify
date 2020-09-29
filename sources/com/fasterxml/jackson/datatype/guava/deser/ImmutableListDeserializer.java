package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;

public class ImmutableListDeserializer extends GuavaImmutableCollectionDeserializer<ImmutableList<Object>> {
    private static final long serialVersionUID = 1;

    public ImmutableListDeserializer(CollectionType collectionType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(collectionType, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    public a<Object> createBuilder() {
        return ImmutableList.g();
    }

    public ImmutableListDeserializer withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return new ImmutableListDeserializer(this._containerType, typeDeserializer, jsonDeserializer);
    }
}
