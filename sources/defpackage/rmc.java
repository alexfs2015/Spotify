package defpackage;

/* renamed from: rmc reason: default package */
public final class rmc implements vua<rmb> {
    private final wlc<rlh> a;
    private final wlc<rln> b;
    private final wlc<rli> c;
    private final wlc<rmh> d;

    private rmc(wlc<rlh> wlc, wlc<rln> wlc2, wlc<rli> wlc3, wlc<rmh> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rmc a(wlc<rlh> wlc, wlc<rln> wlc2, wlc<rli> wlc3, wlc<rmh> wlc4) {
        return new rmc(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new rmb((rlh) this.a.get(), (rln) this.b.get(), (rli) this.c.get(), (rmh) this.d.get());
    }
}
