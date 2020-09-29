package defpackage;

/* renamed from: osk reason: default package */
public final class osk implements vua<osj> {
    private final wlc<String> a;
    private final wlc<uxc> b;

    private osk(wlc<String> wlc, wlc<uxc> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static osk a(wlc<String> wlc, wlc<uxc> wlc2) {
        return new osk(wlc, wlc2);
    }

    public static osj a(String str, uxc uxc) {
        return new osj(str, uxc);
    }

    public final /* synthetic */ Object get() {
        return new osj((String) this.a.get(), (uxc) this.b.get());
    }
}
