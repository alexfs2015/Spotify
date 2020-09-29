package defpackage;

/* renamed from: rzc reason: default package */
public final class rzc implements wig<rzb> {
    private final wzi<ryk> a;
    private final wzi<ryd> b;
    private final wzi<rzd> c;
    private final wzi<ryz> d;
    private final wzi<seb> e;

    private rzc(wzi<ryk> wzi, wzi<ryd> wzi2, wzi<rzd> wzi3, wzi<ryz> wzi4, wzi<seb> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static rzc a(wzi<ryk> wzi, wzi<ryd> wzi2, wzi<rzd> wzi3, wzi<ryz> wzi4, wzi<seb> wzi5) {
        rzc rzc = new rzc(wzi, wzi2, wzi3, wzi4, wzi5);
        return rzc;
    }

    public final /* synthetic */ Object get() {
        rzb rzb = new rzb((ryk) this.a.get(), (ryd) this.b.get(), (rzd) this.c.get(), (ryz) this.d.get(), (seb) this.e.get());
        return rzb;
    }
}
