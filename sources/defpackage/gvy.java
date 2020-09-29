package defpackage;

import android.content.Context;

/* renamed from: gvy reason: default package */
public final class gvy implements vua<gvx> {
    private final wlc<Context> a;
    private final wlc<jnv> b;
    private final wlc<a> c;
    private final wlc<gxz> d;
    private final wlc<gzm> e;
    private final wlc<vol> f;

    private gvy(wlc<Context> wlc, wlc<jnv> wlc2, wlc<a> wlc3, wlc<gxz> wlc4, wlc<gzm> wlc5, wlc<vol> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static gvy a(wlc<Context> wlc, wlc<jnv> wlc2, wlc<a> wlc3, wlc<gxz> wlc4, wlc<gzm> wlc5, wlc<vol> wlc6) {
        gvy gvy = new gvy(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return gvy;
    }

    public final /* synthetic */ Object get() {
        gvx gvx = new gvx((Context) this.a.get(), (jnv) this.b.get(), (a) this.c.get(), (gxz) this.d.get(), (gzm) this.e.get(), (vol) this.f.get());
        return gvx;
    }
}
