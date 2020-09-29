package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableDebounceTimed<T> extends AbstractObservableWithUpstream<T, T> {
    private long b;
    private TimeUnit c;
    private Scheduler d;

    static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final DebounceTimedObserver<T> parent;
        final T value;

        DebounceEmitter(T t, long j, DebounceTimedObserver<T> debounceTimedObserver) {
            this.value = t;
            this.idx = j;
            this.parent = debounceTimedObserver;
        }

        public final boolean b() {
            return get() == DisposableHelper.DISPOSED;
        }

        public final void bd_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final void run() {
            if (this.once.compareAndSet(false, true)) {
                DebounceTimedObserver<T> debounceTimedObserver = this.parent;
                long j = this.idx;
                T t = this.value;
                if (j == debounceTimedObserver.b) {
                    debounceTimedObserver.a.onNext(t);
                    bd_();
                }
            }
        }
    }

    static final class DebounceTimedObserver<T> implements Observer<T>, Disposable {
        final Observer<? super T> a;
        volatile long b;
        private long c;
        private TimeUnit d;
        private Worker e;
        private Disposable f;
        private Disposable g;
        private boolean h;

        DebounceTimedObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, Worker worker) {
            this.a = observer;
            this.c = j;
            this.d = timeUnit;
            this.e = worker;
        }

        public final boolean b() {
            return this.e.b();
        }

        public final void bd_() {
            this.f.bd_();
            this.e.bd_();
        }

        public final void onComplete() {
            if (!this.h) {
                this.h = true;
                Disposable disposable = this.g;
                if (disposable != null) {
                    disposable.bd_();
                }
                DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
                if (debounceEmitter != null) {
                    debounceEmitter.run();
                }
                this.a.onComplete();
                this.e.bd_();
            }
        }

        public final void onError(Throwable th) {
            if (this.h) {
                RxJavaPlugins.a(th);
                return;
            }
            Disposable disposable = this.g;
            if (disposable != null) {
                disposable.bd_();
            }
            this.h = true;
            this.a.onError(th);
            this.e.bd_();
        }

        public final void onNext(T t) {
            if (!this.h) {
                long j = this.b + 1;
                this.b = j;
                Disposable disposable = this.g;
                if (disposable != null) {
                    disposable.bd_();
                }
                DebounceEmitter debounceEmitter = new DebounceEmitter(t, j, this);
                this.g = debounceEmitter;
                DisposableHelper.c(debounceEmitter, this.e.a(debounceEmitter, this.c, this.d));
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.f, disposable)) {
                this.f = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
    }

    public final void a(Observer<? super T> observer) {
        ObservableSource observableSource = this.a;
        DebounceTimedObserver debounceTimedObserver = new DebounceTimedObserver(new SerializedObserver(observer), this.b, this.c, this.d.a());
        observableSource.subscribe(debounceTimedObserver);
    }
}
