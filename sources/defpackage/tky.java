package defpackage;

/* renamed from: tky reason: default package */
public final class tky implements vua<tkx> {
    private final wlc<tlc> a;
    private final wlc<tlh> b;

    private tky(wlc<tlc> wlc, wlc<tlh> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tky a(wlc<tlc> wlc, wlc<tlh> wlc2) {
        return new tky(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tkx((tlc) this.a.get(), (tlh) this.b.get());
    }
}
