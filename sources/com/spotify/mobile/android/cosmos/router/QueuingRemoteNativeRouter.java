package com.spotify.mobile.android.cosmos.router;

import com.spotify.cosmos.android.RemoteNativeRouter;
import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.ResolveCallback;
import com.spotify.cosmos.router.Router;

public class QueuingRemoteNativeRouter extends RemoteNativeRouter {
    static final String SP_ORBIT_SESSION_STATE_URI = "sp://orbitsession/v1/state";
    static final String SP_SESSION_V1_URI = "sp://session/v1";
    Lifetime mLifetime;
    private final QueuingResolveCallback mQueuingResolveCallback;

    public QueuingRemoteNativeRouter() {
        this.mLifetime = Lifetime.UNRESOLVED;
        this.mQueuingResolveCallback = new QueuingResolveCallback(getNativeRouter());
    }

    public QueuingRemoteNativeRouter(Router router) {
        this(router, new QueuingResolveCallback(router));
    }

    public QueuingRemoteNativeRouter(Router router, QueuingResolveCallback queuingResolveCallback) {
        super(router);
        this.mLifetime = Lifetime.UNRESOLVED;
        this.mQueuingResolveCallback = queuingResolveCallback;
    }

    private static boolean shouldQueueRequest(Request request) {
        String str = "o/st:seo/es1isstpbnti/vr/s";
        return !SP_ORBIT_SESSION_STATE_URI.equals(request.getUri()) && !request.getUri().startsWith(SP_SESSION_V1_URI);
    }

    public void destroy() {
        super.destroy();
        this.mLifetime.destroy();
        this.mQueuingResolveCallback.destroy();
    }

    public void onNativeRouterInitialized() {
        this.mLifetime = super.performNativeResolve(new Request(Request.SUB, SP_SESSION_V1_URI), this.mQueuingResolveCallback);
    }

    public Lifetime performNativeResolve(Request request, ResolveCallback resolveCallback) {
        if (!this.mQueuingResolveCallback.isCosmosReady()) {
            if (shouldQueueRequest(request)) {
                return this.mQueuingResolveCallback.queue(request, resolveCallback);
            }
        }
        return super.performNativeResolve(request, resolveCallback);
    }
}