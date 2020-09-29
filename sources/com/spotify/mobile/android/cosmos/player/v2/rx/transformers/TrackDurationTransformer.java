package com.spotify.mobile.android.cosmos.player.v2.rx.transformers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

final class TrackDurationTransformer implements FlowableTransformer<PlayerState, Long> {
    TrackDurationTransformer() {
    }

    public final wrf<Long> apply(Flowable<PlayerState> flowable) {
        return flowable.c((Function<? super T, ? extends R>) $$Lambda$06CtyGbt81wsuPMxY118P0IZ4k8.INSTANCE).a((Predicate<? super T>) $$Lambda$TrackDurationTransformer$J_PkyJtUErfvzvFfiWrxL0SHzAo.INSTANCE).a(Functions.a());
    }

    static /* synthetic */ boolean lambda$apply$0(Long l) {
        return l.longValue() != -1;
    }
}
