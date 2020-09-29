package com.spotify.cosmos.router.internal;

import android.content.Context;
import com.spotify.cosmos.android.CosmosServiceIntentBuilder;

public class CosmosServiceRxRouterFactoryImpl implements CosmosServiceRxRouterFactory {
    private final Context mApplicationContext;
    private final CosmosServiceIntentBuilder mCosmosServiceIntentBuilder;

    CosmosServiceRxRouterFactoryImpl(Context context, CosmosServiceIntentBuilder cosmosServiceIntentBuilder) {
        this.mApplicationContext = context.getApplicationContext();
        this.mCosmosServiceIntentBuilder = cosmosServiceIntentBuilder;
    }

    public CosmosServiceRxRouter create() {
        return new CosmosServiceRxRouter(new CosmosServiceRxRouterClient(this.mApplicationContext, this.mCosmosServiceIntentBuilder));
    }
}
