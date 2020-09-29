package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableObserveOn extends Completable {
    private CompletableSource a;
    private Scheduler b;

    static final class ObserveOnCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final CompletableObserver downstream;
        Throwable error;
        final Scheduler scheduler;

        ObserveOnCompletableObserver(CompletableObserver completableObserver, Scheduler scheduler2) {
            this.downstream = completableObserver;
            this.scheduler = scheduler2;
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void bd_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final void onComplete() {
            DisposableHelper.c(this, this.scheduler.a((Runnable) this));
        }

        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.c(this, this.scheduler.a((Runnable) this));
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.b(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            this.downstream.onComplete();
        }
    }

    public CompletableObserveOn(CompletableSource completableSource, Scheduler scheduler) {
        this.a = completableSource;
        this.b = scheduler;
    }

    public final void b(CompletableObserver completableObserver) {
        this.a.a(new ObserveOnCompletableObserver(completableObserver, this.b));
    }
}
