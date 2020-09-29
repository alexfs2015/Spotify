package com.spotify.cosmos.router.internal;

public final class CosmosServiceRxRouterProvider_Factory implements wig<CosmosServiceRxRouterProvider> {
    private final wzi<CosmosServiceRxRouterFactory> factoryProvider;

    public CosmosServiceRxRouterProvider_Factory(wzi<CosmosServiceRxRouterFactory> wzi) {
        this.factoryProvider = wzi;
    }

    public static CosmosServiceRxRouterProvider_Factory create(wzi<CosmosServiceRxRouterFactory> wzi) {
        return new CosmosServiceRxRouterProvider_Factory(wzi);
    }

    public static CosmosServiceRxRouterProvider newInstance(CosmosServiceRxRouterFactory cosmosServiceRxRouterFactory) {
        return new CosmosServiceRxRouterProvider(cosmosServiceRxRouterFactory);
    }

    public final CosmosServiceRxRouterProvider get() {
        return new CosmosServiceRxRouterProvider((CosmosServiceRxRouterFactory) this.factoryProvider.get());
    }
}
