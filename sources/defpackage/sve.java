package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: sve reason: default package */
public final class sve implements vua<svd> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<svf> b;
    private final wlc<suv> c;
    private final wlc<Scheduler> d;
    private final wlc<suz> e;
    private final wlc<spi> f;

    private sve(wlc<Flowable<PlayerState>> wlc, wlc<svf> wlc2, wlc<suv> wlc3, wlc<Scheduler> wlc4, wlc<suz> wlc5, wlc<spi> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static sve a(wlc<Flowable<PlayerState>> wlc, wlc<svf> wlc2, wlc<suv> wlc3, wlc<Scheduler> wlc4, wlc<suz> wlc5, wlc<spi> wlc6) {
        sve sve = new sve(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return sve;
    }

    public final /* synthetic */ Object get() {
        svd svd = new svd((Flowable) this.a.get(), (svf) this.b.get(), (suv) this.c.get(), (Scheduler) this.d.get(), (suz) this.e.get(), (spi) this.f.get());
        return svd;
    }
}
