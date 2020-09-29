package com.spotify.mobile.android.cosmos.player.v2.rx.transformers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

final class CurrentTrackTransformer implements FlowableTransformer<PlayerState, PlayerTrack> {
    CurrentTrackTransformer() {
    }

    public final wrf<PlayerTrack> apply(Flowable<PlayerState> flowable) {
        return flowable.a((Predicate<? super T>) $$Lambda$CurrentTrackTransformer$6wQ1iw1lJpqDQK1p8vumf1HWTs.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE).a(Functions.a());
    }

    static /* synthetic */ boolean lambda$apply$0(PlayerState playerState) {
        return playerState.track() != null;
    }
}
