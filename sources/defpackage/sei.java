package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: sei reason: default package */
public final class sei implements vua<seh> {
    private final wlc<rzf> a;
    private final wlc<ryy> b;
    private final wlc<rzh> c;
    private final wlc<Scheduler> d;
    private final wlc<Observable<kxx>> e;

    private sei(wlc<rzf> wlc, wlc<ryy> wlc2, wlc<rzh> wlc3, wlc<Scheduler> wlc4, wlc<Observable<kxx>> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static sei a(wlc<rzf> wlc, wlc<ryy> wlc2, wlc<rzh> wlc3, wlc<Scheduler> wlc4, wlc<Observable<kxx>> wlc5) {
        sei sei = new sei(wlc, wlc2, wlc3, wlc4, wlc5);
        return sei;
    }

    public final /* synthetic */ Object get() {
        seh seh = new seh((rzf) this.a.get(), (ryy) this.b.get(), (rzh) this.c.get(), (Scheduler) this.d.get(), (Observable) this.e.get());
        return seh;
    }
}
