package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableFlatMapMaybe<T, R> extends AbstractObservableWithUpstream<T, R> {
    private Function<? super T, ? extends MaybeSource<? extends R>> b;
    private boolean c;

    static final class FlatMapMaybeObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8600231336733376951L;
        final AtomicInteger active = new AtomicInteger(1);
        volatile boolean cancelled;
        final boolean delayErrors;
        final Observer<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        final AtomicReference<SpscLinkedArrayQueue<R>> queue = new AtomicReference<>();
        final CompositeDisposable set = new CompositeDisposable();
        Disposable upstream;

        final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            InnerObserver() {
            }

            public final boolean b() {
                return DisposableHelper.a((Disposable) get());
            }

            public final void bd_() {
                DisposableHelper.a((AtomicReference<Disposable>) this);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
                if (r0.decrementAndGet() != 0) goto L_0x007e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
                if (r0.getAndIncrement() == 0) goto L_0x007e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
                r0.d();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c_(R r5) {
                /*
                    r4 = this;
                    io.reactivex.internal.operators.observable.ObservableFlatMapMaybe$FlatMapMaybeObserver r0 = io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver.this
                    io.reactivex.disposables.CompositeDisposable r1 = r0.set
                    r1.c(r4)
                    int r1 = r0.get()
                    if (r1 != 0) goto L_0x0051
                    r1 = 1
                    r2 = 0
                    boolean r3 = r0.compareAndSet(r2, r1)
                    if (r3 == 0) goto L_0x0051
                    io.reactivex.Observer<? super R> r3 = r0.downstream
                    r3.onNext(r5)
                    java.util.concurrent.atomic.AtomicInteger r5 = r0.active
                    int r5 = r5.decrementAndGet()
                    if (r5 != 0) goto L_0x0023
                    goto L_0x0024
                L_0x0023:
                    r1 = 0
                L_0x0024:
                    java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r5 = r0.queue
                    java.lang.Object r5 = r5.get()
                    io.reactivex.internal.queue.SpscLinkedArrayQueue r5 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r5
                    if (r1 == 0) goto L_0x004a
                    if (r5 == 0) goto L_0x0036
                    boolean r5 = r5.d()
                    if (r5 == 0) goto L_0x004a
                L_0x0036:
                    io.reactivex.internal.util.AtomicThrowable r5 = r0.errors
                    java.lang.Throwable r5 = io.reactivex.internal.util.ExceptionHelper.a(r5)
                    if (r5 == 0) goto L_0x0044
                    io.reactivex.Observer<? super R> r0 = r0.downstream
                    r0.onError(r5)
                    goto L_0x0081
                L_0x0044:
                    io.reactivex.Observer<? super R> r5 = r0.downstream
                    r5.onComplete()
                    return
                L_0x004a:
                    int r5 = r0.decrementAndGet()
                    if (r5 == 0) goto L_0x0081
                    goto L_0x007e
                L_0x0051:
                    java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r1 = r0.queue
                    java.lang.Object r1 = r1.get()
                    io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r1
                    if (r1 == 0) goto L_0x005c
                    goto L_0x006e
                L_0x005c:
                    io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                    int r2 = io.reactivex.Observable.b()
                    r1.<init>(r2)
                    java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r2 = r0.queue
                    r3 = 0
                    boolean r2 = r2.compareAndSet(r3, r1)
                    if (r2 == 0) goto L_0x0051
                L_0x006e:
                    monitor-enter(r1)
                    r1.a(r5)     // Catch:{ all -> 0x0082 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0082 }
                    java.util.concurrent.atomic.AtomicInteger r5 = r0.active
                    r5.decrementAndGet()
                    int r5 = r0.getAndIncrement()
                    if (r5 != 0) goto L_0x0081
                L_0x007e:
                    r0.d()
                L_0x0081:
                    return
                L_0x0082:
                    r5 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0082 }
                    goto L_0x0086
                L_0x0085:
                    throw r5
                L_0x0086:
                    goto L_0x0085
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver.InnerObserver.c_(java.lang.Object):void");
            }

            public final void onComplete() {
                FlatMapMaybeObserver flatMapMaybeObserver = FlatMapMaybeObserver.this;
                flatMapMaybeObserver.set.c(this);
                if (flatMapMaybeObserver.get() == 0) {
                    boolean z = true;
                    if (flatMapMaybeObserver.compareAndSet(0, 1)) {
                        if (flatMapMaybeObserver.active.decrementAndGet() != 0) {
                            z = false;
                        }
                        SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) flatMapMaybeObserver.queue.get();
                        if (!z || (spscLinkedArrayQueue != null && !spscLinkedArrayQueue.d())) {
                            if (flatMapMaybeObserver.decrementAndGet() != 0) {
                                flatMapMaybeObserver.d();
                                return;
                            }
                        }
                        Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) flatMapMaybeObserver.errors);
                        if (a != null) {
                            flatMapMaybeObserver.downstream.onError(a);
                        } else {
                            flatMapMaybeObserver.downstream.onComplete();
                            return;
                        }
                    }
                }
                flatMapMaybeObserver.active.decrementAndGet();
                flatMapMaybeObserver.c();
            }

            public final void onError(Throwable th) {
                FlatMapMaybeObserver flatMapMaybeObserver = FlatMapMaybeObserver.this;
                flatMapMaybeObserver.set.c(this);
                if (ExceptionHelper.a((AtomicReference<Throwable>) flatMapMaybeObserver.errors, th)) {
                    if (!flatMapMaybeObserver.delayErrors) {
                        flatMapMaybeObserver.upstream.bd_();
                        flatMapMaybeObserver.set.bd_();
                    }
                    flatMapMaybeObserver.active.decrementAndGet();
                    flatMapMaybeObserver.c();
                    return;
                }
                RxJavaPlugins.a(th);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.b(this, disposable);
            }
        }

        FlatMapMaybeObserver(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z;
        }

        private void e() {
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.queue.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.e();
            }
        }

        public final boolean b() {
            return this.cancelled;
        }

        public final void bd_() {
            this.cancelled = true;
            this.upstream.bd_();
            this.set.bd_();
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            if (getAndIncrement() == 0) {
                d();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            Observer<? super R> observer = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.queue;
            int i = 1;
            while (!this.cancelled) {
                if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                    Object ba_ = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.ba_() : null;
                    if (ba_ == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                        if (a != null) {
                            observer.onError(a);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    } else if (!z) {
                        observer.onNext(ba_);
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable a2 = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                    e();
                    observer.onError(a2);
                    return;
                }
            }
            e();
        }

        public final void onComplete() {
            this.active.decrementAndGet();
            c();
        }

        public final void onError(Throwable th) {
            this.active.decrementAndGet();
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                if (!this.delayErrors) {
                    this.set.bd_();
                }
                c();
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onNext(T t) {
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.a(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (!this.cancelled && this.set.a((Disposable) innerObserver)) {
                    maybeSource.a(innerObserver);
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.upstream.bd_();
                onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapMaybe(ObservableSource<T> observableSource, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        super(observableSource);
        this.b = function;
        this.c = z;
    }

    public final void a(Observer<? super R> observer) {
        this.a.subscribe(new FlatMapMaybeObserver(observer, this.b, this.c));
    }
}
