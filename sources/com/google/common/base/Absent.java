package com.google.common.base;

final class Absent<T> extends Optional<T> {
    private static Absent<Object> a = new Absent<>();
    private static final long serialVersionUID = 0;

    public final boolean b() {
        return false;
    }

    public final T d() {
        return null;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    static <T> Optional<T> a() {
        return a;
    }

    private Absent() {
    }

    public final T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final T a(T t) {
        return fay.a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }

    public final <V> Optional<V> a(Function<? super T, V> function) {
        fay.a(function);
        return Optional.e();
    }

    private Object readResolve() {
        return a;
    }
}
