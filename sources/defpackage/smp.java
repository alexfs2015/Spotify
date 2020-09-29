package defpackage;

/* renamed from: smp reason: default package */
public final class smp implements wig<smo> {
    private final wzi<smq> a;
    private final wzi<smy> b;
    private final wzi<smh> c;

    private smp(wzi<smq> wzi, wzi<smy> wzi2, wzi<smh> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static smp a(wzi<smq> wzi, wzi<smy> wzi2, wzi<smh> wzi3) {
        return new smp(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new smo((smq) this.a.get(), (smy) this.b.get(), (smh) this.c.get());
    }
}
