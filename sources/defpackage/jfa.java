package defpackage;

import io.reactivex.Scheduler;

/* renamed from: jfa reason: default package */
public final class jfa implements vua<jez> {
    private final wlc<Scheduler> a;
    private final wlc<Scheduler> b;
    private final wlc<hvl> c;
    private final wlc<jfd> d;
    private final wlc<jen> e;
    private final wlc<jex> f;

    public static jez a(Scheduler scheduler, Scheduler scheduler2, hvl hvl, jfd jfd, jen jen, Object obj) {
        jez jez = new jez(scheduler, scheduler2, hvl, jfd, jen, (jex) obj);
        return jez;
    }

    public final /* synthetic */ Object get() {
        jez jez = new jez((Scheduler) this.a.get(), (Scheduler) this.b.get(), (hvl) this.c.get(), (jfd) this.d.get(), (jen) this.e.get(), (jex) this.f.get());
        return jez;
    }
}
