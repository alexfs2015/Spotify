package com.moat.analytics.mobile.base.functional;

import java.util.NoSuchElementException;

public final class a<T> {
    private static final a<?> a = new a<>();
    private final T b;

    private a() {
        this.b = null;
    }

    private a(T t) {
        if (t != null) {
            this.b = t;
            return;
        }
        throw new NullPointerException("Optional of null value.");
    }

    public static <T> a<T> a() {
        return a;
    }

    public static <T> a<T> a(T t) {
        return new a<>(t);
    }

    public static <T> a<T> b(T t) {
        return t == null ? a() : a(t);
    }

    public final T b() {
        T t = this.b;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public final T c(T t) {
        T t2 = this.b;
        return t2 != null ? t2 : t;
    }

    public final boolean c() {
        return this.b != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        T t = this.b;
        T t2 = aVar.b;
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return t.equals(t2);
    }

    public final int hashCode() {
        T t = this.b;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        T t = this.b;
        if (t == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{t});
    }
}
