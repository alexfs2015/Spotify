package com.spotify.cosmos.android;

import android.content.Context;
import android.os.IBinder;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

public class RxCosmos {
    private final vvb mBindServiceObservable;
    private final CosmosServiceIntentBuilder mCosmosServiceIntentBuilder;

    public RxCosmos(vvb vvb, CosmosServiceIntentBuilder cosmosServiceIntentBuilder) {
        this.mBindServiceObservable = vvb;
        this.mCosmosServiceIntentBuilder = cosmosServiceIntentBuilder;
    }

    static /* synthetic */ RemoteNativeRouter lambda$getRouter$0(IBinder iBinder) {
        return (RemoteNativeRouter) iBinder;
    }

    public Observable<RemoteNativeRouter> getRouter(Context context, Scheduler scheduler) {
        return this.mBindServiceObservable.a(this.mCosmosServiceIntentBuilder.createCosmosServiceIntent(context).setAction(Cosmos.ACTION_COSMOS_PROXY), RxCosmos.class.getSimpleName()).c((Function<? super T, ? extends R>) $$Lambda$RxCosmos$uDuHCmAH93VewHo0UGXcZI8WQ1w.INSTANCE).b(scheduler).a(1).a();
    }
}
