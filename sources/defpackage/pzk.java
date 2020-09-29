package defpackage;

/* renamed from: pzk reason: default package */
public final class pzk implements vua<pzj> {
    private final wlc<sgn> a;
    private final wlc<pzw> b;

    private pzk(wlc<sgn> wlc, wlc<pzw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pzk a(wlc<sgn> wlc, wlc<pzw> wlc2) {
        return new pzk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pzj((sgn) this.a.get(), (pzw) this.b.get());
    }
}
