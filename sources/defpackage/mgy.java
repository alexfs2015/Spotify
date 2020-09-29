package defpackage;

/* renamed from: mgy reason: default package */
public final class mgy implements vua<mgx> {
    private final wlc<mgz> a;

    private mgy(wlc<mgz> wlc) {
        this.a = wlc;
    }

    public static mgy a(wlc<mgz> wlc) {
        return new mgy(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mgx((mgz) this.a.get());
    }
}
