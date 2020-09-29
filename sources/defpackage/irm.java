package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: irm reason: default package */
public final class irm implements vua<irl> {
    private final wlc<hip> a;
    private final wlc<Flowable<PlayerState>> b;
    private final wlc<gqx> c;
    private final wlc<uav> d;

    private irm(wlc<hip> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<gqx> wlc3, wlc<uav> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static irm a(wlc<hip> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<gqx> wlc3, wlc<uav> wlc4) {
        return new irm(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new irl(this.a, this.b, this.c, this.d);
    }
}
