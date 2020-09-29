package defpackage;

/* renamed from: lsn reason: default package */
public final class lsn implements vua<lsm> {
    private final wlc<lse> a;
    private final wlc<gxz> b;
    private final wlc<ryz> c;
    private final wlc<sfu> d;
    private final wlc<sgn> e;

    private lsn(wlc<lse> wlc, wlc<gxz> wlc2, wlc<ryz> wlc3, wlc<sfu> wlc4, wlc<sgn> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static lsn a(wlc<lse> wlc, wlc<gxz> wlc2, wlc<ryz> wlc3, wlc<sfu> wlc4, wlc<sgn> wlc5) {
        lsn lsn = new lsn(wlc, wlc2, wlc3, wlc4, wlc5);
        return lsn;
    }

    public final /* synthetic */ Object get() {
        lsm lsm = new lsm((lse) this.a.get(), (gxz) this.b.get(), (ryz) this.c.get(), (sfu) this.d.get(), (sgn) this.e.get());
        return lsm;
    }
}
