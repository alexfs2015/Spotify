package com.google.common.collect;

import java.io.Serializable;

class ImmutableEntry<K, V> extends fbo<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final K key;
    final V value;

    ImmutableEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public final K getKey() {
        return this.key;
    }

    public final V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
