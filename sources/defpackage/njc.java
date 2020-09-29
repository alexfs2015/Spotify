package defpackage;

/* renamed from: njc reason: default package */
public final class njc<T> {
    final T a;
    private final Throwable b;

    private njc(T t, Throwable th) {
        this.a = t;
        this.b = th;
    }

    public static <T> njc<T> a(T t) {
        return new njc<>(t, null);
    }

    public static <T> njc<T> a(Throwable th) {
        return new njc<>(null, th);
    }
}
