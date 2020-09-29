package defpackage;

/* renamed from: mjr reason: default package */
public final class mjr implements vua<mjq> {
    private final wlc<a> a;
    private final wlc<mjt> b;
    private final wlc<fpt> c;
    private final wlc<jjf> d;
    private final wlc<jrp> e;
    private final wlc<String> f;

    private mjr(wlc<a> wlc, wlc<mjt> wlc2, wlc<fpt> wlc3, wlc<jjf> wlc4, wlc<jrp> wlc5, wlc<String> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static mjr a(wlc<a> wlc, wlc<mjt> wlc2, wlc<fpt> wlc3, wlc<jjf> wlc4, wlc<jrp> wlc5, wlc<String> wlc6) {
        mjr mjr = new mjr(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return mjr;
    }

    public final /* synthetic */ Object get() {
        mjq mjq = new mjq(this.a, this.b, this.c, this.d, this.e, this.f);
        return mjq;
    }
}
