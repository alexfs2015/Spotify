package com.spotify.cosmos.android.di;

import androidx.fragment.app.Fragment;
import com.spotify.cosmos.android.di.RxRouterFragmentModule.CC;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;

public final class RxRouterFragmentModule_ProvideRouterFactory implements vua<RxRouter> {
    private final wlc<Fragment> fragmentProvider;
    private final wlc<RxRouterProvider> providerProvider;

    public RxRouterFragmentModule_ProvideRouterFactory(wlc<RxRouterProvider> wlc, wlc<Fragment> wlc2) {
        this.providerProvider = wlc;
        this.fragmentProvider = wlc2;
    }

    public final RxRouter get() {
        return provideRouter((RxRouterProvider) this.providerProvider.get(), (Fragment) this.fragmentProvider.get());
    }

    public static RxRouterFragmentModule_ProvideRouterFactory create(wlc<RxRouterProvider> wlc, wlc<Fragment> wlc2) {
        return new RxRouterFragmentModule_ProvideRouterFactory(wlc, wlc2);
    }

    public static RxRouter provideRouter(RxRouterProvider rxRouterProvider, Fragment fragment) {
        return (RxRouter) vuf.a(CC.provideRouter(rxRouterProvider, fragment), "Cannot return null from a non-@Nullable @Provides method");
    }
}
