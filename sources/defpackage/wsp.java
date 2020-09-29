package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: wsp reason: default package */
final class wsp<T> extends Observable<wsj<T>> {
    private final wru<T> a;

    /* renamed from: wsp$a */
    static final class a implements Disposable {
        private final wru<?> a;
        private volatile boolean b;

        a(wru<?> wru) {
            this.a = wru;
        }

        public final void bf_() {
            this.b = true;
            this.a.b();
        }

        public final boolean b() {
            return this.b;
        }
    }

    wsp(wru<T> wru) {
        this.a = wru;
    }

    public final void a(Observer<? super wsj<T>> observer) {
        boolean z;
        wru d = this.a.d();
        a aVar = new a(d);
        observer.onSubscribe(aVar);
        if (!aVar.b()) {
            try {
                wsj a2 = d.a();
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
