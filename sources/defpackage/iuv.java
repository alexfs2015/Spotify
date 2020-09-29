package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: iuv reason: default package */
public final class iuv {
    public static final wut<PlayerState, iuy> a = $$Lambda$iuv$r5bnuYl3PCrDtrUpBtAblcV1ho.INSTANCE;
    public final Flowable<PlayerState> b;
    public final wug c;
    public wuk d;
    /* access modifiers changed from: private */
    public final iuw e;
    /* access modifiers changed from: private */
    public final kxi f;
    private final hec g;
    private final rgz h;
    /* access modifiers changed from: private */
    public final ivc i;

    /* access modifiers changed from: private */
    public static /* synthetic */ iuy a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (track != null) {
            return new iuy(track.uri(), playerState.contextUri(), Boolean.parseBoolean((String) track.metadata().get("collection.in_collection")), Boolean.parseBoolean((String) track.metadata().get("collection.can_add")));
        }
        return new iuy("empty_track", "empty_context", false, false);
    }

    public iuv(iuw iuw, kxi kxi, hec hec, Flowable<PlayerState> flowable, wug wug, rgz rgz, ivc ivc) {
        this.e = (iuw) fay.a(iuw);
        this.f = (kxi) fay.a(kxi);
        this.g = (hec) fay.a(hec);
        this.b = (Flowable) fay.a(flowable);
        this.c = wug;
        this.h = (rgz) fay.a(rgz);
        this.i = (ivc) fay.a(ivc);
    }

    public final void a() {
        wud a2 = vun.a((wrf<T>) this.g.a());
        rgz rgz = this.h;
        rgz.getClass();
        this.d = wud.a(a2.f(new $$Lambda$Fk33DOAimuY1Q14JoVTBzR_jnw(rgz)).b().c((wud<? extends T>) ScalarSynchronousObservable.d(Boolean.FALSE)), vun.a((wrf<T>) this.b).f(a).b(), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$iuv$5tvfgdbOEet5b78eDL6jdc6tYrk.INSTANCE).a(this.c).c((wud<? extends T>) ScalarSynchronousObservable.d(iux.a)).a((wue<? super T>) new wue<iux>() {
            public final void onCompleted() {
            }

            public final void onError(Throwable th) {
            }

            public final /* synthetic */ void onNext(Object obj) {
                iux iux = (iux) obj;
                iuv.this.e.l(iux.b);
                if (iux.b) {
                    iuv.this.e.k(iux.c);
                    iuv.this.e.m(iux.d);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ iux a(Boolean bool, iuy iuy) {
        return new iux(bool.booleanValue(), iuy.d, iuy.e);
    }
}
