package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

public final class ObservableFromIterable<T> extends Observable<T> {
    private Iterable<? extends T> a;

    static final class FromIterableDisposable<T> extends BasicQueueDisposable<T> {
        final Observer<? super T> a;
        final Iterator<? extends T> b;
        boolean c;
        private volatile boolean d;
        private boolean e;
        private boolean f;

        FromIterableDisposable(Observer<? super T> observer, Iterator<? extends T> it) {
            this.a = observer;
            this.b = it;
        }

        public final int a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.c = true;
            return 1;
        }

        public final T bc_() {
            if (this.e) {
                return null;
            }
            if (!this.f) {
                this.f = true;
            } else if (!this.b.hasNext()) {
                this.e = true;
                return null;
            }
            return ObjectHelper.a(this.b.next(), "The iterator returned a null value");
        }

        public final boolean d() {
            return this.e;
        }

        public final void e() {
            this.e = true;
        }

        public final void bf_() {
            this.d = true;
        }

        public final boolean b() {
            return this.d;
        }
    }

    public ObservableFromIterable(Iterable<? extends T> iterable) {
        this.a = iterable;
    }

    public final void a(Observer<? super T> observer) {
        try {
            Iterator it = this.a.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.a(observer);
                    return;
                }
                FromIterableDisposable fromIterableDisposable = new FromIterableDisposable(observer, it);
                observer.onSubscribe(fromIterableDisposable);
                if (!fromIterableDisposable.c) {
                    while (true) {
                        if (fromIterableDisposable.b()) {
                            break;
                        }
                        try {
                            fromIterableDisposable.a.onNext(ObjectHelper.a(fromIterableDisposable.b.next(), "The iterator returned a null value"));
                            if (fromIterableDisposable.b()) {
                                break;
                            }
                            try {
                                if (!fromIterableDisposable.b.hasNext()) {
                                    if (!fromIterableDisposable.b()) {
                                        fromIterableDisposable.a.onComplete();
                                    }
                                }
                            } catch (Throwable th) {
                                Exceptions.b(th);
                                fromIterableDisposable.a.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.b(th2);
                            fromIterableDisposable.a.onError(th2);
                        }
                    }
                }
            } catch (Throwable th3) {
                Exceptions.b(th3);
                EmptyDisposable.a(th3, observer);
            }
        } catch (Throwable th4) {
            Exceptions.b(th4);
            EmptyDisposable.a(th4, observer);
        }
    }
}
