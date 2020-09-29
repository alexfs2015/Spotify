package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: xgw reason: default package */
final class xgw<T> extends Observable<xgv<T>> {
    private final Observable<xgo<T>> a;

    /* renamed from: xgw$a */
    static class a<R> implements Observer<xgo<R>> {
        private final Observer<? super xgv<R>> a;

        a(Observer<? super xgv<R>> observer) {
            this.a = observer;
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            try {
                this.a.onNext(xgv.a(th));
                this.a.onComplete();
            } catch (Throwable th2) {
                Exceptions.b(th2);
                RxJavaPlugins.a((Throwable) new CompositeException(th, th2));
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            this.a.onNext(xgv.a((xgo) obj));
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }
    }

    xgw(Observable<xgo<T>> observable) {
        this.a = observable;
    }

    public final void a(Observer<? super xgv<T>> observer) {
        this.a.subscribe(new a(observer));
    }
}
