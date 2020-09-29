package defpackage;

import io.reactivex.Completable;
import io.reactivex.Scheduler;

/* renamed from: mbz reason: default package */
public final class mbz implements wig<mby> {
    private final wzi<mcu> a;
    private final wzi<mcv> b;
    private final wzi<Scheduler> c;
    private final wzi<rly> d;
    private final wzi<hbe> e;
    private final wzi<gwp> f;
    private final wzi<mbu> g;
    private final wzi<saq> h;
    private final wzi<Completable> i;
    private final wzi<hcs> j;

    private mbz(wzi<mcu> wzi, wzi<mcv> wzi2, wzi<Scheduler> wzi3, wzi<rly> wzi4, wzi<hbe> wzi5, wzi<gwp> wzi6, wzi<mbu> wzi7, wzi<saq> wzi8, wzi<Completable> wzi9, wzi<hcs> wzi10) {
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
    }

    public static mbz a(wzi<mcu> wzi, wzi<mcv> wzi2, wzi<Scheduler> wzi3, wzi<rly> wzi4, wzi<hbe> wzi5, wzi<gwp> wzi6, wzi<mbu> wzi7, wzi<saq> wzi8, wzi<Completable> wzi9, wzi<hcs> wzi10) {
        mbz mbz = new mbz(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10);
        return mbz;
    }

    public final /* synthetic */ Object get() {
        mby mby = new mby((mcu) this.a.get(), (mcv) this.b.get(), (Scheduler) this.c.get(), (rly) this.d.get(), (hbe) this.e.get(), (gwp) this.f.get(), (mbu) this.g.get(), (saq) this.h.get(), (Completable) this.i.get(), (hcs) this.j.get());
        return mby;
    }
}
