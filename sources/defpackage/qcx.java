package defpackage;

import android.content.Context;

/* renamed from: qcx reason: default package */
public final class qcx implements wig<gwm> {
    private final wzi<gxw> a;
    private final wzi<Context> b;
    private final wzi<a> c;
    private final wzi<jqh> d;
    private final wzi<szp> e;
    private final wzi<has> f;

    private qcx(wzi<gxw> wzi, wzi<Context> wzi2, wzi<a> wzi3, wzi<jqh> wzi4, wzi<szp> wzi5, wzi<has> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static qcx a(wzi<gxw> wzi, wzi<Context> wzi2, wzi<a> wzi3, wzi<jqh> wzi4, wzi<szp> wzi5, wzi<has> wzi6) {
        qcx qcx = new qcx(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return qcx;
    }

    public final /* synthetic */ Object get() {
        return (gwm) wil.a(((gxw) this.a.get()).a((Context) this.b.get(), (a) this.c.get()).a((jqh) this.d.get(), (szp) this.e.get(), (has) this.f.get()).a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
