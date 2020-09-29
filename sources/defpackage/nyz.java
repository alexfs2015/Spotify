package defpackage;

/* renamed from: nyz reason: default package */
public final class nyz<T> {
    final T a;
    final Throwable b;

    private nyz(T t, Throwable th) {
        this.a = t;
        this.b = th;
    }

    public static <T> nyz<T> a(T t) {
        return new nyz<>(t, null);
    }

    public static <T> nyz<T> a(Throwable th) {
        return new nyz<>(null, th);
    }
}
