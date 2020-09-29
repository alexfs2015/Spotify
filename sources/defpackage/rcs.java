package defpackage;

/* renamed from: rcs reason: default package */
public final class rcs implements wig<rcr> {
    private final wzi<rbg> a;
    private final wzi<iqp> b;
    private final wzi<rgf> c;
    private final wzi<jrn> d;

    private rcs(wzi<rbg> wzi, wzi<iqp> wzi2, wzi<rgf> wzi3, wzi<jrn> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rcs a(wzi<rbg> wzi, wzi<iqp> wzi2, wzi<rgf> wzi3, wzi<jrn> wzi4) {
        return new rcs(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rcr((rbg) this.a.get(), (iqp) this.b.get(), (rgf) this.c.get(), (jrn) this.d.get());
    }
}
