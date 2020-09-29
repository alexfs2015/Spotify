package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableTimeout<T, U, V> extends AbstractObservableWithUpstream<T, T> {
    private ObservableSource<U> b;
    private Function<? super T, ? extends ObservableSource<V>> c;
    private ObservableSource<? extends T> d;

    static final class TimeoutConsumer extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final TimeoutSelectorSupport parent;

        TimeoutConsumer(long j, TimeoutSelectorSupport timeoutSelectorSupport) {
            this.idx = j;
            this.parent = timeoutSelectorSupport;
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this, disposable);
        }

        public final void onNext(Object obj) {
            Disposable disposable = (Disposable) get();
            if (disposable != DisposableHelper.DISPOSED) {
                disposable.bf_();
                lazySet(DisposableHelper.DISPOSED);
                this.parent.a(this.idx);
            }
        }

        public final void onError(Throwable th) {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.a(this.idx, th);
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onComplete() {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.a(this.idx);
            }
        }

        public final void bf_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }
    }

    static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, TimeoutSelectorSupport {
        private static final long serialVersionUID = -7508389464265974549L;
        final Observer<? super T> downstream;
        ObservableSource<? extends T> fallback;
        final AtomicLong index;
        final Function<? super T, ? extends ObservableSource<?>> itemTimeoutIndicator;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<Disposable> upstream;

        TimeoutFallbackObserver(Observer<? super T> observer, Function<? super T, ? extends ObservableSource<?>> function, ObservableSource<? extends T> observableSource) {
            this.downstream = observer;
            this.itemTimeoutIndicator = function;
            this.fallback = observableSource;
            this.index = new AtomicLong();
            this.upstream = new AtomicReference<>();
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this.upstream, disposable);
        }

        public final void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    Disposable disposable = (Disposable) this.task.get();
                    if (disposable != null) {
                        disposable.bf_();
                    }
                    this.downstream.onNext(t);
                    try {
                        ObservableSource observableSource = (ObservableSource) ObjectHelper.a(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j2, this);
                        if (DisposableHelper.c(this.task, timeoutConsumer)) {
                            observableSource.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        ((Disposable) this.upstream.get()).bf_();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bf_();
                this.downstream.onError(th);
                this.task.bf_();
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bf_();
                this.downstream.onComplete();
                this.task.bf_();
            }
        }

        public final void a(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.a(this.upstream);
                ObservableSource<? extends T> observableSource = this.fallback;
                this.fallback = null;
                observableSource.subscribe(new FallbackObserver(this.downstream, this));
            }
        }

        public final void a(long j, Throwable th) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.a((AtomicReference<Disposable>) this);
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void bf_() {
            DisposableHelper.a(this.upstream);
            DisposableHelper.a((AtomicReference<Disposable>) this);
            this.task.bf_();
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }
    }

    static final class TimeoutObserver<T> extends AtomicLong implements Observer<T>, Disposable, TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final Observer<? super T> downstream;
        final Function<? super T, ? extends ObservableSource<?>> itemTimeoutIndicator;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        TimeoutObserver(Observer<? super T> observer, Function<? super T, ? extends ObservableSource<?>> function) {
            this.downstream = observer;
            this.itemTimeoutIndicator = function;
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this.upstream, disposable);
        }

        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    Disposable disposable = (Disposable) this.task.get();
                    if (disposable != null) {
                        disposable.bf_();
                    }
                    this.downstream.onNext(t);
                    try {
                        ObservableSource observableSource = (ObservableSource) ObjectHelper.a(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j2, this);
                        if (DisposableHelper.c(this.task, timeoutConsumer)) {
                            observableSource.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        ((Disposable) this.upstream.get()).bf_();
                        getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bf_();
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bf_();
                this.downstream.onComplete();
            }
        }

        public final void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.a(this.upstream);
                this.downstream.onError(new TimeoutException());
            }
        }

        public final void a(long j, Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.a(this.upstream);
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void bf_() {
            DisposableHelper.a(this.upstream);
            this.task.bf_();
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) this.upstream.get());
        }
    }

    interface TimeoutSelectorSupport extends TimeoutSupport {
        void a(long j, Throwable th);
    }

    public ObservableTimeout(Observable<T> observable, ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        super(observable);
        this.b = observableSource;
        this.c = function;
        this.d = observableSource2;
    }

    public final void a(Observer<? super T> observer) {
        ObservableSource<? extends T> observableSource = this.d;
        if (observableSource == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(observer, this.c);
            observer.onSubscribe(timeoutObserver);
            ObservableSource<U> observableSource2 = this.b;
            if (observableSource2 != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0, timeoutObserver);
                if (DisposableHelper.c(timeoutObserver.task, timeoutConsumer)) {
                    observableSource2.subscribe(timeoutConsumer);
                }
            }
            this.a.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(observer, this.c, observableSource);
        observer.onSubscribe(timeoutFallbackObserver);
        ObservableSource<U> observableSource3 = this.b;
        if (observableSource3 != null) {
            TimeoutConsumer timeoutConsumer2 = new TimeoutConsumer(0, timeoutFallbackObserver);
            if (DisposableHelper.c(timeoutFallbackObserver.task, timeoutConsumer2)) {
                observableSource3.subscribe(timeoutConsumer2);
            }
        }
        this.a.subscribe(timeoutFallbackObserver);
    }
}
