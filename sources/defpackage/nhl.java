package defpackage;

import android.content.Context;

/* renamed from: nhl reason: default package */
public final class nhl implements wig<gwm> {
    private final wzi<Context> a;
    private final wzi<a> b;
    private final wzi<jqh> c;
    private final wzi<has> d;
    private final wzi<gxw> e;
    private final wzi<szp> f;

    private nhl(wzi<Context> wzi, wzi<a> wzi2, wzi<jqh> wzi3, wzi<has> wzi4, wzi<gxw> wzi5, wzi<szp> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static nhl a(wzi<Context> wzi, wzi<a> wzi2, wzi<jqh> wzi3, wzi<has> wzi4, wzi<gxw> wzi5, wzi<szp> wzi6) {
        nhl nhl = new nhl(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return nhl;
    }

    public final /* synthetic */ Object get() {
        return (gwm) wil.a(CC.a((Context) this.a.get(), (a) this.b.get(), (jqh) this.c.get(), (has) this.d.get(), (gxw) this.e.get(), (szp) this.f.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
