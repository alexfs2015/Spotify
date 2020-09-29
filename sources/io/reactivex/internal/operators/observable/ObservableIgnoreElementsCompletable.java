package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableIgnoreElementsCompletable<T> extends Completable implements FuseToObservable<T> {
    private ObservableSource<T> a;

    static final class IgnoreObservable<T> implements Observer<T>, Disposable {
        private CompletableObserver a;
        private Disposable b;

        IgnoreObservable(CompletableObserver completableObserver) {
            this.a = completableObserver;
        }

        public final boolean b() {
            return this.b.b();
        }

        public final void bd_() {
            this.b.bd_();
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(T t) {
        }

        public final void onSubscribe(Disposable disposable) {
            this.b = disposable;
            this.a.onSubscribe(this);
        }
    }

    public ObservableIgnoreElementsCompletable(ObservableSource<T> observableSource) {
        this.a = observableSource;
    }

    public final void b(CompletableObserver completableObserver) {
        this.a.subscribe(new IgnoreObservable(completableObserver));
    }

    public final Observable<T> be_() {
        return RxJavaPlugins.a((Observable<T>) new ObservableIgnoreElements<T>(this.a));
    }
}
