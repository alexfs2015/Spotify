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
        final xfl<? super T> downstream;
        Throwable error;
        final Action onOverflow;
        boolean outputFused;
        final SimplePlainQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        xfm upstream;

        BackpressureBufferSubscriber(xfl<? super T> xfl, int i, boolean z, boolean z2, Action action) {
            this.downstream = xfl;
            this.onOverflow = action;
            this.delayError = z2;
            this.queue = z ? new SpscLinkedArrayQueue<>(i) : new SpscArrayQueue<>(i);
        }

        private boolean a(boolean z, boolean z2, xfl<? super T> xfl) {
            if (this.cancelled) {
                this.queue.e();
                return true;
            }
            if (z) {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.e();
                        xfl.onError(th);
                        return true;
                    } else if (z2) {
                        xfl.c();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        xfl.onError(th2);
                    } else {
                        xfl.c();
                    }
                    return true;
                }
            }
            return false;
        }

        private void b() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                xfl<? super T> xfl = this.downstream;
                int i = 1;
                while (!a(this.done, simplePlainQueue.d(), xfl)) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.done;
                        Object ba_ = simplePlainQueue.ba_();
                        boolean z2 = ba_ == null;
                        if (!a(z, z2, xfl)) {
                            if (z2) {
                                break;
                            }
                            xfl.b_(ba_);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !a(this.done, simplePlainQueue.d(), xfl)) {
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
                if (getAndIncrement() == 0) {
                    this.queue.e();
                }
            }
        }

        public final void a(long j) {
            if (!this.outputFused && SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                b();
            }
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                this.downstream.a(this);
                xfm.a(Long.MAX_VALUE);
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

        public final T ba_() {
            return this.queue.ba_();
        }

        public final void c() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.c();
            } else {
                b();
            }
        }

        public final boolean d() {
            return this.queue.d();
        }

        public final void e() {
            this.queue.e();
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
    }

    public FlowableOnBackpressureBuffer(Flowable<T> flowable, int i, boolean z, boolean z2, Action action) {
        super(flowable);
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = action;
    }

    public final void a(xfl<? super T> xfl) {
        Flowable flowable = this.b;
        BackpressureBufferSubscriber backpressureBufferSubscriber = new BackpressureBufferSubscriber(xfl, this.c, this.d, this.e, this.f);
        flowable.a((FlowableSubscriber<? super T>) backpressureBufferSubscriber);
    }
}
