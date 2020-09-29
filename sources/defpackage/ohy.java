package defpackage;

/* renamed from: ohy reason: default package */
public final class ohy implements vua<ohx> {
    private final wlc<oif> a;

    private ohy(wlc<oif> wlc) {
        this.a = wlc;
    }

    public static ohy a(wlc<oif> wlc) {
        return new ohy(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ohx((oif) this.a.get());
    }
}
