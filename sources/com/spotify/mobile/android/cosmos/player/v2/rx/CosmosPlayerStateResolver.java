package com.spotify.mobile.android.cosmos.player.v2.rx;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import java.util.Locale;

public class CosmosPlayerStateResolver implements PlayerStateResolver {
    private static final String PLAYER_URI = "sp://player/v2/main";
    private final Scheduler mComputationScheduler;
    private final ObjectMapper mObjectMapper;
    private final RxResolver mRxResolver;

    public CosmosPlayerStateResolver(RxResolver rxResolver, ObjectMapper objectMapper, Scheduler scheduler) {
        this.mRxResolver = rxResolver;
        this.mObjectMapper = objectMapper;
        this.mComputationScheduler = scheduler;
    }

    public Observable<PlayerState> createPlayerStateObservable(String str, int i, int i2) {
        return this.mRxResolver.resolve(new Request(str, String.format(Locale.US, "sp://player/v2/main?reverse_cap=%d&future_cap=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}))).a(this.mComputationScheduler).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(PlayerState.class, this.mObjectMapper, this.mComputationScheduler));
    }
}
