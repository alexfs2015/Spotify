package defpackage;

/* renamed from: mya reason: default package */
public final class mya implements vua<mxz> {
    private final wlc<uvf> a;
    private final wlc<myn> b;
    private final wlc<fxn> c;
    private final wlc<myo> d;

    private mya(wlc<uvf> wlc, wlc<myn> wlc2, wlc<fxn> wlc3, wlc<myo> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mya a(wlc<uvf> wlc, wlc<myn> wlc2, wlc<fxn> wlc3, wlc<myo> wlc4) {
        return new mya(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new mxz((uvf) this.a.get(), (myn) this.b.get(), this.c, (myo) this.d.get());
    }
}
