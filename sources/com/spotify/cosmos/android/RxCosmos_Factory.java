package com.spotify.cosmos.android;

public final class RxCosmos_Factory implements vua<RxCosmos> {
    private final wlc<vhw> bindServiceObservableProvider;
    private final wlc<CosmosServiceIntentBuilder> cosmosServiceIntentBuilderProvider;

    public RxCosmos_Factory(wlc<vhw> wlc, wlc<CosmosServiceIntentBuilder> wlc2) {
        this.bindServiceObservableProvider = wlc;
        this.cosmosServiceIntentBuilderProvider = wlc2;
    }

    public final RxCosmos get() {
        return new RxCosmos((vhw) this.bindServiceObservableProvider.get(), (CosmosServiceIntentBuilder) this.cosmosServiceIntentBuilderProvider.get());
    }

    public static RxCosmos_Factory create(wlc<vhw> wlc, wlc<CosmosServiceIntentBuilder> wlc2) {
        return new RxCosmos_Factory(wlc, wlc2);
    }

    public static RxCosmos newInstance(vhw vhw, CosmosServiceIntentBuilder cosmosServiceIntentBuilder) {
        return new RxCosmos(vhw, cosmosServiceIntentBuilder);
    }
}
