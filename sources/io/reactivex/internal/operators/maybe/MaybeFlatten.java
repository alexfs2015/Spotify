package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeFlatten<T, R> extends AbstractMaybeWithUpstream<T, R> {
    private Function<? super T, ? extends MaybeSource<? extends R>> b;

    static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = 4375739915521278546L;
        final MaybeObserver<? super R> downstream;
        final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        Disposable upstream;

        final class InnerObserver implements MaybeObserver<R> {
            InnerObserver() {
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.b(FlatMapMaybeObserver.this, disposable);
            }

            public final void c_(R r) {
                FlatMapMaybeObserver.this.downstream.c_(r);
            }

            public final void onError(Throwable th) {
                FlatMapMaybeObserver.this.downstream.onError(th);
            }

            public final void onComplete() {
                FlatMapMaybeObserver.this.downstream.onComplete();
            }
        }

        FlatMapMaybeObserver(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends R>> function) {
            this.downstream = maybeObserver;
            this.mapper = function;
        }

        public final void bf_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
            this.upstream.bf_();
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void c_(T t) {
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.a(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                if (!b()) {
                    maybeSource.a(new InnerObserver());
                }
            } catch (Exception e) {
                Exceptions.b(e);
                this.downstream.onError(e);
            }
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }
    }

    public MaybeFlatten(MaybeSource<T> maybeSource, Function<? super T, ? extends MaybeSource<? extends R>> function) {
        super(maybeSource);
        this.b = function;
    }

    public final void b(MaybeObserver<? super R> maybeObserver) {
        this.a.a(new FlatMapMaybeObserver(maybeObserver, this.b));
    }
}
