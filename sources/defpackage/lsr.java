package defpackage;

/* renamed from: lsr reason: default package */
public final class lsr implements vua<lsq> {
    private final wlc<lse> a;
    private final wlc<sfx> b;
    private final wlc<sgn> c;

    private lsr(wlc<lse> wlc, wlc<sfx> wlc2, wlc<sgn> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lsr a(wlc<lse> wlc, wlc<sfx> wlc2, wlc<sgn> wlc3) {
        return new lsr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new lsq((lse) this.a.get(), (sfx) this.b.get(), (sgn) this.c.get());
    }
}
