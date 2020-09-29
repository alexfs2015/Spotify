package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: roy reason: default package */
public final class roy implements vua<rox> {
    private final wlc<ConnectManager> a;
    private final wlc<Scheduler> b;
    private final wlc<Flowable<PlayerState>> c;
    private final wlc<rpv> d;

    private roy(wlc<ConnectManager> wlc, wlc<Scheduler> wlc2, wlc<Flowable<PlayerState>> wlc3, wlc<rpv> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static roy a(wlc<ConnectManager> wlc, wlc<Scheduler> wlc2, wlc<Flowable<PlayerState>> wlc3, wlc<rpv> wlc4) {
        return new roy(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new rox((ConnectManager) this.a.get(), (Scheduler) this.b.get(), (Flowable) this.c.get(), (rpv) this.d.get());
    }
}
