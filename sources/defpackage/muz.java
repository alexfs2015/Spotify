package defpackage;

/* renamed from: muz reason: default package */
public final class muz implements vua<muy> {
    private final wlc<Boolean> a;
    private final wlc<kxz> b;
    private final wlc<rfe> c;
    private final wlc<muw> d;
    private final wlc<msu> e;

    private muz(wlc<Boolean> wlc, wlc<kxz> wlc2, wlc<rfe> wlc3, wlc<muw> wlc4, wlc<msu> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static muz a(wlc<Boolean> wlc, wlc<kxz> wlc2, wlc<rfe> wlc3, wlc<muw> wlc4, wlc<msu> wlc5) {
        muz muz = new muz(wlc, wlc2, wlc3, wlc4, wlc5);
        return muz;
    }

    public final /* synthetic */ Object get() {
        muy muy = new muy(((Boolean) this.a.get()).booleanValue(), (kxz) this.b.get(), this.c, vtz.b(this.d), vtz.b(this.e));
        return muy;
    }
}
