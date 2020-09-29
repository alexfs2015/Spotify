package com.spotify.mobile.android.cosmos.router;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.ResolveCallback;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.Router;
import com.spotify.mobile.android.util.Assertion;

public class QueuingResolveCallback implements ResolveCallback {
    private final CosmosRequestQueue mCosmosRequestQueue;
    protected boolean mIsCosmosReady;
    private final Router mRouter;

    public QueuingResolveCallback(Router router) {
        this(router, new CosmosRequestQueue());
    }

    protected QueuingResolveCallback(Router router, CosmosRequestQueue cosmosRequestQueue) {
        this.mRouter = (Router) fbp.a(router);
        this.mCosmosRequestQueue = (CosmosRequestQueue) fbp.a(cosmosRequestQueue);
    }

    private static boolean parseResponseForReadiness(Response response) {
        if (response.getStatus() != 200) {
            return false;
        }
        Logger.b("Got cosmos session", new Object[0]);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void destroy() {
        this.mIsCosmosReady = false;
        this.mCosmosRequestQueue.destroy();
    }

    /* access modifiers changed from: 0000 */
    public boolean isCosmosReady() {
        return this.mIsCosmosReady;
    }

    public void onError(Throwable th) {
        Assertion.a("Could not subscribe to cosmos session state", th);
    }

    public void onResolved(Response response) {
        if (!parseResponseForReadiness(response)) {
            this.mIsCosmosReady = false;
        } else if (!isCosmosReady()) {
            this.mIsCosmosReady = true;
            this.mCosmosRequestQueue.replayRequests(this.mRouter);
        }
    }

    /* access modifiers changed from: protected */
    public Lifetime queue(Request request, ResolveCallback resolveCallback) {
        return this.mCosmosRequestQueue.queue(request, resolveCallback);
    }
}
