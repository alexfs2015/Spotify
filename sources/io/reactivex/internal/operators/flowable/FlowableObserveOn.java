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
        wrh upstream;
        final Worker worker;

        /* access modifiers changed from: 0000 */
        public abstract void b();

        /* access modifiers changed from: 0000 */
        public abstract void f();

        /* access modifiers changed from: 0000 */
        public abstract void g();

        BaseObserveOnSubscriber(Worker worker2, boolean z, int i) {
            this.worker = worker2;
            this.delayError = z;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

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

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.a(th);
                return;
            }
            this.error = th;
            this.done = true;
            h();
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                h();
            }
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                h();
            }
        }

        public final void a() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.a();
                this.worker.bf_();
                if (getAndIncrement() == 0) {
                    this.queue.e();
                }
            }
        }

        private void h() {
            if (getAndIncrement() == 0) {
                this.worker.a((Runnable) this);
            }
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

        /* access modifiers changed from: 0000 */
        public final boolean a(boolean z, boolean z2, wrg<?> wrg) {
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
                        wrg.onError(th);
                        this.worker.bf_();
                        return true;
                    } else if (z2) {
                        this.cancelled = true;
                        wrg.c();
                        this.worker.bf_();
                        return true;
                    }
                } else if (z2) {
                    this.cancelled = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        wrg.onError(th2);
                    } else {
                        wrg.c();
                    }
                    this.worker.bf_();
                    return true;
                }
            }
            return false;
        }

        public final int a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public final void e() {
            this.queue.e();
        }

        public final boolean d() {
            return this.queue.d();
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

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                if (wrh instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) wrh;
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
                        wrh.a((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.a(this);
                wrh.a((long) this.prefetch);
            }
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
                        Object bc_ = simpleQueue.bc_();
                        if (!this.cancelled) {
                            if (bc_ == null) {
                                this.cancelled = true;
                                conditionalSubscriber.c();
                                this.worker.bf_();
                                return;
                            } else if (conditionalSubscriber.b(bc_)) {
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
                        this.worker.bf_();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (simpleQueue.d()) {
                        this.cancelled = true;
                        conditionalSubscriber.c();
                        this.worker.bf_();
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
                        Object bc_ = simpleQueue.bc_();
                        boolean z2 = bc_ == null;
                        if (!a(z, z2, conditionalSubscriber)) {
                            if (z2) {
                                break;
                            }
                            if (conditionalSubscriber.b(bc_)) {
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
                        this.worker.bf_();
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
                    this.worker.bf_();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public final T bc_() {
            T bc_ = this.queue.bc_();
            if (!(bc_ == null || this.sourceMode == 1)) {
                long j = this.consumed + 1;
                if (j == ((long) this.limit)) {
                    this.consumed = 0;
                    this.upstream.a(j);
                } else {
                    this.consumed = j;
                }
            }
            return bc_;
        }
    }

    static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final wrg<? super T> downstream;

        ObserveOnSubscriber(wrg<? super T> wrg, Worker worker, boolean z, int i) {
            super(worker, z, i);
            this.downstream = wrg;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                if (wrh instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) wrh;
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
                        wrh.a((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.a(this);
                wrh.a((long) this.prefetch);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void f() {
            wrg<? super T> wrg = this.downstream;
            SimpleQueue simpleQueue = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        Object bc_ = simpleQueue.bc_();
                        if (!this.cancelled) {
                            if (bc_ == null) {
                                this.cancelled = true;
                                wrg.c();
                                this.worker.bf_();
                                return;
                            }
                            wrg.b_(bc_);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        this.cancelled = true;
                        this.upstream.a();
                        wrg.onError(th);
                        this.worker.bf_();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (simpleQueue.d()) {
                        this.cancelled = true;
                        wrg.c();
                        this.worker.bf_();
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
            wrg<? super T> wrg = this.downstream;
            SimpleQueue simpleQueue = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    boolean z = this.done;
                    try {
                        Object bc_ = simpleQueue.bc_();
                        boolean z2 = bc_ == null;
                        if (!a(z, z2, wrg)) {
                            if (z2) {
                                break;
                            }
                            wrg.b_(bc_);
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
                        wrg.onError(th);
                        this.worker.bf_();
                        return;
                    }
                }
                if (j != j2 || !a(this.done, simpleQueue.d(), wrg)) {
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
                    this.worker.bf_();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public final T bc_() {
            T bc_ = this.queue.bc_();
            if (!(bc_ == null || this.sourceMode == 1)) {
                long j = this.produced + 1;
                if (j == ((long) this.limit)) {
                    this.produced = 0;
                    this.upstream.a(j);
                } else {
                    this.produced = j;
                }
            }
            return bc_;
        }
    }

    public FlowableObserveOn(Flowable<T> flowable, Scheduler scheduler, boolean z, int i) {
        super(flowable);
        this.c = scheduler;
        this.d = z;
        this.e = i;
    }

    public final void a(wrg<? super T> wrg) {
        Worker a = this.c.a();
        if (wrg instanceof ConditionalSubscriber) {
            this.b.a((FlowableSubscriber<? super T>) new ObserveOnConditionalSubscriber<Object>((ConditionalSubscriber) wrg, a, this.d, this.e));
        } else {
            this.b.a((FlowableSubscriber<? super T>) new ObserveOnSubscriber<Object>(wrg, a, this.d, this.e));
        }
    }
}
