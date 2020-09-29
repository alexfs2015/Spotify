package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: wso reason: default package */
final class wso<T> extends Observable<wsj<T>> {
    private final wru<T> a;

    /* renamed from: wso$a */
    static final class a<T> implements Disposable, wrw<T> {
        private final wru<?> a;
        private final Observer<? super wsj<T>> b;
        private volatile boolean c;
        private boolean d = false;

        a(wru<?> wru, Observer<? super wsj<T>> observer) {
            this.a = wru;
            this.b = observer;
        }

        public final void a(wsj<T> wsj) {
            if (!this.c) {
                try {
                    this.b.onNext(wsj);
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

        public final void a(wru<T> wru, Throwable th) {
            if (!wru.c()) {
                try {
                    this.b.onError(th);
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                    RxJavaPlugins.a((Throwable) new CompositeException(th, th2));
                }
            }
        }

        public final void bf_() {
            this.c = true;
            this.a.b();
        }

        public final boolean b() {
            return this.c;
        }
    }

    wso(wru<T> wru) {
        this.a = wru;
    }

    public final void a(Observer<? super wsj<T>> observer) {
        wru d = this.a.d();
        a aVar = new a(d, observer);
        observer.onSubscribe(aVar);
        if (!aVar.b()) {
            d.a(aVar);
        }
    }
}
