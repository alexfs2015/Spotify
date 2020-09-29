package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: lpx reason: default package */
public final class lpx implements wig<lpw> {
    private final wzi<ura> a;
    private final wzi<lpr> b;
    private final wzi<Scheduler> c;
    private final wzi<got> d;
    private final wzi<uun> e;
    private final wzi<a> f;
    private final wzi<saf> g;
    private final wzi<waq> h;
    private final wzi<goy> i;

    private lpx(wzi<ura> wzi, wzi<lpr> wzi2, wzi<Scheduler> wzi3, wzi<got> wzi4, wzi<uun> wzi5, wzi<a> wzi6, wzi<saf> wzi7, wzi<waq> wzi8, wzi<goy> wzi9) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
    }

    public static lpx a(wzi<ura> wzi, wzi<lpr> wzi2, wzi<Scheduler> wzi3, wzi<got> wzi4, wzi<uun> wzi5, wzi<a> wzi6, wzi<saf> wzi7, wzi<waq> wzi8, wzi<goy> wzi9) {
        lpx lpx = new lpx(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9);
        return lpx;
    }

    public final /* synthetic */ Object get() {
        lpw lpw = new lpw((ura) this.a.get(), (lpr) this.b.get(), (Scheduler) this.c.get(), (got) this.d.get(), (uun) this.e.get(), (a) this.f.get(), (saf) this.g.get(), (waq) this.h.get(), (goy) this.i.get());
        return lpw;
    }
}
