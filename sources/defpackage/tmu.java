package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: tmu reason: default package */
public final class tmu implements vua<tmt> {
    private final wlc<Flowable<PlayerState>> a;

    private tmu(wlc<Flowable<PlayerState>> wlc) {
        this.a = wlc;
    }

    public static tmu a(wlc<Flowable<PlayerState>> wlc) {
        return new tmu(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tmt((Flowable) this.a.get());
    }
}
