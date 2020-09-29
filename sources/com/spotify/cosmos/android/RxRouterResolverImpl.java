package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

@Deprecated
public class RxRouterResolverImpl implements RxResolver {
    private final RxRouter mRxRouter;
    private final vvk<Response> mSubscriptionTracker = new vvk<>();

    public RxRouterResolverImpl(RxRouter rxRouter) {
        this.mRxRouter = rxRouter;
    }

    static /* synthetic */ CompletableSource lambda$resolveCompletable$0(Request request, Response response) {
        if (response.getStatus() < 400) {
            return Completable.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(request.getAction());
        sb.append(" ");
        sb.append(request.getUri());
        sb.append(": failed with ");
        sb.append(response.getStatus());
        sb.append(" status code.");
        return Completable.a((Throwable) new CosmosException(sb.toString()));
    }

    public Observable<Response> resolve(Request request) {
        return resolve(request, Schedulers.b());
    }

    public Observable<Response> resolve(Request request, Scheduler scheduler) {
        Observable a = this.mRxRouter.resolve(request).a(scheduler);
        StringBuilder sb = new StringBuilder();
        sb.append(request.getAction());
        sb.append(": ");
        sb.append(request.getUri());
        return this.mSubscriptionTracker.a(sb.toString(), a);
    }

    public Completable resolveCompletable(Request request) {
        return resolveCompletable(request, Schedulers.b());
    }

    public Completable resolveCompletable(Request request, Scheduler scheduler) {
        return resolve(request, scheduler).h().e(new Function() {
            public final Object apply(Object obj) {
                return RxRouterResolverImpl.lambda$resolveCompletable$0(Request.this, (Response) obj);
            }
        });
    }

    public List<vvj> unsubscribeAndReturnLeaks() {
        return this.mSubscriptionTracker.a();
    }
}
