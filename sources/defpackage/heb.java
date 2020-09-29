package defpackage;

import io.reactivex.Scheduler;

/* renamed from: heb reason: default package */
public final class heb implements vua<hea> {
    private final wlc<Scheduler> a;
    private final wlc<Scheduler> b;
    private final wlc<Scheduler> c;

    private heb(wlc<Scheduler> wlc, wlc<Scheduler> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static heb a(wlc<Scheduler> wlc, wlc<Scheduler> wlc2, wlc<Scheduler> wlc3) {
        return new heb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new hea((Scheduler) this.a.get(), (Scheduler) this.b.get(), (Scheduler) this.c.get());
    }
}
