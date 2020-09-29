package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;

public final class MaybeToFlowable<T> extends Flowable<T> {
    private MaybeSource<T> b;

    static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        Disposable upstream;

        MaybeToFlowableSubscriber(xfl<? super T> xfl) {
            super(xfl);
        }

        public final void a() {
            super.a();
            this.upstream.bd_();
        }

        public final void c_(T t) {
            b(t);
        }

        public final void onComplete() {
            this.downstream.c();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.a(this);
            }
        }
    }

    public MaybeToFlowable(MaybeSource<T> maybeSource) {
        this.b = maybeSource;
    }

    public final void a(xfl<? super T> xfl) {
        this.b.a(new MaybeToFlowableSubscriber(xfl));
    }
}
