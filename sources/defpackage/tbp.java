package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.rx.transformers.PlayerStateTransformers;
import io.reactivex.Flowable;

/* renamed from: tbp reason: default package */
public final class tbp implements vua<Flowable<PlayerTrack>> {
    private final wlc<Flowable<PlayerState>> a;

    private tbp(wlc<Flowable<PlayerState>> wlc) {
        this.a = wlc;
    }

    public static tbp a(wlc<Flowable<PlayerState>> wlc) {
        return new tbp(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((Flowable) this.a.get()).a(PlayerStateTransformers.currentTrack()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
