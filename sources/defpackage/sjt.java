package defpackage;

/* renamed from: sjt reason: default package */
public final class sjt implements vua<sjs> {
    private final wlc<sjv> a;
    private final wlc<sjk> b;

    private sjt(wlc<sjv> wlc, wlc<sjk> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sjt a(wlc<sjv> wlc, wlc<sjk> wlc2) {
        return new sjt(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sjs((sjv) this.a.get(), (sjk) this.b.get());
    }
}
