package defpackage;

/* renamed from: pzo reason: default package */
public final class pzo implements vua<pzn> {
    private final wlc<sgn> a;
    private final wlc<pzw> b;
    private final wlc<sfu> c;

    private pzo(wlc<sgn> wlc, wlc<pzw> wlc2, wlc<sfu> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pzo a(wlc<sgn> wlc, wlc<pzw> wlc2, wlc<sfu> wlc3) {
        return new pzo(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new pzn((sgn) this.a.get(), (pzw) this.b.get(), (sfu) this.c.get());
    }
}
