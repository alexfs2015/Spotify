package defpackage;

import io.reactivex.Scheduler;

/* renamed from: otc reason: default package */
public final class otc implements vua<otb> {
    private final wlc<Scheduler> a;
    private final wlc<ois> b;

    private otc(wlc<Scheduler> wlc, wlc<ois> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static otc a(wlc<Scheduler> wlc, wlc<ois> wlc2) {
        return new otc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new otb((Scheduler) this.a.get(), (ois) this.b.get());
    }
}
