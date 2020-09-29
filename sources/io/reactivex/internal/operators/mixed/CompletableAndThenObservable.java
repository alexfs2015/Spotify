package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableAndThenObservable<R> extends Observable<R> {
    private CompletableSource a;
    private ObservableSource<? extends R> b;

    static final class AndThenObservableObserver<R> extends AtomicReference<Disposable> implements CompletableObserver, Observer<R>, Disposable {
        private static final long serialVersionUID = -8948264376121066672L;
        final Observer<? super R> downstream;
        ObservableSource<? extends R> other;

        AndThenObservableObserver(Observer<? super R> observer, ObservableSource<? extends R> observableSource) {
            this.other = observableSource;
            this.downstream = observer;
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void bd_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final void onComplete() {
            ObservableSource<? extends R> observableSource = this.other;
            if (observableSource == null) {
                this.downstream.onComplete();
                return;
            }
            this.other = null;
            observableSource.subscribe(this);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onNext(R r) {
            this.downstream.onNext(r);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this, disposable);
        }
    }

    public CompletableAndThenObservable(CompletableSource completableSource, ObservableSource<? extends R> observableSource) {
        this.a = completableSource;
        this.b = observableSource;
    }

    public final void a(Observer<? super R> observer) {
        AndThenObservableObserver andThenObservableObserver = new AndThenObservableObserver(observer, this.b);
        observer.onSubscribe(andThenObservableObserver);
        this.a.a(andThenObservableObserver);
    }
}
