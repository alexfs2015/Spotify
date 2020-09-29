package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {
    private long c;
    private Action d;
    private BackpressureOverflowStrategy e;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[BackpressureOverflowStrategy.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                io.reactivex.BackpressureOverflowStrategy[] r0 = io.reactivex.BackpressureOverflowStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.reactivex.BackpressureOverflowStrategy r1 = io.reactivex.BackpressureOverflowStrategy.DROP_LATEST     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.reactivex.BackpressureOverflowStrategy r1 = io.reactivex.BackpressureOverflowStrategy.DROP_OLDEST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.AnonymousClass1.<clinit>():void");
        }
    }

    static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, wrh {
        private static final long serialVersionUID = 3240706908776709697L;
        final long bufferSize;
        volatile boolean cancelled;
        final Deque<T> deque = new ArrayDeque();
        volatile boolean done;
        final wrg<? super T> downstream;
        Throwable error;
        final Action onOverflow;
        final AtomicLong requested = new AtomicLong();
        final BackpressureOverflowStrategy strategy;
        wrh upstream;

        OnBackpressureBufferStrategySubscriber(wrg<? super T> wrg, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy, long j) {
            this.downstream = wrg;
            this.onOverflow = action;
            this.strategy = backpressureOverflowStrategy;
            this.bufferSize = j;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
            boolean z;
            boolean z2;
            if (!this.done) {
                Deque<T> deque2 = this.deque;
                synchronized (deque2) {
                    z = false;
                    z2 = true;
                    if (((long) deque2.size()) == this.bufferSize) {
                        int i = AnonymousClass1.a[this.strategy.ordinal()];
                        if (i == 1) {
                            deque2.pollLast();
                            deque2.offer(t);
                        } else if (i == 2) {
                            deque2.poll();
                            deque2.offer(t);
                        }
                        z = true;
                    } else {
                        deque2.offer(t);
                    }
                    z2 = false;
                }
                if (z) {
                    Action action = this.onOverflow;
                    if (action != null) {
                        try {
                            action.run();
                        } catch (Throwable th) {
                            Exceptions.b(th);
                            this.upstream.a();
                            onError(th);
                        }
                    }
                } else if (z2) {
                    this.upstream.a();
                    onError(new MissingBackpressureException());
                } else {
                    b();
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.a(th);
                return;
            }
            this.error = th;
            this.done = true;
            b();
        }

        public final void c() {
            this.done = true;
            b();
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                b();
            }
        }

        public final void a() {
            this.cancelled = true;
            this.upstream.a();
            if (getAndIncrement() == 0) {
                a(this.deque);
            }
        }

        private static void a(Deque<T> deque2) {
            synchronized (deque2) {
                deque2.clear();
            }
        }

        private void b() {
            boolean isEmpty;
            Object poll;
            if (getAndIncrement() == 0) {
                Deque<T> deque2 = this.deque;
                wrg<? super T> wrg = this.downstream;
                int i = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (!this.cancelled) {
                            boolean z = this.done;
                            synchronized (deque2) {
                                poll = deque2.poll();
                            }
                            boolean z2 = poll == null;
                            if (z) {
                                Throwable th = this.error;
                                if (th != null) {
                                    a(deque2);
                                    wrg.onError(th);
                                    return;
                                } else if (z2) {
                                    wrg.c();
                                    return;
                                }
                            }
                            if (z2) {
                                break;
                            }
                            wrg.b_(poll);
                            j2++;
                        } else {
                            a(deque2);
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (this.cancelled) {
                            a(deque2);
                            return;
                        }
                        boolean z3 = this.done;
                        synchronized (deque2) {
                            isEmpty = deque2.isEmpty();
                        }
                        if (z3) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                a(deque2);
                                wrg.onError(th2);
                                return;
                            } else if (isEmpty) {
                                wrg.c();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        BackpressureHelper.c(this.requested, j2);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    public FlowableOnBackpressureBufferStrategy(Flowable<T> flowable, long j, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(flowable);
        this.c = j;
        this.d = action;
        this.e = backpressureOverflowStrategy;
    }

    public final void a(wrg<? super T> wrg) {
        Flowable flowable = this.b;
        OnBackpressureBufferStrategySubscriber onBackpressureBufferStrategySubscriber = new OnBackpressureBufferStrategySubscriber(wrg, this.d, this.e, this.c);
        flowable.a((FlowableSubscriber<? super T>) onBackpressureBufferStrategySubscriber);
    }
}
