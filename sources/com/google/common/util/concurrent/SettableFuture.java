package com.google.common.util.concurrent;

public final class SettableFuture<V> extends i<V> {
    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    public final boolean set(V v) {
        return super.set(v);
    }

    public final boolean setException(Throwable th) {
        return super.setException(th);
    }

    public final boolean setFuture(fek<? extends V> fek) {
        return super.setFuture(fek);
    }

    private SettableFuture() {
    }
}
