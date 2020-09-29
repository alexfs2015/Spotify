package defpackage;

import android.content.Context;

/* renamed from: nzf reason: default package */
public final class nzf implements wig<gwm> {
    private final wzi<Context> a;
    private final wzi<a> b;
    private final wzi<jqh> c;
    private final wzi<szp> d;
    private final wzi<gxw> e;
    private final wzi<has> f;

    private nzf(wzi<Context> wzi, wzi<a> wzi2, wzi<jqh> wzi3, wzi<szp> wzi4, wzi<gxw> wzi5, wzi<has> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static nzf a(wzi<Context> wzi, wzi<a> wzi2, wzi<jqh> wzi3, wzi<szp> wzi4, wzi<gxw> wzi5, wzi<has> wzi6) {
        nzf nzf = new nzf(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return nzf;
    }

    public final /* synthetic */ Object get() {
        has has = (has) this.f.get();
        return (gwm) wil.a(((gxw) this.e.get()).a((Context) this.a.get(), (a) this.b.get()).a(has).a((jqh) this.c.get(), (szp) this.d.get(), has).a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
