package defpackage;

/* renamed from: pwc reason: default package */
public final class pwc implements vua<pwb> {
    private final wlc<ryz> a;
    private final wlc<sfx> b;
    private final wlc<sgn> c;

    private pwc(wlc<ryz> wlc, wlc<sfx> wlc2, wlc<sgn> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pwc a(wlc<ryz> wlc, wlc<sfx> wlc2, wlc<sgn> wlc3) {
        return new pwc(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new pwb((ryz) this.a.get(), (sfx) this.b.get(), (sgn) this.c.get());
    }
}
