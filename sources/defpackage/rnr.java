package defpackage;

import android.content.Context;

/* renamed from: rnr reason: default package */
public final class rnr implements wig<gwm> {
    private final wzi<Context> a;
    private final wzi<a> b;
    private final wzi<gxw> c;
    private final wzi<jqh> d;
    private final wzi<szp> e;
    private final wzi<has> f;

    private rnr(wzi<Context> wzi, wzi<a> wzi2, wzi<gxw> wzi3, wzi<jqh> wzi4, wzi<szp> wzi5, wzi<has> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static rnr a(wzi<Context> wzi, wzi<a> wzi2, wzi<gxw> wzi3, wzi<jqh> wzi4, wzi<szp> wzi5, wzi<has> wzi6) {
        rnr rnr = new rnr(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return rnr;
    }

    public final /* synthetic */ Object get() {
        return (gwm) wil.a(((gxw) this.c.get()).a((Context) this.a.get(), (a) this.b.get()).a((jqh) this.d.get(), (szp) this.e.get(), (has) this.f.get()).a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
