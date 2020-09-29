package defpackage;

/* renamed from: nud reason: default package */
public final class nud implements vua<nuc> {
    private final wlc<nua> a;
    private final wlc<a> b;
    private final wlc<a> c;

    private nud(wlc<nua> wlc, wlc<a> wlc2, wlc<a> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nud a(wlc<nua> wlc, wlc<a> wlc2, wlc<a> wlc3) {
        return new nud(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new nuc((nua) this.a.get(), (a) this.b.get(), (a) this.c.get());
    }
}
