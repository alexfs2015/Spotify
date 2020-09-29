package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class MaybePeek<T> extends AbstractMaybeWithUpstream<T, T> {
    final Consumer<? super Disposable> b;
    final Consumer<? super T> c;
    final Consumer<? super Throwable> d;
    final Action e;
    final Action f;
    final Action g;

    static final class MaybePeekObserver<T> implements MaybeObserver<T>, Disposable {
        private MaybeObserver<? super T> a;
        private MaybePeek<T> b;
        private Disposable c;

        MaybePeekObserver(MaybeObserver<? super T> maybeObserver, MaybePeek<T> maybePeek) {
            this.a = maybeObserver;
            this.b = maybePeek;
        }

        public final void bf_() {
            try {
                this.b.g.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.a(th);
            }
            this.c.bf_();
            this.c = DisposableHelper.DISPOSED;
        }

        public final boolean b() {
            return this.c.b();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.c, disposable)) {
                try {
                    this.b.b.accept(disposable);
                    this.c = disposable;
                    this.a.onSubscribe(this);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    disposable.bf_();
                    this.c = DisposableHelper.DISPOSED;
                    EmptyDisposable.a(th, this.a);
                }
            }
        }

        public final void c_(T t) {
            if (this.c != DisposableHelper.DISPOSED) {
                try {
                    this.b.c.accept(t);
                    this.c = DisposableHelper.DISPOSED;
                    this.a.c_(t);
                    c();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    a(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.c == DisposableHelper.DISPOSED) {
                RxJavaPlugins.a(th);
            } else {
                a(th);
            }
        }

        private void a(Throwable th) {
            try {
                this.b.d.accept(th);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                th = new CompositeException(th, th2);
            }
            this.c = DisposableHelper.DISPOSED;
            this.a.onError(th);
            c();
        }

        public final void onComplete() {
            if (this.c != DisposableHelper.DISPOSED) {
                try {
                    this.b.e.run();
                    this.c = DisposableHelper.DISPOSED;
                    this.a.onComplete();
                    c();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    a(th);
                }
            }
        }

        private void c() {
            try {
                this.b.f.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.a(th);
            }
        }
    }

    public MaybePeek(MaybeSource<T> maybeSource, Consumer<? super Disposable> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Action action3) {
        super(maybeSource);
        this.b = consumer;
        this.c = consumer2;
        this.d = consumer3;
        this.e = action;
        this.f = action2;
        this.g = action3;
    }

    public final void b(MaybeObserver<? super T> maybeObserver) {
        this.a.a(new MaybePeekObserver(maybeObserver, this));
    }
}
