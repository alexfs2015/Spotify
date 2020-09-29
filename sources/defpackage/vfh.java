package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;

/* renamed from: vfh reason: default package */
public final class vfh<T> implements ObservableTransformer<vez<T>, vez<T>> {
    /* access modifiers changed from: private */
    public static /* synthetic */ vez a(vez vez, vez vez2) {
        if (!(vez instanceof a) && !(vez instanceof d)) {
            return vez2;
        }
        throw new IllegalStateException("mustn't change state again after completing loading");
    }

    public final ObservableSource<vez<T>> apply(Observable<vez<T>> observable) {
        return observable.a((BiFunction<T, T, T>) $$Lambda$vfh$g84asjrX_81gKKRTnalArFBaLEU.INSTANCE);
    }
}
