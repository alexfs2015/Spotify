package defpackage;

import io.reactivex.Scheduler;

/* renamed from: rhe reason: default package */
public final class rhe implements vua<rhd> {
    private final wlc<rhf> a;
    private final wlc<Scheduler> b;
    private final wlc<Scheduler> c;

    private rhe(wlc<rhf> wlc, wlc<Scheduler> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rhe a(wlc<rhf> wlc, wlc<Scheduler> wlc2, wlc<Scheduler> wlc3) {
        return new rhe(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (rhd) vuf.a(new rhd((rhf) this.a.get(), (Scheduler) this.b.get(), (Scheduler) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
