package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.single.SingleToObservable;
import java.util.concurrent.Callable;

final class ScalarXMapZHelper {
    static <T> boolean a(Object obj, Function<? super T, ? extends CompletableSource> function, CompletableObserver completableObserver) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        CompletableSource completableSource = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                completableSource = (CompletableSource) ObjectHelper.a(function.apply(call), "The mapper returned a null CompletableSource");
            }
            if (completableSource == null) {
                EmptyDisposable.a(completableObserver);
            } else {
                completableSource.a(completableObserver);
            }
            return true;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.a(th, completableObserver);
            return true;
        }
    }

    static <T, R> boolean a(Object obj, Function<? super T, ? extends SingleSource<? extends R>> function, Observer<? super R> observer) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        SingleSource singleSource = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                singleSource = (SingleSource) ObjectHelper.a(function.apply(call), "The mapper returned a null SingleSource");
            }
            if (singleSource == null) {
                EmptyDisposable.a(observer);
            } else {
                singleSource.b(SingleToObservable.b(observer));
            }
            return true;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.a(th, observer);
            return true;
        }
    }
}
