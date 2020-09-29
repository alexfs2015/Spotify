package com.spotify.mobile.android.cosmos.player.v2.rx.transformers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

final class TrackPositionTransformer implements FlowableTransformer<PlayerState, Long> {
    private final long mIntervalMs;
    private final Scheduler mScheduler;

    TrackPositionTransformer(long j, Scheduler scheduler) {
        this.mIntervalMs = j;
        this.mScheduler = scheduler;
    }

    static /* synthetic */ PlayerState lambda$null$0(PlayerState playerState, Long l) {
        return playerState;
    }

    public final xfk<Long> apply(Flowable<PlayerState> flowable) {
        return flowable.e(new Function() {
            public final Object apply(Object obj) {
                return TrackPositionTransformer.this.lambda$apply$1$TrackPositionTransformer((PlayerState) obj);
            }
        });
    }

    public /* synthetic */ xfk lambda$apply$1$TrackPositionTransformer(PlayerState playerState) {
        return (playerState.isPaused() || !playerState.isPlaying()) ? Flowable.b(Long.valueOf(playerState.currentPlaybackPosition())) : Flowable.a((xfk<? extends T1>) Flowable.b(playerState), (xfk<? extends T2>) Flowable.a(this.mIntervalMs, TimeUnit.MILLISECONDS, this.mScheduler), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$TrackPositionTransformer$18CIxiibptD4Lk9W_hXu7NIEGcs.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$fWytPUTL3ZEQpN26Ur_94PQjCXI.INSTANCE);
    }
}
