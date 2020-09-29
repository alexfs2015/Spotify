package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.queue.RxQueueManagerModule.CC;

public final class RxQueueManagerModule_ProvideObjectMapperFactory implements wig<ObjectMapper> {
    private final wzi<rwl> objectMapperFactoryProvider;

    public RxQueueManagerModule_ProvideObjectMapperFactory(wzi<rwl> wzi) {
        this.objectMapperFactoryProvider = wzi;
    }

    public static RxQueueManagerModule_ProvideObjectMapperFactory create(wzi<rwl> wzi) {
        return new RxQueueManagerModule_ProvideObjectMapperFactory(wzi);
    }

    public static ObjectMapper provideObjectMapper(rwl rwl) {
        String str = "tNsnevo@ulond libmCfaPaua l  dnrs nlmlnhot-@er or nureeo";
        return (ObjectMapper) wil.a(CC.provideObjectMapper(rwl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final ObjectMapper get() {
        return provideObjectMapper((rwl) this.objectMapperFactoryProvider.get());
    }
}
