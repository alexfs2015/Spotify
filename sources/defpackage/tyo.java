package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import java.util.concurrent.TimeUnit;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: tyo reason: default package */
public final class tyo {
    private final Flowable<PlayerState> a;

    public tyo(Flowable<PlayerState> flowable) {
        this.a = flowable;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PlayerState a(PlayerState playerState, Long l) {
        return playerState;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii a(xil xil, PlayerState playerState) {
        return a(playerState) ? xii.a((xii<? extends T1>) ScalarSynchronousObservable.d(playerState), xii.a(0, 15, TimeUnit.SECONDS, xil), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$tyo$q63zmMLTd5wTsHQ_xHWsflxdfSs.INSTANCE) : ScalarSynchronousObservable.d(playerState);
    }

    public static boolean a(PlayerState playerState) {
        return !playerState.isPaused() && playerState.isPlaying();
    }

    public final xii<PlayerState> a(xil xil) {
        return wit.a((ObservableSource<T>) this.a.j(), BackpressureStrategy.BUFFER).h(new $$Lambda$tyo$cwOpPuqvuYejUMJwd706R7kDlWM(xil));
    }
}
