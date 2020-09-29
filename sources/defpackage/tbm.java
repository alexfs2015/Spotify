package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.transformers.PlayerStateTransformers;
import io.reactivex.Flowable;

/* renamed from: tbm reason: default package */
public final class tbm implements vua<Flowable<Boolean>> {
    private final wlc<Flowable<PlayerState>> a;

    private tbm(wlc<Flowable<PlayerState>> wlc) {
        this.a = wlc;
    }

    public static tbm a(wlc<Flowable<PlayerState>> wlc) {
        return new tbm(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((Flowable) this.a.get()).a(PlayerStateTransformers.isPlaying()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
