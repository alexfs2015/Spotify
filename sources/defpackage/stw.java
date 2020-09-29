package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import io.reactivex.Flowable;

/* renamed from: stw reason: default package */
public final class stw implements a {
    sty a;
    final xag b = new xag();
    private final wud<PlayerTrack> c;

    public stw(Flowable<PlayerTrack> flowable) {
        this.c = vun.a((wrf<T>) flowable);
    }

    /* access modifiers changed from: 0000 */
    public wuk a() {
        return this.c.a((wun<? super T>) new $$Lambda$stw$H05a8dZaf0l6kOGelViRvpTO2yY<Object>(this), (wun<Throwable>) new $$Lambda$stw$EB32MPuFpAxK9NkungGpS0O2bDQ<Throwable>(this));
    }

    /* access modifiers changed from: private */
    public void a(PlayerTrack playerTrack) {
        this.a.a((String) playerTrack.metadata().get("title"));
        this.a.b(PlayerTrackUtil.getArtists(playerTrack));
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e("Error observing PlayerTrack: %s", th.toString());
    }
}
