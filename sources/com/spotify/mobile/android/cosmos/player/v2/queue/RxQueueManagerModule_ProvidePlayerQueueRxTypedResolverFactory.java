package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.queue.RxQueueManagerModule.CC;

public final class RxQueueManagerModule_ProvidePlayerQueueRxTypedResolverFactory implements vua<gky<PlayerQueue>> {
    private final wlc<gkz> rxTypedResolverFactoryProvider;

    public RxQueueManagerModule_ProvidePlayerQueueRxTypedResolverFactory(wlc<gkz> wlc) {
        this.rxTypedResolverFactoryProvider = wlc;
    }

    public final gky<PlayerQueue> get() {
        return providePlayerQueueRxTypedResolver((gkz) this.rxTypedResolverFactoryProvider.get());
    }

    public static RxQueueManagerModule_ProvidePlayerQueueRxTypedResolverFactory create(wlc<gkz> wlc) {
        return new RxQueueManagerModule_ProvidePlayerQueueRxTypedResolverFactory(wlc);
    }

    public static gky<PlayerQueue> providePlayerQueueRxTypedResolver(gkz gkz) {
        return (gky) vuf.a(CC.providePlayerQueueRxTypedResolver(gkz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
