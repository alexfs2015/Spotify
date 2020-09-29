package com.spotify.cosmos.router.internal;

import com.google.common.base.Optional;
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

class CosmosServiceRxRouter implements RxRouter {
    /* access modifiers changed from: private */
    public final BehaviorSubject<Optional<RxRouter>> mRouter = BehaviorSubject.a();
    private volatile boolean mRunning;
    private final CosmosServiceRxRouterClient mServiceClient;
    private final vvk<Response> mSubscriptionTracker;

    CosmosServiceRxRouter(CosmosServiceRxRouterClient cosmosServiceRxRouterClient) {
        this.mServiceClient = cosmosServiceRxRouterClient;
        this.mSubscriptionTracker = new vvk<>();
        this.mServiceClient.setListener(new Listener() {
            public void onConnected(RxRouter rxRouter) {
                CosmosServiceRxRouter.this.mRouter.onNext(Optional.b(rxRouter));
            }

            public void onDisconnected() {
                CosmosServiceRxRouter.this.mRouter.onNext(Optional.e());
            }
        });
    }

    static /* synthetic */ boolean lambda$resolve$0(Optional optional) {
        return !optional.b();
    }

    public /* synthetic */ void lambda$resolve$2$CosmosServiceRxRouter(Disposable disposable) {
        if (!this.mRunning) {
            throw new IllegalStateException("The router can only resolve requests while it is started");
        }
    }

    public Observable<Response> resolve(Request request) {
        Single h = this.mRouter.a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$c20zSzln3q_RTfLwXH6CVUkoRw.INSTANCE).c(1).h();
        BehaviorSubject<Optional<RxRouter>> behaviorSubject = this.mRouter;
        Observable g = h.d((Function<? super T, ? extends ObservableSource<? extends R>>) new Function() {
            public final Object apply(Object obj) {
                return ((RxRouter) obj).resolve(Request.this);
            }
        }).g((ObservableSource<U>) behaviorSubject.e((ObservableSource<U>) behaviorSubject.a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE)).a((Predicate<? super T>) $$Lambda$CosmosServiceRxRouter$NsBTTY4W9DRwAdFcwwyHNqQNHc.INSTANCE));
        StringBuilder sb = new StringBuilder();
        sb.append(request.getAction());
        sb.append(": ");
        sb.append(request.getUri());
        return this.mSubscriptionTracker.a(sb.toString(), g).c((Consumer<? super Disposable>) new Consumer() {
            public final void accept(Object obj) {
                CosmosServiceRxRouter.this.lambda$resolve$2$CosmosServiceRxRouter((Disposable) obj);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void start() {
        jtr.b("Not called on main looper");
        fbp.b(!this.mRunning);
        this.mRunning = true;
        this.mServiceClient.connect();
    }

    /* access modifiers changed from: 0000 */
    public void stop() {
        jtr.b("Not called on main looper");
        fbp.b(this.mRunning);
        this.mRunning = false;
        this.mServiceClient.disconnect();
    }

    public synchronized List<vvj> unsubscribeAndReturnLeaks() {
        return this.mSubscriptionTracker.a();
    }
}
