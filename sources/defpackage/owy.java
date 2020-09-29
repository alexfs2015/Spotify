package defpackage;

import android.app.Activity;

/* renamed from: owy reason: default package */
public final class owy implements wig<gwm> {
    private final wzi<Activity> a;
    private final wzi<a> b;
    private final wzi<jqh> c;
    private final wzi<hbe> d;
    private final wzi<has> e;
    private final wzi<gxw> f;
    private final wzi<szp> g;

    private owy(wzi<Activity> wzi, wzi<a> wzi2, wzi<jqh> wzi3, wzi<hbe> wzi4, wzi<has> wzi5, wzi<gxw> wzi6, wzi<szp> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static owy a(wzi<Activity> wzi, wzi<a> wzi2, wzi<jqh> wzi3, wzi<hbe> wzi4, wzi<has> wzi5, wzi<gxw> wzi6, wzi<szp> wzi7) {
        owy owy = new owy(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return owy;
    }

    public final /* synthetic */ Object get() {
        has has = (has) this.e.get();
        return (gwm) wil.a(((gxw) this.f.get()).a((Activity) this.a.get(), (a) this.b.get()).a(has).a((jqh) this.c.get(), (szp) this.g.get(), has).a((hbe) this.d.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
