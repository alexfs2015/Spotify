package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, xfm {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        final AtomicReference<T> current = new AtomicReference<>();
        volatile boolean done;
        final xfl<? super T> downstream;
        Throwable error;
        final AtomicLong requested = new AtomicLong();
        xfm upstream;

        BackpressureLatestSubscriber(xfl<? super T> xfl) {
            this.downstream = xfl;
        }

        private boolean a(boolean z, boolean z2, xfl<?> xfl, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z) {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet(null);
                    xfl.onError(th);
                    return true;
                } else if (z2) {
                    xfl.c();
                    return true;
                }
            }
            return false;
        }

        private void b() {
            boolean z;
            if (getAndIncrement() == 0) {
                xfl<? super T> xfl = this.downstream;
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
                        if (!a(z2, z3, xfl, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            xfl.b_(andSet);
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
                        if (a(z4, z, xfl, atomicReference)) {
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

        public final void a() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.a();
                if (getAndIncrement() == 0) {
                    this.current.lazySet(null);
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
                xfm.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
            this.current.lazySet(t);
            b();
        }

        public final void c() {
            this.done = true;
            b();
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            b();
        }
    }

    public FlowableOnBackpressureLatest(Flowable<T> flowable) {
        super(flowable);
    }

    public final void a(xfl<? super T> xfl) {
        this.b.a((FlowableSubscriber<? super T>) new BackpressureLatestSubscriber<Object>(xfl));
    }
}
