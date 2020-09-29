package defpackage;

/* renamed from: tnj reason: default package */
public final class tnj<T> {
    private final T a;
    private final Throwable b;

    private tnj(T t, Throwable th) {
        this.a = t;
        this.b = th;
    }

    public static <T> tnj<T> a(T t) {
        return new tnj<>(t, null);
    }

    public static <T> tnj<T> a(Throwable th) {
        return new tnj<>(null, th);
    }

    public final T a() {
        return this.a;
    }
}
