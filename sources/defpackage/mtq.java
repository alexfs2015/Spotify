package defpackage;

/* renamed from: mtq reason: default package */
public final class mtq implements vua<Boolean> {
    private final wlc<sjs> a;

    private mtq(wlc<sjs> wlc) {
        this.a = wlc;
    }

    public static mtq a(wlc<sjs> wlc) {
        return new mtq(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((sjs) this.a.get()).a());
    }
}
