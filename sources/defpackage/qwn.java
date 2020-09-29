package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: qwn reason: default package */
public final class qwn {
    public static kjm<qwj> a(qst qst, lkn lkn, qwd qwd, Flowable<PlayerState> flowable, jug jug, qxt qxt, Scheduler scheduler) {
        Optional delegate = qwd.getDelegate();
        if (delegate.b()) {
            return kla.a(a(qst, scheduler), a(lkn, scheduler), a(jug, scheduler), a(qxt, scheduler), a(flowable, scheduler), a((uqp) delegate.c(), scheduler), b((uqp) delegate.c(), scheduler));
        }
        return kla.a(a(qst, scheduler), a(lkn, scheduler), a(jug, scheduler), a(qxt, scheduler), a(flowable, scheduler));
    }

    private static Observable<qwj> a(lkn lkn, Scheduler scheduler) {
        return vun.b(lkn.a()).c((Function<? super T, ? extends R>) $$Lambda$62gqz7vR4eV__wU6cKL_jViIJjM.INSTANCE).a(scheduler);
    }

    private static Observable<qwj> a(qxt qxt, Scheduler scheduler) {
        return qxt.a().a(Functions.a()).a(scheduler).c((Function<? super T, ? extends R>) $$Lambda$CzIKQXzO311gqDBv7lRqKj0KcRI.INSTANCE);
    }

    private static Observable<qwj> a(uqp uqp, Scheduler scheduler) {
        return uqp.a().a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$hZJ6VNz7eT448yb4JNHu_HuQng.INSTANCE).a(scheduler);
    }

    private static Observable<qwj> b(uqp uqp, Scheduler scheduler) {
        return uqp.a().c((Function<? super T, ? extends R>) $$Lambda$4v9MUPgYVohJ_aVeO0Sh10CJrqA.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$lkNlPZAhtkI61plc4_DMwjGYZNk.INSTANCE).a(scheduler);
    }

    private static Observable<qwj> a(Flowable<PlayerState> flowable, Scheduler scheduler) {
        return flowable.j().c((Function<? super T, ? extends R>) $$Lambda$qwn$CKjWNR3kAIxoULkZRKISmGvSZG8.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$QcTTYeC3m9JP1oJ82wSodZxQqA.INSTANCE).a(scheduler);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qwl a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (track == null) {
            return new a();
        }
        String uri = track.uri();
        String uid = track.uid();
        String contextUri = playerState.contextUri();
        return playerState.isPaused() ? new b(uri, uid, contextUri) : new c(uri, uid, contextUri);
    }

    private static Observable<qwj> a(qst qst, Scheduler scheduler) {
        return qst.a.a(scheduler);
    }

    private static Observable<qwj> a(jug jug, Scheduler scheduler) {
        return jug.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a()).a(scheduler).c((Function<? super T, ? extends R>) $$Lambda$4IyklceCYwVCUGVQTOsYoeLu15c.INSTANCE);
    }
}
