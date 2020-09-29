package com.google.common.base;

final class Absent<T> extends Optional<T> {
    private static Absent<Object> a = new Absent<>();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    static <T> Optional<T> a() {
        return a;
    }

    private Object readResolve() {
        return a;
    }

    public final <V> Optional<V> a(Function<? super T, V> function) {
        fbp.a(function);
        return Optional.e();
    }

    public final T a(fbu<? extends T> fbu) {
        return fbp.a(fbu.get(), (Object) "use Optional.orNull() instead of a Supplier that returns null");
    }

    public final T a(T t) {
        return fbp.a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }

    public final boolean b() {
        return false;
    }

    public final T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
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
}
