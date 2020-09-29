package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qdh$n-8TCLyMC9gh7f4CEv86Qyg3JgI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qdh$n8TCLyMC9gh7f4CEv86Qyg3JgI implements ObservableTransformer {
    private final /* synthetic */ lbi f$0;
    private final /* synthetic */ qcp f$1;
    private final /* synthetic */ qdi f$2;

    public /* synthetic */ $$Lambda$qdh$n8TCLyMC9gh7f4CEv86Qyg3JgI(lbi lbi, qcp qcp, qdi qdi) {
        this.f$0 = lbi;
        this.f$1 = qcp;
        this.f$2 = qdi;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qdh$0k8y74C7ToDeuBM2oqv98Ih3Fns<Object,Object>(this.f$0, this.f$1, this.f$2), false);
    }
}
