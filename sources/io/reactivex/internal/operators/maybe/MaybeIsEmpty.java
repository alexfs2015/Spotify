package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class MaybeIsEmpty<T> extends AbstractMaybeWithUpstream<T, Boolean> {

    static final class IsEmptyMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        private MaybeObserver<? super Boolean> a;
        private Disposable b;

        IsEmptyMaybeObserver(MaybeObserver<? super Boolean> maybeObserver) {
            this.a = maybeObserver;
        }

        public final boolean b() {
            return this.b.b();
        }

        public final void bd_() {
            this.b.bd_();
        }

        public final void c_(T t) {
            this.a.c_(Boolean.FALSE);
        }

        public final void onComplete() {
            this.a.c_(Boolean.TRUE);
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public MaybeIsEmpty(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    public final void b(MaybeObserver<? super Boolean> maybeObserver) {
        this.a.a(new IsEmptyMaybeObserver(maybeObserver));
    }
}
