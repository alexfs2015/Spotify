package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: xgt reason: default package */
final class xgt<T> extends Observable<xgo<T>> {
    private final xfz<T> a;

    /* renamed from: xgt$a */
    static final class a<T> implements Disposable, xgb<T> {
        private final xfz<?> a;
        private final Observer<? super xgo<T>> b;
        private volatile boolean c;
        private boolean d = false;

        a(xfz<?> xfz, Observer<? super xgo<T>> observer) {
            this.a = xfz;
            this.b = observer;
        }

        public final void a(xfz<T> xfz, Throwable th) {
            if (!xfz.c()) {
                try {
                    this.b.onError(th);
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                    RxJavaPlugins.a((Throwable) new CompositeException(th, th2));
                }
            }
        }

        public final void a(xgo<T> xgo) {
            if (!this.c) {
                try {
                    this.b.onNext(xgo);
                    if (!this.c) {
                        this.d = true;
                        this.b.onComplete();
                    }
                } catch (Throwable th) {
                    Exceptions.b(th);
                    RxJavaPlugins.a((Throwable) new CompositeException(th, th));
                }
            }
        }

        public final boolean b() {
            return this.c;
        }

        public final void bd_() {
            this.c = true;
            this.a.b();
        }
    }

    xgt(xfz<T> xfz) {
        this.a = xfz;
    }

    public final void a(Observer<? super xgo<T>> observer) {
        xfz d = this.a.d();
        a aVar = new a(d, observer);
        observer.onSubscribe(aVar);
        if (!aVar.b()) {
            d.a(aVar);
        }
    }
}
