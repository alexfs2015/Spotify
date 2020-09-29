package defpackage;

import io.reactivex.Scheduler;

/* renamed from: sek reason: default package */
public final class sek implements vua<sej> {
    private final wlc<upd> a;
    private final wlc<sdq> b;
    private final wlc<Scheduler> c;
    private final wlc<Integer> d;

    private sek(wlc<upd> wlc, wlc<sdq> wlc2, wlc<Scheduler> wlc3, wlc<Integer> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static sek a(wlc<upd> wlc, wlc<sdq> wlc2, wlc<Scheduler> wlc3, wlc<Integer> wlc4) {
        return new sek(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new sej((upd) this.a.get(), (sdq) this.b.get(), (Scheduler) this.c.get(), ((Integer) this.d.get()).intValue());
    }
}
