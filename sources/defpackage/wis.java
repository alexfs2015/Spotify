package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: wis reason: default package */
final class wis<T> extends Observable<T> {
    private xii<T> a;

    /* renamed from: wis$a */
    static final class a<T> extends xio<T> implements Disposable {
        private Observer<? super T> a;
        private boolean b;

        a(Observer<? super T> observer) {
            this.a = observer;
        }

        public final boolean b() {
            return isUnsubscribed();
        }

        public final void bd_() {
            unsubscribe();
        }

        public final void onCompleted() {
            if (!this.b) {
                this.b = true;
                this.a.onComplete();
                unsubscribe();
            }
        }

        public final void onError(Throwable th) {
            if (this.b) {
                RxJavaPlugins.a(th);
                return;
            }
            this.b = true;
            this.a.onError(th);
            unsubscribe();
        }

        public final void onNext(T t) {
            if (!this.b) {
                if (t == null) {
                    unsubscribe();
                    onError(new NullPointerException("The upstream 1.x Observable signalled a null value which is not supported in 2.x"));
                    return;
                }
                this.a.onNext(t);
            }
        }
    }

    wis(xii<T> xii) {
        this.a = xii;
    }

    public final void a(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        this.a.a((xio<? super T>) aVar);
    }
}
