package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {
    private Scheduler c;
    private boolean d;
    private int e;

    static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        SimpleQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        int sourceMode;
        xfm upstream;
        final Worker worker;

        BaseObserveOnSubscriber(Worker worker2, boolean z, int i) {
            this.worker = worker2;
            this.delayError = z;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        private void h() {
            if (getAndIncrement() == 0) {
                this.worker.a((Runnable) this);
            }
        }

        public final int a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public final void a() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.a();
                this.worker.bd_();
                if (getAndIncrement() == 0) {
                    this.queue.e();
                }
            }
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                h();
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(boolean z, boolean z2, xfl<?> xfl) {
            if (this.cancelled) {
                e();
                return true;
            }
            if (z) {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.cancelled = true;
                        e();
                        xfl.onError(th);
                        this.worker.bd_();
                        return true;
                    } else if (z2) {
                        this.cancelled = true;
                        xfl.c();
                        this.worker.bd_();
                        return true;
                    }
                } else if (z2) {
                    this.cancelled = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        xfl.onError(th2);
                    } else {
                        xfl.c();
                    }
                    this.worker.bd_();
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public abstract void b();

        public final void b_(T t) {
            if (!this.done) {
                if (this.sourceMode == 2) {
                    h();
                    return;
                }
                if (!this.queue.a(t)) {
                    this.upstream.a();
                    this.error = new MissingBackpressureException("Queue is full?!");
                    this.done = true;
                }
                h();
            }
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                h();
            }
        }

        public final boolean d() {
            return this.queue.d();
        }

        public final void e() {
            this.queue.e();
        }

        /* access modifiers changed from: 0000 */
        public abstract void f();

        /* access modifiers changed from: 0000 */
        public abstract void g();

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.a(th);
                return;
            }
            this.error = th;
            this.done = true;
            h();
        }

        public final void run() {
            if (this.outputFused) {
                b();
            } else if (this.sourceMode == 1) {
                f();
            } else {
                g();
            }
        }
    }

    static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final ConditionalSubscriber<? super T> downstream;

        ObserveOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Worker worker, boolean z, int i) {
            super(worker, z, i);
            this.downstream = conditionalSubscriber;
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                if (xfm instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) xfm;
                    int a = queueSubscription.a(7);
                    if (a == 1) {
                        this.sourceMode = 1;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.a(this);
                        return;
                    } else if (a == 2) {
                        this.sourceMode = 2;
                        this.queue = queueSubscription;
                        this.downstream.a(this);
                        xfm.a((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.a(this);
                xfm.a((long) this.prefetch);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.b_(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.c();
                    }
                    this.worker.bd_();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public final T ba_() {
            T ba_ = this.queue.ba_();
            if (!(ba_ == null || this.sourceMode == 1)) {
                long j = this.consumed + 1;
                if (j == ((long) this.limit)) {
                    this.consumed = 0;
                    this.upstream.a(j);
                } else {
                    this.consumed = j;
                }
            }
            return ba_;
        }

        /* access modifiers changed from: 0000 */
        public final void f() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            SimpleQueue simpleQueue = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        Object ba_ = simpleQueue.ba_();
                        if (!this.cancelled) {
                            if (ba_ == null) {
                                this.cancelled = true;
                                conditionalSubscriber.c();
                                this.worker.bd_();
                                return;
                            } else if (conditionalSubscriber.b(ba_)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        this.cancelled = true;
                        this.upstream.a();
                        conditionalSubscriber.onError(th);
                        this.worker.bd_();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (simpleQueue.d()) {
                        this.cancelled = true;
                        conditionalSubscriber.c();
                        this.worker.bd_();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void g() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            SimpleQueue simpleQueue = this.queue;
            long j = this.produced;
            long j2 = this.consumed;
            int i = 1;
            while (true) {
                long j3 = this.requested.get();
                while (j != j3) {
                    boolean z = this.done;
                    try {
                        Object ba_ = simpleQueue.ba_();
                        boolean z2 = ba_ == null;
                        if (!a(z, z2, conditionalSubscriber)) {
                            if (z2) {
                                break;
                            }
                            if (conditionalSubscriber.b(ba_)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.limit)) {
                                this.upstream.a(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        this.cancelled = true;
                        this.upstream.a();
                        simpleQueue.e();
                        conditionalSubscriber.onError(th);
                        this.worker.bd_();
                        return;
                    }
                }
                if (j != j3 || !a(this.done, simpleQueue.d(), conditionalSubscriber)) {
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        this.consumed = j2;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final xfl<? super T> downstream;

        ObserveOnSubscriber(xfl<? super T> xfl, Worker worker, boolean z, int i) {
            super(worker, z, i);
            this.downstream = xfl;
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                if (xfm instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) xfm;
                    int a = queueSubscription.a(7);
                    if (a == 1) {
                        this.sourceMode = 1;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.a(this);
                        return;
                    } else if (a == 2) {
                        this.sourceMode = 2;
                        this.queue = queueSubscription;
                        this.downstream.a(this);
                        xfm.a((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.a(this);
                xfm.a((long) this.prefetch);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.b_(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.c();
                    }
                    this.worker.bd_();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public final T ba_() {
            T ba_ = this.queue.ba_();
            if (!(ba_ == null || this.sourceMode == 1)) {
                long j = this.produced + 1;
                if (j == ((long) this.limit)) {
                    this.produced = 0;
                    this.upstream.a(j);
                } else {
                    this.produced = j;
                }
            }
            return ba_;
        }

        /* access modifiers changed from: 0000 */
        public final void f() {
            xfl<? super T> xfl = this.downstream;
            SimpleQueue simpleQueue = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        Object ba_ = simpleQueue.ba_();
                        if (!this.cancelled) {
                            if (ba_ == null) {
                                this.cancelled = true;
                                xfl.c();
                                this.worker.bd_();
                                return;
                            }
                            xfl.b_(ba_);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        this.cancelled = true;
                        this.upstream.a();
                        xfl.onError(th);
                        this.worker.bd_();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (simpleQueue.d()) {
                        this.cancelled = true;
                        xfl.c();
                        this.worker.bd_();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void g() {
            xfl<? super T> xfl = this.downstream;
            SimpleQueue simpleQueue = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    boolean z = this.done;
                    try {
                        Object ba_ = simpleQueue.ba_();
                        boolean z2 = ba_ == null;
                        if (!a(z, z2, xfl)) {
                            if (z2) {
                                break;
                            }
                            xfl.b_(ba_);
                            j++;
                            if (j == ((long) this.limit)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.requested.addAndGet(-j);
                                }
                                this.upstream.a(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        this.cancelled = true;
                        this.upstream.a();
                        simpleQueue.e();
                        xfl.onError(th);
                        this.worker.bd_();
                        return;
                    }
                }
                if (j != j2 || !a(this.done, simpleQueue.d(), xfl)) {
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public FlowableObserveOn(Flowable<T> flowable, Scheduler scheduler, boolean z, int i) {
        super(flowable);
        this.c = scheduler;
        this.d = z;
        this.e = i;
    }

    public final void a(xfl<? super T> xfl) {
        Worker a = this.c.a();
        if (xfl instanceof ConditionalSubscriber) {
            this.b.a((FlowableSubscriber<? super T>) new ObserveOnConditionalSubscriber<Object>((ConditionalSubscriber) xfl, a, this.d, this.e));
        } else {
            this.b.a((FlowableSubscriber<? super T>) new ObserveOnSubscriber<Object>(xfl, a, this.d, this.e));
        }
    }
}
