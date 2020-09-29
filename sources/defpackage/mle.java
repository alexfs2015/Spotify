package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mle reason: default package */
public final class mle implements vua<mlc> {
    private final wlc<mla> a;
    private final wlc<rqd> b;
    private final wlc<mlz> c;
    private final wlc<mmb> d;
    private final wlc<Scheduler> e;

    public static mlc a(mla mla, rqd rqd, mlz mlz, wlc<mmb> wlc, Scheduler scheduler) {
        mlc mlc = new mlc(mla, rqd, mlz, wlc, scheduler);
        return mlc;
    }

    public final /* synthetic */ Object get() {
        mlc mlc = new mlc((mla) this.a.get(), (rqd) this.b.get(), (mlz) this.c.get(), this.d, (Scheduler) this.e.get());
        return mlc;
    }
}
