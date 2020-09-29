package defpackage;

import io.reactivex.Scheduler;

/* renamed from: gdc reason: default package */
public final class gdc implements vua<gda> {
    private final wlc<gdd> a;
    private final wlc<gdf> b;
    private final wlc<vix> c;
    private final wlc<Scheduler> d;
    private final wlc<Scheduler> e;

    private gdc(wlc<gdd> wlc, wlc<gdf> wlc2, wlc<vix> wlc3, wlc<Scheduler> wlc4, wlc<Scheduler> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static gdc a(wlc<gdd> wlc, wlc<gdf> wlc2, wlc<vix> wlc3, wlc<Scheduler> wlc4, wlc<Scheduler> wlc5) {
        gdc gdc = new gdc(wlc, wlc2, wlc3, wlc4, wlc5);
        return gdc;
    }

    public final /* synthetic */ Object get() {
        gda gda = new gda((gdd) this.a.get(), (gdf) this.b.get(), (vix) this.c.get(), (Scheduler) this.d.get(), (Scheduler) this.e.get());
        return gda;
    }
}
