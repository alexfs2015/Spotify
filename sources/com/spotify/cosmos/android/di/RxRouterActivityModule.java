package com.spotify.cosmos.android.di;

import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;

public interface RxRouterActivityModule {

    /* renamed from: com.spotify.cosmos.android.di.RxRouterActivityModule$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static RxRouter provideRouter(RxRouterProvider rxRouterProvider, kf kfVar) {
            return rxRouterProvider.provideWithLifecycle(kfVar.a);
        }
    }
}
