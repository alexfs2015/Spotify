package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;

public final class ObservableZipIterable<T, U, V> extends Observable<V> {
    private Observable<? extends T> a;
    private Iterable<U> b;
    private BiFunction<? super T, ? super U, ? extends V> c;

    static final class ZipIterableObserver<T, U, V> implements Observer<T>, Disposable {
        private Observer<? super V> a;
        private Iterator<U> b;
        private BiFunction<? super T, ? super U, ? extends V> c;
        private Disposable d;
        private boolean e;

        ZipIterableObserver(Observer<? super V> observer, Iterator<U> it, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.a = observer;
            this.b = it;
            this.c = biFunction;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void bf_() {
            this.d.bf_();
        }

        public final boolean b() {
            return this.d.b();
        }

        public final void onNext(T t) {
            if (!this.e) {
                try {
                    try {
                        this.a.onNext(ObjectHelper.a(this.c.apply(t, ObjectHelper.a(this.b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                        try {
                            if (!this.b.hasNext()) {
                                this.e = true;
                                this.d.bf_();
                                this.a.onComplete();
                            }
                        } catch (Throwable th) {
                            Exceptions.b(th);
                            a(th);
                        }
                    } catch (Throwable th2) {
                        Exceptions.b(th2);
                        a(th2);
                    }
                } catch (Throwable th3) {
                    Exceptions.b(th3);
                    a(th3);
                }
            }
        }

        private void a(Throwable th) {
            this.e = true;
            this.d.bf_();
            this.a.onError(th);
        }

        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.a(th);
                return;
            }
            this.e = true;
            this.a.onError(th);
        }

        public final void onComplete() {
            if (!this.e) {
                this.e = true;
                this.a.onComplete();
            }
        }
    }

    public ObservableZipIterable(Observable<? extends T> observable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        this.a = observable;
        this.b = iterable;
        this.c = biFunction;
    }

    public final void a(Observer<? super V> observer) {
        try {
            Iterator it = (Iterator) ObjectHelper.a(this.b.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.a(observer);
                } else {
                    this.a.subscribe(new ZipIterableObserver(observer, it, this.c));
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                EmptyDisposable.a(th, observer);
            }
        } catch (Throwable th2) {
            Exceptions.b(th2);
            EmptyDisposable.a(th2, observer);
        }
    }
}
