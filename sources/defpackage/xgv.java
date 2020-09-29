package defpackage;

/* renamed from: xgv reason: default package */
public final class xgv<T> {
    private final xgo<T> a;
    private final Throwable b;

    private xgv(xgo<T> xgo, Throwable th) {
        this.a = xgo;
        this.b = th;
    }

    public static <T> xgv<T> a(Throwable th) {
        if (th != null) {
            return new xgv<>(null, th);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> xgv<T> a(xgo<T> xgo) {
        if (xgo != null) {
            return new xgv<>(xgo, null);
        }
        throw new NullPointerException("response == null");
    }
}
