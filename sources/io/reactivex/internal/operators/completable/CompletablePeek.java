package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class CompletablePeek extends Completable {
    final Consumer<? super Disposable> a;
    final Consumer<? super Throwable> b;
    final Action c;
    final Action d;
    final Action e;
    final Action f;
    private CompletableSource g;

    final class CompletableObserverImplementation implements CompletableObserver, Disposable {
        private CompletableObserver a;
        private Disposable b;

        CompletableObserverImplementation(CompletableObserver completableObserver) {
            this.a = completableObserver;
        }

        private void c() {
            try {
                CompletablePeek.this.e.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.a(th);
            }
        }

        public final boolean b() {
            return this.b.b();
        }

        public final void bd_() {
            try {
                CompletablePeek.this.f.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.a(th);
            }
            this.b.bd_();
        }

        public final void onComplete() {
            if (this.b != DisposableHelper.DISPOSED) {
                try {
                    CompletablePeek.this.c.run();
                    CompletablePeek.this.d.run();
                    this.a.onComplete();
                    c();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.a.onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.b == DisposableHelper.DISPOSED) {
                RxJavaPlugins.a(th);
                return;
            }
            try {
                CompletablePeek.this.b.accept(th);
                CompletablePeek.this.d.run();
            } catch (Throwable th2) {
                Exceptions.b(th2);
                th = new CompositeException(th, th2);
            }
            this.a.onError(th);
            c();
        }

        public final void onSubscribe(Disposable disposable) {
            try {
                CompletablePeek.this.a.accept(disposable);
                if (DisposableHelper.a(this.b, disposable)) {
                    this.b = disposable;
                    this.a.onSubscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                disposable.bd_();
                this.b = DisposableHelper.DISPOSED;
                EmptyDisposable.a(th, this.a);
            }
        }
    }

    public CompletablePeek(CompletableSource completableSource, Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        this.g = completableSource;
        this.a = consumer;
        this.b = consumer2;
        this.c = action;
        this.d = action2;
        this.e = action3;
        this.f = action4;
    }

    public final void b(CompletableObserver completableObserver) {
        this.g.a(new CompletableObserverImplementation(completableObserver));
    }
}
