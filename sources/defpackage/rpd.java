package defpackage;

import io.reactivex.Scheduler;

/* renamed from: rpd reason: default package */
public final class rpd implements vua<rpc> {
    private final wlc<hec> a;
    private final wlc<Scheduler> b;

    private rpd(wlc<hec> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rpd a(wlc<hec> wlc, wlc<Scheduler> wlc2) {
        return new rpd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rpc((hec) this.a.get(), (Scheduler) this.b.get());
    }
}
