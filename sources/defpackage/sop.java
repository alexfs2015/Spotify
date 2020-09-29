package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: sop reason: default package */
public final class sop implements wig<soo> {
    private final wzi<sit> a;
    private final wzi<sim> b;
    private final wzi<siv> c;
    private final wzi<Scheduler> d;
    private final wzi<Observable<lbg>> e;

    private sop(wzi<sit> wzi, wzi<sim> wzi2, wzi<siv> wzi3, wzi<Scheduler> wzi4, wzi<Observable<lbg>> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static sop a(wzi<sit> wzi, wzi<sim> wzi2, wzi<siv> wzi3, wzi<Scheduler> wzi4, wzi<Observable<lbg>> wzi5) {
        sop sop = new sop(wzi, wzi2, wzi3, wzi4, wzi5);
        return sop;
    }

    public final /* synthetic */ Object get() {
        soo soo = new soo((sit) this.a.get(), (sim) this.b.get(), (siv) this.c.get(), (Scheduler) this.d.get(), (Observable) this.e.get());
        return soo;
    }
}
