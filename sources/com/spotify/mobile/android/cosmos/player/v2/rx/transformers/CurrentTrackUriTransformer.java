package com.spotify.mobile.android.cosmos.player.v2.rx.transformers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

final class CurrentTrackUriTransformer implements FlowableTransformer<PlayerState, String> {
    CurrentTrackUriTransformer() {
    }

    public final wrf<String> apply(Flowable<PlayerState> flowable) {
        return flowable.a((Predicate<? super T>) $$Lambda$CurrentTrackUriTransformer$gkV7ESb9JqQVQIWleGRRFenDzU.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg.INSTANCE).a(Functions.a());
    }

    static /* synthetic */ boolean lambda$apply$0(PlayerState playerState) {
        return playerState.track() != null;
    }
}
