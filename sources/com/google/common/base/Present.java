package com.google.common.base;

final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    Present(T t) {
        this.reference = t;
    }

    public final <V> Optional<V> a(Function<? super T, V> function) {
        return new Present(fbp.a(function.apply(this.reference), (Object) "the Function passed to Optional.transform() must not return null."));
    }

    public final T a(fbu<? extends T> fbu) {
        fbp.a(fbu);
        return this.reference;
    }

    public final T a(T t) {
        fbp.a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    public final boolean b() {
        return true;
    }

    public final T c() {
        return this.reference;
    }

    public final T d() {
        return this.reference;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Present)) {
            return false;
        }
        return this.reference.equals(((Present) obj).reference);
    }

    public final int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Optional.of(");
        sb.append(this.reference);
        sb.append(")");
        return sb.toString();
    }
}
