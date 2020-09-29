package defpackage;

/* renamed from: tno reason: default package */
public final class tno implements vua<tnn> {
    private final wlc<tnv> a;
    private final wlc<tol> b;
    private final wlc<tpj> c;

    private tno(wlc<tnv> wlc, wlc<tol> wlc2, wlc<tpj> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tno a(wlc<tnv> wlc, wlc<tol> wlc2, wlc<tpj> wlc3) {
        return new tno(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tnn((tnv) this.a.get(), (tol) this.b.get(), (tpj) this.c.get());
    }
}
