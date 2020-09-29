package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableInterval extends Observable<Long> {
    private Scheduler a;
    private long b;
    private long c;
    private TimeUnit d;

    static final class IntervalObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long count;
        final Observer<? super Long> downstream;

        IntervalObserver(Observer<? super Long> observer) {
            this.downstream = observer;
        }

        public final boolean b() {
            return get() == DisposableHelper.DISPOSED;
        }

        public final void bd_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final void run() {
            if (get() != DisposableHelper.DISPOSED) {
                Observer<? super Long> observer = this.downstream;
                long j = this.count;
                this.count = 1 + j;
                observer.onNext(Long.valueOf(j));
            }
        }
    }

    public ObservableInterval(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.a = scheduler;
    }

    public final void a(Observer<? super Long> observer) {
        IntervalObserver intervalObserver = new IntervalObserver(observer);
        observer.onSubscribe(intervalObserver);
        Scheduler scheduler = this.a;
        if (scheduler instanceof TrampolineScheduler) {
            Worker a2 = scheduler.a();
            DisposableHelper.b(intervalObserver, a2);
            a2.a(intervalObserver, this.b, this.c, this.d);
            return;
        }
        DisposableHelper.b(intervalObserver, scheduler.a(intervalObserver, this.b, this.c, this.d));
    }
}
