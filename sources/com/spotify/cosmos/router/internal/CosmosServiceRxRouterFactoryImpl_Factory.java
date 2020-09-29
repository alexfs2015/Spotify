package com.spotify.cosmos.router.internal;

import android.content.Context;
import com.spotify.cosmos.android.CosmosServiceIntentBuilder;

public final class CosmosServiceRxRouterFactoryImpl_Factory implements wig<CosmosServiceRxRouterFactoryImpl> {
    private final wzi<Context> arg0Provider;
    private final wzi<CosmosServiceIntentBuilder> arg1Provider;

    public CosmosServiceRxRouterFactoryImpl_Factory(wzi<Context> wzi, wzi<CosmosServiceIntentBuilder> wzi2) {
        this.arg0Provider = wzi;
        this.arg1Provider = wzi2;
    }

    public static CosmosServiceRxRouterFactoryImpl_Factory create(wzi<Context> wzi, wzi<CosmosServiceIntentBuilder> wzi2) {
        return new CosmosServiceRxRouterFactoryImpl_Factory(wzi, wzi2);
    }

    public static CosmosServiceRxRouterFactoryImpl newInstance(Context context, CosmosServiceIntentBuilder cosmosServiceIntentBuilder) {
        return new CosmosServiceRxRouterFactoryImpl(context, cosmosServiceIntentBuilder);
    }

    public final CosmosServiceRxRouterFactoryImpl get() {
        return new CosmosServiceRxRouterFactoryImpl((Context) this.arg0Provider.get(), (CosmosServiceIntentBuilder) this.arg1Provider.get());
    }
}
