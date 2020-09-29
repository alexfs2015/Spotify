package defpackage;

/* renamed from: ksr reason: default package */
public final class ksr implements wig<ksq> {
    private final wzi<twl> a;
    private final wzi<twh> b;
    private final wzi<twk> c;
    private final wzi<ksb> d;
    private final wzi<kry> e;

    private ksr(wzi<twl> wzi, wzi<twh> wzi2, wzi<twk> wzi3, wzi<ksb> wzi4, wzi<kry> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static ksr a(wzi<twl> wzi, wzi<twh> wzi2, wzi<twk> wzi3, wzi<ksb> wzi4, wzi<kry> wzi5) {
        ksr ksr = new ksr(wzi, wzi2, wzi3, wzi4, wzi5);
        return ksr;
    }

    public final /* synthetic */ Object get() {
        ksq ksq = new ksq((twl) this.a.get(), (twh) this.b.get(), (twk) this.c.get(), (ksb) this.d.get(), (kry) this.e.get());
        return ksq;
    }
}
