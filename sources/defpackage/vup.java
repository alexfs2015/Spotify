package defpackage;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

/* renamed from: vup reason: default package */
final class vup<T> extends Single<T> {
    private wuh<T> a;

    /* renamed from: vup$a */
    static final class a<T> extends wui<T> implements Disposable {
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

        public final void bf_() {
            unsubscribe();
        }

        public final boolean b() {
            return isUnsubscribed();
        }
    }

    vup(wuh<T> wuh) {
        this.a = wuh;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        a aVar = new a(singleObserver);
        singleObserver.onSubscribe(aVar);
        this.a.a((wui<? super T>) aVar);
    }
}
