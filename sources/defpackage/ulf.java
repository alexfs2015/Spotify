package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: ulf reason: default package */
public final class ulf implements vua<wud<PlayerState>> {
    private final wlc<Flowable<PlayerState>> a;

    private ulf(wlc<Flowable<PlayerState>> wlc) {
        this.a = wlc;
    }

    public static ulf a(wlc<Flowable<PlayerState>> wlc) {
        return new ulf(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(vun.a((wrf<T>) (Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
