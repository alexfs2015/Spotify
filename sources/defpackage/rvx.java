package defpackage;

/* renamed from: rvx reason: default package */
public final class rvx implements vua<rvw> {
    private final wlc<rvt> a;
    private final wlc<jrp> b;

    private rvx(wlc<rvt> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rvx a(wlc<rvt> wlc, wlc<jrp> wlc2) {
        return new rvx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rvw((rvt) this.a.get(), (jrp) this.b.get());
    }
}
