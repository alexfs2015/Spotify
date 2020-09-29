package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.adapter.rxjava2.HttpException;

/* renamed from: wsn reason: default package */
final class wsn<T> extends Observable<T> {
    private final Observable<wsj<T>> a;

    /* renamed from: wsn$a */
    static class a<R> implements Observer<wsj<R>> {
        private final Observer<? super R> a;
        private boolean b;

        public final /* synthetic */ void onNext(Object obj) {
            wsj wsj = (wsj) obj;
            if (wsj.a()) {
                this.a.onNext(wsj.b());
                return;
            }
            this.b = true;
            HttpException httpException = new HttpException(wsj);
            try {
                this.a.onError(httpException);
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.a((Throwable) new CompositeException(httpException, th));
            }
        }

        a(Observer<? super R> observer) {
            this.a = observer;
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
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
    }

    wsn(Observable<wsj<T>> observable) {
        this.a = observable;
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new a(observer));
    }
}
