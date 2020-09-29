package defpackage;

/* renamed from: rkx reason: default package */
public final class rkx implements vua<rkw> {
    private final wlc<rky> a;
    private final wlc<jrp> b;

    private rkx(wlc<rky> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rkx a(wlc<rky> wlc, wlc<jrp> wlc2) {
        return new rkx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rkw((rky) this.a.get(), (jrp) this.b.get());
    }
}
