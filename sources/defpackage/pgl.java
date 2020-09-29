package defpackage;

/* renamed from: pgl reason: default package */
public final class pgl implements wig<pgk> {
    private final wzi<pgi> a;
    private final wzi<pdv> b;
    private final wzi<Boolean> c;
    private final wzi<Boolean> d;
    private final wzi<Boolean> e;

    private pgl(wzi<pgi> wzi, wzi<pdv> wzi2, wzi<Boolean> wzi3, wzi<Boolean> wzi4, wzi<Boolean> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static pgl a(wzi<pgi> wzi, wzi<pdv> wzi2, wzi<Boolean> wzi3, wzi<Boolean> wzi4, wzi<Boolean> wzi5) {
        pgl pgl = new pgl(wzi, wzi2, wzi3, wzi4, wzi5);
        return pgl;
    }

    public final /* synthetic */ Object get() {
        pgk pgk = new pgk((pgi) this.a.get(), (pdv) this.b.get(), ((Boolean) this.c.get()).booleanValue(), ((Boolean) this.d.get()).booleanValue(), ((Boolean) this.e.get()).booleanValue());
        return pgk;
    }
}
