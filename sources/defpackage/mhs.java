package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mhs reason: default package */
public final class mhs implements vua<mhr> {
    private final wlc<mhh> a;
    private final wlc<ufm> b;
    private final wlc<Scheduler> c;

    private mhs(wlc<mhh> wlc, wlc<ufm> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mhs a(wlc<mhh> wlc, wlc<ufm> wlc2, wlc<Scheduler> wlc3) {
        return new mhs(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mhr((mhh) this.a.get(), (ufm) this.b.get(), (Scheduler) this.c.get());
    }
}
