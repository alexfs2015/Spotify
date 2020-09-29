package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: kuy reason: default package */
public final class kuy implements vua<kux> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<jjf> b;

    private kuy(wlc<Flowable<PlayerState>> wlc, wlc<jjf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kuy a(wlc<Flowable<PlayerState>> wlc, wlc<jjf> wlc2) {
        return new kuy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kux((Flowable) this.a.get(), (jjf) this.b.get());
    }
}
