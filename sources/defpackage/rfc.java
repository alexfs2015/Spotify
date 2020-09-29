package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: rfc reason: default package */
public final class rfc {
    private static Observable<rey> a(Flowable<PlayerState> flowable, Scheduler scheduler) {
        return flowable.j().c((Function<? super T, ? extends R>) $$Lambda$rfc$BM4QRfvGmBvyHKPZyY_Ba55BrLw.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$HDv8XNI8rp6r2hqkk3ian5YXaOs.INSTANCE).a(scheduler);
    }

    private static Observable<rey> a(jwo jwo, Scheduler scheduler) {
        return jwo.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a()).a(scheduler).c((Function<? super T, ? extends R>) $$Lambda$JpsuEpjRLrLeFFt0YWAEwTeSDs.INSTANCE);
    }

    private static Observable<rey> a(lon lon, Scheduler scheduler) {
        return wit.b(lon.a()).c((Function<? super T, ? extends R>) $$Lambda$H18EaSk8PyBdkFiwgSirxLd_TQ.INSTANCE).a(scheduler);
    }

    private static Observable<rey> a(rbi rbi, Scheduler scheduler) {
        return rbi.a.a(scheduler);
    }

    private static Observable<rey> a(rgi rgi, Scheduler scheduler) {
        return rgi.a().a(Functions.a()).a(scheduler).c((Function<? super T, ? extends R>) $$Lambda$qB82NW_7z4DjqNhKvBb7Fll3oXA.INSTANCE);
    }

    private static Observable<rey> a(vbu vbu, Scheduler scheduler) {
        return vbu.a().a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$1eNz4chbVMfxpvwGR2HoRug8LAA.INSTANCE).a(scheduler);
    }

    public static kmv<rey> a(rbi rbi, lon lon, res res, Flowable<PlayerState> flowable, jwo jwo, rgi rgi, Scheduler scheduler) {
        Optional delegate = res.getDelegate();
        if (delegate.b()) {
            return koj.a(a(rbi, scheduler), a(lon, scheduler), a(jwo, scheduler), a(rgi, scheduler), a(flowable, scheduler), a((vbu) delegate.c(), scheduler), b((vbu) delegate.c(), scheduler));
        }
        return koj.a(a(rbi, scheduler), a(lon, scheduler), a(jwo, scheduler), a(rgi, scheduler), a(flowable, scheduler));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rfa a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (track == null) {
            return new a();
        }
        String uri = track.uri();
        String uid = track.uid();
        String contextUri = playerState.contextUri();
        return playerState.isPaused() ? new b(uri, uid, contextUri) : new c(uri, uid, contextUri);
    }

    private static Observable<rey> b(vbu vbu, Scheduler scheduler) {
        return vbu.a().c((Function<? super T, ? extends R>) $$Lambda$VPVZYguxHhnFa8WdKmjDYF2FU.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$lH4Xt4f7qM1_azcGluLOK54wds.INSTANCE).a(scheduler);
    }
}
