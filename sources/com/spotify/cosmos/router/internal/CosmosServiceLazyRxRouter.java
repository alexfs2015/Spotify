package com.spotify.cosmos.router.internal;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.internal.CosmosServiceRxRouterClient.Listener;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;
import java.util.List;

public class CosmosServiceLazyRxRouter implements RxRouter {
    /* access modifiers changed from: private */
    public final BehaviorSubject<Optional<RxRouter>> mRouter = BehaviorSubject.a();
    private volatile boolean mRunning;
    private final CosmosServiceRxRouterClient mServiceClient;
    private final vif<Response> mSubscriptionTracker;

    public CosmosServiceLazyRxRouter(CosmosServiceRxRouterClient cosmosServiceRxRouterClient) {
        this.mServiceClient = cosmosServiceRxRouterClient;
        this.mSubscriptionTracker = new vif<>();
        this.mServiceClient.setListener(new Listener() {
            public void onConnected(RxRouter rxRouter) {
                CosmosServiceLazyRxRouter.this.mRouter.onNext(Optional.b(rxRouter));
            }

            public void onDisconnected() {
                CosmosServiceLazyRxRouter.this.mRouter.onNext(Optional.e());
            }
        });
    }

    public Observable<Response> resolve(Request request) {
        Single h = this.mRouter.a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$c20zSzln3q_RTfLwXH6CVUkoRw.INSTANCE).c(1).h();
        BehaviorSubject<Optional<RxRouter>> behaviorSubject = this.mRouter;
        Observable g = h.d((Function<? super T, ? extends ObservableSource<? extends R>>) new Function() {
            public final Object apply(Object obj) {
                return ((RxRouter) obj).resolve(Request.this);
            }
        }).g((ObservableSource<U>) behaviorSubject.e((ObservableSource<U>) behaviorSubject.a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE)).a((Predicate<? super T>) $$Lambda$CosmosServiceLazyRxRouter$GhaTdlsAJBvuuyH6FbMXGvXajEc.INSTANCE));
        StringBuilder sb = new StringBuilder();
        sb.append(request.getAction());
        sb.append(": ");
        sb.append(request.getUri());
        return this.mSubscriptionTracker.a(sb.toString(), g).c((Consumer<? super Disposable>) new Consumer() {
            public final void accept(Object obj) {
                CosmosServiceLazyRxRouter.this.lambda$resolve$2$CosmosServiceLazyRxRouter((Disposable) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$resolve$0(Optional optional) {
        return !optional.b();
    }

    public /* synthetic */ void lambda$resolve$2$CosmosServiceLazyRxRouter(Disposable disposable) {
        if (!this.mRunning) {
            start();
        }
    }

    public synchronized List<vie> unsubscribeAndReturnLeaks() {
        return this.mSubscriptionTracker.a();
    }

    private void start() {
        jrh.b("Not called on main looper");
        fay.b(!this.mRunning);
        this.mRunning = true;
        Logger.b("Connecting service client", new Object[0]);
        this.mServiceClient.connect();
    }

    public void stop() {
        jrh.b("Not called on main looper");
        if (!this.mRunning) {
            Logger.b("Skipping stop since never got a request to resolve.", new Object[0]);
            return;
        }
        this.mRunning = false;
        Logger.b("Disconnecting service client", new Object[0]);
        this.mServiceClient.disconnect();
    }
}
