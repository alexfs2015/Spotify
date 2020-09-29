package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;

public final class RxQueueManager_Factory implements wig<RxQueueManager> {
    private final wzi<ObjectMapper> objectMapperProvider;
    private final wzi<PlayerQueueUtil> playerQueueUtilProvider;
    private final wzi<RxResolver> rxResolverProvider;
    private final wzi<gmm<PlayerQueue>> rxTypedResolverProvider;

    public RxQueueManager_Factory(wzi<RxResolver> wzi, wzi<gmm<PlayerQueue>> wzi2, wzi<ObjectMapper> wzi3, wzi<PlayerQueueUtil> wzi4) {
        this.rxResolverProvider = wzi;
        this.rxTypedResolverProvider = wzi2;
        this.objectMapperProvider = wzi3;
        this.playerQueueUtilProvider = wzi4;
    }

    public static RxQueueManager_Factory create(wzi<RxResolver> wzi, wzi<gmm<PlayerQueue>> wzi2, wzi<ObjectMapper> wzi3, wzi<PlayerQueueUtil> wzi4) {
        return new RxQueueManager_Factory(wzi, wzi2, wzi3, wzi4);
    }

    public static RxQueueManager newInstance(RxResolver rxResolver, gmm<PlayerQueue> gmm, ObjectMapper objectMapper, PlayerQueueUtil playerQueueUtil) {
        return new RxQueueManager(rxResolver, gmm, objectMapper, playerQueueUtil);
    }

    public final RxQueueManager get() {
        return new RxQueueManager((RxResolver) this.rxResolverProvider.get(), (gmm) this.rxTypedResolverProvider.get(), (ObjectMapper) this.objectMapperProvider.get(), (PlayerQueueUtil) this.playerQueueUtilProvider.get());
    }
}
