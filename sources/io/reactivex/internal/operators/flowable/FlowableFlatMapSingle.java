package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableFlatMapSingle<T, R> extends AbstractFlowableWithUpstream<T, R> {
    private Function<? super T, ? extends SingleSource<? extends R>> c;
    private boolean d;
    private int e;

    static final class FlatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, wrh {
        private static final long serialVersionUID = 8600231336733376951L;
        final AtomicInteger active = new AtomicInteger(1);
        volatile boolean cancelled;
        final boolean delayErrors;
        final wrg<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        final int maxConcurrency;
        final AtomicReference<SpscLinkedArrayQueue<R>> queue = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final CompositeDisposable set = new CompositeDisposable();
        wrh upstream;

        final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            InnerObserver() {
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.b(this, disposable);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
                if (r0.decrementAndGet() != 0) goto L_0x0091;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
                if (r0.getAndIncrement() == 0) goto L_0x0091;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
                r0.e();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c_(R r8) {
                /*
                    r7 = this;
                    io.reactivex.internal.operators.flowable.FlowableFlatMapSingle$FlatMapSingleSubscriber r0 = io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber.this
                    io.reactivex.disposables.CompositeDisposable r1 = r0.set
                    r1.c(r7)
                    int r1 = r0.get()
                    if (r1 != 0) goto L_0x007d
                    r1 = 1
                    r2 = 0
                    boolean r3 = r0.compareAndSet(r2, r1)
                    if (r3 == 0) goto L_0x007d
                    java.util.concurrent.atomic.AtomicInteger r3 = r0.active
                    int r3 = r3.decrementAndGet()
                    if (r3 != 0) goto L_0x001e
                    goto L_0x001f
                L_0x001e:
                    r1 = 0
                L_0x001f:
                    java.util.concurrent.atomic.AtomicLong r2 = r0.requested
                    long r2 = r2.get()
                    r4 = 0
                    int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r6 == 0) goto L_0x006a
                    wrg<? super R> r2 = r0.downstream
                    r2.b_(r8)
                    java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r8 = r0.queue
                    java.lang.Object r8 = r8.get()
                    io.reactivex.internal.queue.SpscLinkedArrayQueue r8 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r8
                    if (r1 == 0) goto L_0x0056
                    if (r8 == 0) goto L_0x0042
                    boolean r8 = r8.d()
                    if (r8 == 0) goto L_0x0056
                L_0x0042:
                    io.reactivex.internal.util.AtomicThrowable r8 = r0.errors
                    java.lang.Throwable r8 = io.reactivex.internal.util.ExceptionHelper.a(r8)
                    if (r8 == 0) goto L_0x0050
                    wrg<? super R> r0 = r0.downstream
                    r0.onError(r8)
                    goto L_0x0094
                L_0x0050:
                    wrg<? super R> r8 = r0.downstream
                    r8.c()
                    return
                L_0x0056:
                    java.util.concurrent.atomic.AtomicLong r8 = r0.requested
                    r1 = 1
                    io.reactivex.internal.util.BackpressureHelper.c(r8, r1)
                    int r8 = r0.maxConcurrency
                    r3 = 2147483647(0x7fffffff, float:NaN)
                    if (r8 == r3) goto L_0x0073
                    wrh r8 = r0.upstream
                    r8.a(r1)
                    goto L_0x0073
                L_0x006a:
                    io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = r0.b()
                    monitor-enter(r1)
                    r1.a(r8)     // Catch:{ all -> 0x007a }
                    monitor-exit(r1)     // Catch:{ all -> 0x007a }
                L_0x0073:
                    int r8 = r0.decrementAndGet()
                    if (r8 == 0) goto L_0x0094
                    goto L_0x0091
                L_0x007a:
                    r8 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x007a }
                    throw r8
                L_0x007d:
                    io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = r0.b()
                    monitor-enter(r1)
                    r1.a(r8)     // Catch:{ all -> 0x0095 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0095 }
                    java.util.concurrent.atomic.AtomicInteger r8 = r0.active
                    r8.decrementAndGet()
                    int r8 = r0.getAndIncrement()
                    if (r8 != 0) goto L_0x0094
                L_0x0091:
                    r0.e()
                L_0x0094:
                    return
                L_0x0095:
                    r8 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0095 }
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber.InnerObserver.c_(java.lang.Object):void");
            }

            public final void onError(Throwable th) {
                FlatMapSingleSubscriber flatMapSingleSubscriber = FlatMapSingleSubscriber.this;
                flatMapSingleSubscriber.set.c(this);
                if (ExceptionHelper.a((AtomicReference<Throwable>) flatMapSingleSubscriber.errors, th)) {
                    if (!flatMapSingleSubscriber.delayErrors) {
                        flatMapSingleSubscriber.upstream.a();
                        flatMapSingleSubscriber.set.bf_();
                    } else if (flatMapSingleSubscriber.maxConcurrency != Integer.MAX_VALUE) {
                        flatMapSingleSubscriber.upstream.a(1);
                    }
                    flatMapSingleSubscriber.active.decrementAndGet();
                    flatMapSingleSubscriber.d();
                    return;
                }
                RxJavaPlugins.a(th);
            }

            public final boolean b() {
                return DisposableHelper.a((Disposable) get());
            }

            public final void bf_() {
                DisposableHelper.a((AtomicReference<Disposable>) this);
            }
        }

        FlatMapSingleSubscriber(wrg<? super R> wrg, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
            this.downstream = wrg;
            this.mapper = function;
            this.delayErrors = z;
            this.maxConcurrency = i;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    wrh.a(Long.MAX_VALUE);
                    return;
                }
                wrh.a((long) i);
            }
        }

        public final void b_(T t) {
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.a(this.mapper.apply(t), "The mapper returned a null SingleSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (!this.cancelled && this.set.a((Disposable) innerObserver)) {
                    singleSource.b(innerObserver);
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.upstream.a();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.active.decrementAndGet();
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                if (!this.delayErrors) {
                    this.set.bf_();
                }
                d();
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void c() {
            this.active.decrementAndGet();
            d();
        }

        public final void a() {
            this.cancelled = true;
            this.upstream.a();
            this.set.bf_();
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                d();
            }
        }

        /* access modifiers changed from: 0000 */
        public final SpscLinkedArrayQueue<R> b() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
            do {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) this.queue.get();
                if (spscLinkedArrayQueue2 != null) {
                    return spscLinkedArrayQueue2;
                }
                spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Flowable.a());
            } while (!this.queue.compareAndSet(null, spscLinkedArrayQueue));
            return spscLinkedArrayQueue;
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        private void f() {
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.queue.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.e();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void e() {
            boolean z;
            wrg<? super R> wrg = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.queue;
            int i = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    z = false;
                    if (j2 == j) {
                        break;
                    } else if (this.cancelled) {
                        f();
                        return;
                    } else if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                        boolean z2 = atomicInteger.get() == 0;
                        SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                        Object bc_ = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.bc_() : null;
                        boolean z3 = bc_ == null;
                        if (!z2 || !z3) {
                            if (z3) {
                                break;
                            }
                            wrg.b_(bc_);
                            j2++;
                        } else {
                            Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                            if (a != null) {
                                wrg.onError(a);
                                return;
                            } else {
                                wrg.c();
                                return;
                            }
                        }
                    } else {
                        Throwable a2 = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                        f();
                        wrg.onError(a2);
                        return;
                    }
                }
                if (j2 == j) {
                    if (this.cancelled) {
                        f();
                        return;
                    } else if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                        boolean z4 = atomicInteger.get() == 0;
                        SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) atomicReference.get();
                        if (spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.d()) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable a3 = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                            if (a3 != null) {
                                wrg.onError(a3);
                                return;
                            } else {
                                wrg.c();
                                return;
                            }
                        }
                    } else {
                        Throwable a4 = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                        f();
                        wrg.onError(a4);
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.c(this.requested, j2);
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.a(j2);
                    }
                }
                i = addAndGet(-i);
            } while (i != 0);
        }
    }

    public FlowableFlatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
        super(flowable);
        this.c = function;
        this.d = z;
        this.e = i;
    }

    public final void a(wrg<? super R> wrg) {
        this.b.a((FlowableSubscriber<? super T>) new FlatMapSingleSubscriber<Object>(wrg, this.c, this.d, this.e));
    }
}
