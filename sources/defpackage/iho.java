package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: iho reason: default package */
public final class iho implements wig<Flowable<PlayerState>> {
    private final wzi<Flowable<PlayerState>> a;

    private iho(wzi<Flowable<PlayerState>> wzi) {
        this.a = wzi;
    }

    public static iho a(wzi<Flowable<PlayerState>> wzi) {
        return new iho(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(CC.b((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
