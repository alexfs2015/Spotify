package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

public final class MaybeMap<T, R> extends AbstractMaybeWithUpstream<T, R> {
    private Function<? super T, ? extends R> b;

    static final class MapMaybeObserver<T, R> implements MaybeObserver<T>, Disposable {
        private MaybeObserver<? super R> a;
        private Function<? super T, ? extends R> b;
        private Disposable c;

        MapMaybeObserver(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends R> function) {
            this.a = maybeObserver;
            this.b = function;
        }

        public final boolean b() {
            return this.c.b();
        }

        public final void bd_() {
            Disposable disposable = this.c;
            this.c = DisposableHelper.DISPOSED;
            disposable.bd_();
        }

        public final void c_(T t) {
            try {
                this.a.c_(ObjectHelper.a(this.b.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                Exceptions.b(th);
                this.a.onError(th);
            }
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public MaybeMap(MaybeSource<T> maybeSource, Function<? super T, ? extends R> function) {
        super(maybeSource);
        this.b = function;
    }

    public final void b(MaybeObserver<? super R> maybeObserver) {
        this.a.a(new MapMaybeObserver(maybeObserver, this.b));
    }
}
