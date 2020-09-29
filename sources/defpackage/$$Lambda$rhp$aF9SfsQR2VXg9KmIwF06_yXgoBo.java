package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$rhp$aF9SfsQR2VXg9KmIwF06_yXgoBo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rhp$aF9SfsQR2VXg9KmIwF06_yXgoBo implements ObservableTransformer {
    private final /* synthetic */ rgf f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$rhp$aF9SfsQR2VXg9KmIwF06_yXgoBo(rgf rgf, String str) {
        this.f$0 = rgf;
        this.f$1 = str;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$rhp$pRwdiJ1KSZZF1qztA5SA0mQlKzU<Object,Object>(this.f$0, this.f$1));
    }
}
