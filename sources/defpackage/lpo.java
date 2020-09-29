package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: lpo reason: default package */
public final class lpo implements wig<lpn> {
    private final wzi<Scheduler> a;
    private final wzi<vxa> b;
    private final wzi<lpr> c;
    private final wzi<uun> d;
    private final wzi<SpSharedPreferences<Object>> e;
    private final wzi<lqb> f;
    private final wzi<wbn> g;
    private final wzi<lbk> h;
    private final wzi<a> i;
    private final wzi<waq> j;
    private final wzi<qoo> k;
    private final wzi<goy> l;
    private final wzi<got> m;

    private lpo(wzi<Scheduler> wzi, wzi<vxa> wzi2, wzi<lpr> wzi3, wzi<uun> wzi4, wzi<SpSharedPreferences<Object>> wzi5, wzi<lqb> wzi6, wzi<wbn> wzi7, wzi<lbk> wzi8, wzi<a> wzi9, wzi<waq> wzi10, wzi<qoo> wzi11, wzi<goy> wzi12, wzi<got> wzi13) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
        this.k = wzi11;
        this.l = wzi12;
        this.m = wzi13;
    }

    public static lpo a(wzi<Scheduler> wzi, wzi<vxa> wzi2, wzi<lpr> wzi3, wzi<uun> wzi4, wzi<SpSharedPreferences<Object>> wzi5, wzi<lqb> wzi6, wzi<wbn> wzi7, wzi<lbk> wzi8, wzi<a> wzi9, wzi<waq> wzi10, wzi<qoo> wzi11, wzi<goy> wzi12, wzi<got> wzi13) {
        lpo lpo = new lpo(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11, wzi12, wzi13);
        return lpo;
    }

    public final /* synthetic */ Object get() {
        lpn lpn = new lpn((Scheduler) this.a.get(), (vxa) this.b.get(), (lpr) this.c.get(), (uun) this.d.get(), (SpSharedPreferences) this.e.get(), (lqb) this.f.get(), (wbn) this.g.get(), (lbk) this.h.get(), (a) this.i.get(), (waq) this.j.get(), (qoo) this.k.get(), (goy) this.l.get(), (got) this.m.get());
        return lpn;
    }
}
