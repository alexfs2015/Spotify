package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
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
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableConcatMapCompletable<T> extends Completable {
    private Observable<T> a;
    private Function<? super T, ? extends CompletableSource> b;
    private ErrorMode c;
    private int d;

    static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        volatile boolean disposed;
        volatile boolean done;
        final CompletableObserver downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapInnerObserver inner = new ConcatMapInnerObserver(this);
        final Function<? super T, ? extends CompletableSource> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        Disposable upstream;

        static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = 5638352172918776687L;
            final ConcatMapCompletableObserver<?> parent;

            ConcatMapInnerObserver(ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.parent = concatMapCompletableObserver;
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this, disposable);
            }

            public final void onError(Throwable th) {
                ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.parent;
                if (!ExceptionHelper.a((AtomicReference<Throwable>) concatMapCompletableObserver.errors, th)) {
                    RxJavaPlugins.a(th);
                } else if (concatMapCompletableObserver.errorMode == ErrorMode.IMMEDIATE) {
                    concatMapCompletableObserver.disposed = true;
                    concatMapCompletableObserver.upstream.bf_();
                    Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) concatMapCompletableObserver.errors);
                    if (a != ExceptionHelper.a) {
                        concatMapCompletableObserver.downstream.onError(a);
                    }
                    if (concatMapCompletableObserver.getAndIncrement() == 0) {
                        concatMapCompletableObserver.queue.e();
                    }
                } else {
                    concatMapCompletableObserver.active = false;
                    concatMapCompletableObserver.c();
                }
            }

            public final void onComplete() {
                ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.parent;
                concatMapCompletableObserver.active = false;
                concatMapCompletableObserver.c();
            }
        }

        ConcatMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, ErrorMode errorMode2, int i) {
            this.downstream = completableObserver;
            this.mapper = function;
            this.errorMode = errorMode2;
            this.prefetch = i;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int a = queueDisposable.a(3);
                    if (a == 1) {
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        c();
                        return;
                    } else if (a == 2) {
                        this.queue = queueDisposable;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (t != null) {
                this.queue.a(t);
            }
            c();
        }

        public final void onError(Throwable th) {
            if (!ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                RxJavaPlugins.a(th);
            } else if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.disposed = true;
                DisposableHelper.a((AtomicReference<Disposable>) this.inner);
                Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                if (a != ExceptionHelper.a) {
                    this.downstream.onError(a);
                }
                if (getAndIncrement() == 0) {
                    this.queue.e();
                }
            } else {
                this.done = true;
                c();
            }
        }

        public final void onComplete() {
            this.done = true;
            c();
        }

        public final void bf_() {
            this.disposed = true;
            this.upstream.bf_();
            DisposableHelper.a((AtomicReference<Disposable>) this.inner);
            if (getAndIncrement() == 0) {
                this.queue.e();
            }
        }

        public final boolean b() {
            return this.disposed;
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            boolean z;
            if (getAndIncrement() == 0) {
                AtomicThrowable atomicThrowable = this.errors;
                ErrorMode errorMode2 = this.errorMode;
                while (!this.disposed) {
                    if (!this.active) {
                        if (errorMode2 != ErrorMode.BOUNDARY || atomicThrowable.get() == null) {
                            boolean z2 = this.done;
                            CompletableSource completableSource = null;
                            try {
                                Object bc_ = this.queue.bc_();
                                if (bc_ != null) {
                                    completableSource = (CompletableSource) ObjectHelper.a(this.mapper.apply(bc_), "The mapper returned a null CompletableSource");
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z2 && z) {
                                    this.disposed = true;
                                    Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable);
                                    if (a != null) {
                                        this.downstream.onError(a);
                                        return;
                                    } else {
                                        this.downstream.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    this.active = true;
                                    completableSource.a(this.inner);
                                }
                            } catch (Throwable th) {
                                Exceptions.b(th);
                                this.disposed = true;
                                this.queue.e();
                                this.upstream.bf_();
                                ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable, th);
                                this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable));
                                return;
                            }
                        } else {
                            this.disposed = true;
                            this.queue.e();
                            this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable));
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
    }

    public ObservableConcatMapCompletable(Observable<T> observable, Function<? super T, ? extends CompletableSource> function, ErrorMode errorMode, int i) {
        this.a = observable;
        this.b = function;
        this.c = errorMode;
        this.d = i;
    }

    public final void b(CompletableObserver completableObserver) {
        if (!ScalarXMapZHelper.a((Object) this.a, this.b, completableObserver)) {
            this.a.subscribe(new ConcatMapCompletableObserver(completableObserver, this.b, this.c, this.d));
        }
    }
}
