package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: ppw reason: default package */
public final class ppw implements vua<ppv> {
    private final wlc<ppx> a;
    private final wlc<pqs> b;
    private final wlc<pni> c;
    private final wlc<rka> d;
    private final wlc<Flowable<PlayerState>> e;
    private final wlc<pqp> f;
    private final wlc<Scheduler> g;
    private final wlc<Scheduler> h;

    private ppw(wlc<ppx> wlc, wlc<pqs> wlc2, wlc<pni> wlc3, wlc<rka> wlc4, wlc<Flowable<PlayerState>> wlc5, wlc<pqp> wlc6, wlc<Scheduler> wlc7, wlc<Scheduler> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static ppw a(wlc<ppx> wlc, wlc<pqs> wlc2, wlc<pni> wlc3, wlc<rka> wlc4, wlc<Flowable<PlayerState>> wlc5, wlc<pqp> wlc6, wlc<Scheduler> wlc7, wlc<Scheduler> wlc8) {
        ppw ppw = new ppw(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return ppw;
    }

    public final /* synthetic */ Object get() {
        ppv ppv = new ppv((ppx) this.a.get(), (pqs) this.b.get(), (pni) this.c.get(), (rka) this.d.get(), (Flowable) this.e.get(), (pqp) this.f.get(), (Scheduler) this.g.get(), (Scheduler) this.h.get());
        return ppv;
    }
}
