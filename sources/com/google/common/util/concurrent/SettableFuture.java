package com.google.common.util.concurrent;

public final class SettableFuture<V> extends i<V> {
    private SettableFuture() {
    }

    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    public final boolean set(V v) {
        return super.set(v);
    }

    public final boolean setException(Throwable th) {
        return super.setException(th);
    }

    public final boolean setFuture(ffe<? extends V> ffe) {
        return super.setFuture(ffe);
    }
}
