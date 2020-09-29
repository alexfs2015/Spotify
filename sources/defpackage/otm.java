package defpackage;

/* renamed from: otm reason: default package */
public final class otm implements vua<oti> {
    private final wlc<otn> a;
    private final wlc<a> b;
    private final wlc<a> c;
    private final wlc<oug> d;
    private final wlc<rsl> e;
    private final wlc<String> f;
    private final wlc<Boolean> g;

    private otm(wlc<otn> wlc, wlc<a> wlc2, wlc<a> wlc3, wlc<oug> wlc4, wlc<rsl> wlc5, wlc<String> wlc6, wlc<Boolean> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static otm a(wlc<otn> wlc, wlc<a> wlc2, wlc<a> wlc3, wlc<oug> wlc4, wlc<rsl> wlc5, wlc<String> wlc6, wlc<Boolean> wlc7) {
        otm otm = new otm(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return otm;
    }

    public final /* synthetic */ Object get() {
        oti oti = new oti((otn) this.a.get(), (a) this.b.get(), (a) this.c.get(), (oug) this.d.get(), (rsl) this.e.get(), (String) this.f.get(), ((Boolean) this.g.get()).booleanValue());
        return oti;
    }
}
