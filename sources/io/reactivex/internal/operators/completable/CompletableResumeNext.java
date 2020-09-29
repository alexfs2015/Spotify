package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableResumeNext extends Completable {
    private CompletableSource a;
    private Function<? super Throwable, ? extends CompletableSource> b;

    static final class ResumeNextObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        private static final long serialVersionUID = 5018523762564524046L;
        final CompletableObserver downstream;
        final Function<? super Throwable, ? extends CompletableSource> errorMapper;
        boolean once;

        ResumeNextObserver(CompletableObserver completableObserver, Function<? super Throwable, ? extends CompletableSource> function) {
            this.downstream = completableObserver;
            this.errorMapper = function;
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this, disposable);
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void onError(Throwable th) {
            if (this.once) {
                this.downstream.onError(th);
                return;
            }
            this.once = true;
            try {
                ((CompletableSource) ObjectHelper.a(this.errorMapper.apply(th), "The errorMapper returned a null CompletableSource")).a(this);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void bf_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }
    }

    public CompletableResumeNext(CompletableSource completableSource, Function<? super Throwable, ? extends CompletableSource> function) {
        this.a = completableSource;
        this.b = function;
    }

    public final void b(CompletableObserver completableObserver) {
        ResumeNextObserver resumeNextObserver = new ResumeNextObserver(completableObserver, this.b);
        completableObserver.onSubscribe(resumeNextObserver);
        this.a.a(resumeNextObserver);
    }
}
