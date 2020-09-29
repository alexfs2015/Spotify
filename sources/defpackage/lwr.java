package defpackage;

/* renamed from: lwr reason: default package */
public final class lwr implements vua<Boolean> {
    private final wlc<lum> a;

    private lwr(wlc<lum> wlc) {
        this.a = wlc;
    }

    public static lwr a(wlc<lum> wlc) {
        return new lwr(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((lum) this.a.get()).b());
    }
}
