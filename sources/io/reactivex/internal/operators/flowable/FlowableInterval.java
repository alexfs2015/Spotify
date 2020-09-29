package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableInterval extends Flowable<Long> {
    private Scheduler b;
    private long c;
    private long d;
    private TimeUnit e;

    static final class IntervalSubscriber extends AtomicLong implements Runnable, xfm {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final xfl<? super Long> downstream;
        final AtomicReference<Disposable> resource = new AtomicReference<>();

        IntervalSubscriber(xfl<? super Long> xfl) {
            this.downstream = xfl;
        }

        public final void a() {
            DisposableHelper.a(this.resource);
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a((AtomicLong) this, j);
            }
        }

        public final void a(Disposable disposable) {
            DisposableHelper.b(this.resource, disposable);
        }

        public final void run() {
            if (this.resource.get() != DisposableHelper.DISPOSED) {
                if (get() != 0) {
                    xfl<? super Long> xfl = this.downstream;
                    long j = this.count;
                    this.count = j + 1;
                    xfl.b_(Long.valueOf(j));
                    BackpressureHelper.c(this, 1);
                    return;
                }
                xfl<? super Long> xfl2 = this.downstream;
                StringBuilder sb = new StringBuilder("Can't deliver value ");
                sb.append(this.count);
                sb.append(" due to lack of requests");
                xfl2.onError(new MissingBackpressureException(sb.toString()));
                DisposableHelper.a(this.resource);
            }
        }
    }

    public FlowableInterval(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.c = j;
        this.d = j2;
        this.e = timeUnit;
        this.b = scheduler;
    }

    public final void a(xfl<? super Long> xfl) {
        IntervalSubscriber intervalSubscriber = new IntervalSubscriber(xfl);
        xfl.a(intervalSubscriber);
        Scheduler scheduler = this.b;
        if (scheduler instanceof TrampolineScheduler) {
            Worker a = scheduler.a();
            intervalSubscriber.a((Disposable) a);
            a.a(intervalSubscriber, this.c, this.d, this.e);
            return;
        }
        intervalSubscriber.a(scheduler.a(intervalSubscriber, this.c, this.d, this.e));
    }
}
