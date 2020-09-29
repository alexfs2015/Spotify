package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservablePublishSelector<T, R> extends AbstractObservableWithUpstream<T, R> {
    private Function<? super Observable<T>, ? extends ObservableSource<R>> b;

    static final class SourceObserver<T, R> implements Observer<T> {
        private PublishSubject<T> a;
        private AtomicReference<Disposable> b;

        SourceObserver(PublishSubject<T> publishSubject, AtomicReference<Disposable> atomicReference) {
            this.a = publishSubject;
            this.b = atomicReference;
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this.b, disposable);
        }

        public final void onNext(T t) {
            this.a.onNext(t);
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onComplete() {
            this.a.onComplete();
        }
    }

    static final class TargetObserver<T, R> extends AtomicReference<Disposable> implements Observer<R>, Disposable {
        private static final long serialVersionUID = 854110278590336484L;
        final Observer<? super R> downstream;
        Disposable upstream;

        TargetObserver(Observer<? super R> observer) {
            this.downstream = observer;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(R r) {
            this.downstream.onNext(r);
        }

        public final void onError(Throwable th) {
            DisposableHelper.a((AtomicReference<Disposable>) this);
            this.downstream.onError(th);
        }

        public final void onComplete() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
            this.downstream.onComplete();
        }

        public final void bf_() {
            this.upstream.bf_();
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final boolean b() {
            return this.upstream.b();
        }
    }

    public ObservablePublishSelector(ObservableSource<T> observableSource, Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        super(observableSource);
        this.b = function;
    }

    public final void a(Observer<? super R> observer) {
        PublishSubject a = PublishSubject.a();
        try {
            ObservableSource observableSource = (ObservableSource) ObjectHelper.a(this.b.apply(a), "The selector returned a null ObservableSource");
            TargetObserver targetObserver = new TargetObserver(observer);
            observableSource.subscribe(targetObserver);
            this.a.subscribe(new SourceObserver(a, targetObserver));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.a(th, observer);
        }
    }
}
