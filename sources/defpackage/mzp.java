package defpackage;

/* renamed from: mzp reason: default package */
public final class mzp implements vua<Boolean> {
    private final wlc<sjs> a;

    private mzp(wlc<sjs> wlc) {
        this.a = wlc;
    }

    public static mzp a(wlc<sjs> wlc) {
        return new mzp(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((sjs) this.a.get()).a());
    }
}
