package defpackage;

import io.reactivex.Scheduler;

/* renamed from: seu reason: default package */
public final class seu implements vua<set> {
    private final wlc<sdo> a;
    private final wlc<sdd> b;
    private final wlc<Scheduler> c;
    private final wlc<sdg> d;

    private seu(wlc<sdo> wlc, wlc<sdd> wlc2, wlc<Scheduler> wlc3, wlc<sdg> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static seu a(wlc<sdo> wlc, wlc<sdd> wlc2, wlc<Scheduler> wlc3, wlc<sdg> wlc4) {
        return new seu(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new set((sdo) this.a.get(), (sdd) this.b.get(), (Scheduler) this.c.get(), (sdg) this.d.get());
    }
}
