package defpackage;

/* renamed from: wsj reason: default package */
public final class wsj<T> {
    public final wmf a;
    public final wmg b;
    private final T c;

    public static <T> wsj<T> a(T t, wmf wmf) {
        wsm.a(wmf, "rawResponse == null");
        if (wmf.a()) {
            return new wsj<>(wmf, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public static <T> wsj<T> a(wmg wmg, wmf wmf) {
        wsm.a(wmg, "body == null");
        wsm.a(wmf, "rawResponse == null");
        if (!wmf.a()) {
            return new wsj<>(wmf, null, wmg);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    private wsj(wmf wmf, T t, wmg wmg) {
        this.a = wmf;
        this.c = t;
        this.b = wmg;
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
