package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeSubscribeOn<T> extends AbstractMaybeWithUpstream<T, T> {
    private Scheduler b;

    static final class SubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = 8571289934935992137L;
        final MaybeObserver<? super T> downstream;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnMaybeObserver(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void bd_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
            this.task.bd_();
        }

        public final void c_(T t) {
            this.downstream.c_(t);
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this, disposable);
        }
    }

    static final class SubscribeTask<T> implements Runnable {
        private MaybeObserver<? super T> a;
        private MaybeSource<T> b;

        SubscribeTask(MaybeObserver<? super T> maybeObserver, MaybeSource<T> maybeSource) {
            this.a = maybeObserver;
            this.b = maybeSource;
        }

        public final void run() {
            this.b.a(this.a);
        }
    }

    public MaybeSubscribeOn(MaybeSource<T> maybeSource, Scheduler scheduler) {
        super(maybeSource);
        this.b = scheduler;
    }

    public final void b(MaybeObserver<? super T> maybeObserver) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(maybeObserver);
        maybeObserver.onSubscribe(subscribeOnMaybeObserver);
        DisposableHelper.c(subscribeOnMaybeObserver.task, this.b.a((Runnable) new SubscribeTask(subscribeOnMaybeObserver, this.a)));
    }
}
