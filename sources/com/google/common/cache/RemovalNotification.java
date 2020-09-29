package com.google.common.cache;

import java.util.AbstractMap.SimpleImmutableEntry;

public final class RemovalNotification<K, V> extends SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final RemovalCause cause;

    private RemovalNotification(K k, V v, RemovalCause removalCause) {
        super(k, v);
        this.cause = (RemovalCause) fbp.a(removalCause);
    }

    public static <K, V> RemovalNotification<K, V> a(K k, V v, RemovalCause removalCause) {
        return new RemovalNotification<>(k, v, removalCause);
    }
}
