package defpackage;

/* renamed from: mzy reason: default package */
public final class mzy implements vua<mzx> {
    private final wlc<rgt> a;

    private mzy(wlc<rgt> wlc) {
        this.a = wlc;
    }

    public static mzy a(wlc<rgt> wlc) {
        return new mzy(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mzx((rgt) this.a.get());
    }
}
