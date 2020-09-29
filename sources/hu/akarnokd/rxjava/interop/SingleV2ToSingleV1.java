package hu.akarnokd.rxjava.interop;

import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleV2ToSingleV1<T> implements a<T> {
    private SingleSource<T> a;

    static final class SourceSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, xip {
        private static final long serialVersionUID = 4758098209431016997L;
        final xin<? super T> actual;

        SourceSingleObserver(xin<? super T> xin) {
            this.actual = xin;
        }

        public final void c_(T t) {
            this.actual.a(t);
        }

        public final boolean isUnsubscribed() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void onError(Throwable th) {
            this.actual.a(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this, disposable);
        }

        public final void unsubscribe() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }
    }

    public SingleV2ToSingleV1(SingleSource<T> singleSource) {
        this.a = singleSource;
    }

    public final /* synthetic */ void call(Object obj) {
        xin xin = (xin) obj;
        SourceSingleObserver sourceSingleObserver = new SourceSingleObserver(xin);
        xin.a((xip) sourceSingleObserver);
        this.a.b(sourceSingleObserver);
    }
}
