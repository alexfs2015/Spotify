package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kgi$w_K6y2CxPflJm29b28UW2FWx0HE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kgi$w_K6y2CxPflJm29b28UW2FWx0HE implements ObservableTransformer {
    private final /* synthetic */ kgt f$0;

    public /* synthetic */ $$Lambda$kgi$w_K6y2CxPflJm29b28UW2FWx0HE(kgt kgt) {
        this.f$0 = kgt;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a(AndroidSchedulers.a()).d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$kgi$ucn3JxqZgIbkhaLiRtWa8s1OZcg<Object,Object>(this.f$0), false);
    }
}
