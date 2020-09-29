package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;

/* renamed from: ghn reason: default package */
public final class ghn {
    private final Flowable<PlayerState> a;
    private final hgy b;

    public ghn(Flowable<PlayerState> flowable, hgy hgy) {
        this.a = flowable;
        this.b = hgy;
    }

    /* access modifiers changed from: private */
    public static ghz a(PlayerState playerState, RolloutFlag rolloutFlag) {
        return new c(playerState.isPlaying(), playerState.isPaused(), rolloutFlag);
    }

    public final Observable<ghz> a() {
        return Observable.a((ObservableSource<? extends T1>) this.a.j(), (ObservableSource<? extends T2>) this.b.a(ghq.a).j(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$ghn$7W7l0fcDQ3x1GLVqqvLQKqXjxQ8.INSTANCE);
    }
}
