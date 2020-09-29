package com.spotify.mobile.android.cosmos.player.v2.rx;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

public final class CosmosPlayerStateResolver_Factory implements vua<CosmosPlayerStateResolver> {
    private final wlc<Scheduler> computationSchedulerProvider;
    private final wlc<ObjectMapper> mapperProvider;
    private final wlc<RxResolver> rxResolverProvider;

    public CosmosPlayerStateResolver_Factory(wlc<RxResolver> wlc, wlc<ObjectMapper> wlc2, wlc<Scheduler> wlc3) {
        this.rxResolverProvider = wlc;
        this.mapperProvider = wlc2;
        this.computationSchedulerProvider = wlc3;
    }

    public final CosmosPlayerStateResolver get() {
        return new CosmosPlayerStateResolver((RxResolver) this.rxResolverProvider.get(), (ObjectMapper) this.mapperProvider.get(), (Scheduler) this.computationSchedulerProvider.get());
    }

    public static CosmosPlayerStateResolver_Factory create(wlc<RxResolver> wlc, wlc<ObjectMapper> wlc2, wlc<Scheduler> wlc3) {
        return new CosmosPlayerStateResolver_Factory(wlc, wlc2, wlc3);
    }

    public static CosmosPlayerStateResolver newInstance(RxResolver rxResolver, ObjectMapper objectMapper, Scheduler scheduler) {
        return new CosmosPlayerStateResolver(rxResolver, objectMapper, scheduler);
    }
}
