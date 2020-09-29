package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.collect.ImmutableCollection.b;
import com.google.common.collect.ImmutableSortedMultiset;

public class ImmutableSortedMultisetDeserializer extends GuavaImmutableCollectionDeserializer<ImmutableSortedMultiset<Object>> {
    private static final long serialVersionUID = 1;

    public ImmutableSortedMultisetDeserializer(CollectionType collectionType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(collectionType, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    public b<Object> createBuilder() {
        return ImmutableSortedMultiset.s();
    }

    public GuavaCollectionDeserializer<ImmutableSortedMultiset<Object>> withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return new ImmutableSortedMultisetDeserializer(this._containerType, typeDeserializer, jsonDeserializer);
    }
}
