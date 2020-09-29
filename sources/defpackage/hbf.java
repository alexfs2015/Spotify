package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: hbf reason: default package */
public final class hbf implements wig<hbe> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<Scheduler> b;

    private hbf(wzi<Flowable<PlayerState>> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hbf a(wzi<Flowable<PlayerState>> wzi, wzi<Scheduler> wzi2) {
        return new hbf(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hbe((Flowable) this.a.get(), (Scheduler) this.b.get());
    }
}
