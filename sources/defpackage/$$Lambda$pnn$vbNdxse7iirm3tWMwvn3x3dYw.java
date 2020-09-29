package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pnn$vbNdxse7ii-rm3tWM-wvn3x3dYw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pnn$vbNdxse7iirm3tWMwvn3x3dYw implements ObservableTransformer {
    private final /* synthetic */ Scheduler f$0;

    public /* synthetic */ $$Lambda$pnn$vbNdxse7iirm3tWMwvn3x3dYw(Scheduler scheduler) {
        this.f$0 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$pnn$EhT4rFawDN2ddFSA6eFfN3kr7E<Object,Object>(this.f$0), false);
    }
}
