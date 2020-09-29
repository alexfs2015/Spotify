package defpackage;

/* renamed from: nsw reason: default package */
public final class nsw<T> {
    final T a;
    final Throwable b;

    private nsw(T t, Throwable th) {
        this.a = t;
        this.b = th;
    }

    public static <T> nsw<T> a(T t) {
        return new nsw<>(t, null);
    }

    public static <T> nsw<T> a(Throwable th) {
        return new nsw<>(null, th);
    }
}
