package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: qgw reason: default package */
public final class qgw implements vua<Observable<String>> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<Scheduler> b;

    private qgw(wlc<Flowable<PlayerState>> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qgw a(wlc<Flowable<PlayerState>> wlc, wlc<Scheduler> wlc2) {
        return new qgw(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(CC.a((Flowable) this.a.get(), (Scheduler) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
