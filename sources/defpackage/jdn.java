package defpackage;

import io.reactivex.Scheduler;

/* renamed from: jdn reason: default package */
public final class jdn implements wig<jdm> {
    private final wzi<Scheduler> a;
    private final wzi<Scheduler> b;
    private final wzi<jbm> c;
    private final wzi<jbi> d;
    private final wzi<jbw> e;

    public static jdm a(Scheduler scheduler, Scheduler scheduler2, jbm jbm, jbi jbi, jbw jbw) {
        jdm jdm = new jdm(scheduler, scheduler2, jbm, jbi, jbw);
        return jdm;
    }

    public final /* synthetic */ Object get() {
        jdm jdm = new jdm((Scheduler) this.a.get(), (Scheduler) this.b.get(), (jbm) this.c.get(), (jbi) this.d.get(), (jbw) this.e.get());
        return jdm;
    }
}
