package defpackage;

/* renamed from: qzy reason: default package */
public final class qzy implements wig<qzx> {
    private final wzi<jrn> a;
    private final wzi<vbq> b;

    private qzy(wzi<jrn> wzi, wzi<vbq> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qzy a(wzi<jrn> wzi, wzi<vbq> wzi2) {
        return new qzy(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qzx((jrn) this.a.get(), (vbq) this.b.get());
    }
}
