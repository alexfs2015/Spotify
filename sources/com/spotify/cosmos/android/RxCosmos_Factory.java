package com.spotify.cosmos.android;

public final class RxCosmos_Factory implements wig<RxCosmos> {
    private final wzi<vvb> bindServiceObservableProvider;
    private final wzi<CosmosServiceIntentBuilder> cosmosServiceIntentBuilderProvider;

    public RxCosmos_Factory(wzi<vvb> wzi, wzi<CosmosServiceIntentBuilder> wzi2) {
        this.bindServiceObservableProvider = wzi;
        this.cosmosServiceIntentBuilderProvider = wzi2;
    }

    public static RxCosmos_Factory create(wzi<vvb> wzi, wzi<CosmosServiceIntentBuilder> wzi2) {
        return new RxCosmos_Factory(wzi, wzi2);
    }

    public static RxCosmos newInstance(vvb vvb, CosmosServiceIntentBuilder cosmosServiceIntentBuilder) {
        return new RxCosmos(vvb, cosmosServiceIntentBuilder);
    }

    public final RxCosmos get() {
        return new RxCosmos((vvb) this.bindServiceObservableProvider.get(), (CosmosServiceIntentBuilder) this.cosmosServiceIntentBuilderProvider.get());
    }
}
