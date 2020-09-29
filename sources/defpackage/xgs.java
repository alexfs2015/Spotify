package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.adapter.rxjava2.HttpException;

/* renamed from: xgs reason: default package */
final class xgs<T> extends Observable<T> {
    private final Observable<xgo<T>> a;

    /* renamed from: xgs$a */
    static class a<R> implements Observer<xgo<R>> {
        private final Observer<? super R> a;
        private boolean b;

        a(Observer<? super R> observer) {
            this.a = observer;
        }

        public final void onComplete() {
            if (!this.b) {
                this.a.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (!this.b) {
                this.a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            RxJavaPlugins.a((Throwable) assertionError);
        }

        public final /* synthetic */ void onNext(Object obj) {
            xgo xgo = (xgo) obj;
            if (xgo.a()) {
                this.a.onNext(xgo.b());
                return;
            }
            this.b = true;
            HttpException httpException = new HttpException(xgo);
            try {
                this.a.onError(httpException);
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.a((Throwable) new CompositeException(httpException, th));
            }
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }
    }

    xgs(Observable<xgo<T>> observable) {
        this.a = observable;
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new a(observer));
    }
}
