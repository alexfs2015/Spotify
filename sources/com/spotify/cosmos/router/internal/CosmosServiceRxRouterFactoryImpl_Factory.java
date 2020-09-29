package com.spotify.cosmos.router.internal;

import android.content.Context;
import com.spotify.cosmos.android.CosmosServiceIntentBuilder;

public final class CosmosServiceRxRouterFactoryImpl_Factory implements vua<CosmosServiceRxRouterFactoryImpl> {
    private final wlc<Context> arg0Provider;
    private final wlc<CosmosServiceIntentBuilder> arg1Provider;

    public CosmosServiceRxRouterFactoryImpl_Factory(wlc<Context> wlc, wlc<CosmosServiceIntentBuilder> wlc2) {
        this.arg0Provider = wlc;
        this.arg1Provider = wlc2;
    }

    public final CosmosServiceRxRouterFactoryImpl get() {
        return new CosmosServiceRxRouterFactoryImpl((Context) this.arg0Provider.get(), (CosmosServiceIntentBuilder) this.arg1Provider.get());
    }

    public static CosmosServiceRxRouterFactoryImpl_Factory create(wlc<Context> wlc, wlc<CosmosServiceIntentBuilder> wlc2) {
        return new CosmosServiceRxRouterFactoryImpl_Factory(wlc, wlc2);
    }

    public static CosmosServiceRxRouterFactoryImpl newInstance(Context context, CosmosServiceIntentBuilder cosmosServiceIntentBuilder) {
        return new CosmosServiceRxRouterFactoryImpl(context, cosmosServiceIntentBuilder);
    }
}
