package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: plw reason: default package */
public final class plw implements vua<pmm> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<Scheduler> b;
    private final wlc<pmg> c;
    private final wlc<spi> d;

    private plw(wlc<Flowable<PlayerState>> wlc, wlc<Scheduler> wlc2, wlc<pmg> wlc3, wlc<spi> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static plw a(wlc<Flowable<PlayerState>> wlc, wlc<Scheduler> wlc2, wlc<pmg> wlc3, wlc<spi> wlc4) {
        return new plw(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (pmm) vuf.a(new pmn((Flowable) this.a.get(), (Scheduler) this.b.get(), (pmg) this.c.get(), (spi) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
