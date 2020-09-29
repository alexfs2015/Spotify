package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vym$qJMEReakUkeZlqpNIpRvzHZF21E reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vym$qJMEReakUkeZlqpNIpRvzHZF21E implements ObservableTransformer {
    private final /* synthetic */ vxa f$0;

    public /* synthetic */ $$Lambda$vym$qJMEReakUkeZlqpNIpRvzHZF21E(vxa vxa) {
        this.f$0 = vxa;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vym$qa1StpYMWJmc296b2KJd9Ho11is<Object,Object>(this.f$0), false);
    }
}
