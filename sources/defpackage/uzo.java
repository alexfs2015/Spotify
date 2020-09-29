package defpackage;

import io.reactivex.Scheduler;

/* renamed from: uzo reason: default package */
public final class uzo implements vua<uzn> {
    private final wlc<jrp> a;
    private final wlc<uzj> b;
    private final wlc<Scheduler> c;

    private uzo(wlc<jrp> wlc, wlc<uzj> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static uzo a(wlc<jrp> wlc, wlc<uzj> wlc2, wlc<Scheduler> wlc3) {
        return new uzo(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new uzn((jrp) this.a.get(), (uzj) this.b.get(), (Scheduler) this.c.get());
    }
}
