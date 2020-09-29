package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableAndThenCompletable extends Completable {
    private CompletableSource a;
    private CompletableSource b;

    static final class NextObserver implements CompletableObserver {
        private AtomicReference<Disposable> a;
        private CompletableObserver b;

        public NextObserver(AtomicReference<Disposable> atomicReference, CompletableObserver completableObserver) {
            this.a = atomicReference;
            this.b = completableObserver;
        }

        public final void onComplete() {
            this.b.onComplete();
        }

        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.a, disposable);
        }
    }

    static final class SourceObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        private static final long serialVersionUID = -4101678820158072998L;
        final CompletableObserver actualObserver;
        final CompletableSource next;

        SourceObserver(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.actualObserver = completableObserver;
            this.next = completableSource;
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void bd_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final void onComplete() {
            this.next.a(new NextObserver(this, this.actualObserver));
        }

        public final void onError(Throwable th) {
            this.actualObserver.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.b(this, disposable)) {
                this.actualObserver.onSubscribe(this);
            }
        }
    }

    public CompletableAndThenCompletable(CompletableSource completableSource, CompletableSource completableSource2) {
        this.a = completableSource;
        this.b = completableSource2;
    }

    public final void b(CompletableObserver completableObserver) {
        this.a.a(new SourceObserver(completableObserver, this.b));
    }
}
