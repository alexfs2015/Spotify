package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleObserver;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleCreate<T> extends Single<T> {
    private SingleOnSubscribe<T> a;

    static final class Emitter<T> extends AtomicReference<Disposable> implements SingleEmitter<T>, Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        final SingleObserver<? super T> downstream;

        Emitter(SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        public final void a(Cancellable cancellable) {
            DisposableHelper.a((AtomicReference<Disposable>) this, (Disposable) new CancellableDisposable(cancellable));
        }

        public final void a(T t) {
            if (get() != DisposableHelper.DISPOSED) {
                Disposable disposable = (Disposable) getAndSet(DisposableHelper.DISPOSED);
                if (disposable != DisposableHelper.DISPOSED) {
                    if (t == null) {
                        try {
                            this.downstream.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (disposable != null) {
                                disposable.bd_();
                            }
                            throw th;
                        }
                    } else {
                        this.downstream.c_(t);
                    }
                    if (disposable != null) {
                        disposable.bd_();
                    }
                }
            }
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

        public final String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }

    public SingleCreate(SingleOnSubscribe<T> singleOnSubscribe) {
        this.a = singleOnSubscribe;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        Emitter emitter = new Emitter(singleObserver);
        singleObserver.onSubscribe(emitter);
        try {
            this.a.subscribe(emitter);
        } catch (Throwable th) {
            Exceptions.b(th);
            emitter.a(th);
        }
    }
}
