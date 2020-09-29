package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {
    private Scheduler b;

    static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8094547886072529208L;
        final Observer<? super T> downstream;
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        SubscribeOnObserver(Observer<? super T> observer) {
            this.downstream = observer;
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this.upstream, disposable);
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void bf_() {
            DisposableHelper.a(this.upstream);
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }
    }

    final class SubscribeTask implements Runnable {
        private final SubscribeOnObserver<T> a;

        SubscribeTask(SubscribeOnObserver<T> subscribeOnObserver) {
            this.a = subscribeOnObserver;
        }

        public final void run() {
            ObservableSubscribeOn.this.a.subscribe(this.a);
        }
    }

    public ObservableSubscribeOn(ObservableSource<T> observableSource, Scheduler scheduler) {
        super(observableSource);
        this.b = scheduler;
    }

    public final void a(Observer<? super T> observer) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(observer);
        observer.onSubscribe(subscribeOnObserver);
        DisposableHelper.b(subscribeOnObserver, this.b.a((Runnable) new SubscribeTask(subscribeOnObserver)));
    }
}
