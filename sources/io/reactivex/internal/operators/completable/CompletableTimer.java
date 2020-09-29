package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableTimer extends Completable {
    private long a;
    private TimeUnit b;
    private Scheduler c;

    static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;
        final CompletableObserver downstream;

        TimerDisposable(CompletableObserver completableObserver) {
            this.downstream = completableObserver;
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void bd_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final void run() {
            this.downstream.onComplete();
        }
    }

    public CompletableTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    public final void b(CompletableObserver completableObserver) {
        TimerDisposable timerDisposable = new TimerDisposable(completableObserver);
        completableObserver.onSubscribe(timerDisposable);
        DisposableHelper.c(timerDisposable, this.c.a(timerDisposable, this.a, this.b));
    }
}
