package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.libs.connect.access.animation.logic.NudgeResolver;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: rou reason: default package */
public final class rou implements vua<NudgeResolver> {
    private final wlc<Observable<Boolean>> a;
    private final wlc<Flowable<PlayerState>> b;
    private final wlc<Scheduler> c;

    private rou(wlc<Observable<Boolean>> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rou a(wlc<Observable<Boolean>> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<Scheduler> wlc3) {
        return new rou(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new NudgeResolver((Observable) this.a.get(), (Flowable) this.b.get(), (Scheduler) this.c.get());
    }
}
