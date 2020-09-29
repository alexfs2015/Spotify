package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableDelaySubscriptionOther<T, U> extends Observable<T> {
    final ObservableSource<? extends T> a;
    private ObservableSource<U> b;

    final class DelayObserver implements Observer<U> {
        final SequentialDisposable a;
        final Observer<? super T> b;
        private boolean c;

        final class OnComplete implements Observer<T> {
            OnComplete() {
            }

            public final void onComplete() {
                DelayObserver.this.b.onComplete();
            }

            public final void onError(Throwable th) {
                DelayObserver.this.b.onError(th);
            }

            public final void onNext(T t) {
                DelayObserver.this.b.onNext(t);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.a((AtomicReference<Disposable>) DelayObserver.this.a, disposable);
            }
        }

        DelayObserver(SequentialDisposable sequentialDisposable, Observer<? super T> observer) {
            this.a = sequentialDisposable;
            this.b = observer;
        }

        public final void onComplete() {
            if (!this.c) {
                this.c = true;
                ObservableDelaySubscriptionOther.this.a.subscribe(new OnComplete());
            }
        }

        public final void onError(Throwable th) {
            if (this.c) {
                RxJavaPlugins.a(th);
                return;
            }
            this.c = true;
            this.b.onError(th);
        }

        public final void onNext(U u) {
            onComplete();
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.a((AtomicReference<Disposable>) this.a, disposable);
        }
    }

    public ObservableDelaySubscriptionOther(ObservableSource<? extends T> observableSource, ObservableSource<U> observableSource2) {
        this.a = observableSource;
        this.b = observableSource2;
    }

    public final void a(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        this.b.subscribe(new DelayObserver(sequentialDisposable, observer));
    }
}
