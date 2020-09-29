package defpackage;

import io.reactivex.Scheduler;

/* renamed from: tpy reason: default package */
public final class tpy implements wig<tpx> {
    private final wzi<Scheduler> a;
    private final wzi<Scheduler> b;

    public static tpx a(Scheduler scheduler, Scheduler scheduler2) {
        return new tpx(scheduler, scheduler2);
    }

    public final /* synthetic */ Object get() {
        return new tpx((Scheduler) this.a.get(), (Scheduler) this.b.get());
    }
}
