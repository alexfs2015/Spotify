package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import io.reactivex.Flowable;

/* renamed from: ted reason: default package */
public final class ted implements a {
    tef a;
    final xok b = new xok();
    private final xii<PlayerTrack> c;

    public ted(Flowable<PlayerTrack> flowable) {
        this.c = wit.a((xfk<T>) flowable);
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

    /* access modifiers changed from: 0000 */
    public xip a() {
        return this.c.a((xis<? super T>) new $$Lambda$ted$4VA70dx7fYllmdkVdA61iUXiQk<Object>(this), (xis<Throwable>) new $$Lambda$ted$yKg6njj4GvLNqMh3PNt9m27nXJI<Throwable>(this));
    }
}
