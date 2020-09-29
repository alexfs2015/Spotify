package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: nwz reason: default package */
public final class nwz {
    private final Flowable<PlayerState> a;
    private final uwm b;
    private final kxi c;
    private final tcn d;
    private final ConnectManager e;
    private final gqx f;
    private final ron g;
    private final uav h;
    private final rfy i;
    private final tin j;
    private final Scheduler k;

    public nwz(Flowable<PlayerState> flowable, uwm uwm, kxi kxi, tcn tcn, ConnectManager connectManager, gqx gqx, ron ron, uav uav, rfy rfy, tin tin, Scheduler scheduler) {
        this.a = flowable;
        this.b = uwm;
        this.c = kxi;
        this.d = tcn;
        this.e = connectManager;
        this.f = gqx;
        this.g = ron;
        this.h = uav;
        this.i = rfy;
        this.j = tin;
        this.k = scheduler;
    }

    /* access modifiers changed from: 0000 */
    public c<nxn, nxd, nxc> a() {
        return klb.a((kjz<M, E, F>) $$Lambda$3ghocpB8tdJdOdo4yAIQ3sGVbQ.INSTANCE, b()).a(c()).a(kkh.a("NowPlayingBar"));
    }

    private ObservableTransformer<nxc, nxd> b() {
        return nxt.a(this.b, this.c, this.d, this.i, this.j, this.k);
    }

    private kjm<nxd> c() {
        return nxu.a(this.a, gqx.a(this.e), vun.b(this.h.a()), this.g.a());
    }
}
