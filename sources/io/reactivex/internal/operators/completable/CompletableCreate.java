package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableCreate extends Completable {
    private CompletableOnSubscribe a;

    static final class Emitter extends AtomicReference<Disposable> implements CompletableEmitter, Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        final CompletableObserver downstream;

        Emitter(CompletableObserver completableObserver) {
            this.downstream = completableObserver;
        }

        public final void a(Cancellable cancellable) {
            DisposableHelper.a((AtomicReference<Disposable>) this, (Disposable) new CancellableDisposable(cancellable));
        }

        public final void a(Throwable th) {
            if (!b(th)) {
                RxJavaPlugins.a(th);
            }
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final boolean b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() != DisposableHelper.DISPOSED) {
                Disposable disposable = (Disposable) getAndSet(DisposableHelper.DISPOSED);
                if (disposable != DisposableHelper.DISPOSED) {
                    try {
                        this.downstream.onError(th);
                        return true;
                    } finally {
                        if (disposable != null) {
                            disposable.bd_();
                        }
                    }
                }
            }
            return false;
        }

        public final void bd_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final void c() {
            if (get() != DisposableHelper.DISPOSED) {
                Disposable disposable = (Disposable) getAndSet(DisposableHelper.DISPOSED);
                if (disposable != DisposableHelper.DISPOSED) {
                    try {
                        this.downstream.onComplete();
                    } finally {
                        if (disposable != null) {
                            disposable.bd_();
                        }
                    }
                }
            }
        }

        public final String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }

    public CompletableCreate(CompletableOnSubscribe completableOnSubscribe) {
        this.a = completableOnSubscribe;
    }

    public final void b(CompletableObserver completableObserver) {
        Emitter emitter = new Emitter(completableObserver);
        completableObserver.onSubscribe(emitter);
        try {
            this.a.subscribe(emitter);
        } catch (Throwable th) {
            Exceptions.b(th);
            emitter.a(th);
        }
    }
}
