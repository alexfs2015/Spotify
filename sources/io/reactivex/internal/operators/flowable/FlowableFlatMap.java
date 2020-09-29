package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    private Function<? super T, ? extends xfk<? extends U>> c;
    private boolean d;
    private int e;
    private int f;

    static final class InnerSubscriber<T, U> extends AtomicReference<xfm> implements FlowableSubscriber<U>, Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit = (this.bufferSize >> 2);
        final MergeSubscriber<T, U> parent;
        long produced;
        volatile SimpleQueue<U> queue;

        InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j) {
            this.id = j;
            this.parent = mergeSubscriber;
            this.bufferSize = mergeSubscriber.bufferSize;
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j) {
            if (this.fusionMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((xfm) get()).a(j2);
                    return;
                }
                this.produced = j2;
            }
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a((AtomicReference<xfm>) this, xfm)) {
                if (xfm instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) xfm;
                    int a = queueSubscription.a(7);
                    if (a == 1) {
                        this.fusionMode = a;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.b();
                        return;
                    } else if (a == 2) {
                        this.fusionMode = a;
                        this.queue = queueSubscription;
                    }
                }
                xfm.a((long) this.bufferSize);
            }
        }

        public final boolean b() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
            if (r0.decrementAndGet() != 0) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
            if (r0.getAndIncrement() == 0) goto L_0x008d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b_(U r9) {
            /*
                r8 = this;
                int r0 = r8.fusionMode
                r1 = 2
                if (r0 == r1) goto L_0x0091
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r0 = r8.parent
                int r1 = r0.get()
                java.lang.String r2 = "Inner queue full?!"
                if (r1 != 0) goto L_0x006b
                r1 = 0
                r3 = 1
                boolean r1 = r0.compareAndSet(r1, r3)
                if (r1 == 0) goto L_0x006b
                java.util.concurrent.atomic.AtomicLong r1 = r0.requested
                long r3 = r1.get()
                io.reactivex.internal.fuseable.SimpleQueue<U> r1 = r8.queue
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x0046
                if (r1 == 0) goto L_0x002d
                boolean r5 = r1.d()
                if (r5 == 0) goto L_0x0046
            L_0x002d:
                xfl<? super U> r1 = r0.downstream
                r1.b_(r9)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r9 == 0) goto L_0x0040
                java.util.concurrent.atomic.AtomicLong r9 = r0.requested
                r9.decrementAndGet()
            L_0x0040:
                r1 = 1
                r8.a(r1)
                goto L_0x0064
            L_0x0046:
                if (r1 != 0) goto L_0x0055
                io.reactivex.internal.fuseable.SimpleQueue<U> r1 = r8.queue
                if (r1 != 0) goto L_0x0055
                io.reactivex.internal.queue.SpscArrayQueue r1 = new io.reactivex.internal.queue.SpscArrayQueue
                int r3 = r0.bufferSize
                r1.<init>(r3)
                r8.queue = r1
            L_0x0055:
                boolean r9 = r1.a(r9)
                if (r9 != 0) goto L_0x0064
                io.reactivex.exceptions.MissingBackpressureException r9 = new io.reactivex.exceptions.MissingBackpressureException
                r9.<init>(r2)
                r0.onError(r9)
                goto L_0x0096
            L_0x0064:
                int r9 = r0.decrementAndGet()
                if (r9 == 0) goto L_0x0090
                goto L_0x008d
            L_0x006b:
                io.reactivex.internal.fuseable.SimpleQueue<U> r1 = r8.queue
                if (r1 != 0) goto L_0x0078
                io.reactivex.internal.queue.SpscArrayQueue r1 = new io.reactivex.internal.queue.SpscArrayQueue
                int r3 = r0.bufferSize
                r1.<init>(r3)
                r8.queue = r1
            L_0x0078:
                boolean r9 = r1.a(r9)
                if (r9 != 0) goto L_0x0087
                io.reactivex.exceptions.MissingBackpressureException r9 = new io.reactivex.exceptions.MissingBackpressureException
                r9.<init>(r2)
                r0.onError(r9)
                goto L_0x0096
            L_0x0087:
                int r9 = r0.getAndIncrement()
                if (r9 != 0) goto L_0x0090
            L_0x008d:
                r0.d()
            L_0x0090:
                return
            L_0x0091:
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r9 = r8.parent
                r9.b()
            L_0x0096:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber.b_(java.lang.Object):void");
        }

        public final void bd_() {
            SubscriptionHelper.a((AtomicReference<xfm>) this);
        }

        public final void c() {
            this.done = true;
            this.parent.b();
        }

        public final void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            MergeSubscriber<T, U> mergeSubscriber = this.parent;
            if (ExceptionHelper.a((AtomicReference<Throwable>) mergeSubscriber.errs, th)) {
                this.done = true;
                if (!mergeSubscriber.delayErrors) {
                    mergeSubscriber.upstream.a();
                    for (InnerSubscriber bd_ : (InnerSubscriber[]) mergeSubscriber.subscribers.getAndSet(MergeSubscriber.a)) {
                        bd_.bd_();
                    }
                }
                mergeSubscriber.b();
                return;
            }
            RxJavaPlugins.a(th);
        }
    }

    static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, xfm {
        static final InnerSubscriber<?, ?>[] a = new InnerSubscriber[0];
        private static InnerSubscriber<?, ?>[] b = new InnerSubscriber[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final xfl<? super U> downstream;
        final AtomicThrowable errs = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends xfk<? extends U>> mapper;
        final int maxConcurrency;
        volatile SimplePlainQueue<U> queue;
        final AtomicLong requested = new AtomicLong();
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<InnerSubscriber<?, ?>[]> subscribers = new AtomicReference<>();
        long uniqueId;
        xfm upstream;

        MergeSubscriber(xfl<? super U> xfl, Function<? super T, ? extends xfk<? extends U>> function, boolean z, int i, int i2) {
            this.downstream = xfl;
            this.mapper = function;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            this.scalarLimit = Math.max(1, i >> 1);
            this.subscribers.lazySet(b);
        }

        private boolean a(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                if (innerSubscriberArr == a) {
                    innerSubscriber.bd_();
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[(length + 1)];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        private void b(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<T, U>[] innerSubscriberArr;
            Object obj;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (innerSubscriberArr[i2] == innerSubscriber) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = b;
                        } else {
                            InnerSubscriber[] innerSubscriberArr2 = new InnerSubscriber[(length - 1)];
                            System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, i);
                            System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr2, i, (length - i) - 1);
                            obj = innerSubscriberArr2;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, obj));
        }

        private SimpleQueue<U> e() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue == null) {
                int i = this.maxConcurrency;
                simplePlainQueue = i == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.bufferSize) : new SpscArrayQueue<>(i);
                this.queue = simplePlainQueue;
            }
            return simplePlainQueue;
        }

        private boolean f() {
            if (this.cancelled) {
                g();
                return true;
            } else if (this.delayErrors || this.errs.get() == null) {
                return false;
            } else {
                g();
                Throwable a2 = ExceptionHelper.a((AtomicReference<Throwable>) this.errs);
                if (a2 != ExceptionHelper.a) {
                    this.downstream.onError(a2);
                }
                return true;
            }
        }

        private void g() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                simplePlainQueue.e();
            }
        }

        public final void a() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.a();
                InnerSubscriber<?, ?>[] innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                InnerSubscriber<?, ?>[] innerSubscriberArr2 = a;
                if (innerSubscriberArr != innerSubscriberArr2) {
                    InnerSubscriber<?, ?>[] innerSubscriberArr3 = (InnerSubscriber[]) this.subscribers.getAndSet(innerSubscriberArr2);
                    if (innerSubscriberArr3 != a) {
                        for (InnerSubscriber<?, ?> bd_ : innerSubscriberArr3) {
                            bd_.bd_();
                        }
                        Throwable a2 = ExceptionHelper.a((AtomicReference<Throwable>) this.errs);
                        if (!(a2 == null || a2 == ExceptionHelper.a)) {
                            RxJavaPlugins.a(a2);
                        }
                    }
                }
                if (getAndIncrement() == 0) {
                    SimplePlainQueue<U> simplePlainQueue = this.queue;
                    if (simplePlainQueue != null) {
                        simplePlainQueue.e();
                    }
                }
            }
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                b();
            }
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                this.downstream.a(this);
                if (!this.cancelled) {
                    int i = this.maxConcurrency;
                    if (i == Integer.MAX_VALUE) {
                        xfm.a(Long.MAX_VALUE);
                        return;
                    }
                    xfm.a((long) i);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            if (getAndIncrement() == 0) {
                d();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
            if (decrementAndGet() != 0) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
            if (getAndIncrement() == 0) goto L_0x00aa;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b_(T r11) {
            /*
                r10 = this;
                boolean r0 = r10.done
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                io.reactivex.functions.Function<? super T, ? extends xfk<? extends U>> r0 = r10.mapper     // Catch:{ all -> 0x00eb }
                java.lang.Object r11 = r0.apply(r11)     // Catch:{ all -> 0x00eb }
                java.lang.String r0 = "The mapper returned a null Publisher"
                java.lang.Object r11 = io.reactivex.internal.functions.ObjectHelper.a(r11, r0)     // Catch:{ all -> 0x00eb }
                xfk r11 = (defpackage.xfk) r11     // Catch:{ all -> 0x00eb }
                boolean r0 = r11 instanceof java.util.concurrent.Callable
                if (r0 == 0) goto L_0x00d5
                java.util.concurrent.Callable r11 = (java.util.concurrent.Callable) r11     // Catch:{ all -> 0x00c8 }
                java.lang.Object r11 = r11.call()     // Catch:{ all -> 0x00c8 }
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1 = 1
                r2 = 0
                if (r11 == 0) goto L_0x00ae
                int r3 = r10.get()
                java.lang.String r4 = "Scalar queue full?!"
                if (r3 != 0) goto L_0x0091
                boolean r3 = r10.compareAndSet(r2, r1)
                if (r3 == 0) goto L_0x0091
                java.util.concurrent.atomic.AtomicLong r3 = r10.requested
                long r5 = r3.get()
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r3 = r10.queue
                r7 = 0
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 == 0) goto L_0x0075
                if (r3 == 0) goto L_0x0048
                boolean r7 = r3.d()
                if (r7 == 0) goto L_0x0075
            L_0x0048:
                xfl<? super U> r3 = r10.downstream
                r3.b_(r11)
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r11 == 0) goto L_0x005b
                java.util.concurrent.atomic.AtomicLong r11 = r10.requested
                r11.decrementAndGet()
            L_0x005b:
                int r11 = r10.maxConcurrency
                if (r11 == r0) goto L_0x008a
                boolean r11 = r10.cancelled
                if (r11 != 0) goto L_0x008a
                int r11 = r10.scalarEmitted
                int r11 = r11 + r1
                r10.scalarEmitted = r11
                int r0 = r10.scalarLimit
                if (r11 != r0) goto L_0x008a
                r10.scalarEmitted = r2
                xfm r11 = r10.upstream
                long r0 = (long) r0
                r11.a(r0)
                goto L_0x008a
            L_0x0075:
                if (r3 != 0) goto L_0x007b
                io.reactivex.internal.fuseable.SimpleQueue r3 = r10.e()
            L_0x007b:
                boolean r11 = r3.a(r11)
                if (r11 != 0) goto L_0x008a
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                r11.<init>(r4)
                r10.onError(r11)
                goto L_0x00c7
            L_0x008a:
                int r11 = r10.decrementAndGet()
                if (r11 == 0) goto L_0x00ea
                goto L_0x00aa
            L_0x0091:
                io.reactivex.internal.fuseable.SimpleQueue r0 = r10.e()
                boolean r11 = r0.a(r11)
                if (r11 != 0) goto L_0x00a4
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                r11.<init>(r4)
                r10.onError(r11)
                goto L_0x00c7
            L_0x00a4:
                int r11 = r10.getAndIncrement()
                if (r11 != 0) goto L_0x00ea
            L_0x00aa:
                r10.d()
                goto L_0x00ea
            L_0x00ae:
                int r11 = r10.maxConcurrency
                if (r11 == r0) goto L_0x00c7
                boolean r11 = r10.cancelled
                if (r11 != 0) goto L_0x00c7
                int r11 = r10.scalarEmitted
                int r11 = r11 + r1
                r10.scalarEmitted = r11
                int r0 = r10.scalarLimit
                if (r11 != r0) goto L_0x00c7
                r10.scalarEmitted = r2
                xfm r11 = r10.upstream
                long r0 = (long) r0
                r11.a(r0)
            L_0x00c7:
                return
            L_0x00c8:
                r11 = move-exception
                io.reactivex.exceptions.Exceptions.b(r11)
                io.reactivex.internal.util.AtomicThrowable r0 = r10.errs
                io.reactivex.internal.util.ExceptionHelper.a(r0, r11)
                r10.b()
                return
            L_0x00d5:
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber
                long r1 = r10.uniqueId
                r3 = 1
                long r3 = r3 + r1
                r10.uniqueId = r3
                r0.<init>(r10, r1)
                boolean r1 = r10.a(r0)
                if (r1 == 0) goto L_0x00ea
                r11.b(r0)
            L_0x00ea:
                return
            L_0x00eb:
                r11 = move-exception
                io.reactivex.exceptions.Exceptions.b(r11)
                xfm r0 = r10.upstream
                r0.a()
                r10.onError(r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.b_(java.lang.Object):void");
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                b();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            long j;
            long j2;
            long j3;
            long j4;
            boolean z;
            InnerSubscriber[] innerSubscriberArr;
            int i;
            long j5;
            xfl<? super U> xfl = this.downstream;
            int i2 = 1;
            while (!f()) {
                SimplePlainQueue<U> simplePlainQueue = this.queue;
                long j6 = this.requested.get();
                boolean z2 = j6 == Long.MAX_VALUE;
                long j7 = 0;
                if (simplePlainQueue != null) {
                    long j8 = 0;
                    while (true) {
                        long j9 = 0;
                        j = j8;
                        Object obj = null;
                        while (true) {
                            if (j6 == 0) {
                                break;
                            }
                            Object ba_ = simplePlainQueue.ba_();
                            if (!f()) {
                                if (ba_ == null) {
                                    obj = ba_;
                                    break;
                                }
                                xfl.b_(ba_);
                                j++;
                                j9++;
                                j6--;
                                obj = ba_;
                            } else {
                                return;
                            }
                        }
                        if (j9 != 0) {
                            j6 = z2 ? Long.MAX_VALUE : this.requested.addAndGet(-j9);
                        }
                        if (j6 == 0 || obj == null) {
                            break;
                        }
                        j8 = j;
                    }
                } else {
                    j = 0;
                }
                boolean z3 = this.done;
                SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (!z3 || ((simplePlainQueue2 != null && !simplePlainQueue2.d()) || length != 0)) {
                    int i3 = i2;
                    if (length != 0) {
                        long j10 = this.lastId;
                        int i4 = this.lastIndex;
                        if (length <= i4 || innerSubscriberArr2[i4].id != j10) {
                            if (length <= i4) {
                                i4 = 0;
                            }
                            int i5 = i4;
                            for (int i6 = 0; i6 < length && innerSubscriberArr2[i5].id != j10; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.lastIndex = i5;
                            this.lastId = innerSubscriberArr2[i5].id;
                            i4 = i5;
                        }
                        int i7 = i4;
                        z = false;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                innerSubscriberArr = innerSubscriberArr2;
                                break;
                            } else if (!f()) {
                                InnerSubscriber innerSubscriber = innerSubscriberArr2[i7];
                                Object obj2 = null;
                                while (!f()) {
                                    SimpleQueue<U> simpleQueue = innerSubscriber.queue;
                                    if (simpleQueue != null) {
                                        i = length;
                                        Object obj3 = obj2;
                                        innerSubscriberArr = innerSubscriberArr2;
                                        long j11 = j7;
                                        while (true) {
                                            if (j2 == j7) {
                                                break;
                                            }
                                            try {
                                                Object ba_2 = simpleQueue.ba_();
                                                if (ba_2 == null) {
                                                    obj3 = ba_2;
                                                    j7 = 0;
                                                    break;
                                                }
                                                xfl.b_(ba_2);
                                                if (!f()) {
                                                    j2--;
                                                    j11++;
                                                    obj3 = ba_2;
                                                    j7 = 0;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                Exceptions.b(th2);
                                                innerSubscriber.bd_();
                                                ExceptionHelper.a((AtomicReference<Throwable>) this.errs, th2);
                                                if (!this.delayErrors) {
                                                    this.upstream.a();
                                                }
                                                if (!f()) {
                                                    b(innerSubscriber);
                                                    i8++;
                                                    z = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j11 != j7) {
                                            j2 = !z2 ? this.requested.addAndGet(-j11) : Long.MAX_VALUE;
                                            innerSubscriber.a(j11);
                                            j5 = 0;
                                        } else {
                                            j5 = j7;
                                        }
                                        if (!(j2 == j5 || obj3 == null)) {
                                            innerSubscriberArr2 = innerSubscriberArr;
                                            length = i;
                                            obj2 = obj3;
                                            j7 = 0;
                                        }
                                    } else {
                                        innerSubscriberArr = innerSubscriberArr2;
                                        i = length;
                                    }
                                    boolean z4 = innerSubscriber.done;
                                    SimpleQueue<U> simpleQueue2 = innerSubscriber.queue;
                                    if (z4 && (simpleQueue2 == null || simpleQueue2.d())) {
                                        b(innerSubscriber);
                                        if (!f()) {
                                            j++;
                                            z = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j2 == 0) {
                                        break;
                                    }
                                    int i9 = i7 + 1;
                                    i7 = i9 == i ? 0 : i9;
                                    i8++;
                                    innerSubscriberArr2 = innerSubscriberArr;
                                    length = i;
                                    j7 = 0;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i7;
                        this.lastId = innerSubscriberArr[i7].id;
                        j4 = j;
                        j3 = 0;
                    } else {
                        j3 = 0;
                        j4 = j;
                        z = false;
                    }
                    if (j4 != j3 && !this.cancelled) {
                        this.upstream.a(j4);
                    }
                    int i10 = i3;
                    if (!z) {
                        i2 = addAndGet(-i10);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i10;
                    }
                } else {
                    Throwable a2 = ExceptionHelper.a((AtomicReference<Throwable>) this.errs);
                    if (a2 != ExceptionHelper.a) {
                        if (a2 == null) {
                            xfl.c();
                            return;
                        }
                        xfl.onError(a2);
                    }
                    return;
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.a(th);
            } else if (ExceptionHelper.a((AtomicReference<Throwable>) this.errs, th)) {
                this.done = true;
                b();
            } else {
                RxJavaPlugins.a(th);
            }
        }
    }

    public FlowableFlatMap(Flowable<T> flowable, Function<? super T, ? extends xfk<? extends U>> function, boolean z, int i, int i2) {
        super(flowable);
        this.c = function;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    public final void a(xfl<? super U> xfl) {
        if (!FlowableScalarXMap.a(this.b, xfl, this.c)) {
            Flowable flowable = this.b;
            MergeSubscriber mergeSubscriber = new MergeSubscriber(xfl, this.c, this.d, this.e, this.f);
            flowable.a((FlowableSubscriber<? super T>) mergeSubscriber);
        }
    }
}
