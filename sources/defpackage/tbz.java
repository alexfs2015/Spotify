package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: tbz reason: default package */
public final class tbz implements vua<tby> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<tch> b;

    private tbz(wlc<Flowable<PlayerState>> wlc, wlc<tch> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tbz a(wlc<Flowable<PlayerState>> wlc, wlc<tch> wlc2) {
        return new tbz(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tby((Flowable) this.a.get(), (tch) this.b.get());
    }
}
