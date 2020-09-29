package io.reactivex.internal.operators.single;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleDelayWithCompletable<T> extends Single<T> {
    private SingleSource<T> a;
    private CompletableSource b;

    static final class OtherObserver<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        private static final long serialVersionUID = -8565274649390031272L;
        final SingleObserver<? super T> downstream;
        final SingleSource<T> source;

        OtherObserver(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.downstream = singleObserver;
            this.source = singleSource;
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void bd_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final void onComplete() {
            this.source.b(new ResumeSingleObserver(this, this.downstream));
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.b(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    public SingleDelayWithCompletable(SingleSource<T> singleSource, CompletableSource completableSource) {
        this.a = singleSource;
        this.b = completableSource;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.b.a(new OtherObserver(singleObserver, this.a));
    }
}
