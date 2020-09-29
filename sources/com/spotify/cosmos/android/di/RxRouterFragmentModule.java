package com.spotify.cosmos.android.di;

import androidx.fragment.app.Fragment;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;

public interface RxRouterFragmentModule {

    /* renamed from: com.spotify.cosmos.android.di.RxRouterFragmentModule$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static RxRouter provideRouter(RxRouterProvider rxRouterProvider, Fragment fragment) {
            return rxRouterProvider.provideWithLifecycle(fragment.Q);
        }
    }
}
