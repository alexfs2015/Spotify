package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, wrh {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        final AtomicReference<T> current = new AtomicReference<>();
        volatile boolean done;
        final wrg<? super T> downstream;
        Throwable error;
        final AtomicLong requested = new AtomicLong();
        wrh upstream;

        BackpressureLatestSubscriber(wrg<? super T> wrg) {
            this.downstream = wrg;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
            this.current.lazySet(t);
            b();
        }

        public final void onError(Throwable th) {
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
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.a();
                if (getAndIncrement() == 0) {
                    this.current.lazySet(null);
                }
            }
        }

        private void b() {
            boolean z;
            if (getAndIncrement() == 0) {
                wrg<? super T> wrg = this.downstream;
                AtomicLong atomicLong = this.requested;
                AtomicReference<T> atomicReference = this.current;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.done;
                        Object andSet = atomicReference.getAndSet(null);
                        boolean z3 = andSet == null;
                        if (!a(z2, z3, wrg, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            wrg.b_(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (a(z4, z, wrg, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        BackpressureHelper.c(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        private boolean a(boolean z, boolean z2, wrg<?> wrg, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z) {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet(null);
                    wrg.onError(th);
                    return true;
                } else if (z2) {
                    wrg.c();
                    return true;
                }
            }
            return false;
        }
    }

    public FlowableOnBackpressureLatest(Flowable<T> flowable) {
        super(flowable);
    }

    public final void a(wrg<? super T> wrg) {
        this.b.a((FlowableSubscriber<? super T>) new BackpressureLatestSubscriber<Object>(wrg));
    }
}
