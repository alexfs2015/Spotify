package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: skl reason: default package */
public final class skl implements vua<skk> {
    private final wlc<Flowable<PlayerState>> a;

    private skl(wlc<Flowable<PlayerState>> wlc) {
        this.a = wlc;
    }

    public static skl a(wlc<Flowable<PlayerState>> wlc) {
        return new skl(wlc);
    }

    public final /* synthetic */ Object get() {
        return new skk((Flowable) this.a.get());
    }
}
