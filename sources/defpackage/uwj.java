package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: uwj reason: default package */
public final class uwj implements wig<xii<PlayerState>> {
    private final wzi<Flowable<PlayerState>> a;

    private uwj(wzi<Flowable<PlayerState>> wzi) {
        this.a = wzi;
    }

    public static uwj a(wzi<Flowable<PlayerState>> wzi) {
        return new uwj(wzi);
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(wit.a((xfk<T>) (Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
