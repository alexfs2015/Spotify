package defpackage;

/* renamed from: pbt reason: default package */
public final class pbt implements vua<pbs> {
    private final wlc<lkn> a;
    private final wlc<tmo> b;
    private final wlc<pbm> c;
    private final wlc<String> d;
    private final wlc<ozw> e;

    private pbt(wlc<lkn> wlc, wlc<tmo> wlc2, wlc<pbm> wlc3, wlc<String> wlc4, wlc<ozw> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static pbt a(wlc<lkn> wlc, wlc<tmo> wlc2, wlc<pbm> wlc3, wlc<String> wlc4, wlc<ozw> wlc5) {
        pbt pbt = new pbt(wlc, wlc2, wlc3, wlc4, wlc5);
        return pbt;
    }

    public final /* synthetic */ Object get() {
        pbs pbs = new pbs((lkn) this.a.get(), (tmo) this.b.get(), (pbm) this.c.get(), (String) this.d.get(), (ozw) this.e.get());
        return pbs;
    }
}
