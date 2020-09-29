package defpackage;

/* renamed from: raj reason: default package */
public final class raj {
    public final wlc<qti> a;
    public final wlc<qwt> b;
    public final wlc<Object> c;
    public final wlc<qxx> d;
    public final wlc<qxz> e;
    public final wlc<qyf> f;
    public final wlc<quw> g;
    public final wlc<qwd> h;
    public final wlc<qta> i;
    public final wlc<qzs> j;
    public final wlc<rag> k;
    public final wlc<qzv> l;
    public final wlc<qwz> m;
    public final wlc<qsr> n;

    public raj(wlc<qti> wlc, wlc<qwt> wlc2, wlc<Object> wlc3, wlc<qxx> wlc4, wlc<qxz> wlc5, wlc<qyf> wlc6, wlc<quw> wlc7, wlc<qwd> wlc8, wlc<qta> wlc9, wlc<qzs> wlc10, wlc<rag> wlc11, wlc<qzv> wlc12, wlc<qwz> wlc13, wlc<qsr> wlc14) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
        this.h = (wlc) a(wlc8, 8);
        this.i = (wlc) a(wlc9, 9);
        this.j = (wlc) a(wlc10, 10);
        this.k = (wlc) a(wlc11, 11);
        this.l = (wlc) a(wlc12, 12);
        this.m = (wlc) a(wlc13, 13);
        this.n = (wlc) a(wlc14, 14);
    }

    public static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}
