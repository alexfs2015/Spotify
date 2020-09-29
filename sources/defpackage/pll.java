package defpackage;

/* renamed from: pll reason: default package */
public final class pll {
    public final wlc<pli> a;
    public final wlc<pmm> b;
    public final wlc<pmg> c;
    public final wlc<hec> d;
    public final wlc<lkn> e;

    public pll(wlc<pli> wlc, wlc<pmm> wlc2, wlc<pmg> wlc3, wlc<hec> wlc4, wlc<lkn> wlc5) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
