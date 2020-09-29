package defpackage;

import android.content.Context;

/* renamed from: mfj reason: default package */
public final class mfj implements wig<gwm> {
    private final wzi<gxw> a;
    private final wzi<Context> b;
    private final wzi<a> c;
    private final wzi<szp> d;
    private final wzi<jqh> e;
    private final wzi<has> f;

    private mfj(wzi<gxw> wzi, wzi<Context> wzi2, wzi<a> wzi3, wzi<szp> wzi4, wzi<jqh> wzi5, wzi<has> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static mfj a(wzi<gxw> wzi, wzi<Context> wzi2, wzi<a> wzi3, wzi<szp> wzi4, wzi<jqh> wzi5, wzi<has> wzi6) {
        mfj mfj = new mfj(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return mfj;
    }

    public final /* synthetic */ Object get() {
        has has = (has) this.f.get();
        return (gwm) wil.a(((gxw) this.a.get()).a((Context) this.b.get(), (a) this.c.get()).a(has).a((jqh) this.e.get(), (szp) this.d.get(), has).a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
