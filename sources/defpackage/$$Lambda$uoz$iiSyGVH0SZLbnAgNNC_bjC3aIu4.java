package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uoz$iiSyGVH0SZLbnAgNNC_bjC3aIu4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uoz$iiSyGVH0SZLbnAgNNC_bjC3aIu4 implements ObservableTransformer {
    private final /* synthetic */ upa f$0;

    public /* synthetic */ $$Lambda$uoz$iiSyGVH0SZLbnAgNNC_bjC3aIu4(upa upa) {
        this.f$0 = upa;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$uoz$opJM4jHpq5bMEfIF9JamLPDf5T8<Object,Object>(this.f$0), false);
    }
}
