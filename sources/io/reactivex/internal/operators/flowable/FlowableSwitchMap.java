package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableSwitchMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    private Function<? super T, ? extends xfk<? extends R>> c;
    private int d;
    private boolean e;

    static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<xfm> implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long index;
        final SwitchMapSubscriber<T, R> parent;
        volatile SimpleQueue<R> queue;

        SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j, int i) {
            this.parent = switchMapSubscriber;
            this.index = j;
            this.bufferSize = i;
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
                        xfm.a((long) this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                xfm.a((long) this.bufferSize);
            }
        }

        public final void b_(R r) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                if (this.fusionMode != 0 || this.queue.a(r)) {
                    switchMapSubscriber.b();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        public final void c() {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                this.done = true;
                switchMapSubscriber.b();
            }
        }

        public final void onError(Throwable th) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index != switchMapSubscriber.unique || !ExceptionHelper.a((AtomicReference<Throwable>) switchMapSubscriber.error, th)) {
                RxJavaPlugins.a(th);
                return;
            }
            if (!switchMapSubscriber.delayErrors) {
                switchMapSubscriber.upstream.a();
            }
            this.done = true;
            switchMapSubscriber.b();
        }
    }

    static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, xfm {
        private static SwitchMapInnerSubscriber<Object, Object> a = null;
        private static final long serialVersionUID = -3491074160481096299L;
        final AtomicReference<SwitchMapInnerSubscriber<T, R>> active = new AtomicReference<>();
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final xfl<? super R> downstream;
        final AtomicThrowable error;
        final Function<? super T, ? extends xfk<? extends R>> mapper;
        final AtomicLong requested = new AtomicLong();
        volatile long unique;
        xfm upstream;

        static {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = new SwitchMapInnerSubscriber<>(null, -1, 1);
            a = switchMapInnerSubscriber;
            SubscriptionHelper.a((AtomicReference<xfm>) switchMapInnerSubscriber);
        }

        SwitchMapSubscriber(xfl<? super R> xfl, Function<? super T, ? extends xfk<? extends R>> function, int i, boolean z) {
            this.downstream = xfl;
            this.mapper = function;
            this.bufferSize = i;
            this.delayErrors = z;
            this.error = new AtomicThrowable();
        }

        private void d() {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.active.get();
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber2 = a;
            if (switchMapInnerSubscriber != switchMapInnerSubscriber2) {
                SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber3 = (SwitchMapInnerSubscriber) this.active.getAndSet(switchMapInnerSubscriber2);
                if (switchMapInnerSubscriber3 != a && switchMapInnerSubscriber3 != null) {
                    SubscriptionHelper.a((AtomicReference<xfm>) switchMapInnerSubscriber3);
                }
            }
        }

        public final void a() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.a();
                d();
            }
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                if (this.unique == 0) {
                    this.upstream.a(Long.MAX_VALUE);
                    return;
                }
                b();
            }
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                this.downstream.a(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e5, code lost:
            r14 = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r17 = this;
                r1 = r17
                int r0 = r17.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                xfl<? super R> r2 = r1.downstream
                r4 = 1
            L_0x000c:
                boolean r0 = r1.cancelled
                r5 = 0
                if (r0 == 0) goto L_0x0017
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                r0.lazySet(r5)
                return
            L_0x0017:
                boolean r0 = r1.done
                if (r0 == 0) goto L_0x0062
                boolean r0 = r1.delayErrors
                if (r0 == 0) goto L_0x003f
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L_0x0062
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x003b
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
                r2.onError(r0)
                return
            L_0x003b:
                r2.c()
                return
            L_0x003f:
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x0056
                r17.d()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
                r2.onError(r0)
                return
            L_0x0056:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L_0x0062
                r2.c()
                return
            L_0x0062:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                java.lang.Object r0 = r0.get()
                r6 = r0
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber r6 = (io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber) r6
                if (r6 == 0) goto L_0x0071
                io.reactivex.internal.fuseable.SimpleQueue<R> r0 = r6.queue
                r7 = r0
                goto L_0x0072
            L_0x0071:
                r7 = r5
            L_0x0072:
                if (r7 == 0) goto L_0x013c
                boolean r0 = r6.done
                if (r0 == 0) goto L_0x00ad
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto L_0x00a0
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x0093
                r17.d()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
                r2.onError(r0)
                return
            L_0x0093:
                boolean r0 = r7.d()
                if (r0 == 0) goto L_0x00ad
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                r0.compareAndSet(r6, r5)
                goto L_0x000c
            L_0x00a0:
                boolean r0 = r7.d()
                if (r0 == 0) goto L_0x00ad
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                r0.compareAndSet(r6, r5)
                goto L_0x000c
            L_0x00ad:
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                long r8 = r0.get()
                r10 = 0
                r12 = r10
            L_0x00b6:
                r14 = 0
                int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r0 == 0) goto L_0x011a
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L_0x00c0
                return
            L_0x00c0:
                boolean r0 = r6.done
                java.lang.Object r15 = r7.ba_()     // Catch:{ all -> 0x00c7 }
                goto L_0x00d6
            L_0x00c7:
                r0 = move-exception
                r15 = r0
                io.reactivex.exceptions.Exceptions.b(r15)
                io.reactivex.internal.subscriptions.SubscriptionHelper.a(r6)
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                io.reactivex.internal.util.ExceptionHelper.a(r0, r15)
                r15 = r5
                r0 = 1
            L_0x00d6:
                if (r15 != 0) goto L_0x00db
                r16 = 1
                goto L_0x00dd
            L_0x00db:
                r16 = 0
            L_0x00dd:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r3 = r1.active
                java.lang.Object r3 = r3.get()
                if (r6 == r3) goto L_0x00e7
            L_0x00e5:
                r14 = 1
                goto L_0x011a
            L_0x00e7:
                if (r0 == 0) goto L_0x0111
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto L_0x0109
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x0101
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
                r2.onError(r0)
                return
            L_0x0101:
                if (r16 == 0) goto L_0x0111
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                r0.compareAndSet(r6, r5)
                goto L_0x00e5
            L_0x0109:
                if (r16 == 0) goto L_0x0111
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                r0.compareAndSet(r6, r5)
                goto L_0x00e5
            L_0x0111:
                if (r16 != 0) goto L_0x011a
                r2.b_(r15)
                r14 = 1
                long r12 = r12 + r14
                goto L_0x00b6
            L_0x011a:
                int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r0 == 0) goto L_0x013a
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L_0x013a
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 == 0) goto L_0x0131
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                long r7 = -r12
                r0.addAndGet(r7)
            L_0x0131:
                java.lang.Object r0 = r6.get()
                xfm r0 = (defpackage.xfm) r0
                r0.a(r12)
            L_0x013a:
                if (r14 != 0) goto L_0x000c
            L_0x013c:
                int r0 = -r4
                int r4 = r1.addAndGet(r0)
                if (r4 == 0) goto L_0x0145
                goto L_0x000c
            L_0x0145:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber.b():void");
        }

        public final void b_(T t) {
            if (!this.done) {
                long j = this.unique + 1;
                this.unique = j;
                SwitchMapInnerSubscriber switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.active.get();
                if (switchMapInnerSubscriber != null) {
                    SubscriptionHelper.a((AtomicReference<xfm>) switchMapInnerSubscriber);
                }
                try {
                    xfk xfk = (xfk) ObjectHelper.a(this.mapper.apply(t), "The publisher returned is null");
                    SwitchMapInnerSubscriber switchMapInnerSubscriber2 = new SwitchMapInnerSubscriber(this, j, this.bufferSize);
                    while (true) {
                        SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber3 = (SwitchMapInnerSubscriber) this.active.get();
                        if (switchMapInnerSubscriber3 != a) {
                            if (this.active.compareAndSet(switchMapInnerSubscriber3, switchMapInnerSubscriber2)) {
                                xfk.b(switchMapInnerSubscriber2);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.upstream.a();
                    onError(th);
                }
            }
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                b();
            }
        }

        public final void onError(Throwable th) {
            if (this.done || !ExceptionHelper.a((AtomicReference<Throwable>) this.error, th)) {
                RxJavaPlugins.a(th);
                return;
            }
            if (!this.delayErrors) {
                d();
            }
            this.done = true;
            b();
        }
    }

    public FlowableSwitchMap(Flowable<T> flowable, Function<? super T, ? extends xfk<? extends R>> function, int i, boolean z) {
        super(flowable);
        this.c = function;
        this.d = i;
        this.e = z;
    }

    public final void a(xfl<? super R> xfl) {
        if (!FlowableScalarXMap.a(this.b, xfl, this.c)) {
            this.b.a((FlowableSubscriber<? super T>) new SwitchMapSubscriber<Object>(xfl, this.c, this.d, this.e));
        }
    }
}
