package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: iwy reason: default package */
public final class iwy implements vua<iwx> {
    private final wlc<ka> a;
    private final wlc<sih> b;
    private final wlc<fpt> c;
    private final wlc<jjf> d;
    private final wlc<Flowable<PlayerState>> e;
    private final wlc<Scheduler> f;
    private final wlc<iwt> g;

    private iwy(wlc<ka> wlc, wlc<sih> wlc2, wlc<fpt> wlc3, wlc<jjf> wlc4, wlc<Flowable<PlayerState>> wlc5, wlc<Scheduler> wlc6, wlc<iwt> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static iwy a(wlc<ka> wlc, wlc<sih> wlc2, wlc<fpt> wlc3, wlc<jjf> wlc4, wlc<Flowable<PlayerState>> wlc5, wlc<Scheduler> wlc6, wlc<iwt> wlc7) {
        iwy iwy = new iwy(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return iwy;
    }

    public final /* synthetic */ Object get() {
        iwx iwx = new iwx((ka) this.a.get(), (sih) this.b.get(), (fpt) this.c.get(), (jjf) this.d.get(), (Flowable) this.e.get(), (Scheduler) this.f.get(), (iwt) this.g.get());
        return iwx;
    }
}
