package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: gym reason: default package */
public final class gym implements vua<gyl> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<Scheduler> b;

    private gym(wlc<Flowable<PlayerState>> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static gym a(wlc<Flowable<PlayerState>> wlc, wlc<Scheduler> wlc2) {
        return new gym(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new gyl((Flowable) this.a.get(), (Scheduler) this.b.get());
    }
}
