package defpackage;

/* renamed from: rbw reason: default package */
public final class rbw implements wig<rbv> {
    private final wzi<rcd> a;
    private final wzi<rcb> b;
    private final wzi<rcf> c;
    private final wzi<rch> d;

    private rbw(wzi<rcd> wzi, wzi<rcb> wzi2, wzi<rcf> wzi3, wzi<rch> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rbw a(wzi<rcd> wzi, wzi<rcb> wzi2, wzi<rcf> wzi3, wzi<rch> wzi4) {
        return new rbw(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rbv((rcd) this.a.get(), (rcb) this.b.get(), (rcf) this.c.get(), (rch) this.d.get());
    }
}
