package com.spotify.cosmos.android;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class RxFireAndForgetResolver implements FireAndForgetResolver {
    /* access modifiers changed from: private */
    public final CompositeDisposable mDisposables = new CompositeDisposable();
    private boolean mDisposed;
    private final RxResolver mRxResolver;

    public RxFireAndForgetResolver(RxResolver rxResolver) {
        this.mRxResolver = rxResolver;
    }

    public synchronized void dispose() {
        this.mDisposables.c();
        this.mDisposed = true;
    }

    public synchronized void reset() {
        this.mDisposed = false;
    }

    public synchronized void resolve(Request request) {
        if (this.mDisposed) {
            Logger.e(new IllegalStateException(), "Trying to resolve when FireAndForgetResolver is disposed", new Object[0]);
        }
        final String uri = request.getUri();
        final String action = request.getAction();
        this.mRxResolver.resolveCompletable(request).a((CompletableObserver) new CompletableObserver() {
            private Disposable mDisposable;

            public void onComplete() {
                Logger.c("%s %s completed", uri, action);
                RxFireAndForgetResolver.this.mDisposables.b(this.mDisposable);
            }

            public void onError(Throwable th) {
                Logger.c("%s %s failed with message: %s", uri, action, th.getMessage());
                RxFireAndForgetResolver.this.mDisposables.b(this.mDisposable);
            }

            public void onSubscribe(Disposable disposable) {
                this.mDisposable = disposable;
                RxFireAndForgetResolver.this.mDisposables.a(disposable);
            }
        });
    }

    public synchronized void resolve(Request request, final ResolverCallbackReceiver resolverCallbackReceiver) {
        if (this.mDisposed) {
            Logger.e(new IllegalStateException(), "Trying to resolve when FireAndForgetResolver is disposed", new Object[0]);
        }
        final String uri = request.getUri();
        final String action = request.getAction();
        this.mRxResolver.resolve(request).subscribe(new Observer<Response>() {
            private Disposable mDisposable;

            public void onComplete() {
                Logger.c("%s %s completed", uri, action);
                RxFireAndForgetResolver.this.mDisposables.b(this.mDisposable);
            }

            public void onError(Throwable th) {
                Logger.c("%s %s failed with message: %s", uri, action, th.getMessage());
                resolverCallbackReceiver.sendOnError(th);
                RxFireAndForgetResolver.this.mDisposables.b(this.mDisposable);
            }

            public void onNext(Response response) {
                resolverCallbackReceiver.sendOnResolved(response);
            }

            public void onSubscribe(Disposable disposable) {
                this.mDisposable = disposable;
                RxFireAndForgetResolver.this.mDisposables.a(disposable);
            }
        });
    }
}
