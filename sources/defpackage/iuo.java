package defpackage;

/* renamed from: iuo reason: default package */
public final class iuo implements wig<gwm> {
    private final wzi<iul> a;
    private final wzi<szp> b;
    private final wzi<jqh> c;
    private final wzi<gxw> d;
    private final wzi<hbe> e;
    private final wzi<has> f;

    private iuo(wzi<iul> wzi, wzi<szp> wzi2, wzi<jqh> wzi3, wzi<gxw> wzi4, wzi<hbe> wzi5, wzi<has> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static iuo a(wzi<iul> wzi, wzi<szp> wzi2, wzi<jqh> wzi3, wzi<gxw> wzi4, wzi<hbe> wzi5, wzi<has> wzi6) {
        iuo iuo = new iuo(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return iuo;
    }

    public final /* synthetic */ Object get() {
        has has = (has) this.f.get();
        return (gwm) wil.a(((gxw) this.d.get()).a((iul) this.a.get()).a(has).a((jqh) this.c.get(), (szp) this.b.get(), has).a((hbe) this.e.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
