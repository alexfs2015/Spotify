package com.spotify.cosmos.android.util;

import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.ResolveCallback;

public interface CosmosRequestInterceptor {
    public static final CosmosRequestInterceptor NO_OP = new CosmosRequestInterceptor() {
        public final void destroy() {
        }

        public final Lifetime resolve(Request request, ResolveCallback resolveCallback) {
            return Lifetime.UNRESOLVED;
        }
    };

    void destroy();

    Lifetime resolve(Request request, ResolveCallback resolveCallback);
}
