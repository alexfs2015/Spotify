package com.spotify.cosmos.android.di;

import com.spotify.cosmos.android.di.RxRouterActivityModule.CC;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;

public final class RxRouterActivityModule_ProvideRouterFactory implements vua<RxRouter> {
    private final wlc<ka> activityProvider;
    private final wlc<RxRouterProvider> providerProvider;

    public RxRouterActivityModule_ProvideRouterFactory(wlc<RxRouterProvider> wlc, wlc<ka> wlc2) {
        this.providerProvider = wlc;
        this.activityProvider = wlc2;
    }

    public final RxRouter get() {
        return provideRouter((RxRouterProvider) this.providerProvider.get(), (ka) this.activityProvider.get());
    }

    public static RxRouterActivityModule_ProvideRouterFactory create(wlc<RxRouterProvider> wlc, wlc<ka> wlc2) {
        return new RxRouterActivityModule_ProvideRouterFactory(wlc, wlc2);
    }

    public static RxRouter provideRouter(RxRouterProvider rxRouterProvider, ka kaVar) {
        return (RxRouter) vuf.a(CC.provideRouter(rxRouterProvider, kaVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
