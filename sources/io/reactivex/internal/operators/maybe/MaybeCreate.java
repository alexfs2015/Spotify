package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeCreate<T> extends Maybe<T> {
    private MaybeOnSubscribe<T> a;

    static final class Emitter<T> extends AtomicReference<Disposable> implements MaybeEmitter<T>, Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        final MaybeObserver<? super T> downstream;

        Emitter(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
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
                                disposable.bf_();
                            }
                            throw th;
                        }
                    } else {
                        this.downstream.c_(t);
                    }
                    if (disposable != null) {
                        disposable.bf_();
                    }
                }
            }
        }

        public final boolean a(Throwable th) {
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
                            disposable.bf_();
                        }
                    }
                }
            }
            return false;
        }

        public final void c() {
            if (get() != DisposableHelper.DISPOSED) {
                Disposable disposable = (Disposable) getAndSet(DisposableHelper.DISPOSED);
                if (disposable != DisposableHelper.DISPOSED) {
                    try {
                        this.downstream.onComplete();
                    } finally {
                        if (disposable != null) {
                            disposable.bf_();
                        }
                    }
                }
            }
        }

        public final void bf_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }

    public MaybeCreate(MaybeOnSubscribe<T> maybeOnSubscribe) {
        this.a = maybeOnSubscribe;
    }

    public final void b(MaybeObserver<? super T> maybeObserver) {
        Emitter emitter = new Emitter(maybeObserver);
        maybeObserver.onSubscribe(emitter);
        try {
            this.a.subscribe(emitter);
        } catch (Throwable th) {
            Exceptions.b(th);
            if (!emitter.a(th)) {
                RxJavaPlugins.a(th);
            }
        }
    }
}
