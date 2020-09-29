package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class MaybeFromSingle<T> extends Maybe<T> {
    private SingleSource<T> a;

    static final class FromSingleObserver<T> implements SingleObserver<T>, Disposable {
        private MaybeObserver<? super T> a;
        private Disposable b;

        FromSingleObserver(MaybeObserver<? super T> maybeObserver) {
            this.a = maybeObserver;
        }

        public final boolean b() {
            return this.b.b();
        }

        public final void bd_() {
            this.b.bd_();
            this.b = DisposableHelper.DISPOSED;
        }

        public final void c_(T t) {
            this.b = DisposableHelper.DISPOSED;
            this.a.c_(t);
        }

        public final void onError(Throwable th) {
            this.b = DisposableHelper.DISPOSED;
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public MaybeFromSingle(SingleSource<T> singleSource) {
        this.a = singleSource;
    }

    public final void b(MaybeObserver<? super T> maybeObserver) {
        this.a.b(new FromSingleObserver(maybeObserver));
    }
}
