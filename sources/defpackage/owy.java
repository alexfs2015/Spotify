package defpackage;

/* renamed from: owy reason: default package */
public final class owy implements vua<owx> {
    private final wlc<tuu> a;
    private final wlc<fxn> b;

    private owy(wlc<tuu> wlc, wlc<fxn> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static owy a(wlc<tuu> wlc, wlc<fxn> wlc2) {
        return new owy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new owx((tuu) this.a.get(), this.b);
    }
}
