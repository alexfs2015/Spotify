package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

public final class MaybeToSingle<T> extends Single<T> {
    private MaybeSource<T> a;
    private T b = null;

    static final class ToSingleMaybeSubscriber<T> implements MaybeObserver<T>, Disposable {
        private SingleObserver<? super T> a;
        private T b;
        private Disposable c;

        ToSingleMaybeSubscriber(SingleObserver<? super T> singleObserver, T t) {
            this.a = singleObserver;
            this.b = t;
        }

        public final void bf_() {
            this.c.bf_();
            this.c = DisposableHelper.DISPOSED;
        }

        public final boolean b() {
            return this.c.b();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void c_(T t) {
            this.c = DisposableHelper.DISPOSED;
            this.a.c_(t);
        }

        public final void onError(Throwable th) {
            this.c = DisposableHelper.DISPOSED;
            this.a.onError(th);
        }

        public final void onComplete() {
            this.c = DisposableHelper.DISPOSED;
            T t = this.b;
            if (t != null) {
                this.a.c_(t);
            } else {
                this.a.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }
    }

    public MaybeToSingle(MaybeSource<T> maybeSource, T t) {
        this.a = maybeSource;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.a.a(new ToSingleMaybeSubscriber(singleObserver, this.b));
    }
}
