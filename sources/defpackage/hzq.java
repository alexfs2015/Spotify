package defpackage;

/* renamed from: hzq reason: default package */
public final class hzq implements vua<hzp> {
    private final wlc<ka> a;
    private final wlc<Boolean> b;

    private hzq(wlc<ka> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hzq a(wlc<ka> wlc, wlc<Boolean> wlc2) {
        return new hzq(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hzp((ka) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
