package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeObserveOn<T> extends AbstractMaybeWithUpstream<T, T> {
    private Scheduler b;

    static final class ObserveOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final MaybeObserver<? super T> downstream;
        Throwable error;
        final Scheduler scheduler;
        T value;

        ObserveOnMaybeObserver(MaybeObserver<? super T> maybeObserver, Scheduler scheduler2) {
            this.downstream = maybeObserver;
            this.scheduler = scheduler2;
        }

        public final void bf_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.b(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        public final void c_(T t) {
            this.value = t;
            DisposableHelper.c(this, this.scheduler.a((Runnable) this));
        }

        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.c(this, this.scheduler.a((Runnable) this));
        }

        public final void onComplete() {
            DisposableHelper.c(this, this.scheduler.a((Runnable) this));
        }

        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            T t = this.value;
            if (t != null) {
                this.value = null;
                this.downstream.c_(t);
                return;
            }
            this.downstream.onComplete();
        }
    }

    public MaybeObserveOn(MaybeSource<T> maybeSource, Scheduler scheduler) {
        super(maybeSource);
        this.b = scheduler;
    }

    public final void b(MaybeObserver<? super T> maybeObserver) {
        this.a.a(new ObserveOnMaybeObserver(maybeObserver, this.b));
    }
}
