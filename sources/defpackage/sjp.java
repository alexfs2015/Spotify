package defpackage;

/* renamed from: sjp reason: default package */
public final class sjp implements vua<sjo> {
    private final wlc<sjx> a;
    private final wlc<String> b;

    private sjp(wlc<sjx> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sjp a(wlc<sjx> wlc, wlc<String> wlc2) {
        return new sjp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sjo((sjx) this.a.get(), (String) this.b.get());
    }
}
