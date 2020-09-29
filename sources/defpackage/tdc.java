package defpackage;

/* renamed from: tdc reason: default package */
public final class tdc<T> {
    private final T a;
    private final Throwable b;

    private tdc(T t, Throwable th) {
        this.a = t;
        this.b = th;
    }

    public final T a() {
        return this.a;
    }

    public static <T> tdc<T> a(T t) {
        return new tdc<>(t, null);
    }

    public static <T> tdc<T> a(Throwable th) {
        return new tdc<>(null, th);
    }
}
