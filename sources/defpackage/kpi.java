package defpackage;

/* renamed from: kpi reason: default package */
public final class kpi implements vua<kph> {
    private final wlc<tkt> a;
    private final wlc<tkp> b;
    private final wlc<tks> c;
    private final wlc<kos> d;
    private final wlc<kop> e;

    private kpi(wlc<tkt> wlc, wlc<tkp> wlc2, wlc<tks> wlc3, wlc<kos> wlc4, wlc<kop> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static kpi a(wlc<tkt> wlc, wlc<tkp> wlc2, wlc<tks> wlc3, wlc<kos> wlc4, wlc<kop> wlc5) {
        kpi kpi = new kpi(wlc, wlc2, wlc3, wlc4, wlc5);
        return kpi;
    }

    public final /* synthetic */ Object get() {
        kph kph = new kph((tkt) this.a.get(), (tkp) this.b.get(), (tks) this.c.get(), (kos) this.d.get(), (kop) this.e.get());
        return kph;
    }
}
