package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: ixg reason: default package */
public final class ixg {
    public static final xiy<PlayerState, ixj> a = $$Lambda$ixg$w0U2zPqAw7xT9mlaeSEsbtGE24.INSTANCE;
    public final Flowable<PlayerState> b;
    public final xil c;
    public xip d;
    /* access modifiers changed from: private */
    public final ixh e;
    /* access modifiers changed from: private */
    public final lar f;
    private final hgy g;
    private final rqb h;
    /* access modifiers changed from: private */
    public final ixn i;

    public ixg(ixh ixh, lar lar, hgy hgy, Flowable<PlayerState> flowable, xil xil, rqb rqb, ixn ixn) {
        this.e = (ixh) fbp.a(ixh);
        this.f = (lar) fbp.a(lar);
        this.g = (hgy) fbp.a(hgy);
        this.b = (Flowable) fbp.a(flowable);
        this.c = xil;
        this.h = (rqb) fbp.a(rqb);
        this.i = (ixn) fbp.a(ixn);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ixi a(Boolean bool, ixj ixj) {
        return new ixi(bool.booleanValue(), ixj.d, ixj.e);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ixj a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        return track != null ? new ixj(track.uri(), playerState.contextUri(), Boolean.parseBoolean((String) track.metadata().get("collection.in_collection")), Boolean.parseBoolean((String) track.metadata().get("collection.can_add"))) : new ixj("empty_track", "empty_context", false, false);
    }

    public final void a() {
        xii a2 = wit.a((xfk<T>) this.g.a());
        rqb rqb = this.h;
        rqb.getClass();
        this.d = xii.a(a2.e((xiy<? super T, ? extends R>) new $$Lambda$nYUPVQ2xGrNWiMCjUDxRqC1XUqQ<Object,Object>(rqb)).b().c((xii<? extends T>) ScalarSynchronousObservable.d(Boolean.FALSE)), wit.a((xfk<T>) this.b).e(a).b(), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$ixg$eh4PWFA58fVRxwQ_uYbqEpBZZOQ.INSTANCE).a(this.c).c((xii<? extends T>) ScalarSynchronousObservable.d(ixi.a)).a((xij<? super T>) new xij<ixi>() {
            public final void onCompleted() {
            }

            public final void onError(Throwable th) {
            }

            public final /* synthetic */ void onNext(Object obj) {
                ixi ixi = (ixi) obj;
                ixg.this.e.l(ixi.b);
                if (ixi.b) {
                    ixg.this.e.k(ixi.c);
                    ixg.this.e.m(ixi.d);
                }
            }
        });
    }
}
