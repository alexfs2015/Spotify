package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;

/* renamed from: ggc reason: default package */
public final class ggc {
    private final Flowable<PlayerState> a;
    private final hec b;

    public ggc(Flowable<PlayerState> flowable, hec hec) {
        this.a = flowable;
        this.b = hec;
    }

    public final Observable<ggo> a() {
        return Observable.a((ObservableSource<? extends T1>) this.a.j(), (ObservableSource<? extends T2>) this.b.a(ggf.a).j(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$ggc$9wvB0nCmineA91p2pRhRPwOCBU.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static ggo a(PlayerState playerState, RolloutFlag rolloutFlag) {
        return new c(playerState.isPlaying(), playerState.isPaused(), rolloutFlag);
    }
}
