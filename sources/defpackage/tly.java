package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.transformers.PlayerStateTransformers;
import io.reactivex.Flowable;

/* renamed from: tly reason: default package */
public final class tly implements wig<Flowable<Long>> {
    private final wzi<Flowable<PlayerState>> a;

    private tly(wzi<Flowable<PlayerState>> wzi) {
        this.a = wzi;
    }

    public static tly a(wzi<Flowable<PlayerState>> wzi) {
        return new tly(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((Flowable) this.a.get()).a(PlayerStateTransformers.duration()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
