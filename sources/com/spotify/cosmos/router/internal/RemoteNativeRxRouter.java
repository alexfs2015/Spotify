package com.spotify.cosmos.router.internal;

import android.os.Handler;
import com.spotify.cosmos.android.RemoteNativeRouter;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;

public class RemoteNativeRxRouter implements RxRouter {
    private final Handler mHandler;
    private final RemoteNativeRouter mRouter;

    public RemoteNativeRxRouter(RemoteNativeRouter remoteNativeRouter) {
        this(remoteNativeRouter, null);
    }

    public RemoteNativeRxRouter(RemoteNativeRouter remoteNativeRouter, Handler handler) {
        this.mRouter = remoteNativeRouter;
        this.mHandler = handler;
    }

    /* access modifiers changed from: private */
    public static boolean isSubscription(Request request) {
        return Request.SUB.equals(request.getAction());
    }

    public Observable<Response> resolve(Request request) {
        return Observable.a((ObservableOnSubscribe<T>) new ObservableOnSubscribe(request) {
            private final /* synthetic */ Request f$1;

            {
                this.f$1 = r2;
            }

            public final void subscribe(ObservableEmitter observableEmitter) {
                RemoteNativeRxRouter.this.lambda$resolve$0$RemoteNativeRxRouter(this.f$1, observableEmitter);
            }
        });
    }

    public /* synthetic */ void lambda$resolve$0$RemoteNativeRxRouter(final Request request, final ObservableEmitter observableEmitter) {
        Lifetime resolve = this.mRouter.resolve(request.getAction(), request.getUri(), request.getHeaders(), request.getBody(), new ResolverCallbackReceiver(this.mHandler) {
            public void onResolved(Response response) {
                if (!observableEmitter.b()) {
                    observableEmitter.a((Object) response);
                    if (!RemoteNativeRxRouter.isSubscription(request)) {
                        observableEmitter.c();
                    }
                }
            }

            public void onError(Throwable th) {
                if (!observableEmitter.b()) {
                    observableEmitter.a(th);
                }
            }
        });
        resolve.getClass();
        observableEmitter.a((Cancellable) new Cancellable() {
            public final void cancel() {
                Lifetime.this.destroy();
            }
        });
    }
}
