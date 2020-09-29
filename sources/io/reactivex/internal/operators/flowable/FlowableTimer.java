package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableTimer extends Flowable<Long> {
    private Scheduler b;
    private long c;
    private TimeUnit d;

    static final class TimerSubscriber extends AtomicReference<Disposable> implements Runnable, xfm {
        private static final long serialVersionUID = -2809475196591179431L;
        final xfl<? super Long> downstream;
        volatile boolean requested;

        TimerSubscriber(xfl<? super Long> xfl) {
            this.downstream = xfl;
        }

        public final void a() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                this.requested = true;
            }
        }

        public final void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (this.requested) {
                    this.downstream.b_(Long.valueOf(0));
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.c();
                    return;
                }
                lazySet(EmptyDisposable.INSTANCE);
                this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
            }
        }
    }

    public FlowableTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.c = j;
        this.d = timeUnit;
        this.b = scheduler;
    }

    public final void a(xfl<? super Long> xfl) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(xfl);
        xfl.a(timerSubscriber);
        DisposableHelper.d(timerSubscriber, this.b.a(timerSubscriber, this.c, this.d));
    }
}
