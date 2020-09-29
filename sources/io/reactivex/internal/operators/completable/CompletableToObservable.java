package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

public final class CompletableToObservable<T> extends Observable<T> {
    private CompletableSource a;

    static final class ObserverCompletableObserver extends BasicQueueDisposable<Void> implements CompletableObserver {
        private Observer<?> a;
        private Disposable b;

        ObserverCompletableObserver(Observer<?> observer) {
            this.a = observer;
        }

        public final int a(int i) {
            return i & 2;
        }

        public final boolean b() {
            return this.b.b();
        }

        public final /* bridge */ /* synthetic */ Object ba_() {
            return null;
        }

        public final void bd_() {
            this.b.bd_();
        }

        public final boolean d() {
            return true;
        }

        public final void e() {
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public CompletableToObservable(CompletableSource completableSource) {
        this.a = completableSource;
    }

    public final void a(Observer<? super T> observer) {
        this.a.a(new ObserverCompletableObserver(observer));
    }
}
