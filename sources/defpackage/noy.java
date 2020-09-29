package defpackage;

/* renamed from: noy reason: default package */
public final class noy<T> {
    final T a;
    private final Throwable b;

    private noy(T t, Throwable th) {
        this.a = t;
        this.b = th;
    }

    public static <T> noy<T> a(T t) {
        return new noy<>(t, null);
    }

    public static <T> noy<T> a(Throwable th) {
        return new noy<>(null, th);
    }
}
