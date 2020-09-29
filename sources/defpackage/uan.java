package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/* renamed from: uan reason: default package */
public final class uan implements vua<Observable<ho<String, PlayerTrack>>> {
    private final wlc<Flowable<PlayerState>> a;

    private uan(wlc<Flowable<PlayerState>> wlc) {
        this.a = wlc;
    }

    public static uan a(wlc<Flowable<PlayerState>> wlc) {
        return new uan(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
