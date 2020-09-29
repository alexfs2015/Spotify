package defpackage;

/* renamed from: mzy reason: default package */
public final class mzy implements wig<mzx> {
    private final wzi<mzo> a;
    private final wzi<iqn> b;

    private mzy(wzi<mzo> wzi, wzi<iqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mzy a(wzi<mzo> wzi, wzi<iqn> wzi2) {
        return new mzy(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mzx((mzo) this.a.get(), this.b);
    }
}
