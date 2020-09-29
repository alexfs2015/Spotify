package com.spotify.cosmos.router.internal;

public final class CosmosServiceRxRouterProvider_Factory implements vua<CosmosServiceRxRouterProvider> {
    private final wlc<CosmosServiceRxRouterFactory> factoryProvider;

    public CosmosServiceRxRouterProvider_Factory(wlc<CosmosServiceRxRouterFactory> wlc) {
        this.factoryProvider = wlc;
    }

    public final CosmosServiceRxRouterProvider get() {
        return new CosmosServiceRxRouterProvider((CosmosServiceRxRouterFactory) this.factoryProvider.get());
    }

    public static CosmosServiceRxRouterProvider_Factory create(wlc<CosmosServiceRxRouterFactory> wlc) {
        return new CosmosServiceRxRouterProvider_Factory(wlc);
    }

    public static CosmosServiceRxRouterProvider newInstance(CosmosServiceRxRouterFactory cosmosServiceRxRouterFactory) {
        return new CosmosServiceRxRouterProvider(cosmosServiceRxRouterFactory);
    }
}
