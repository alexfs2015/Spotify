package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: llx reason: default package */
public final class llx implements vua<llw> {
    private final wlc<ufm> a;
    private final wlc<llr> b;
    private final wlc<Scheduler> c;
    private final wlc<gne> d;
    private final wlc<ujc> e;
    private final wlc<a> f;
    private final wlc<rqu> g;
    private final wlc<vnk> h;
    private final wlc<gnj> i;

    private llx(wlc<ufm> wlc, wlc<llr> wlc2, wlc<Scheduler> wlc3, wlc<gne> wlc4, wlc<ujc> wlc5, wlc<a> wlc6, wlc<rqu> wlc7, wlc<vnk> wlc8, wlc<gnj> wlc9) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
    }

    public static llx a(wlc<ufm> wlc, wlc<llr> wlc2, wlc<Scheduler> wlc3, wlc<gne> wlc4, wlc<ujc> wlc5, wlc<a> wlc6, wlc<rqu> wlc7, wlc<vnk> wlc8, wlc<gnj> wlc9) {
        llx llx = new llx(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return llx;
    }

    public final /* synthetic */ Object get() {
        llw llw = new llw((ufm) this.a.get(), (llr) this.b.get(), (Scheduler) this.c.get(), (gne) this.d.get(), (ujc) this.e.get(), (a) this.f.get(), (rqu) this.g.get(), (vnk) this.h.get(), (gnj) this.i.get());
        return llw;
    }
}
