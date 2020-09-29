package defpackage;

/* renamed from: pby reason: default package */
public final class pby implements vua<pbx> {
    private final wlc<pbm> a;
    private final wlc<kxm> b;
    private final wlc<pbz> c;

    private pby(wlc<pbm> wlc, wlc<kxm> wlc2, wlc<pbz> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pby a(wlc<pbm> wlc, wlc<kxm> wlc2, wlc<pbz> wlc3) {
        return new pby(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new pbx((pbm) this.a.get(), (kxm) this.b.get(), (pbz) this.c.get());
    }
}
