package com.spotify.cosmos.android.di;

import com.spotify.cosmos.android.di.RxRouterActivityModule.CC;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;

public final class RxRouterActivityModule_ProvideRouterFactory implements wig<RxRouter> {
    private final wzi<kf> activityProvider;
    private final wzi<RxRouterProvider> providerProvider;

    public RxRouterActivityModule_ProvideRouterFactory(wzi<RxRouterProvider> wzi, wzi<kf> wzi2) {
        this.providerProvider = wzi;
        this.activityProvider = wzi2;
    }

    public static RxRouterActivityModule_ProvideRouterFactory create(wzi<RxRouterProvider> wzi, wzi<kf> wzi2) {
        return new RxRouterActivityModule_ProvideRouterFactory(wzi, wzi2);
    }

    public static RxRouter provideRouter(RxRouterProvider rxRouterProvider, kf kfVar) {
        return (RxRouter) wil.a(CC.provideRouter(rxRouterProvider, kfVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final RxRouter get() {
        return provideRouter((RxRouterProvider) this.providerProvider.get(), (kf) this.activityProvider.get());
    }
}
