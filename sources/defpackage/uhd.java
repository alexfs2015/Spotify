package defpackage;

/* renamed from: uhd reason: default package */
public final class uhd implements vua<uhc> {
    private final wlc<ugv> a;
    private final wlc<jsz> b;

    private uhd(wlc<ugv> wlc, wlc<jsz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uhd a(wlc<ugv> wlc, wlc<jsz> wlc2) {
        return new uhd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new uhc((ugv) this.a.get(), (jsz) this.b.get());
    }
}
