package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: pdo reason: default package */
public final class pdo implements vua<pdn> {
    private final wlc<Flowable<PlayerState>> a;

    private pdo(wlc<Flowable<PlayerState>> wlc) {
        this.a = wlc;
    }

    public static pdo a(wlc<Flowable<PlayerState>> wlc) {
        return new pdo(wlc);
    }

    public final /* synthetic */ Object get() {
        return new pdn((Flowable) this.a.get());
    }
}
