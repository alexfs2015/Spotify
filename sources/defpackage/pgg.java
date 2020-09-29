package defpackage;

import android.app.Activity;

/* renamed from: pgg reason: default package */
public final class pgg implements vua<pgf> {
    private final wlc<Activity> a;
    private final wlc<mbl> b;
    private final wlc<jro> c;
    private final wlc<gya> d;
    private final wlc<pgh> e;

    private pgg(wlc<Activity> wlc, wlc<mbl> wlc2, wlc<jro> wlc3, wlc<gya> wlc4, wlc<pgh> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static pgg a(wlc<Activity> wlc, wlc<mbl> wlc2, wlc<jro> wlc3, wlc<gya> wlc4, wlc<pgh> wlc5) {
        pgg pgg = new pgg(wlc, wlc2, wlc3, wlc4, wlc5);
        return pgg;
    }

    public final /* synthetic */ Object get() {
        pgf pgf = new pgf((Activity) this.a.get(), (mbl) this.b.get(), (jro) this.c.get(), (gya) this.d.get(), (pgh) this.e.get());
        return pgf;
    }
}
