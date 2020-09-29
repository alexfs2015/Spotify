package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qad$USk3frWSXVmkWavMkfxexDBDtco reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qad$USk3frWSXVmkWavMkfxexDBDtco implements ObservableTransformer {
    private final /* synthetic */ hgy f$0;
    private final /* synthetic */ pxt f$1;
    private final /* synthetic */ jty f$2;

    public /* synthetic */ $$Lambda$qad$USk3frWSXVmkWavMkfxexDBDtco(hgy hgy, pxt pxt, jty jty) {
        this.f$0 = hgy;
        this.f$1 = pxt;
        this.f$2 = jty;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qad$79zEaS4Webtkuu7fY6AOcaRpyY<Object,Object>(this.f$0, this.f$1, this.f$2), false);
    }
}
