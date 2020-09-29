package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$oeg$UhL7avHSf5zaHJ7KctEUkd3ewwc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$oeg$UhL7avHSf5zaHJ7KctEUkd3ewwc implements ObservableTransformer {
    private final /* synthetic */ vid f$0;

    public /* synthetic */ $$Lambda$oeg$UhL7avHSf5zaHJ7KctEUkd3ewwc(vid vid) {
        this.f$0 = vid;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$oeg$TWWySe2WYGpQ8Aj5qhrrY29PgPE<Object,Object>(this.f$0), false).e();
    }
}
