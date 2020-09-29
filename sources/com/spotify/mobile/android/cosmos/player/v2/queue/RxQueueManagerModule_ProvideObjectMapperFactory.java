package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.queue.RxQueueManagerModule.CC;

public final class RxQueueManagerModule_ProvideObjectMapperFactory implements vua<ObjectMapper> {
    private final wlc<rnf> objectMapperFactoryProvider;

    public RxQueueManagerModule_ProvideObjectMapperFactory(wlc<rnf> wlc) {
        this.objectMapperFactoryProvider = wlc;
    }

    public final ObjectMapper get() {
        return provideObjectMapper((rnf) this.objectMapperFactoryProvider.get());
    }

    public static RxQueueManagerModule_ProvideObjectMapperFactory create(wlc<rnf> wlc) {
        return new RxQueueManagerModule_ProvideObjectMapperFactory(wlc);
    }

    public static ObjectMapper provideObjectMapper(rnf rnf) {
        return (ObjectMapper) vuf.a(CC.provideObjectMapper(rnf), "Cannot return null from a non-@Nullable @Provides method");
    }
}
