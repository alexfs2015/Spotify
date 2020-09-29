package hu.akarnokd.rxjava.interop;

import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleV2ToSingleV1<T> implements a<T> {
    private SingleSource<T> a;

    static final class SourceSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, wuk {
        private static final long serialVersionUID = 4758098209431016997L;
        final wui<? super T> actual;

        SourceSingleObserver(wui<? super T> wui) {
            this.actual = wui;
        }

        public final void unsubscribe() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final boolean isUnsubscribed() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this, disposable);
        }

        public final void c_(T t) {
            this.actual.a(t);
        }

        public final void onError(Throwable th) {
            this.actual.a(th);
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wui wui = (wui) obj;
        SourceSingleObserver sourceSingleObserver = new SourceSingleObserver(wui);
        wui.a((wuk) sourceSingleObserver);
        this.a.b(sourceSingleObserver);
    }

    public SingleV2ToSingleV1(SingleSource<T> singleSource) {
        this.a = singleSource;
    }
}
