package defpackage;

/* renamed from: raa reason: default package */
public final class raa {
    public final wlc<qtg> a;
    public final wlc<qwt> b;
    public final wlc<qxx> c;
    public final wlc<qxz> d;
    public final wlc<qyf> e;
    public final wlc<quw> f;
    public final wlc<qwf> g;
    public final wlc<qzj> h;
    public final wlc<qzs> i;
    public final wlc<qta> j;
    public final wlc<rac> k;
    public final wlc<rag> l;
    public final wlc<qzv> m;
    public final wlc<qsr> n;
    public final wlc<qwz> o;

    public raa(wlc<qtg> wlc, wlc<qwt> wlc2, wlc<qxx> wlc3, wlc<qxz> wlc4, wlc<qyf> wlc5, wlc<quw> wlc6, wlc<qwf> wlc7, wlc<qzj> wlc8, wlc<qzs> wlc9, wlc<qta> wlc10, wlc<rac> wlc11, wlc<rag> wlc12, wlc<qzv> wlc13, wlc<qsr> wlc14, wlc<qwz> wlc15) {
        wlc<qtg> wlc16 = wlc;
        this.a = (wlc) a(wlc, 1);
        wlc<qwt> wlc17 = wlc2;
        this.b = (wlc) a(wlc2, 2);
        wlc<qxx> wlc18 = wlc3;
        this.c = (wlc) a(wlc3, 3);
        wlc<qxz> wlc19 = wlc4;
        this.d = (wlc) a(wlc4, 4);
        wlc<qyf> wlc20 = wlc5;
        this.e = (wlc) a(wlc5, 5);
        wlc<quw> wlc21 = wlc6;
        this.f = (wlc) a(wlc6, 6);
        wlc<qwf> wlc22 = wlc7;
        this.g = (wlc) a(wlc7, 7);
        wlc<qzj> wlc23 = wlc8;
        this.h = (wlc) a(wlc8, 8);
        wlc<qzs> wlc24 = wlc9;
        this.i = (wlc) a(wlc9, 9);
        wlc<qta> wlc25 = wlc10;
        this.j = (wlc) a(wlc10, 10);
        wlc<rac> wlc26 = wlc11;
        this.k = (wlc) a(wlc11, 11);
        wlc<rag> wlc27 = wlc12;
        this.l = (wlc) a(wlc12, 12);
        this.m = (wlc) a(wlc13, 13);
        this.n = (wlc) a(wlc14, 14);
        this.o = (wlc) a(wlc15, 15);
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
