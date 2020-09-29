package defpackage;

import io.reactivex.Scheduler;

/* renamed from: jbb reason: default package */
public final class jbb implements vua<jba> {
    private final wlc<Scheduler> a;
    private final wlc<Scheduler> b;
    private final wlc<izb> c;
    private final wlc<iyx> d;
    private final wlc<izl> e;

    public static jba a(Scheduler scheduler, Scheduler scheduler2, izb izb, iyx iyx, izl izl) {
        jba jba = new jba(scheduler, scheduler2, izb, iyx, izl);
        return jba;
    }

    public final /* synthetic */ Object get() {
        jba jba = new jba((Scheduler) this.a.get(), (Scheduler) this.b.get(), (izb) this.c.get(), (iyx) this.d.get(), (izl) this.e.get());
        return jba;
    }
}
