package defpackage;

/* renamed from: mci reason: default package */
public final class mci<T> {
    final T a;
    private final Throwable b;

    mci(T t, Throwable th) {
        this.a = t;
        this.b = th;
    }

    public static <T> mci<T> a(T t) {
        return new mci<>(t, null);
    }
}
