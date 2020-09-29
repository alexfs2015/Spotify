package defpackage;

/* renamed from: sah reason: default package */
public final class sah implements vua<sag> {
    private final wlc<rzq> a;
    private final wlc<saa> b;
    private final wlc<Boolean> c;
    private final wlc<rzi> d;

    private sah(wlc<rzq> wlc, wlc<saa> wlc2, wlc<Boolean> wlc3, wlc<rzi> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static sah a(wlc<rzq> wlc, wlc<saa> wlc2, wlc<Boolean> wlc3, wlc<rzi> wlc4) {
        return new sah(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new sag((rzq) this.a.get(), (saa) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (rzi) this.d.get());
    }
}
