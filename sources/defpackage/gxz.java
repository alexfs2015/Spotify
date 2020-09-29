package defpackage;

import android.content.Context;

/* renamed from: gxz reason: default package */
public final class gxz implements wig<gxy> {
    private final wzi<Context> a;
    private final wzi<jqh> b;
    private final wzi<a> c;
    private final wzi<has> d;
    private final wzi<hcf> e;
    private final wzi<wbt> f;

    private gxz(wzi<Context> wzi, wzi<jqh> wzi2, wzi<a> wzi3, wzi<has> wzi4, wzi<hcf> wzi5, wzi<wbt> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static gxz a(wzi<Context> wzi, wzi<jqh> wzi2, wzi<a> wzi3, wzi<has> wzi4, wzi<hcf> wzi5, wzi<wbt> wzi6) {
        gxz gxz = new gxz(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return gxz;
    }

    public final /* synthetic */ Object get() {
        gxy gxy = new gxy((Context) this.a.get(), (jqh) this.b.get(), (a) this.c.get(), (has) this.d.get(), (hcf) this.e.get(), (wbt) this.f.get());
        return gxy;
    }
}
