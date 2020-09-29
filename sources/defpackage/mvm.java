package defpackage;

/* renamed from: mvm reason: default package */
public final class mvm implements vua<mvl> {
    private final wlc<ka> a;
    private final wlc<msp> b;
    private final wlc<a> c;
    private final wlc<gxz> d;
    private final wlc<gzm> e;
    private final wlc<vol> f;

    private mvm(wlc<ka> wlc, wlc<msp> wlc2, wlc<a> wlc3, wlc<gxz> wlc4, wlc<gzm> wlc5, wlc<vol> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static mvm a(wlc<ka> wlc, wlc<msp> wlc2, wlc<a> wlc3, wlc<gxz> wlc4, wlc<gzm> wlc5, wlc<vol> wlc6) {
        mvm mvm = new mvm(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return mvm;
    }

    public final /* synthetic */ Object get() {
        mvl mvl = new mvl((ka) this.a.get(), (msp) this.b.get(), (a) this.c.get(), (gxz) this.d.get(), (gzm) this.e.get(), (vol) this.f.get());
        return mvl;
    }
}
