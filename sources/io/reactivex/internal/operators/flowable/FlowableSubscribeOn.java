package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    private Scheduler c;
    private boolean d;

    static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, Runnable, xfm {
        private static final long serialVersionUID = 8094547886072529208L;
        final xfl<? super T> downstream;
        final boolean nonScheduledRequests;
        final AtomicLong requested = new AtomicLong();
        xfk<T> source;
        final AtomicReference<xfm> upstream = new AtomicReference<>();
        final Worker worker;

        static final class Request implements Runnable {
            private xfm a;
            private long b;

            Request(xfm xfm, long j) {
                this.a = xfm;
                this.b = j;
            }

            public final void run() {
                this.a.a(this.b);
            }
        }

        SubscribeOnSubscriber(xfl<? super T> xfl, Worker worker2, xfk<T> xfk, boolean z) {
            this.downstream = xfl;
            this.worker = worker2;
            this.source = xfk;
            this.nonScheduledRequests = !z;
        }

        private void a(long j, xfm xfm) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                xfm.a(j);
            } else {
                this.worker.a((Runnable) new Request(xfm, j));
            }
        }

        public final void a() {
            SubscriptionHelper.a(this.upstream);
            this.worker.bd_();
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                xfm xfm = (xfm) this.upstream.get();
                if (xfm != null) {
                    a(j, xfm);
                    return;
                }
                BackpressureHelper.a(this.requested, j);
                xfm xfm2 = (xfm) this.upstream.get();
                if (xfm2 != null) {
                    long andSet = this.requested.getAndSet(0);
                    if (andSet != 0) {
                        a(andSet, xfm2);
                    }
                }
            }
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                long andSet = this.requested.getAndSet(0);
                if (andSet != 0) {
                    a(andSet, xfm);
                }
            }
        }

        public final void b_(T t) {
            this.downstream.b_(t);
        }

        public final void c() {
            this.downstream.c();
            this.worker.bd_();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.bd_();
        }

        public final void run() {
            lazySet(Thread.currentThread());
            xfk<T> xfk = this.source;
            this.source = null;
            xfk.b(this);
        }
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z) {
        super(flowable);
        this.c = scheduler;
        this.d = z;
    }

    public final void a(xfl<? super T> xfl) {
        Worker a = this.c.a();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(xfl, a, this.b, this.d);
        xfl.a(subscribeOnSubscriber);
        a.a((Runnable) subscribeOnSubscriber);
    }
}
