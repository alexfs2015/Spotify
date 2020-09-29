package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kgi$-rWUGFwY1nkaSm5oExwh4iUY9r0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kgi$rWUGFwY1nkaSm5oExwh4iUY9r0 implements ObservableTransformer {
    private final /* synthetic */ kgt f$0;

    public /* synthetic */ $$Lambda$kgi$rWUGFwY1nkaSm5oExwh4iUY9r0(kgt kgt) {
        this.f$0 = kgt;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$kgi$ieB2sRB1rxOLbLPzAhiJQLPutNg.INSTANCE, false).a((ObservableTransformer<? super T, ? extends R>) new $$Lambda$kgi$w_K6y2CxPflJm29b28UW2FWx0HE<Object,Object>(this.f$0));
    }
}
