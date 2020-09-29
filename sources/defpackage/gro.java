package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: gro reason: default package */
public final class gro implements vua<grn> {
    private final wlc<RxResolver> a;
    private final wlc<gkr> b;
    private final wlc<Scheduler> c;

    private gro(wlc<RxResolver> wlc, wlc<gkr> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static gro a(wlc<RxResolver> wlc, wlc<gkr> wlc2, wlc<Scheduler> wlc3) {
        return new gro(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new grn((RxResolver) this.a.get(), (gkr) this.b.get(), (Scheduler) this.c.get());
    }
}
