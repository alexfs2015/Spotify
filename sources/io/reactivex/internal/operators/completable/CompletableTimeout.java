package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class CompletableTimeout extends Completable {
    final long a;
    final TimeUnit b;
    final CompletableSource c;
    private CompletableSource d;
    private Scheduler e;

    final class DisposeTask implements Runnable {
        final CompositeDisposable a;
        final CompletableObserver b;
        private final AtomicBoolean c;

        final class DisposeObserver implements CompletableObserver {
            DisposeObserver() {
            }

            public final void onComplete() {
                DisposeTask.this.a.bd_();
                DisposeTask.this.b.onComplete();
            }

            public final void onError(Throwable th) {
                DisposeTask.this.a.bd_();
                DisposeTask.this.b.onError(th);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposeTask.this.a.a(disposable);
            }
        }

        DisposeTask(AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, CompletableObserver completableObserver) {
            this.c = atomicBoolean;
            this.a = compositeDisposable;
            this.b = completableObserver;
        }

        public final void run() {
            if (this.c.compareAndSet(false, true)) {
                this.a.c();
                if (CompletableTimeout.this.c == null) {
                    this.b.onError(new TimeoutException(ExceptionHelper.a(CompletableTimeout.this.a, CompletableTimeout.this.b)));
                    return;
                }
                CompletableTimeout.this.c.a(new DisposeObserver());
            }
        }
    }

    static final class TimeOutObserver implements CompletableObserver {
        private final CompositeDisposable a;
        private final AtomicBoolean b;
        private final CompletableObserver c;

        TimeOutObserver(CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean, CompletableObserver completableObserver) {
            this.a = compositeDisposable;
            this.b = atomicBoolean;
            this.c = completableObserver;
        }

        public final void onComplete() {
            if (this.b.compareAndSet(false, true)) {
                this.a.bd_();
                this.c.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.b.compareAndSet(false, true)) {
                this.a.bd_();
                this.c.onError(th);
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.a(disposable);
        }
    }

    public CompletableTimeout(CompletableSource completableSource, long j, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource2) {
        this.d = completableSource;
        this.a = j;
        this.b = timeUnit;
        this.e = scheduler;
        this.c = completableSource2;
    }

    public final void b(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        compositeDisposable.a(this.e.a(new DisposeTask(atomicBoolean, compositeDisposable, completableObserver), this.a, this.b));
        this.d.a(new TimeOutObserver(compositeDisposable, atomicBoolean, completableObserver));
    }
}
