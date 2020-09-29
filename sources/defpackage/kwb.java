package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: kwb reason: default package */
public final class kwb implements vua<kwa> {
    private final wlc<kvy> a;
    private final wlc<kwg> b;
    private final wlc<ueb> c;
    private final wlc<Scheduler> d;
    private final wlc<Flowable<PlayerState>> e;
    private final wlc<kvb> f;

    private kwb(wlc<kvy> wlc, wlc<kwg> wlc2, wlc<ueb> wlc3, wlc<Scheduler> wlc4, wlc<Flowable<PlayerState>> wlc5, wlc<kvb> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static kwb a(wlc<kvy> wlc, wlc<kwg> wlc2, wlc<ueb> wlc3, wlc<Scheduler> wlc4, wlc<Flowable<PlayerState>> wlc5, wlc<kvb> wlc6) {
        kwb kwb = new kwb(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return kwb;
    }

    public static kwa a(kvy kvy, kwg kwg, ueb ueb, Scheduler scheduler, Flowable<PlayerState> flowable, kvb kvb) {
        kwa kwa = new kwa(kvy, kwg, ueb, scheduler, flowable, kvb);
        return kwa;
    }

    public final /* synthetic */ Object get() {
        kwa kwa = new kwa((kvy) this.a.get(), (kwg) this.b.get(), (ueb) this.c.get(), (Scheduler) this.d.get(), (Flowable) this.e.get(), (kvb) this.f.get());
        return kwa;
    }
}
