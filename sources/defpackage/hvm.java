package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: hvm reason: default package */
public final class hvm implements vua<hvl> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;
    private final wlc<Scheduler> c;
    private final wlc<Scheduler> d;

    private hvm(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<Scheduler> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hvm a(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<Scheduler> wlc3, wlc<Scheduler> wlc4) {
        return new hvm(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new hvl((RxResolver) this.a.get(), (rnf) this.b.get(), (Scheduler) this.c.get(), (Scheduler) this.d.get());
    }
}
