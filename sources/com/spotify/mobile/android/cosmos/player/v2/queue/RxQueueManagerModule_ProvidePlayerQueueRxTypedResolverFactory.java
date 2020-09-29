package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.queue.RxQueueManagerModule.CC;

public final class RxQueueManagerModule_ProvidePlayerQueueRxTypedResolverFactory implements wig<gmm<PlayerQueue>> {
    private final wzi<gmn> rxTypedResolverFactoryProvider;

    public RxQueueManagerModule_ProvidePlayerQueueRxTypedResolverFactory(wzi<gmn> wzi) {
        this.rxTypedResolverFactoryProvider = wzi;
    }

    public static RxQueueManagerModule_ProvidePlayerQueueRxTypedResolverFactory create(wzi<gmn> wzi) {
        return new RxQueueManagerModule_ProvidePlayerQueueRxTypedResolverFactory(wzi);
    }

    public static gmm<PlayerQueue> providePlayerQueueRxTypedResolver(gmn gmn) {
        String str = "eosnlCob u oNlilounmed@l anv-en n rmdthParo@slrfanrt  ut";
        return (gmm) wil.a(CC.providePlayerQueueRxTypedResolver(gmn), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final gmm<PlayerQueue> get() {
        return providePlayerQueueRxTypedResolver((gmn) this.rxTypedResolverFactoryProvider.get());
    }
}
