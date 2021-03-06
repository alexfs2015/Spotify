package com.spotify.cosmos.android;

import android.os.Binder;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.util.CosmosRequestInterceptor;
import com.spotify.cosmos.android.util.CosmosRequestObserver;
import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.NativeRouter;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.ResolveCallback;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.Router;
import com.spotify.mobile.android.util.Assertion;
import java.lang.ref.WeakReference;
import java.util.Map;

public class RemoteNativeRouter extends Binder {
    public static final int INVALID_SUBSCRIPTION_ID = -1;
    private static CosmosRequestInterceptor sRequestInterceptor = CosmosRequestInterceptor.NO_OP;
    /* access modifiers changed from: private */
    public static CosmosRequestObserver sRequestObserver = CosmosRequestObserver.NO_OP;
    private final Router mNativeRouter;
    /* access modifiers changed from: private */
    public boolean mRouterDestroyed;

    class NullResolveCallback extends SubscriptionResolveCallback {
        public int getId() {
            return -1;
        }

        public void onError(Throwable th) {
        }

        public void onResolved(Response response) {
        }

        public NullResolveCallback() {
            super(null);
        }
    }

    class SubscriptionResolveCallback implements ResolveCallback {
        private boolean mIsCancelled;
        private final ResolverCallbackReceiver mResolverCallbackReceiver;

        private SubscriptionResolveCallback(ResolverCallbackReceiver resolverCallbackReceiver) {
            this.mResolverCallbackReceiver = resolverCallbackReceiver;
            this.mIsCancelled = false;
        }

        public void onResolved(Response response) {
            if (!RemoteNativeRouter.this.mRouterDestroyed && !this.mIsCancelled) {
                this.mResolverCallbackReceiver.sendOnResolved(response);
            }
        }

        public void onError(Throwable th) {
            if (!RemoteNativeRouter.this.mRouterDestroyed && !this.mIsCancelled) {
                this.mResolverCallbackReceiver.sendOnError(th);
            }
        }

        public int getId() {
            return this.mResolverCallbackReceiver.getId();
        }

        public void destroy() {
            this.mIsCancelled = true;
        }
    }

    static class WeakResolveCallbackWrapper implements ResolveCallback {
        private final String mId;
        private final WeakReference<ResolveCallback> mRef;

        public WeakResolveCallbackWrapper(String str, ResolveCallback resolveCallback) {
            this.mId = str;
            this.mRef = new WeakReference<>(resolveCallback);
        }

        public void onResolved(Response response) {
            ResolveCallback resolveCallback = (ResolveCallback) this.mRef.get();
            try {
                RemoteNativeRouter.sRequestObserver.onResponse(this.mId, response);
                if (resolveCallback != null) {
                    resolveCallback.onResolved(response);
                }
            } catch (Exception e) {
                Assertion.a("Caught an Exception in ResolveCallback.onResolved", (Throwable) e);
            }
        }

        public void onError(Throwable th) {
            ResolveCallback resolveCallback = (ResolveCallback) this.mRef.get();
            RemoteNativeRouter.sRequestObserver.onError(this.mId, th);
            if (resolveCallback != null) {
                resolveCallback.onError(th);
            }
        }
    }

    static void setObserver(CosmosRequestObserver cosmosRequestObserver) {
        sRequestObserver = cosmosRequestObserver;
    }

    static void clearInterceptor() {
        setInterceptor(CosmosRequestInterceptor.NO_OP);
    }

    static void setInterceptor(CosmosRequestInterceptor cosmosRequestInterceptor) {
        CosmosRequestInterceptor cosmosRequestInterceptor2 = sRequestInterceptor;
        if (cosmosRequestInterceptor != cosmosRequestInterceptor2) {
            cosmosRequestInterceptor2.destroy();
        }
        sRequestInterceptor = cosmosRequestInterceptor;
    }

    static CosmosRequestInterceptor getInterceptor() {
        return sRequestInterceptor;
    }

    public RemoteNativeRouter(Router router) {
        this.mRouterDestroyed = false;
        this.mNativeRouter = router;
    }

    public RemoteNativeRouter() {
        this(new NativeRouter());
    }

    public Router getNativeRouter() {
        return this.mNativeRouter;
    }

    public Lifetime resolve(String str, String str2, Map<String, String> map, byte[] bArr, ResolverCallbackReceiver resolverCallbackReceiver) {
        SubscriptionResolveCallback subscriptionResolveCallback;
        if (resolverCallbackReceiver == null) {
            subscriptionResolveCallback = new NullResolveCallback();
        } else {
            subscriptionResolveCallback = new SubscriptionResolveCallback(resolverCallbackReceiver);
        }
        return resolve(new Request(str, str2, map, bArr), subscriptionResolveCallback);
    }

    private Lifetime resolve(Request request, SubscriptionResolveCallback subscriptionResolveCallback) {
        if (!this.mRouterDestroyed) {
            int id = subscriptionResolveCallback.getId();
            Logger.c("Resolving router with uri = %s", request.getUri());
            sRequestObserver.onRequest(String.valueOf(id), request);
            Lifetime resolve = sRequestInterceptor.resolve(request, subscriptionResolveCallback);
            if (resolve != Lifetime.UNRESOLVED) {
                return new Lifetime(resolve) {
                    private final /* synthetic */ Lifetime f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void destroy() {
                        RemoteNativeRouter.lambda$resolve$0(SubscriptionResolveCallback.this, this.f$1);
                    }
                };
            }
            return new Lifetime(performNativeResolve(request, new WeakResolveCallbackWrapper(String.valueOf(id), subscriptionResolveCallback))) {
                private final /* synthetic */ Lifetime f$1;

                {
                    this.f$1 = r2;
                }

                public final void destroy() {
                    RemoteNativeRouter.lambda$resolve$1(SubscriptionResolveCallback.this, this.f$1);
                }
            };
        }
        throw new IllegalStateException("Router already destroyed");
    }

    static /* synthetic */ void lambda$resolve$0(SubscriptionResolveCallback subscriptionResolveCallback, Lifetime lifetime) {
        subscriptionResolveCallback.destroy();
        lifetime.destroy();
    }

    static /* synthetic */ void lambda$resolve$1(SubscriptionResolveCallback subscriptionResolveCallback, Lifetime lifetime) {
        subscriptionResolveCallback.destroy();
        lifetime.destroy();
    }

    /* access modifiers changed from: protected */
    public Lifetime performNativeResolve(Request request, ResolveCallback resolveCallback) {
        return this.mNativeRouter.resolve(request, resolveCallback);
    }

    public void destroy() {
        if (!this.mRouterDestroyed) {
            this.mNativeRouter.destroy();
            sRequestInterceptor.destroy();
            this.mRouterDestroyed = true;
            return;
        }
        throw new IllegalStateException("Router already destroyed");
    }
}
