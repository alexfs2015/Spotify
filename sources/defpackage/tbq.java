package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.transformers.PlayerStateTransformers;
import io.reactivex.Flowable;

/* renamed from: tbq reason: default package */
public final class tbq implements vua<Flowable<String>> {
    private final wlc<Flowable<PlayerState>> a;

    private tbq(wlc<Flowable<PlayerState>> wlc) {
        this.a = wlc;
    }

    public static tbq a(wlc<Flowable<PlayerState>> wlc) {
        return new tbq(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((Flowable) this.a.get()).a(PlayerStateTransformers.currentTrackUri()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
