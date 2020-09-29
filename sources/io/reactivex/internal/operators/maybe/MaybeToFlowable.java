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

        MaybeToFlowableSubscriber(wrg<? super T> wrg) {
            super(wrg);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.a(this);
            }
        }

        public final void c_(T t) {
            b(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onComplete() {
            this.downstream.c();
        }

        public final void a() {
            super.a();
            this.upstream.bf_();
        }
    }

    public MaybeToFlowable(MaybeSource<T> maybeSource) {
        this.b = maybeSource;
    }

    public final void a(wrg<? super T> wrg) {
        this.b.a(new MaybeToFlowableSubscriber(wrg));
    }
}
