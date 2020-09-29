package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pze$iMoG9bwUqLWKIMt2SUMSYNDoGpQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pze$iMoG9bwUqLWKIMt2SUMSYNDoGpQ implements ObservableTransformer {
    private final /* synthetic */ pyt f$0;

    public /* synthetic */ $$Lambda$pze$iMoG9bwUqLWKIMt2SUMSYNDoGpQ(pyt pyt) {
        this.f$0 = pyt;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$pze$7Gq3lI42iD5nTsIMKbWVjM2OE<Object,Object>(this.f$0), false);
    }
}
