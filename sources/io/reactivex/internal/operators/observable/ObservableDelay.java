package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

public final class ObservableDelay<T> extends AbstractObservableWithUpstream<T, T> {
    private long b;
    private TimeUnit c;
    private Scheduler d;
    private boolean e;

    static final class DelayObserver<T> implements Observer<T>, Disposable {
        final Observer<? super T> a;
        final Worker b;
        private long c;
        private TimeUnit d;
        private boolean e;
        private Disposable f;

        final class OnComplete implements Runnable {
            OnComplete() {
            }

            public final void run() {
                try {
                    DelayObserver.this.a.onComplete();
                } finally {
                    DelayObserver.this.b.bd_();
                }
            }
        }

        final class OnError implements Runnable {
            private final Throwable a;

            OnError(Throwable th) {
                this.a = th;
            }

            public final void run() {
                try {
                    DelayObserver.this.a.onError(this.a);
                } finally {
                    DelayObserver.this.b.bd_();
                }
            }
        }

        final class OnNext implements Runnable {
            private final T a;

            OnNext(T t) {
                this.a = t;
            }

            public final void run() {
                DelayObserver.this.a.onNext(this.a);
            }
        }

        DelayObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, Worker worker, boolean z) {
            this.a = observer;
            this.c = j;
            this.d = timeUnit;
            this.b = worker;
            this.e = z;
        }

        public final boolean b() {
            return this.b.b();
        }

        public final void bd_() {
            this.f.bd_();
            this.b.bd_();
        }

        public final void onComplete() {
            this.b.a(new OnComplete(), this.c, this.d);
        }

        public final void onError(Throwable th) {
            this.b.a(new OnError(th), this.e ? this.c : 0, this.d);
        }

        public final void onNext(T t) {
            this.b.a(new OnNext(t), this.c, this.d);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.f, disposable)) {
                this.f = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableDelay(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(observableSource);
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = z;
    }

    public final void a(Observer<? super T> observer) {
        Observer<? super T> serializedObserver = this.e ? observer : new SerializedObserver<>(observer);
        Worker a = this.d.a();
        ObservableSource observableSource = this.a;
        DelayObserver delayObserver = new DelayObserver(serializedObserver, this.b, this.c, a, this.e);
        observableSource.subscribe(delayObserver);
    }
}
