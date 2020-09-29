package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: ubv reason: default package */
public final class ubv implements vua<ubu> {
    private final wlc<ucf> a;
    private final wlc<ucg> b;
    private final wlc<RxResolver> c;
    private final wlc<hvl> d;
    private final wlc<Scheduler> e;
    private final wlc<Scheduler> f;
    private final wlc<Scheduler> g;
    private final wlc<rnf> h;

    private ubv(wlc<ucf> wlc, wlc<ucg> wlc2, wlc<RxResolver> wlc3, wlc<hvl> wlc4, wlc<Scheduler> wlc5, wlc<Scheduler> wlc6, wlc<Scheduler> wlc7, wlc<rnf> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static ubv a(wlc<ucf> wlc, wlc<ucg> wlc2, wlc<RxResolver> wlc3, wlc<hvl> wlc4, wlc<Scheduler> wlc5, wlc<Scheduler> wlc6, wlc<Scheduler> wlc7, wlc<rnf> wlc8) {
        ubv ubv = new ubv(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return ubv;
    }

    public final /* synthetic */ Object get() {
        ubu ubu = new ubu((ucf) this.a.get(), (ucg) this.b.get(), (RxResolver) this.c.get(), (hvl) this.d.get(), (Scheduler) this.e.get(), (Scheduler) this.f.get(), (Scheduler) this.g.get(), (rnf) this.h.get());
        return ubu;
    }
}
