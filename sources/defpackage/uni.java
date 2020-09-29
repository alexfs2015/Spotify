package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/* renamed from: uni reason: default package */
public final class uni implements wig<Observable<ho<String, PlayerTrack>>> {
    private final wzi<Flowable<PlayerState>> a;

    private uni(wzi<Flowable<PlayerState>> wzi) {
        this.a = wzi;
    }

    public static uni a(wzi<Flowable<PlayerState>> wzi) {
        return new uni(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
