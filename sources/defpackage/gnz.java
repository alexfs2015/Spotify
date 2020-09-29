package defpackage;

import io.reactivex.Scheduler;

/* renamed from: gnz reason: default package */
public final class gnz implements vua<gny> {
    private final wlc<Scheduler> a;
    private final wlc<ghm> b;

    private gnz(wlc<Scheduler> wlc, wlc<ghm> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static gnz a(wlc<Scheduler> wlc, wlc<ghm> wlc2) {
        return new gnz(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new gny((Scheduler) this.a.get(), (ghm) this.b.get());
    }
}
