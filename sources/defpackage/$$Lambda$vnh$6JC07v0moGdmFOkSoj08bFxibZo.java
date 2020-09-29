package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vnh$6JC07v0moGdmFOkSoj08bFxibZo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vnh$6JC07v0moGdmFOkSoj08bFxibZo implements ObservableTransformer {
    private final /* synthetic */ vnj f$0;

    public /* synthetic */ $$Lambda$vnh$6JC07v0moGdmFOkSoj08bFxibZo(vnj vnj) {
        this.f$0 = vnj;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$gIMatWtVafQI4lIzCukXTF2jFE.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vnh$tzerSRplJdfiq6SLdPmNNVBk0<Object,Object>(this.f$0), false);
    }
}
