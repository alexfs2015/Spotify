package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableTakeUntil<T, U> extends AbstractObservableWithUpstream<T, T> {
    private ObservableSource<? extends U> b;

    static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 1418547743690811973L;
        final Observer<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final OtherObserver otherObserver = new OtherObserver<>();
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        final class OtherObserver extends AtomicReference<Disposable> implements Observer<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            OtherObserver() {
            }

            public final void onComplete() {
                TakeUntilMainObserver.this.c();
            }

            public final void onError(Throwable th) {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.a(takeUntilMainObserver.upstream);
                HalfSerializer.a(takeUntilMainObserver.downstream, th, (AtomicInteger) takeUntilMainObserver, takeUntilMainObserver.error);
            }

            public final void onNext(U u) {
                DisposableHelper.a((AtomicReference<Disposable>) this);
                TakeUntilMainObserver.this.c();
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.b(this, disposable);
            }
        }

        TakeUntilMainObserver(Observer<? super T> observer) {
            this.downstream = observer;
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) this.upstream.get());
        }

        public final void bd_() {
            DisposableHelper.a(this.upstream);
            DisposableHelper.a((AtomicReference<Disposable>) this.otherObserver);
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            DisposableHelper.a(this.upstream);
            HalfSerializer.a(this.downstream, (AtomicInteger) this, this.error);
        }

        public final void onComplete() {
            DisposableHelper.a((AtomicReference<Disposable>) this.otherObserver);
            HalfSerializer.a(this.downstream, (AtomicInteger) this, this.error);
        }

        public final void onError(Throwable th) {
            DisposableHelper.a((AtomicReference<Disposable>) this.otherObserver);
            HalfSerializer.a(this.downstream, th, (AtomicInteger) this, this.error);
        }

        public final void onNext(T t) {
            HalfSerializer.a(this.downstream, t, (AtomicInteger) this, this.error);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this.upstream, disposable);
        }
    }

    public ObservableTakeUntil(ObservableSource<T> observableSource, ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.b = observableSource2;
    }

    public final void a(Observer<? super T> observer) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(observer);
        observer.onSubscribe(takeUntilMainObserver);
        this.b.subscribe(takeUntilMainObserver.otherObserver);
        this.a.subscribe(takeUntilMainObserver);
    }
}
