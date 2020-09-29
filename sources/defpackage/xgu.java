package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: xgu reason: default package */
final class xgu<T> extends Observable<xgo<T>> {
    private final xfz<T> a;

    /* renamed from: xgu$a */
    static final class a implements Disposable {
        private final xfz<?> a;
        private volatile boolean b;

        a(xfz<?> xfz) {
            this.a = xfz;
        }

        public final boolean b() {
            return this.b;
        }

        public final void bd_() {
            this.b = true;
            this.a.b();
        }
    }

    xgu(xfz<T> xfz) {
        this.a = xfz;
    }

    public final void a(Observer<? super xgo<T>> observer) {
        boolean z;
        xfz d = this.a.d();
        a aVar = new a(d);
        observer.onSubscribe(aVar);
        if (!aVar.b()) {
            try {
                xgo a2 = d.a();
                if (!aVar.b()) {
                    observer.onNext(a2);
                }
                if (!aVar.b()) {
                    try {
                        observer.onComplete();
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
                Exceptions.b(th);
                if (z) {
                    RxJavaPlugins.a(th);
                    return;
                }
                if (!aVar.b()) {
                    try {
                        observer.onError(th);
                    } catch (Throwable th3) {
                        Exceptions.b(th3);
                        RxJavaPlugins.a((Throwable) new CompositeException(th, th3));
                    }
                }
            }
        }
    }
}
