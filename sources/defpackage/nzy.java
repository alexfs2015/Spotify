package defpackage;

/* renamed from: nzy reason: default package */
public final class nzy implements vua<nzx> {
    private final wlc<nzv> a;
    private final wlc<jrp> b;

    private nzy(wlc<nzv> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nzy a(wlc<nzv> wlc, wlc<jrp> wlc2) {
        return new nzy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new nzx((nzv) this.a.get(), (jrp) this.b.get());
    }
}
