package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableFlatMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    private Function<? super T, ? extends ObservableSource<? extends U>> b;
    private boolean c;
    private int d;
    private int e;

    static final class InnerObserver<T, U> extends AtomicReference<Disposable> implements Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;
        final long id;
        final MergeObserver<T, U> parent;
        volatile SimpleQueue<U> queue;

        InnerObserver(MergeObserver<T, U> mergeObserver, long j) {
            this.id = j;
            this.parent = mergeObserver;
        }

        public final void onComplete() {
            this.done = true;
            this.parent.c();
        }

        public final void onError(Throwable th) {
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.parent.errors, th)) {
                if (!this.parent.delayErrors) {
                    this.parent.e();
                }
                this.done = true;
                this.parent.c();
                return;
            }
            RxJavaPlugins.a(th);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
            if (r0.getAndIncrement() == 0) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
            if (r0.decrementAndGet() == 0) goto L_0x003f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(U r4) {
            /*
                r3 = this;
                int r0 = r3.fusionMode
                if (r0 != 0) goto L_0x003a
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r0 = r3.parent
                int r1 = r0.get()
                if (r1 != 0) goto L_0x0020
                r1 = 0
                r2 = 1
                boolean r1 = r0.compareAndSet(r1, r2)
                if (r1 == 0) goto L_0x0020
                io.reactivex.Observer<? super U> r1 = r0.downstream
                r1.onNext(r4)
                int r4 = r0.decrementAndGet()
                if (r4 != 0) goto L_0x0036
                goto L_0x003f
            L_0x0020:
                io.reactivex.internal.fuseable.SimpleQueue<U> r1 = r3.queue
                if (r1 != 0) goto L_0x002d
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r2 = r0.bufferSize
                r1.<init>(r2)
                r3.queue = r1
            L_0x002d:
                r1.a(r4)
                int r4 = r0.getAndIncrement()
                if (r4 != 0) goto L_0x0039
            L_0x0036:
                r0.d()
            L_0x0039:
                return
            L_0x003a:
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r4 = r3.parent
                r4.c()
            L_0x003f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver.onNext(java.lang.Object):void");
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.b(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int a = queueDisposable.a(7);
                if (a == 1) {
                    this.fusionMode = a;
                    this.queue = queueDisposable;
                    this.done = true;
                    this.parent.c();
                } else if (a == 2) {
                    this.fusionMode = a;
                    this.queue = queueDisposable;
                }
            }
        }
    }

    static final class MergeObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {
        private static InnerObserver<?, ?>[] a = new InnerObserver[0];
        private static InnerObserver<?, ?>[] b = new InnerObserver[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super U> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<InnerObserver<?, ?>[]> observers;
        volatile SimplePlainQueue<U> queue;
        Queue<ObservableSource<? extends U>> sources;
        long uniqueId;
        Disposable upstream;
        int wip;

        MergeObserver(Observer<? super U> observer, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            if (i != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i);
            }
            this.observers = new AtomicReference<>(a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(io.reactivex.ObservableSource<? extends U> r6) {
            /*
                r5 = this;
            L_0x0000:
                boolean r0 = r6 instanceof java.util.concurrent.Callable
                if (r0 == 0) goto L_0x0032
                java.util.concurrent.Callable r6 = (java.util.concurrent.Callable) r6
                boolean r6 = r5.a(r6)
                if (r6 == 0) goto L_0x0047
                int r6 = r5.maxConcurrency
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r6 == r0) goto L_0x0047
                r6 = 0
                monitor-enter(r5)
                java.util.Queue<io.reactivex.ObservableSource<? extends U>> r0 = r5.sources     // Catch:{ all -> 0x002f }
                java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x002f }
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0     // Catch:{ all -> 0x002f }
                r1 = 1
                if (r0 != 0) goto L_0x0026
                int r6 = r5.wip     // Catch:{ all -> 0x002f }
                int r6 = r6 - r1
                r5.wip = r6     // Catch:{ all -> 0x002f }
                r6 = 1
            L_0x0026:
                monitor-exit(r5)     // Catch:{ all -> 0x002f }
                if (r6 == 0) goto L_0x002d
                r5.c()
                return
            L_0x002d:
                r6 = r0
                goto L_0x0000
            L_0x002f:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x002f }
                throw r6
            L_0x0032:
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver r0 = new io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver
                long r1 = r5.uniqueId
                r3 = 1
                long r3 = r3 + r1
                r5.uniqueId = r3
                r0.<init>(r5, r1)
                boolean r1 = r5.a(r0)
                if (r1 == 0) goto L_0x0047
                r6.subscribe(r0)
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.a(io.reactivex.ObservableSource):void");
        }

        private boolean a(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                innerObserverArr = (InnerObserver[]) this.observers.get();
                if (innerObserverArr == b) {
                    DisposableHelper.a((AtomicReference<Disposable>) innerObserver);
                    return false;
                }
                int length = innerObserverArr.length;
                innerObserverArr2 = new InnerObserver[(length + 1)];
                System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                innerObserverArr2[length] = innerObserver;
            } while (!this.observers.compareAndSet(innerObserverArr, innerObserverArr2));
            return true;
        }

        private boolean a(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    SimplePlainQueue<U> simplePlainQueue = this.queue;
                    if (simplePlainQueue == null) {
                        int i = this.maxConcurrency;
                        simplePlainQueue = i == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.bufferSize) : new SpscArrayQueue<>(i);
                        this.queue = simplePlainQueue;
                    }
                    if (!simplePlainQueue.a(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.downstream.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                d();
                return true;
            } catch (Throwable th) {
                Exceptions.b(th);
                ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th);
                c();
                return true;
            }
        }

        private void b(InnerObserver<T, U> innerObserver) {
            InnerObserver<T, U>[] innerObserverArr;
            Object obj;
            do {
                innerObserverArr = (InnerObserver[]) this.observers.get();
                int length = innerObserverArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (innerObserverArr[i2] == innerObserver) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = a;
                        } else {
                            InnerObserver[] innerObserverArr2 = new InnerObserver[(length - 1)];
                            System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, i);
                            System.arraycopy(innerObserverArr, i + 1, innerObserverArr2, i, (length - i) - 1);
                            obj = innerObserverArr2;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.observers.compareAndSet(innerObserverArr, obj));
        }

        private boolean f() {
            if (this.cancelled) {
                return true;
            }
            Throwable th = (Throwable) this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            e();
            Throwable a2 = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
            if (a2 != ExceptionHelper.a) {
                this.downstream.onError(a2);
            }
            return true;
        }

        public final boolean b() {
            return this.cancelled;
        }

        public final void bd_() {
            if (!this.cancelled) {
                this.cancelled = true;
                if (e()) {
                    Throwable a2 = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                    if (a2 != null && a2 != ExceptionHelper.a) {
                        RxJavaPlugins.a(a2);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            if (getAndIncrement() == 0) {
                d();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            int i;
            int i2;
            int i3;
            Observer<? super U> observer = this.downstream;
            int i4 = 1;
            while (!f()) {
                SimplePlainQueue<U> simplePlainQueue = this.queue;
                if (simplePlainQueue != null) {
                    while (!f()) {
                        Object ba_ = simplePlainQueue.ba_();
                        if (ba_ != null) {
                            observer.onNext(ba_);
                        }
                    }
                    return;
                }
                boolean z = this.done;
                SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                InnerObserver[] innerObserverArr = (InnerObserver[]) this.observers.get();
                int length = innerObserverArr.length;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.sources.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((simplePlainQueue2 == null || simplePlainQueue2.d()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        long j = this.lastId;
                        int i5 = this.lastIndex;
                        if (length <= i5 || innerObserverArr[i5].id != j) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            int i6 = i5;
                            for (int i7 = 0; i7 < length && innerObserverArr[i6].id != j; i7++) {
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                            }
                            this.lastIndex = i6;
                            this.lastId = innerObserverArr[i6].id;
                            i5 = i6;
                        }
                        int i8 = 0;
                        i2 = 0;
                        while (i8 < length) {
                            if (!f()) {
                                InnerObserver innerObserver = innerObserverArr[i3];
                                SimpleQueue<U> simpleQueue = innerObserver.queue;
                                if (simpleQueue != null) {
                                    while (true) {
                                        try {
                                            Object ba_2 = simpleQueue.ba_();
                                            if (ba_2 == null) {
                                                break;
                                            }
                                            observer.onNext(ba_2);
                                            if (f()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.b(th);
                                            DisposableHelper.a((AtomicReference<Disposable>) innerObserver);
                                            ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th);
                                            if (!f()) {
                                                b(innerObserver);
                                                i2++;
                                                i3++;
                                                if (i3 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = innerObserver.done;
                                SimpleQueue<U> simpleQueue2 = innerObserver.queue;
                                if (z2 && (simpleQueue2 == null || simpleQueue2.d())) {
                                    b(innerObserver);
                                    if (!f()) {
                                        i2++;
                                    } else {
                                        return;
                                    }
                                }
                                i3++;
                                if (i3 != length) {
                                    i8++;
                                }
                                i3 = 0;
                                i8++;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i3;
                        this.lastId = innerObserverArr[i3].id;
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                        while (true) {
                            int i9 = i2 - 1;
                            if (i2 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                ObservableSource observableSource = (ObservableSource) this.sources.poll();
                                if (observableSource == null) {
                                    this.wip--;
                                } else {
                                    a(observableSource);
                                }
                            }
                            i2 = i9;
                        }
                        while (true) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable a2 = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                    if (a2 != ExceptionHelper.a) {
                        if (a2 == null) {
                            observer.onComplete();
                            return;
                        }
                        observer.onError(a2);
                    }
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean e() {
            this.upstream.bd_();
            InnerObserver<?, ?>[] innerObserverArr = (InnerObserver[]) this.observers.get();
            InnerObserver<?, ?>[] innerObserverArr2 = b;
            if (innerObserverArr != innerObserverArr2) {
                InnerObserver<?, ?>[] innerObserverArr3 = (InnerObserver[]) this.observers.getAndSet(innerObserverArr2);
                if (innerObserverArr3 != b) {
                    for (InnerObserver<?, ?> a2 : innerObserverArr3) {
                        DisposableHelper.a((AtomicReference<Disposable>) a2);
                    }
                    return true;
                }
            }
            return false;
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
            } else if (ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                this.done = true;
                c();
            } else {
                RxJavaPlugins.a(th);
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                try {
                    ObservableSource observableSource = (ObservableSource) ObjectHelper.a(this.mapper.apply(t), "The mapper returned a null ObservableSource");
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.wip == this.maxConcurrency) {
                                this.sources.offer(observableSource);
                                return;
                            }
                            this.wip++;
                        }
                    }
                    a(observableSource);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.upstream.bd_();
                    onError(th);
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
        super(observableSource);
        this.b = function;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final void a(Observer<? super U> observer) {
        if (!ObservableScalarXMap.a(this.a, observer, this.b)) {
            ObservableSource observableSource = this.a;
            MergeObserver mergeObserver = new MergeObserver(observer, this.b, this.c, this.d, this.e);
            observableSource.subscribe(mergeObserver);
        }
    }
}
