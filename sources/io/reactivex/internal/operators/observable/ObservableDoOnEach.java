package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableDoOnEach<T> extends AbstractObservableWithUpstream<T, T> {
    private Consumer<? super T> b;
    private Consumer<? super Throwable> c;
    private Action d;
    private Action e;

    static final class DoOnEachObserver<T> implements Observer<T>, Disposable {
        private Observer<? super T> a;
        private Consumer<? super T> b;
        private Consumer<? super Throwable> c;
        private Action d;
        private Action e;
        private Disposable f;
        private boolean g;

        DoOnEachObserver(Observer<? super T> observer, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            this.a = observer;
            this.b = consumer;
            this.c = consumer2;
            this.d = action;
            this.e = action2;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.f, disposable)) {
                this.f = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void bf_() {
            this.f.bf_();
        }

        public final boolean b() {
            return this.f.b();
        }

        public final void onNext(T t) {
            if (!this.g) {
                try {
                    this.b.accept(t);
                    this.a.onNext(t);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.f.bf_();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.a(th);
                return;
            }
            this.g = true;
            try {
                this.c.accept(th);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                th = new CompositeException(th, th2);
            }
            this.a.onError(th);
            try {
                this.e.run();
            } catch (Throwable th3) {
                Exceptions.b(th3);
                RxJavaPlugins.a(th3);
            }
        }

        public final void onComplete() {
            if (!this.g) {
                try {
                    this.d.run();
                    this.g = true;
                    this.a.onComplete();
                    try {
                        this.e.run();
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        RxJavaPlugins.a(th);
                    }
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                    onError(th2);
                }
            }
        }
    }

    public ObservableDoOnEach(ObservableSource<T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(observableSource);
        this.b = consumer;
        this.c = consumer2;
        this.d = action;
        this.e = action2;
    }

    public final void a(Observer<? super T> observer) {
        ObservableSource observableSource = this.a;
        DoOnEachObserver doOnEachObserver = new DoOnEachObserver(observer, this.b, this.c, this.d, this.e);
        observableSource.subscribe(doOnEachObserver);
    }
}
