package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;

public final class SingleToFlowable<T> extends Flowable<T> {
    private SingleSource<? extends T> b;

    static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements SingleObserver<T> {
        private static final long serialVersionUID = 187782011903685568L;
        Disposable upstream;

        SingleToFlowableObserver(wrg<? super T> wrg) {
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

        public final void a() {
            super.a();
            this.upstream.bf_();
        }
    }

    public SingleToFlowable(SingleSource<? extends T> singleSource) {
        this.b = singleSource;
    }

    public final void a(wrg<? super T> wrg) {
        this.b.b(new SingleToFlowableObserver(wrg));
    }
}
