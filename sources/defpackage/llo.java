package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: llo reason: default package */
public final class llo implements vua<lln> {
    private final wlc<Scheduler> a;
    private final wlc<vju> b;
    private final wlc<llr> c;
    private final wlc<ujc> d;
    private final wlc<SpSharedPreferences<Object>> e;
    private final wlc<lmb> f;
    private final wlc<vof> g;
    private final wlc<kyb> h;
    private final wlc<a> i;
    private final wlc<vnk> j;
    private final wlc<qfz> k;
    private final wlc<gnj> l;
    private final wlc<gne> m;

    private llo(wlc<Scheduler> wlc, wlc<vju> wlc2, wlc<llr> wlc3, wlc<ujc> wlc4, wlc<SpSharedPreferences<Object>> wlc5, wlc<lmb> wlc6, wlc<vof> wlc7, wlc<kyb> wlc8, wlc<a> wlc9, wlc<vnk> wlc10, wlc<qfz> wlc11, wlc<gnj> wlc12, wlc<gne> wlc13) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
        this.k = wlc11;
        this.l = wlc12;
        this.m = wlc13;
    }

    public static llo a(wlc<Scheduler> wlc, wlc<vju> wlc2, wlc<llr> wlc3, wlc<ujc> wlc4, wlc<SpSharedPreferences<Object>> wlc5, wlc<lmb> wlc6, wlc<vof> wlc7, wlc<kyb> wlc8, wlc<a> wlc9, wlc<vnk> wlc10, wlc<qfz> wlc11, wlc<gnj> wlc12, wlc<gne> wlc13) {
        llo llo = new llo(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13);
        return llo;
    }

    public final /* synthetic */ Object get() {
        lln lln = new lln((Scheduler) this.a.get(), (vju) this.b.get(), (llr) this.c.get(), (ujc) this.d.get(), (SpSharedPreferences) this.e.get(), (lmb) this.f.get(), (vof) this.g.get(), (kyb) this.h.get(), (a) this.i.get(), (vnk) this.j.get(), (qfz) this.k.get(), (gnj) this.l.get(), (gne) this.m.get());
        return lln;
    }
}
