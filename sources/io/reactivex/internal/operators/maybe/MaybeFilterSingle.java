package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

public final class MaybeFilterSingle<T> extends Maybe<T> {
    private SingleSource<T> a;
    private Predicate<? super T> b;

    static final class FilterMaybeObserver<T> implements SingleObserver<T>, Disposable {
        private MaybeObserver<? super T> a;
        private Predicate<? super T> b;
        private Disposable c;

        FilterMaybeObserver(MaybeObserver<? super T> maybeObserver, Predicate<? super T> predicate) {
            this.a = maybeObserver;
            this.b = predicate;
        }

        public final void bf_() {
            Disposable disposable = this.c;
            this.c = DisposableHelper.DISPOSED;
            disposable.bf_();
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
            try {
                if (this.b.test(t)) {
                    this.a.c_(t);
                } else {
                    this.a.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.a.onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }
    }

    public MaybeFilterSingle(SingleSource<T> singleSource, Predicate<? super T> predicate) {
        this.a = singleSource;
        this.b = predicate;
    }

    public final void b(MaybeObserver<? super T> maybeObserver) {
        this.a.b(new FilterMaybeObserver(maybeObserver, this.b));
    }
}
