package defpackage;

/* renamed from: per reason: default package */
public final class per implements wig<ugq> {
    private final wzi<ugr> a;
    private final wzi<tyh> b;
    private final wzi<txz> c;
    private final wzi<txf> d;
    private final wzi<txs> e;
    private final wzi<tyb> f;
    private final wzi<txl> g;
    private final wzi<txi> h;

    private per(wzi<ugr> wzi, wzi<tyh> wzi2, wzi<txz> wzi3, wzi<txf> wzi4, wzi<txs> wzi5, wzi<tyb> wzi6, wzi<txl> wzi7, wzi<txi> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static per a(wzi<ugr> wzi, wzi<tyh> wzi2, wzi<txz> wzi3, wzi<txf> wzi4, wzi<txs> wzi5, wzi<tyb> wzi6, wzi<txl> wzi7, wzi<txi> wzi8) {
        per per = new per(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return per;
    }

    public final /* synthetic */ Object get() {
        ugr ugr = (ugr) this.a.get();
        txz txz = (txz) this.c.get();
        txf txf = (txf) this.d.get();
        txs txs = (txs) this.e.get();
        tyb tyb = (tyb) this.f.get();
        txl txl = (txl) this.g.get();
        txi txi = (txi) this.h.get();
        ugr.a(a.class, (ugp) (tyh) this.b.get());
        ugr.a(a.class, (ugp) txz);
        ugr.a(a.class, (ugp) txs);
        ugr.a(a.class, (ugp) new tyd());
        ugr.a(a.class, (ugp) tyb);
        ugr.a(a.class, (ugp) new txc());
        ugr.a(a.class, (ugp) txf);
        ugr.a(a.class, (ugp) txl);
        ugr.a(a.class, (ugp) new txe());
        ugr.a(a.class, (ugp) txi);
        return (ugq) wil.a(ugr, "Cannot return null from a non-@Nullable @Provides method");
    }
}
