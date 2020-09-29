package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;

public final class RxQueueManager_Factory implements vua<RxQueueManager> {
    private final wlc<ObjectMapper> objectMapperProvider;
    private final wlc<PlayerQueueUtil> playerQueueUtilProvider;
    private final wlc<RxResolver> rxResolverProvider;
    private final wlc<gky<PlayerQueue>> rxTypedResolverProvider;

    public RxQueueManager_Factory(wlc<RxResolver> wlc, wlc<gky<PlayerQueue>> wlc2, wlc<ObjectMapper> wlc3, wlc<PlayerQueueUtil> wlc4) {
        this.rxResolverProvider = wlc;
        this.rxTypedResolverProvider = wlc2;
        this.objectMapperProvider = wlc3;
        this.playerQueueUtilProvider = wlc4;
    }

    public final RxQueueManager get() {
        return new RxQueueManager((RxResolver) this.rxResolverProvider.get(), (gky) this.rxTypedResolverProvider.get(), (ObjectMapper) this.objectMapperProvider.get(), (PlayerQueueUtil) this.playerQueueUtilProvider.get());
    }

    public static RxQueueManager_Factory create(wlc<RxResolver> wlc, wlc<gky<PlayerQueue>> wlc2, wlc<ObjectMapper> wlc3, wlc<PlayerQueueUtil> wlc4) {
        return new RxQueueManager_Factory(wlc, wlc2, wlc3, wlc4);
    }

    public static RxQueueManager newInstance(RxResolver rxResolver, gky<PlayerQueue> gky, ObjectMapper objectMapper, PlayerQueueUtil playerQueueUtil) {
        return new RxQueueManager(rxResolver, gky, objectMapper, playerQueueUtil);
    }
}
