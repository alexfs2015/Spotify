package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$jez$GIcbTW87BQzh5eH0mm5-aorgT4Q reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jez$GIcbTW87BQzh5eH0mm5aorgT4Q implements ObservableTransformer {
    private final /* synthetic */ jfd f$0;

    public /* synthetic */ $$Lambda$jez$GIcbTW87BQzh5eH0mm5aorgT4Q(jfd jfd) {
        this.f$0 = jfd;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$jez$TO3nHO4j3YwGlL7O2Svno27chVo(this.f$0));
    }
}
