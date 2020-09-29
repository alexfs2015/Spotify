package defpackage;

/* renamed from: hwz reason: default package */
public final class hwz implements vua<hwy> {
    private final wlc<jvr> a;
    private final wlc<gdz<fko>> b;
    private final wlc<jhu> c;
    private final wlc<jrp> d;

    private hwz(wlc<jvr> wlc, wlc<gdz<fko>> wlc2, wlc<jhu> wlc3, wlc<jrp> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hwz a(wlc<jvr> wlc, wlc<gdz<fko>> wlc2, wlc<jhu> wlc3, wlc<jrp> wlc4) {
        return new hwz(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new hwy((jvr) this.a.get(), (gdz) this.b.get(), (jhu) this.c.get(), (jrp) this.d.get());
    }
}
