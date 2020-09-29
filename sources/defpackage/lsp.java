package defpackage;

/* renamed from: lsp reason: default package */
public final class lsp implements vua<lso> {
    private final wlc<lse> a;
    private final wlc<gxz> b;
    private final wlc<sgn> c;

    private lsp(wlc<lse> wlc, wlc<gxz> wlc2, wlc<sgn> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lsp a(wlc<lse> wlc, wlc<gxz> wlc2, wlc<sgn> wlc3) {
        return new lsp(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new lso((lse) this.a.get(), (gxz) this.b.get(), (sgn) this.c.get());
    }
}
