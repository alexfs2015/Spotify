package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableConcatMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    private Function<? super T, ? extends ObservableSource<? extends U>> b;
    private int c;
    private ErrorMode d;

    static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final Observer<? super R> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;
        final DelayErrorInnerObserver<R> observer;
        SimpleQueue<T> queue;
        int sourceMode;
        final boolean tillTheEnd;
        Disposable upstream;

        static final class DelayErrorInnerObserver<R> extends AtomicReference<Disposable> implements Observer<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final Observer<? super R> downstream;
            final ConcatMapDelayErrorObserver<?, R> parent;

            DelayErrorInnerObserver(Observer<? super R> observer, ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver) {
                this.downstream = observer;
                this.parent = concatMapDelayErrorObserver;
            }

            public final void onComplete() {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                concatMapDelayErrorObserver.active = false;
                concatMapDelayErrorObserver.c();
            }

            public final void onError(Throwable th) {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                if (ExceptionHelper.a((AtomicReference<Throwable>) concatMapDelayErrorObserver.error, th)) {
                    if (!concatMapDelayErrorObserver.tillTheEnd) {
                        concatMapDelayErrorObserver.upstream.bd_();
                    }
                    concatMapDelayErrorObserver.active = false;
                    concatMapDelayErrorObserver.c();
                    return;
                }
                RxJavaPlugins.a(th);
            }

            public final void onNext(R r) {
                this.downstream.onNext(r);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this, disposable);
            }
        }

        ConcatMapDelayErrorObserver(Observer<? super R> observer2, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
            this.downstream = observer2;
            this.mapper = function;
            this.bufferSize = i;
            this.tillTheEnd = z;
            this.observer = new DelayErrorInnerObserver<>(observer2, this);
        }

        public final boolean b() {
            return this.cancelled;
        }

        public final void bd_() {
            this.cancelled = true;
            this.upstream.bd_();
            DisposableHelper.a((AtomicReference<Disposable>) this.observer);
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            if (getAndIncrement() == 0) {
                Observer<? super R> observer2 = this.downstream;
                SimpleQueue<T> simpleQueue = this.queue;
                AtomicThrowable atomicThrowable = this.error;
                while (true) {
                    if (!this.active) {
                        if (this.cancelled) {
                            simpleQueue.e();
                            return;
                        } else if (this.tillTheEnd || ((Throwable) atomicThrowable.get()) == null) {
                            boolean z = this.done;
                            try {
                                Object ba_ = simpleQueue.ba_();
                                boolean z2 = ba_ == null;
                                if (z && z2) {
                                    this.cancelled = true;
                                    Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable);
                                    if (a != null) {
                                        observer2.onError(a);
                                        return;
                                    } else {
                                        observer2.onComplete();
                                        return;
                                    }
                                } else if (!z2) {
                                    try {
                                        ObservableSource observableSource = (ObservableSource) ObjectHelper.a(this.mapper.apply(ba_), "The mapper returned a null ObservableSource");
                                        if (observableSource instanceof Callable) {
                                            try {
                                                Object call = ((Callable) observableSource).call();
                                                if (call != null && !this.cancelled) {
                                                    observer2.onNext(call);
                                                }
                                            } catch (Throwable th) {
                                                Exceptions.b(th);
                                                ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable, th);
                                            }
                                        } else {
                                            this.active = true;
                                            observableSource.subscribe(this.observer);
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.b(th2);
                                        this.cancelled = true;
                                        this.upstream.bd_();
                                        simpleQueue.e();
                                        ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable, th2);
                                        observer2.onError(ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable));
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                Exceptions.b(th3);
                                this.cancelled = true;
                                this.upstream.bd_();
                                ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable, th3);
                                observer2.onError(ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable));
                                return;
                            }
                        } else {
                            simpleQueue.e();
                            this.cancelled = true;
                            observer2.onError(ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable));
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public final void onComplete() {
            this.done = true;
            c();
        }

        public final void onError(Throwable th) {
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.error, th)) {
                this.done = true;
                c();
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onNext(T t) {
            if (this.sourceMode == 0) {
                this.queue.a(t);
            }
            c();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int a = queueDisposable.a(3);
                    if (a == 1) {
                        this.sourceMode = a;
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        c();
                        return;
                    } else if (a == 2) {
                        this.sourceMode = a;
                        this.queue = queueDisposable;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }
    }

    static final class SourceObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        final Observer<? super U> downstream;
        int fusionMode;
        final InnerObserver<U> inner;
        final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
        SimpleQueue<T> queue;
        Disposable upstream;

        static final class InnerObserver<U> extends AtomicReference<Disposable> implements Observer<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final Observer<? super U> downstream;
            final SourceObserver<?, ?> parent;

            InnerObserver(Observer<? super U> observer, SourceObserver<?, ?> sourceObserver) {
                this.downstream = observer;
                this.parent = sourceObserver;
            }

            public final void onComplete() {
                SourceObserver<?, ?> sourceObserver = this.parent;
                sourceObserver.active = false;
                sourceObserver.c();
            }

            public final void onError(Throwable th) {
                this.parent.bd_();
                this.downstream.onError(th);
            }

            public final void onNext(U u) {
                this.downstream.onNext(u);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this, disposable);
            }
        }

        SourceObserver(Observer<? super U> observer, Function<? super T, ? extends ObservableSource<? extends U>> function, int i) {
            this.downstream = observer;
            this.mapper = function;
            this.bufferSize = i;
            this.inner = new InnerObserver<>(observer, this);
        }

        public final boolean b() {
            return this.disposed;
        }

        public final void bd_() {
            this.disposed = true;
            DisposableHelper.a((AtomicReference<Disposable>) this.inner);
            this.upstream.bd_();
            if (getAndIncrement() == 0) {
                this.queue.e();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            if (getAndIncrement() == 0) {
                while (!this.disposed) {
                    if (!this.active) {
                        boolean z = this.done;
                        try {
                            Object ba_ = this.queue.ba_();
                            boolean z2 = ba_ == null;
                            if (z && z2) {
                                this.disposed = true;
                                this.downstream.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    ObservableSource observableSource = (ObservableSource) ObjectHelper.a(this.mapper.apply(ba_), "The mapper returned a null ObservableSource");
                                    this.active = true;
                                    observableSource.subscribe(this.inner);
                                } catch (Throwable th) {
                                    Exceptions.b(th);
                                    bd_();
                                    this.queue.e();
                                    this.downstream.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            Exceptions.b(th2);
                            bd_();
                            this.queue.e();
                            this.downstream.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.queue.e();
            }
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                c();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.a(th);
                return;
            }
            this.done = true;
            bd_();
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.fusionMode == 0) {
                    this.queue.a(t);
                }
                c();
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int a = queueDisposable.a(3);
                    if (a == 1) {
                        this.fusionMode = a;
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        c();
                        return;
                    } else if (a == 2) {
                        this.fusionMode = a;
                        this.queue = queueDisposable;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, int i, ErrorMode errorMode) {
        super(observableSource);
        this.b = function;
        this.d = errorMode;
        this.c = Math.max(8, i);
    }

    public final void a(Observer<? super U> observer) {
        if (!ObservableScalarXMap.a(this.a, observer, this.b)) {
            if (this.d == ErrorMode.IMMEDIATE) {
                this.a.subscribe(new SourceObserver(new SerializedObserver(observer), this.b, this.c));
            } else {
                this.a.subscribe(new ConcatMapDelayErrorObserver(observer, this.b, this.c, this.d == ErrorMode.END));
            }
        }
    }
}
