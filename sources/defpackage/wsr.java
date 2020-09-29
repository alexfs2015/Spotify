package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: wsr reason: default package */
final class wsr<T> extends Observable<wsq<T>> {
    private final Observable<wsj<T>> a;

    /* renamed from: wsr$a */
    static class a<R> implements Observer<wsj<R>> {
        private final Observer<? super wsq<R>> a;

        public final /* synthetic */ void onNext(Object obj) {
            this.a.onNext(wsq.a((wsj) obj));
        }

        a(Observer<? super wsq<R>> observer) {
            this.a = observer;
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }

        public final void onError(Throwable th) {
            try {
                this.a.onNext(wsq.a(th));
                this.a.onComplete();
            } catch (Throwable th2) {
                Exceptions.b(th2);
                RxJavaPlugins.a((Throwable) new CompositeException(th, th2));
            }
        }

        public final void onComplete() {
            this.a.onComplete();
        }
    }

    wsr(Observable<wsj<T>> observable) {
        this.a = observable;
    }

    public final void a(Observer<? super wsq<T>> observer) {
        this.a.subscribe(new a(observer));
    }
}
