package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.transformers.PlayerStateTransformers;
import io.reactivex.Flowable;

/* renamed from: tlt reason: default package */
public final class tlt implements wig<Flowable<Boolean>> {
    private final wzi<Flowable<PlayerState>> a;

    private tlt(wzi<Flowable<PlayerState>> wzi) {
        this.a = wzi;
    }

    public static tlt a(wzi<Flowable<PlayerState>> wzi) {
        return new tlt(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((Flowable) this.a.get()).a(PlayerStateTransformers.isPlaying()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
