package defpackage;

/* renamed from: lws reason: default package */
public final class lws implements vua<Boolean> {
    private final wlc<lum> a;

    private lws(wlc<lum> wlc) {
        this.a = wlc;
    }

    public static lws a(wlc<lum> wlc) {
        return new lws(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((lum) this.a.get()).c());
    }
}
