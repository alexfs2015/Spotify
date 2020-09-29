package defpackage;

/* renamed from: pwe reason: default package */
public final class pwe implements vua<pwd> {
    private final wlc<saj> a;
    private final wlc<sfx> b;
    private final wlc<sgn> c;
    private final wlc<sjc> d;
    private final wlc<sjx> e;

    private pwe(wlc<saj> wlc, wlc<sfx> wlc2, wlc<sgn> wlc3, wlc<sjc> wlc4, wlc<sjx> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static pwe a(wlc<saj> wlc, wlc<sfx> wlc2, wlc<sgn> wlc3, wlc<sjc> wlc4, wlc<sjx> wlc5) {
        pwe pwe = new pwe(wlc, wlc2, wlc3, wlc4, wlc5);
        return pwe;
    }

    public final /* synthetic */ Object get() {
        pwd pwd = new pwd((saj) this.a.get(), (sfx) this.b.get(), (sgn) this.c.get(), (sjc) this.d.get(), (sjx) this.e.get());
        return pwd;
    }
}
