package defpackage;

/* renamed from: wsq reason: default package */
public final class wsq<T> {
    private final wsj<T> a;
    private final Throwable b;

    public static <T> wsq<T> a(Throwable th) {
        if (th != null) {
            return new wsq<>(null, th);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> wsq<T> a(wsj<T> wsj) {
        if (wsj != null) {
            return new wsq<>(wsj, null);
        }
        throw new NullPointerException("response == null");
    }

    private wsq(wsj<T> wsj, Throwable th) {
        this.a = wsj;
        this.b = th;
    }
}
