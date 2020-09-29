package defpackage;

/* renamed from: rpa reason: default package */
public final class rpa implements vua<roz> {
    private final wlc<gkr> a;
    private final wlc<gkw> b;

    private rpa(wlc<gkr> wlc, wlc<gkw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rpa a(wlc<gkr> wlc, wlc<gkw> wlc2) {
        return new rpa(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new roz((gkr) this.a.get(), (gkw) this.b.get());
    }
}
