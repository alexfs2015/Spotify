package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleTimeout<T> extends Single<T> {
    private SingleSource<T> a;
    private long b;
    private TimeUnit c;
    private Scheduler d;
    private SingleSource<? extends T> e;

    static final class TimeoutMainObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {
        private static final long serialVersionUID = 37497744973048446L;
        final SingleObserver<? super T> downstream;
        final TimeoutFallbackObserver<T> fallback;
        SingleSource<? extends T> other;
        final AtomicReference<Disposable> task = new AtomicReference<>();
        final long timeout;
        final TimeUnit unit;

        static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final SingleObserver<? super T> downstream;

            TimeoutFallbackObserver(SingleObserver<? super T> singleObserver) {
                this.downstream = singleObserver;
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
        }

        TimeoutMainObserver(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource, long j, TimeUnit timeUnit) {
            this.downstream = singleObserver;
            this.other = singleSource;
            this.timeout = j;
            this.unit = timeUnit;
            if (singleSource != null) {
                this.fallback = new TimeoutFallbackObserver<>(singleObserver);
            } else {
                this.fallback = null;
            }
        }

        public final void run() {
            Disposable disposable = (Disposable) get();
            if (disposable != DisposableHelper.DISPOSED && compareAndSet(disposable, DisposableHelper.DISPOSED)) {
                if (disposable != null) {
                    disposable.bf_();
                }
                SingleSource<? extends T> singleSource = this.other;
                if (singleSource == null) {
                    this.downstream.onError(new TimeoutException(ExceptionHelper.a(this.timeout, this.unit)));
                } else {
                    this.other = null;
                    singleSource.b(this.fallback);
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this, disposable);
        }

        public final void c_(T t) {
            Disposable disposable = (Disposable) get();
            if (disposable != DisposableHelper.DISPOSED && compareAndSet(disposable, DisposableHelper.DISPOSED)) {
                DisposableHelper.a(this.task);
                this.downstream.c_(t);
            }
        }

        public final void onError(Throwable th) {
            Disposable disposable = (Disposable) get();
            if (disposable == DisposableHelper.DISPOSED || !compareAndSet(disposable, DisposableHelper.DISPOSED)) {
                RxJavaPlugins.a(th);
                return;
            }
            DisposableHelper.a(this.task);
            this.downstream.onError(th);
        }

        public final void bf_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
            DisposableHelper.a(this.task);
            TimeoutFallbackObserver<T> timeoutFallbackObserver = this.fallback;
            if (timeoutFallbackObserver != null) {
                DisposableHelper.a((AtomicReference<Disposable>) timeoutFallbackObserver);
            }
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }
    }

    public SingleTimeout(SingleSource<T> singleSource, long j, TimeUnit timeUnit, Scheduler scheduler, SingleSource<? extends T> singleSource2) {
        this.a = singleSource;
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = singleSource2;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        TimeoutMainObserver timeoutMainObserver = new TimeoutMainObserver(singleObserver, this.e, this.b, this.c);
        singleObserver.onSubscribe(timeoutMainObserver);
        DisposableHelper.c(timeoutMainObserver.task, this.d.a(timeoutMainObserver, this.b, this.c));
        this.a.b(timeoutMainObserver);
    }
}
