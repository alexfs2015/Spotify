package defpackage;

import android.app.Application;

/* renamed from: rkr reason: default package */
public final class rkr implements vua<rkq> {
    private final wlc<Application> a;
    private final wlc<a> b;
    private final wlc<rkf> c;
    private final wlc<rko> d;
    private final wlc<rkm> e;
    private final wlc<rkk> f;
    private final wlc<rki> g;

    private rkr(wlc<Application> wlc, wlc<a> wlc2, wlc<rkf> wlc3, wlc<rko> wlc4, wlc<rkm> wlc5, wlc<rkk> wlc6, wlc<rki> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static rkr a(wlc<Application> wlc, wlc<a> wlc2, wlc<rkf> wlc3, wlc<rko> wlc4, wlc<rkm> wlc5, wlc<rkk> wlc6, wlc<rki> wlc7) {
        rkr rkr = new rkr(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return rkr;
    }

    public final /* synthetic */ Object get() {
        rkq rkq = new rkq((Application) this.a.get(), (a) this.b.get(), (rkf) this.c.get(), (rko) this.d.get(), this.e, (rkk) this.f.get(), (rki) this.g.get());
        return rkq;
    }
}
