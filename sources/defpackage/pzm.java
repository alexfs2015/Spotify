package defpackage;

/* renamed from: pzm reason: default package */
public final class pzm implements vua<pzl> {
    private final wlc<sgn> a;
    private final wlc<pzw> b;

    private pzm(wlc<sgn> wlc, wlc<pzw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pzm a(wlc<sgn> wlc, wlc<pzw> wlc2) {
        return new pzm(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pzl((sgn) this.a.get(), (pzw) this.b.get());
    }
}
