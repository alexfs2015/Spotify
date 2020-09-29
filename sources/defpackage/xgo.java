package defpackage;

/* renamed from: xgo reason: default package */
public final class xgo<T> {
    public final xal a;
    public final xam b;
    private final T c;

    private xgo(xal xal, T t, xam xam) {
        this.a = xal;
        this.c = t;
        this.b = xam;
    }

    public static <T> xgo<T> a(T t, xal xal) {
        xgr.a(xal, "rawResponse == null");
        if (xal.a()) {
            return new xgo<>(xal, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public static <T> xgo<T> a(xam xam, xal xal) {
        xgr.a(xam, "body == null");
        xgr.a(xal, "rawResponse == null");
        if (!xal.a()) {
            return new xgo<>(xal, null, xam);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public final boolean a() {
        return this.a.a();
    }

    public final T b() {
        return this.c;
    }

    public final String toString() {
        return this.a.toString();
    }
}
