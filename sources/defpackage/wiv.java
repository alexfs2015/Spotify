package defpackage;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

/* renamed from: wiv reason: default package */
final class wiv<T> extends Single<T> {
    private xim<T> a;

    /* renamed from: wiv$a */
    static final class a<T> extends xin<T> implements Disposable {
        private SingleObserver<? super T> a;

        a(SingleObserver<? super T> singleObserver) {
            this.a = singleObserver;
        }

        public final void a(T t) {
            if (t == null) {
                this.a.onError(new NullPointerException("The upstream 1.x Single signalled a null value which is not supported in 2.x"));
            } else {
                this.a.c_(t);
            }
        }

        public final void a(Throwable th) {
            this.a.onError(th);
        }

        public final boolean b() {
            return isUnsubscribed();
        }

        public final void bd_() {
            unsubscribe();
        }
    }

    wiv(xim<T> xim) {
        this.a = xim;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        a aVar = new a(singleObserver);
        singleObserver.onSubscribe(aVar);
        this.a.a((xin<? super T>) aVar);
    }
}
