package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vym$LlV64HliBirhRo4P8OahQTNHdzE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vym$LlV64HliBirhRo4P8OahQTNHdzE implements ObservableTransformer {
    private final /* synthetic */ vxt f$0;

    public /* synthetic */ $$Lambda$vym$LlV64HliBirhRo4P8OahQTNHdzE(vxt vxt) {
        this.f$0 = vxt;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$fc1JfTztcIpGD55cm4iGy1rb9Qc.INSTANCE).a(this.f$0.a()).c((Function<? super T, ? extends R>) $$Lambda$EUlyronpaqIsj_iIR_m1b2xvFU.INSTANCE);
    }
}
