package com.spotify.mobile.android.cosmos.player.v2.rx.transformers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

final class IsPlayingTransformer implements FlowableTransformer<PlayerState, Boolean> {
    IsPlayingTransformer() {
    }

    static /* synthetic */ Boolean lambda$apply$0(PlayerState playerState) {
        return Boolean.valueOf(playerState.isPlaying() && !playerState.isPaused());
    }

    public final xfk<Boolean> apply(Flowable<PlayerState> flowable) {
        return flowable.c((Function<? super T, ? extends R>) $$Lambda$IsPlayingTransformer$0Z5DnIDONExDjOPCaF5KXLEYgcs.INSTANCE).a(Functions.a());
    }
}
