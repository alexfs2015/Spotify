package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {
    private int c;
    private boolean d;
    private boolean e;
    private Action f;

    static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final wrg<? super T> downstream;
        Throwable error;
        final Action onOverflow;
        boolean outputFused;
        final SimplePlainQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        wrh upstream;

        BackpressureBufferSubscriber(wrg<? super T> wrg, int i, boolean z, boolean z2, Action action) {
            SimplePlainQueue<T> simplePlainQueue;
            this.downstream = wrg;
            this.onOverflow = action;
            this.delayError = z2;
            if (z) {
                simplePlainQueue = new SpscLinkedArrayQueue<>(i);
            } else {
                simplePlainQueue = new SpscArrayQueue<>(i);
            }
            this.queue = simplePlainQueue;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
            if (!this.queue.a(t)) {
                this.upstream.a();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.onOverflow.run();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.outputFused) {
                this.downstream.b_(null);
            } else {
                b();
            }
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                b();
            }
        }

        public final void c() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.c();
            } else {
                b();
            }
        }

        public final void a(long j) {
            if (!this.outputFused && SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                b();
            }
        }

        public final void a() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.a();
                if (getAndIncrement() == 0) {
                    this.queue.e();
                }
            }
        }

        private void b() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                wrg<? super T> wrg = this.downstream;
                int i = 1;
                while (!a(this.done, simplePlainQueue.d(), wrg)) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.done;
                        Object bc_ = simplePlainQueue.bc_();
                        boolean z2 = bc_ == null;
                        if (!a(z, z2, wrg)) {
                            if (z2) {
                                break;
                            }
                            wrg.b_(bc_);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !a(this.done, simplePlainQueue.d(), wrg)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.requested.addAndGet(-j2);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        private boolean a(boolean z, boolean z2, wrg<? super T> wrg) {
            if (this.cancelled) {
                this.queue.e();
                return true;
            }
            if (z) {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.e();
                        wrg.onError(th);
                        return true;
                    } else if (z2) {
                        wrg.c();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        wrg.onError(th2);
                    } else {
                        wrg.c();
                    }
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

        public final T bc_() {
            return this.queue.bc_();
        }

        public final void e() {
            this.queue.e();
        }

        public final boolean d() {
            return this.queue.d();
        }
    }

    public FlowableOnBackpressureBuffer(Flowable<T> flowable, int i, boolean z, boolean z2, Action action) {
        super(flowable);
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = action;
    }

    public final void a(wrg<? super T> wrg) {
        Flowable flowable = this.b;
        BackpressureBufferSubscriber backpressureBufferSubscriber = new BackpressureBufferSubscriber(wrg, this.c, this.d, this.e, this.f);
        flowable.a((FlowableSubscriber<? super T>) backpressureBufferSubscriber);
    }
}
