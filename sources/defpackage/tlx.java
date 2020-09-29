package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.transformers.PlayerStateTransformers;
import io.reactivex.Flowable;

/* renamed from: tlx reason: default package */
public final class tlx implements wig<Flowable<String>> {
    private final wzi<Flowable<PlayerState>> a;

    private tlx(wzi<Flowable<PlayerState>> wzi) {
        this.a = wzi;
    }

    public static tlx a(wzi<Flowable<PlayerState>> wzi) {
        return new tlx(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((Flowable) this.a.get()).a(PlayerStateTransformers.currentTrackUri()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
