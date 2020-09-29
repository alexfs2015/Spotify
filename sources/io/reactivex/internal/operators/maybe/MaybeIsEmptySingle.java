package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.plugins.RxJavaPlugins;

public final class MaybeIsEmptySingle<T> extends Single<Boolean> implements FuseToMaybe<Boolean> {
    private MaybeSource<T> a;

    static final class IsEmptyMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        private SingleObserver<? super Boolean> a;
        private Disposable b;

        IsEmptyMaybeObserver(SingleObserver<? super Boolean> singleObserver) {
            this.a = singleObserver;
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
            this.a.c_(Boolean.FALSE);
        }

        public final void onComplete() {
            this.b = DisposableHelper.DISPOSED;
            this.a.c_(Boolean.TRUE);
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

    public MaybeIsEmptySingle(MaybeSource<T> maybeSource) {
        this.a = maybeSource;
    }

    public final Maybe<Boolean> a() {
        return RxJavaPlugins.a((Maybe<T>) new MaybeIsEmpty<T>(this.a));
    }

    public final void a(SingleObserver<? super Boolean> singleObserver) {
        this.a.a(new IsEmptyMaybeObserver(singleObserver));
    }
}
