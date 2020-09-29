package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.newplaying.scroll.widgets.storylines.StorylinesWidgetPresenter;
import io.reactivex.Flowable;

/* renamed from: svl reason: default package */
public final class svl implements vua<StorylinesWidgetPresenter> {
    private final wlc<Flowable<PlayerTrack>> a;
    private final wlc<PlayerState> b;
    private final wlc<uog> c;
    private final wlc<uoe> d;
    private final wlc<spi> e;
    private final wlc<FollowManager> f;
    private final wlc<hvk<svp>> g;
    private final wlc<wug> h;
    private final wlc<uom> i;
    private final wlc<rcu> j;

    private svl(wlc<Flowable<PlayerTrack>> wlc, wlc<PlayerState> wlc2, wlc<uog> wlc3, wlc<uoe> wlc4, wlc<spi> wlc5, wlc<FollowManager> wlc6, wlc<hvk<svp>> wlc7, wlc<wug> wlc8, wlc<uom> wlc9, wlc<rcu> wlc10) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
    }

    public static svl a(wlc<Flowable<PlayerTrack>> wlc, wlc<PlayerState> wlc2, wlc<uog> wlc3, wlc<uoe> wlc4, wlc<spi> wlc5, wlc<FollowManager> wlc6, wlc<hvk<svp>> wlc7, wlc<wug> wlc8, wlc<uom> wlc9, wlc<rcu> wlc10) {
        svl svl = new svl(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10);
        return svl;
    }

    public final /* synthetic */ Object get() {
        StorylinesWidgetPresenter storylinesWidgetPresenter = new StorylinesWidgetPresenter((Flowable) this.a.get(), this.b, (uog) this.c.get(), (uoe) this.d.get(), (spi) this.e.get(), (FollowManager) this.f.get(), (hvk) this.g.get(), (wug) this.h.get(), (uom) this.i.get(), (rcu) this.j.get());
        return storylinesWidgetPresenter;
    }
}
