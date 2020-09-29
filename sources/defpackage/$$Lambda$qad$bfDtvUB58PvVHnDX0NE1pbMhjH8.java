package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qad$bfDtvUB58PvVHnDX0NE1pbMhjH8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qad$bfDtvUB58PvVHnDX0NE1pbMhjH8 implements ObservableTransformer {
    private final /* synthetic */ qae f$0;
    private final /* synthetic */ qba f$1;

    public /* synthetic */ $$Lambda$qad$bfDtvUB58PvVHnDX0NE1pbMhjH8(qae qae, qba qba) {
        this.f$0 = qae;
        this.f$1 = qba;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qad$kj_eJaroN7n28EcqhgQqauySYo<Object,Object>(this.f$0, this.f$1), false);
    }
}
