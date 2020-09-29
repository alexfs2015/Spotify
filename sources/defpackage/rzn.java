package defpackage;

/* renamed from: rzn reason: default package */
public final class rzn implements vua<rzm> {
    private final wlc<rzh> a;
    private final wlc<rzq> b;
    private final wlc<rzw> c;
    private final wlc<Boolean> d;
    private final wlc<rzi> e;

    private rzn(wlc<rzh> wlc, wlc<rzq> wlc2, wlc<rzw> wlc3, wlc<Boolean> wlc4, wlc<rzi> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static rzn a(wlc<rzh> wlc, wlc<rzq> wlc2, wlc<rzw> wlc3, wlc<Boolean> wlc4, wlc<rzi> wlc5) {
        rzn rzn = new rzn(wlc, wlc2, wlc3, wlc4, wlc5);
        return rzn;
    }

    public final /* synthetic */ Object get() {
        rzm rzm = new rzm((rzh) this.a.get(), (rzq) this.b.get(), (rzw) this.c.get(), ((Boolean) this.d.get()).booleanValue(), (rzi) this.e.get());
        return rzm;
    }
}
