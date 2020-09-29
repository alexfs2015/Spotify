package defpackage;

import android.app.Activity;

/* renamed from: rjy reason: default package */
public final class rjy implements vua<rjx> {
    private final wlc<Activity> a;
    private final wlc<mbl> b;
    private final wlc<jro> c;
    private final wlc<gya> d;
    private final wlc<rjv> e;

    private rjy(wlc<Activity> wlc, wlc<mbl> wlc2, wlc<jro> wlc3, wlc<gya> wlc4, wlc<rjv> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static rjy a(wlc<Activity> wlc, wlc<mbl> wlc2, wlc<jro> wlc3, wlc<gya> wlc4, wlc<rjv> wlc5) {
        rjy rjy = new rjy(wlc, wlc2, wlc3, wlc4, wlc5);
        return rjy;
    }

    public final /* synthetic */ Object get() {
        rjx rjx = new rjx((Activity) this.a.get(), (mbl) this.b.get(), (jro) this.c.get(), (gya) this.d.get(), (rjv) this.e.get());
        return rjx;
    }
}
