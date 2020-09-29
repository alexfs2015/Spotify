package defpackage;

/* renamed from: pzi reason: default package */
public final class pzi implements vua<pzh> {
    private final wlc<sgn> a;
    private final wlc<pzw> b;

    private pzi(wlc<sgn> wlc, wlc<pzw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pzi a(wlc<sgn> wlc, wlc<pzw> wlc2) {
        return new pzi(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pzh((sgn) this.a.get(), (pzw) this.b.get());
    }
}
