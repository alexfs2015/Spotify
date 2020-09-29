package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$nnx$F9JhdA7XEhDwSqkwyHuSt8fSLTM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$nnx$F9JhdA7XEhDwSqkwyHuSt8fSLTM implements ObservableTransformer {
    private final /* synthetic */ nof f$0;
    private final /* synthetic */ noh f$1;
    private final /* synthetic */ hhm f$2;
    private final /* synthetic */ nit f$3;

    public /* synthetic */ $$Lambda$nnx$F9JhdA7XEhDwSqkwyHuSt8fSLTM(nof nof, noh noh, hhm hhm, nit nit) {
        this.f$0 = nof;
        this.f$1 = noh;
        this.f$2 = hhm;
        this.f$3 = nit;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$nnx$kZSmaLsDrgPYsz5KuioJ8e0P78(this.f$0, this.f$1, this.f$2, this.f$3));
    }
}
