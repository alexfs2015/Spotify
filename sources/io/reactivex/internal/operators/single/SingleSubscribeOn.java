package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleSubscribeOn<T> extends Single<T> {
    private SingleSource<? extends T> a;
    private Scheduler b;

    static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final SingleObserver<? super T> downstream;
        final SingleSource<? extends T> source;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnObserver(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource) {
            this.downstream = singleObserver;
            this.source = singleSource;
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this, disposable);
        }

        public final void c_(T t) {
            this.downstream.c_(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void bf_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
            this.task.bf_();
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void run() {
            this.source.b(this);
        }
    }

    public SingleSubscribeOn(SingleSource<? extends T> singleSource, Scheduler scheduler) {
        this.a = singleSource;
        this.b = scheduler;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(singleObserver, this.a);
        singleObserver.onSubscribe(subscribeOnObserver);
        DisposableHelper.c(subscribeOnObserver.task, this.b.a((Runnable) subscribeOnObserver));
    }
}
