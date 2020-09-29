package io.reactivex.internal.operators.single;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import java.util.Iterator;

public final class SingleFlatMapIterableObservable<T, R> extends Observable<R> {
    private SingleSource<T> a;
    private Function<? super T, ? extends Iterable<? extends R>> b;

    static final class FlatMapIterableObserver<T, R> extends BasicIntQueueDisposable<R> implements SingleObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        volatile boolean cancelled;
        final Observer<? super R> downstream;
        volatile Iterator<? extends R> it;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        boolean outputFused;
        Disposable upstream;

        FlatMapIterableObserver(Observer<? super R> observer, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.downstream = observer;
            this.mapper = function;
        }

        public final int a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public final boolean b() {
            return this.cancelled;
        }

        public final R ba_() {
            Iterator<? extends R> it2 = this.it;
            if (it2 == null) {
                return null;
            }
            R a = ObjectHelper.a(it2.next(), "The iterator returned a null value");
            if (!it2.hasNext()) {
                this.it = null;
            }
            return a;
        }

        public final void bd_() {
            this.cancelled = true;
            this.upstream.bd_();
            this.upstream = DisposableHelper.DISPOSED;
        }

        public final void c_(T t) {
            Observer<? super R> observer = this.downstream;
            try {
                Iterator<? extends R> it2 = ((Iterable) this.mapper.apply(t)).iterator();
                if (!it2.hasNext()) {
                    observer.onComplete();
                } else if (this.outputFused) {
                    this.it = it2;
                    observer.onNext(null);
                    observer.onComplete();
                } else {
                    while (!this.cancelled) {
                        try {
                            observer.onNext(it2.next());
                            if (!this.cancelled) {
                                try {
                                    if (!it2.hasNext()) {
                                        observer.onComplete();
                                        return;
                                    }
                                } catch (Throwable th) {
                                    Exceptions.b(th);
                                    observer.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.b(th2);
                            observer.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                Exceptions.b(th3);
                this.downstream.onError(th3);
            }
        }

        public final boolean d() {
            return this.it == null;
        }

        public final void e() {
            this.it = null;
        }

        public final void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public SingleFlatMapIterableObservable(SingleSource<T> singleSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.a = singleSource;
        this.b = function;
    }

    public final void a(Observer<? super R> observer) {
        this.a.b(new FlatMapIterableObserver(observer, this.b));
    }
}
