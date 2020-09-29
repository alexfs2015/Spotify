package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.rx.transformers.PlayerStateTransformers;
import io.reactivex.Flowable;

/* renamed from: tlw reason: default package */
public final class tlw implements wig<Flowable<PlayerTrack>> {
    private final wzi<Flowable<PlayerState>> a;

    private tlw(wzi<Flowable<PlayerState>> wzi) {
        this.a = wzi;
    }

    public static tlw a(wzi<Flowable<PlayerState>> wzi) {
        return new tlw(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((Flowable) this.a.get()).a(PlayerStateTransformers.currentTrack()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
