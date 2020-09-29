package defpackage;

/* renamed from: lyh reason: default package */
public final class lyh<T> {
    final T a;
    private final Throwable b;

    lyh(T t, Throwable th) {
        this.a = t;
        this.b = th;
    }

    public static <T> lyh<T> a(T t) {
        return new lyh<>(t, null);
    }
}
