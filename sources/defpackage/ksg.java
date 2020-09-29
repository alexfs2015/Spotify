package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: ksg reason: default package */
public final class ksg implements vua<ksf> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<jrp> b;
    private final wlc<wug> c;

    private ksg(wlc<Flowable<PlayerState>> wlc, wlc<jrp> wlc2, wlc<wug> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ksg a(wlc<Flowable<PlayerState>> wlc, wlc<jrp> wlc2, wlc<wug> wlc3) {
        return new ksg(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ksf((Flowable) this.a.get(), (jrp) this.b.get(), (wug) this.c.get());
    }
}
