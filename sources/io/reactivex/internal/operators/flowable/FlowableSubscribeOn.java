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

    static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, Runnable, wrh {
        private static final long serialVersionUID = 8094547886072529208L;
        final wrg<? super T> downstream;
        final boolean nonScheduledRequests;
        final AtomicLong requested = new AtomicLong();
        wrf<T> source;
        final AtomicReference<wrh> upstream = new AtomicReference<>();
        final Worker worker;

        static final class Request implements Runnable {
            private wrh a;
            private long b;

            Request(wrh wrh, long j) {
                this.a = wrh;
                this.b = j;
            }

            public final void run() {
                this.a.a(this.b);
            }
        }

        SubscribeOnSubscriber(wrg<? super T> wrg, Worker worker2, wrf<T> wrf, boolean z) {
            this.downstream = wrg;
            this.worker = worker2;
            this.source = wrf;
            this.nonScheduledRequests = !z;
        }

        public final void run() {
            lazySet(Thread.currentThread());
            wrf<T> wrf = this.source;
            this.source = null;
            wrf.b(this);
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                long andSet = this.requested.getAndSet(0);
                if (andSet != 0) {
                    a(andSet, wrh);
                }
            }
        }

        public final void b_(T t) {
            this.downstream.b_(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.bf_();
        }

        public final void c() {
            this.downstream.c();
            this.worker.bf_();
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                wrh wrh = (wrh) this.upstream.get();
                if (wrh != null) {
                    a(j, wrh);
                    return;
                }
                BackpressureHelper.a(this.requested, j);
                wrh wrh2 = (wrh) this.upstream.get();
                if (wrh2 != null) {
                    long andSet = this.requested.getAndSet(0);
                    if (andSet != 0) {
                        a(andSet, wrh2);
                    }
                }
            }
        }

        private void a(long j, wrh wrh) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                wrh.a(j);
            } else {
                this.worker.a((Runnable) new Request(wrh, j));
            }
        }

        public final void a() {
            SubscriptionHelper.a(this.upstream);
            this.worker.bf_();
        }
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z) {
        super(flowable);
        this.c = scheduler;
        this.d = z;
    }

    public final void a(wrg<? super T> wrg) {
        Worker a = this.c.a();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(wrg, a, this.b, this.d);
        wrg.a(subscribeOnSubscriber);
        a.a((Runnable) subscribeOnSubscriber);
    }
}
