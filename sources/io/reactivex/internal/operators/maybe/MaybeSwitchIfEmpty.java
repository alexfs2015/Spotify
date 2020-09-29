package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeSwitchIfEmpty<T> extends AbstractMaybeWithUpstream<T, T> {
    private MaybeSource<? extends T> b;

    static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = -2223459372976438024L;
        final MaybeObserver<? super T> downstream;
        final MaybeSource<? extends T> other;

        static final class OtherMaybeObserver<T> implements MaybeObserver<T> {
            private MaybeObserver<? super T> a;
            private AtomicReference<Disposable> b;

            OtherMaybeObserver(MaybeObserver<? super T> maybeObserver, AtomicReference<Disposable> atomicReference) {
                this.a = maybeObserver;
                this.b = atomicReference;
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.b(this.b, disposable);
            }

            public final void c_(T t) {
                this.a.c_(t);
            }

            public final void onError(Throwable th) {
                this.a.onError(th);
            }

            public final void onComplete() {
                this.a.onComplete();
            }
        }

        SwitchIfEmptyMaybeObserver(MaybeObserver<? super T> maybeObserver, MaybeSource<? extends T> maybeSource) {
            this.downstream = maybeObserver;
            this.other = maybeSource;
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
            this.downstream.c_(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onComplete() {
            Disposable disposable = (Disposable) get();
            if (disposable != DisposableHelper.DISPOSED && compareAndSet(disposable, null)) {
                this.other.a(new OtherMaybeObserver(this.downstream, this));
            }
        }
    }

    public MaybeSwitchIfEmpty(MaybeSource<T> maybeSource, MaybeSource<? extends T> maybeSource2) {
        super(maybeSource);
        this.b = maybeSource2;
    }

    public final void b(MaybeObserver<? super T> maybeObserver) {
        this.a.a(new SwitchIfEmptyMaybeObserver(maybeObserver, this.b));
    }
}
