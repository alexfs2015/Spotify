package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.collect.ImmutableCollection.b;
import com.google.common.collect.ImmutableSortedSet;

public class ImmutableSortedSetDeserializer extends GuavaImmutableCollectionDeserializer<ImmutableSortedSet<Object>> {
    private static final long serialVersionUID = 1;

    public ImmutableSortedSetDeserializer(CollectionType collectionType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(collectionType, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    public b<Object> createBuilder() {
        return ImmutableSortedSet.k();
    }

    public ImmutableSortedSetDeserializer withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return new ImmutableSortedSetDeserializer(this._containerType, typeDeserializer, jsonDeserializer);
    }
}
