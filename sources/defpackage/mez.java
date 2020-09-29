package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mez reason: default package */
public final class mez implements vua<mey> {
    private final wlc<nd> a;
    private final wlc<String> b;
    private final wlc<Scheduler> c;

    private mez(wlc<nd> wlc, wlc<String> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mez a(wlc<nd> wlc, wlc<String> wlc2, wlc<Scheduler> wlc3) {
        return new mez(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mey((nd) this.a.get(), (String) this.b.get(), (Scheduler) this.c.get());
    }
}
