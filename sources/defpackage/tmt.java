package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import java.util.concurrent.TimeUnit;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: tmt reason: default package */
public final class tmt {
    private final Flowable<PlayerState> a;

    /* access modifiers changed from: private */
    public static /* synthetic */ PlayerState a(PlayerState playerState, Long l) {
        return playerState;
    }

    public tmt(Flowable<PlayerState> flowable) {
        this.a = flowable;
    }

    public final wud<PlayerState> a(wug wug) {
        return vun.a((ObservableSource<T>) this.a.j(), BackpressureStrategy.BUFFER).i(new $$Lambda$tmt$mvtgiZVl3xjyDwH4RCXradBRkXU(wug));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wud a(wug wug, PlayerState playerState) {
        if (a(playerState)) {
            return wud.a((wud<? extends T1>) ScalarSynchronousObservable.d(playerState), wud.a(0, 15, TimeUnit.SECONDS, wug), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$tmt$CQd7C_uvS_jsHdouaaUZAsTA9JU.INSTANCE);
        }
        return ScalarSynchronousObservable.d(playerState);
    }

    public static boolean a(PlayerState playerState) {
        return !playerState.isPaused() && playerState.isPlaying();
    }
}
