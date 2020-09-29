package defpackage;

/* renamed from: lwp reason: default package */
public final class lwp implements vua<Boolean> {
    private final wlc<lum> a;

    private lwp(wlc<lum> wlc) {
        this.a = wlc;
    }

    public static lwp a(wlc<lum> wlc) {
        return new lwp(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((lum) this.a.get()).g());
    }
}
