package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$nwt$8-pDx3qOPasegYhEHN3PHihCb_M reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$nwt$8pDx3qOPasegYhEHN3PHihCb_M implements ObservableTransformer {
    private final /* synthetic */ nwk f$0;
    private final /* synthetic */ jtz f$1;

    public /* synthetic */ $$Lambda$nwt$8pDx3qOPasegYhEHN3PHihCb_M(nwk nwk, jtz jtz) {
        this.f$0 = nwk;
        this.f$1 = jtz;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$nwt$Y2J8RGFdvLWuhSOiQhT7eca_9x4<Object,Object>(this.f$0, this.f$1), false);
    }
}
