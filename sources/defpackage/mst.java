package defpackage;

/* renamed from: mst reason: default package */
public final class mst implements vua<mss> {
    private final wlc<Boolean> a;
    private final wlc<rfe> b;
    private final wlc<msu> c;
    private final wlc<skh> d;

    private mst(wlc<Boolean> wlc, wlc<rfe> wlc2, wlc<msu> wlc3, wlc<skh> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mst a(wlc<Boolean> wlc, wlc<rfe> wlc2, wlc<msu> wlc3, wlc<skh> wlc4) {
        return new mst(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new mss(((Boolean) this.a.get()).booleanValue(), this.b, vtz.b(this.c), (skh) this.d.get());
    }
}
