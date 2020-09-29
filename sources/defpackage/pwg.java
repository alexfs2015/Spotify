package defpackage;

/* renamed from: pwg reason: default package */
public final class pwg implements vua<pwf> {
    private final wlc<ryz> a;
    private final wlc<sfx> b;
    private final wlc<sgn> c;

    private pwg(wlc<ryz> wlc, wlc<sfx> wlc2, wlc<sgn> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pwg a(wlc<ryz> wlc, wlc<sfx> wlc2, wlc<sgn> wlc3) {
        return new pwg(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new pwf((ryz) this.a.get(), (sfx) this.b.get(), (sgn) this.c.get());
    }
}
