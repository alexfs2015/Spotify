package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;
        final Observer<? super T> observer;
        final T value;

        public ScalarDisposable(Observer<? super T> observer2, T t) {
            this.observer = observer2;
            this.value = t;
        }

        public final int a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public final boolean a(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public final boolean b() {
            return get() == 3;
        }

        public final T ba_() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        public final void bd_() {
            set(3);
        }

        public final boolean d() {
            return get() != 1;
        }

        public final void e() {
            lazySet(3);
        }

        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }
    }

    static final class ScalarXMapObservable<T, R> extends Observable<R> {
        private T a;
        private Function<? super T, ? extends ObservableSource<? extends R>> b;

        ScalarXMapObservable(T t, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.a = t;
            this.b = function;
        }

        public final void a(Observer<? super R> observer) {
            try {
                ObservableSource observableSource = (ObservableSource) ObjectHelper.a(this.b.apply(this.a), "The mapper returned a null ObservableSource");
                if (observableSource instanceof Callable) {
                    try {
                        Object call = ((Callable) observableSource).call();
                        if (call == null) {
                            EmptyDisposable.a(observer);
                            return;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(observer, call);
                        observer.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        EmptyDisposable.a(th, observer);
                    }
                } else {
                    observableSource.subscribe(observer);
                }
            } catch (Throwable th2) {
                EmptyDisposable.a(th2, observer);
            }
        }
    }

    public static <T, U> Observable<U> a(T t, Function<? super T, ? extends ObservableSource<? extends U>> function) {
        return RxJavaPlugins.a((Observable<T>) new ScalarXMapObservable<T>(t, function));
    }

    public static <T, R> boolean a(ObservableSource<T> observableSource, Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        if (!(observableSource instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) observableSource).call();
            if (call == null) {
                EmptyDisposable.a(observer);
                return true;
            }
            try {
                ObservableSource observableSource2 = (ObservableSource) ObjectHelper.a(function.apply(call), "The mapper returned a null ObservableSource");
                if (observableSource2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) observableSource2).call();
                        if (call2 == null) {
                            EmptyDisposable.a(observer);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(observer, call2);
                        observer.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        EmptyDisposable.a(th, observer);
                        return true;
                    }
                } else {
                    observableSource2.subscribe(observer);
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                EmptyDisposable.a(th2, observer);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.b(th3);
            EmptyDisposable.a(th3, observer);
            return true;
        }
    }
}
