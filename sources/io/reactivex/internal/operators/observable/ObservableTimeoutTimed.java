package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableTimeoutTimed<T> extends AbstractObservableWithUpstream<T, T> {
    private long b;
    private TimeUnit c;
    private Scheduler d;
    private ObservableSource<? extends T> e;

    static final class FallbackObserver<T> implements Observer<T> {
        private Observer<? super T> a;
        private AtomicReference<Disposable> b;

        FallbackObserver(Observer<? super T> observer, AtomicReference<Disposable> atomicReference) {
            this.a = observer;
            this.b = atomicReference;
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.b, disposable);
        }

        public final void onNext(T t) {
            this.a.onNext(t);
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onComplete() {
            this.a.onComplete();
        }
    }

    static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final Observer<? super T> downstream;
        ObservableSource<? extends T> fallback;
        final AtomicLong index = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<Disposable> upstream = new AtomicReference<>();
        final Worker worker;

        TimeoutFallbackObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, Worker worker2, ObservableSource<? extends T> observableSource) {
            this.downstream = observer;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker2;
            this.fallback = observableSource;
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this.upstream, disposable);
        }

        public final void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).bf_();
                    this.downstream.onNext(t);
                    b(j2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            DisposableHelper.c(this.task, this.worker.a(new TimeoutTask(j, this), this.timeout, this.unit));
        }

        public final void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bf_();
                this.downstream.onError(th);
                this.worker.bf_();
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bf_();
                this.downstream.onComplete();
                this.worker.bf_();
            }
        }

        public final void a(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.a(this.upstream);
                ObservableSource<? extends T> observableSource = this.fallback;
                this.fallback = null;
                observableSource.subscribe(new FallbackObserver(this.downstream, this));
                this.worker.bf_();
            }
        }

        public final void bf_() {
            DisposableHelper.a(this.upstream);
            DisposableHelper.a((AtomicReference<Disposable>) this);
            this.worker.bf_();
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }
    }

    static final class TimeoutObserver<T> extends AtomicLong implements Observer<T>, Disposable, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final Observer<? super T> downstream;
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<Disposable> upstream = new AtomicReference<>();
        final Worker worker;

        TimeoutObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, Worker worker2) {
            this.downstream = observer;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker2;
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this.upstream, disposable);
        }

        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).bf_();
                    this.downstream.onNext(t);
                    b(j2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            DisposableHelper.c(this.task, this.worker.a(new TimeoutTask(j, this), this.timeout, this.unit));
        }

        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bf_();
                this.downstream.onError(th);
                this.worker.bf_();
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bf_();
                this.downstream.onComplete();
                this.worker.bf_();
            }
        }

        public final void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.a(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.a(this.timeout, this.unit)));
                this.worker.bf_();
            }
        }

        public final void bf_() {
            DisposableHelper.a(this.upstream);
            this.worker.bf_();
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) this.upstream.get());
        }
    }

    interface TimeoutSupport {
        void a(long j);
    }

    static final class TimeoutTask implements Runnable {
        private TimeoutSupport a;
        private long b;

        TimeoutTask(long j, TimeoutSupport timeoutSupport) {
            this.b = j;
            this.a = timeoutSupport;
        }

        public final void run() {
            this.a.a(this.b);
        }
    }

    public ObservableTimeoutTimed(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler, ObservableSource<? extends T> observableSource) {
        super(observable);
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = observableSource;
    }

    public final void a(Observer<? super T> observer) {
        if (this.e == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(observer, this.b, this.c, this.d.a());
            observer.onSubscribe(timeoutObserver);
            timeoutObserver.b(0);
            this.a.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(observer, this.b, this.c, this.d.a(), this.e);
        observer.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.b(0);
        this.a.subscribe(timeoutFallbackObserver);
    }
}
