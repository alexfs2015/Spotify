package defpackage;

/* renamed from: rby reason: default package */
public final class rby implements wig<rbx> {
    private final wzi<rcd> a;
    private final wzi<rcb> b;
    private final wzi<rcf> c;
    private final wzi<rch> d;

    private rby(wzi<rcd> wzi, wzi<rcb> wzi2, wzi<rcf> wzi3, wzi<rch> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rby a(wzi<rcd> wzi, wzi<rcb> wzi2, wzi<rcf> wzi3, wzi<rch> wzi4) {
        return new rby(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rbx((rcd) this.a.get(), (rcb) this.b.get(), (rcf) this.c.get(), (rch) this.d.get());
    }
}
