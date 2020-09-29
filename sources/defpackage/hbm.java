package defpackage;

/* renamed from: hbm reason: default package */
public final class hbm implements wig<hbl> {
    private final wzi<hbh> a;
    private final wzi<has> b;
    private final wzi<hbc> c;

    private hbm(wzi<hbh> wzi, wzi<has> wzi2, wzi<hbc> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hbm a(wzi<hbh> wzi, wzi<has> wzi2, wzi<hbc> wzi3) {
        return new hbm(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new hbl((hbh) this.a.get(), (has) this.b.get(), (hbc) this.c.get());
    }
}
