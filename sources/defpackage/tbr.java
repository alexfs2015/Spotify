package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.transformers.PlayerStateTransformers;
import io.reactivex.Flowable;

/* renamed from: tbr reason: default package */
public final class tbr implements vua<Flowable<Long>> {
    private final wlc<Flowable<PlayerState>> a;

    private tbr(wlc<Flowable<PlayerState>> wlc) {
        this.a = wlc;
    }

    public static tbr a(wlc<Flowable<PlayerState>> wlc) {
        return new tbr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((Flowable) this.a.get()).a(PlayerStateTransformers.duration()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
