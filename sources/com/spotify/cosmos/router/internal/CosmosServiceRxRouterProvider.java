package com.spotify.cosmos.router.internal;

import androidx.lifecycle.Lifecycle;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;

public class CosmosServiceRxRouterProvider implements RxRouterProvider {
    private final CosmosServiceRxRouterFactory mRouterFactory;

    public CosmosServiceRxRouterProvider(CosmosServiceRxRouterFactory cosmosServiceRxRouterFactory) {
        this.mRouterFactory = cosmosServiceRxRouterFactory;
    }

    public RxRouter provideWithLifecycle(Lifecycle lifecycle) {
        CosmosServiceRxRouter create = this.mRouterFactory.create();
        lifecycle.a(new RouterLifecycleObserver(create));
        return create;
    }
}
