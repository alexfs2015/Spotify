package com.spotify.cosmos.android.di;

import androidx.fragment.app.Fragment;
import com.spotify.cosmos.android.di.RxRouterFragmentModule.CC;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;

public final class RxRouterFragmentModule_ProvideRouterFactory implements wig<RxRouter> {
    private final wzi<Fragment> fragmentProvider;
    private final wzi<RxRouterProvider> providerProvider;

    public RxRouterFragmentModule_ProvideRouterFactory(wzi<RxRouterProvider> wzi, wzi<Fragment> wzi2) {
        this.providerProvider = wzi;
        this.fragmentProvider = wzi2;
    }

    public static RxRouterFragmentModule_ProvideRouterFactory create(wzi<RxRouterProvider> wzi, wzi<Fragment> wzi2) {
        return new RxRouterFragmentModule_ProvideRouterFactory(wzi, wzi2);
    }

    public static RxRouter provideRouter(RxRouterProvider rxRouterProvider, Fragment fragment) {
        return (RxRouter) wil.a(CC.provideRouter(rxRouterProvider, fragment), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final RxRouter get() {
        return provideRouter((RxRouterProvider) this.providerProvider.get(), (Fragment) this.fragmentProvider.get());
    }
}
