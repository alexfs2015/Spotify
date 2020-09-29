package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableDelay extends Completable {
    private CompletableSource a;
    private long b;
    private TimeUnit c;
    private Scheduler d;
    private boolean e;

    static final class Delay extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final CompletableObserver downstream;
        Throwable error;
        final Scheduler scheduler;
        final TimeUnit unit;

        Delay(CompletableObserver completableObserver, long j, TimeUnit timeUnit, Scheduler scheduler2, boolean z) {
            this.downstream = completableObserver;
            this.delay = j;
            this.unit = timeUnit;
            this.scheduler = scheduler2;
            this.delayError = z;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.b(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        public final void onComplete() {
            DisposableHelper.c(this, this.scheduler.a(this, this.delay, this.unit));
        }

        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.c(this, this.scheduler.a(this, this.delayError ? this.delay : 0, this.unit));
        }

        public final void bf_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void run() {
            Throwable th = this.error;
            this.error = null;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public CompletableDelay(CompletableSource completableSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.a = completableSource;
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = z;
    }

    public final void b(CompletableObserver completableObserver) {
        CompletableSource completableSource = this.a;
        Delay delay = new Delay(completableObserver, this.b, this.c, this.d, this.e);
        completableSource.a(delay);
    }
}
