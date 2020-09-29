package defpackage;

import io.reactivex.Scheduler;

/* renamed from: gkj reason: default package */
public final class gkj implements vua<gki> {
    private final wlc<gkn> a;
    private final wlc<Scheduler> b;

    public static gki a(gkn gkn, Scheduler scheduler) {
        return new gki(gkn, scheduler);
    }

    public final /* synthetic */ Object get() {
        return new gki((gkn) this.a.get(), (Scheduler) this.b.get());
    }
}
