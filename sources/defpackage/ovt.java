package defpackage;

/* renamed from: ovt reason: default package */
public final class ovt implements vua<ovs> {
    private final wlc<ovx> a;
    private final wlc<ovv> b;
    private final wlc<a> c;
    private final wlc<b> d;
    private final wlc<owb> e;
    private final wlc<vfe> f;
    private final wlc<a> g;

    private ovt(wlc<ovx> wlc, wlc<ovv> wlc2, wlc<a> wlc3, wlc<b> wlc4, wlc<owb> wlc5, wlc<vfe> wlc6, wlc<a> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static ovt a(wlc<ovx> wlc, wlc<ovv> wlc2, wlc<a> wlc3, wlc<b> wlc4, wlc<owb> wlc5, wlc<vfe> wlc6, wlc<a> wlc7) {
        ovt ovt = new ovt(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return ovt;
    }

    public final /* synthetic */ Object get() {
        ovs ovs = new ovs((ovx) this.a.get(), (ovv) this.b.get(), (a) this.c.get(), (b) this.d.get(), (owb) this.e.get(), (vfe) this.f.get(), (a) this.g.get());
        return ovs;
    }
}
