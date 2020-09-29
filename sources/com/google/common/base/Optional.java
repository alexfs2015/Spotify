package com.google.common.base;

import java.io.Serializable;

public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    Optional() {
    }

    public static <T> Optional<T> b(T t) {
        return new Present(fbp.a(t));
    }

    public static <T> Optional<T> c(T t) {
        return t == null ? e() : new Present(t);
    }

    public static <T> Optional<T> e() {
        return Absent.a();
    }

    public abstract <V> Optional<V> a(Function<? super T, V> function);

    public abstract T a(fbu<? extends T> fbu);

    public abstract T a(T t);

    public abstract boolean b();

    public abstract T c();

    public abstract T d();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}
