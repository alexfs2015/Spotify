package defpackage;

import io.reactivex.Scheduler;

/* renamed from: ufn reason: default package */
public final class ufn implements vua<ufm> {
    private final wlc<gkz> a;
    private final wlc<Scheduler> b;

    private ufn(wlc<gkz> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ufn a(wlc<gkz> wlc, wlc<Scheduler> wlc2) {
        return new ufn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ufm((gkz) this.a.get(), (Scheduler) this.b.get());
    }
}
