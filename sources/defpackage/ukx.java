package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: ukx reason: default package */
public final class ukx implements vua<uku> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<wug> b;

    private ukx(wlc<Flowable<PlayerState>> wlc, wlc<wug> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ukx a(wlc<Flowable<PlayerState>> wlc, wlc<wug> wlc2) {
        return new ukx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new uku((Flowable) this.a.get(), (wug) this.b.get());
    }
}
