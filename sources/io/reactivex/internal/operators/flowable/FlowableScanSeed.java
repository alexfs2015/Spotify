package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {
    private BiFunction<R, ? super T, R> c;
    private Callable<R> d;

    static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, wrh {
        private static final long serialVersionUID = -1776795561228106469L;
        final BiFunction<R, ? super T, R> accumulator;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final wrg<? super R> downstream;
        Throwable error;
        final int limit;
        final int prefetch;
        final SimplePlainQueue<R> queue;
        final AtomicLong requested = new AtomicLong();
        wrh upstream;
        R value;

        ScanSeedSubscriber(wrg<? super R> wrg, BiFunction<R, ? super T, R> biFunction, R r, int i) {
            this.downstream = wrg;
            this.accumulator = biFunction;
            this.value = r;
            this.prefetch = i;
            this.limit = i - (i >> 2);
            this.queue = new SpscArrayQueue(i);
            this.queue.a(r);
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
                wrh.a((long) (this.prefetch - 1));
            }
        }

        public final void b_(T t) {
            if (!this.done) {
                try {
                    R a = ObjectHelper.a(this.accumulator.apply(this.value, t), "The accumulator returned a null value");
                    this.value = a;
                    this.queue.a(a);
                    b();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.upstream.a();
                    onError(th);
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
            if (!this.done) {
                this.done = true;
                b();
            }
        }

        public final void a() {
            this.cancelled = true;
            this.upstream.a();
            if (getAndIncrement() == 0) {
                this.queue.e();
            }
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                b();
            }
        }

        private void b() {
            if (getAndIncrement() == 0) {
                wrg<? super R> wrg = this.downstream;
                SimplePlainQueue<R> simplePlainQueue = this.queue;
                int i = this.limit;
                int i2 = this.consumed;
                int i3 = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.cancelled) {
                            simplePlainQueue.e();
                            return;
                        }
                        boolean z = this.done;
                        if (z) {
                            Throwable th = this.error;
                            if (th != null) {
                                simplePlainQueue.e();
                                wrg.onError(th);
                                return;
                            }
                        }
                        Object bc_ = simplePlainQueue.bc_();
                        boolean z2 = bc_ == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            wrg.b_(bc_);
                            j2++;
                            i2++;
                            if (i2 == i) {
                                this.upstream.a((long) i);
                                i2 = 0;
                            }
                        } else {
                            wrg.c();
                            return;
                        }
                    }
                    if (j2 == j && this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            simplePlainQueue.e();
                            wrg.onError(th2);
                            return;
                        } else if (simplePlainQueue.d()) {
                            wrg.c();
                            return;
                        }
                    }
                    if (j2 != 0) {
                        BackpressureHelper.c(this.requested, j2);
                    }
                    this.consumed = i2;
                    i3 = addAndGet(-i3);
                } while (i3 != 0);
            }
        }
    }

    public FlowableScanSeed(Flowable<T> flowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(flowable);
        this.c = biFunction;
        this.d = callable;
    }

    public final void a(wrg<? super R> wrg) {
        try {
            this.b.a((FlowableSubscriber<? super T>) new ScanSeedSubscriber<Object>(wrg, this.c, ObjectHelper.a(this.d.call(), "The seed supplied is null"), Flowable.a));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.a(th, wrg);
        }
    }
}
