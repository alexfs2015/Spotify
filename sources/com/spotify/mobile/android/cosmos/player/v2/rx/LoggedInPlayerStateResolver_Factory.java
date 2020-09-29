package com.spotify.mobile.android.cosmos.player.v2.rx;

import io.reactivex.Observable;

public final class LoggedInPlayerStateResolver_Factory implements vua<LoggedInPlayerStateResolver> {
    private final wlc<CosmosPlayerStateResolver> cosmosPlayerStateResolverProvider;
    private final wlc<Observable<Boolean>> loggedInProvider;

    public LoggedInPlayerStateResolver_Factory(wlc<Observable<Boolean>> wlc, wlc<CosmosPlayerStateResolver> wlc2) {
        this.loggedInProvider = wlc;
        this.cosmosPlayerStateResolverProvider = wlc2;
    }

    public final LoggedInPlayerStateResolver get() {
        return new LoggedInPlayerStateResolver((Observable) this.loggedInProvider.get(), (CosmosPlayerStateResolver) this.cosmosPlayerStateResolverProvider.get());
    }

    public static LoggedInPlayerStateResolver_Factory create(wlc<Observable<Boolean>> wlc, wlc<CosmosPlayerStateResolver> wlc2) {
        return new LoggedInPlayerStateResolver_Factory(wlc, wlc2);
    }

    public static LoggedInPlayerStateResolver newInstance(Observable<Boolean> observable, CosmosPlayerStateResolver cosmosPlayerStateResolver) {
        return new LoggedInPlayerStateResolver(observable, cosmosPlayerStateResolver);
    }
}
