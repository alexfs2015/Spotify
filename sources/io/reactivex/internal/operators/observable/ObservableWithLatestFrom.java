package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableWithLatestFrom<T, U, R> extends AbstractObservableWithUpstream<T, R> {
    private BiFunction<? super T, ? super U, ? extends R> b;
    private ObservableSource<? extends U> c;

    static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements Observer<T>, Disposable {
        private static final long serialVersionUID = -312246233408980075L;
        final BiFunction<? super T, ? super U, ? extends R> combiner;
        final Observer<? super R> downstream;
        final AtomicReference<Disposable> other = new AtomicReference<>();
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        WithLatestFromObserver(Observer<? super R> observer, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.downstream = observer;
            this.combiner = biFunction;
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) this.upstream.get());
        }

        public final void bd_() {
            DisposableHelper.a(this.upstream);
            DisposableHelper.a(this.other);
        }

        public final void onComplete() {
            DisposableHelper.a(this.other);
            this.downstream.onComplete();
        }

        public final void onError(Throwable th) {
            DisposableHelper.a(this.other);
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    this.downstream.onNext(ObjectHelper.a(this.combiner.apply(t, obj), "The combiner returned a null value"));
                } catch (Throwable th) {
                    Exceptions.b(th);
                    bd_();
                    this.downstream.onError(th);
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this.upstream, disposable);
        }
    }

    final class WithLatestFromOtherObserver implements Observer<U> {
        private final WithLatestFromObserver<T, U, R> a;

        WithLatestFromOtherObserver(WithLatestFromObserver<T, U, R> withLatestFromObserver) {
            this.a = withLatestFromObserver;
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            WithLatestFromObserver<T, U, R> withLatestFromObserver = this.a;
            DisposableHelper.a(withLatestFromObserver.upstream);
            withLatestFromObserver.downstream.onError(th);
        }

        public final void onNext(U u) {
            this.a.lazySet(u);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this.a.other, disposable);
        }
    }

    public ObservableWithLatestFrom(ObservableSource<T> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.b = biFunction;
        this.c = observableSource2;
    }

    public final void a(Observer<? super R> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(serializedObserver, this.b);
        serializedObserver.onSubscribe(withLatestFromObserver);
        this.c.subscribe(new WithLatestFromOtherObserver(withLatestFromObserver));
        this.a.subscribe(withLatestFromObserver);
    }
}
