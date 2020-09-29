package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.transformers.PlayerStateTransformers;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: tbs reason: default package */
public final class tbs implements vua<Flowable<Long>> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<Long> b;
    private final wlc<Scheduler> c;

    private tbs(wlc<Flowable<PlayerState>> wlc, wlc<Long> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tbs a(wlc<Flowable<PlayerState>> wlc, wlc<Long> wlc2, wlc<Scheduler> wlc3) {
        return new tbs(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((Flowable) this.a.get()).a(PlayerStateTransformers.position(((Long) this.b.get()).longValue(), (Scheduler) this.c.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
