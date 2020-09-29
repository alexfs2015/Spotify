package defpackage;

import io.reactivex.Scheduler;

/* renamed from: pxi reason: default package */
public final class pxi implements wig<pxh> {
    private final wzi<qbc> a;
    private final wzi<pxf> b;
    private final wzi<pzo> c;
    private final wzi<rtj> d;
    private final wzi<Scheduler> e;

    private pxi(wzi<qbc> wzi, wzi<pxf> wzi2, wzi<pzo> wzi3, wzi<rtj> wzi4, wzi<Scheduler> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static pxi a(wzi<qbc> wzi, wzi<pxf> wzi2, wzi<pzo> wzi3, wzi<rtj> wzi4, wzi<Scheduler> wzi5) {
        pxi pxi = new pxi(wzi, wzi2, wzi3, wzi4, wzi5);
        return pxi;
    }

    public final /* synthetic */ Object get() {
        pxh pxh = new pxh((qbc) this.a.get(), (pxf) this.b.get(), (pzo) this.c.get(), (rtj) this.d.get(), (Scheduler) this.e.get());
        return pxh;
    }
}
