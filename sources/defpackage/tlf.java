package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: tlf reason: default package */
public final class tlf implements vua<tle> {
    private final wlc<Flowable<PlayerState>> a;

    private tlf(wlc<Flowable<PlayerState>> wlc) {
        this.a = wlc;
    }

    public static tlf a(wlc<Flowable<PlayerState>> wlc) {
        return new tlf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tle((Flowable) this.a.get());
    }
}
