package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.newplaying.scroll.widgets.storylines.StorylinesWidgetPresenter;
import io.reactivex.Flowable;

/* renamed from: tfs reason: default package */
public final class tfs implements wig<StorylinesWidgetPresenter> {
    private final wzi<Flowable<PlayerTrack>> a;
    private final wzi<PlayerState> b;
    private final wzi<uzk> c;
    private final wzi<uzi> d;
    private final wzi<szp> e;
    private final wzi<FollowManager> f;
    private final wzi<hxw<tfw>> g;
    private final wzi<xil> h;
    private final wzi<uzq> i;
    private final wzi<rls> j;

    private tfs(wzi<Flowable<PlayerTrack>> wzi, wzi<PlayerState> wzi2, wzi<uzk> wzi3, wzi<uzi> wzi4, wzi<szp> wzi5, wzi<FollowManager> wzi6, wzi<hxw<tfw>> wzi7, wzi<xil> wzi8, wzi<uzq> wzi9, wzi<rls> wzi10) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
    }

    public static tfs a(wzi<Flowable<PlayerTrack>> wzi, wzi<PlayerState> wzi2, wzi<uzk> wzi3, wzi<uzi> wzi4, wzi<szp> wzi5, wzi<FollowManager> wzi6, wzi<hxw<tfw>> wzi7, wzi<xil> wzi8, wzi<uzq> wzi9, wzi<rls> wzi10) {
        tfs tfs = new tfs(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10);
        return tfs;
    }

    public final /* synthetic */ Object get() {
        StorylinesWidgetPresenter storylinesWidgetPresenter = new StorylinesWidgetPresenter((Flowable) this.a.get(), this.b, (uzk) this.c.get(), (uzi) this.d.get(), (szp) this.e.get(), (FollowManager) this.f.get(), (hxw) this.g.get(), (xil) this.h.get(), (uzq) this.i.get(), (rls) this.j.get());
        return storylinesWidgetPresenter;
    }
}
