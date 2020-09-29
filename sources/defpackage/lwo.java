package defpackage;

/* renamed from: lwo reason: default package */
public final class lwo implements vua<Boolean> {
    private final wlc<lum> a;

    private lwo(wlc<lum> wlc) {
        this.a = wlc;
    }

    public static lwo a(wlc<lum> wlc) {
        return new lwo(wlc);
    }

    public final /* synthetic */ Object get() {
        lum lum = (lum) this.a.get();
        return Boolean.valueOf(lum.e().a() && lum.g());
    }
}
