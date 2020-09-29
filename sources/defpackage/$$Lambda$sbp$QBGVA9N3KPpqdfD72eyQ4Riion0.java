package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$sbp$QBGVA9N3KPpqdfD72eyQ4Riion0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$sbp$QBGVA9N3KPpqdfD72eyQ4Riion0 implements ObservableTransformer {
    private final /* synthetic */ sbh f$0;

    public /* synthetic */ $$Lambda$sbp$QBGVA9N3KPpqdfD72eyQ4Riion0(sbh sbh) {
        this.f$0 = sbh;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$sbp$GgE25RHqRCdje3uaH4jwXpVjA<Object,Object>(this.f$0), false);
    }
}
