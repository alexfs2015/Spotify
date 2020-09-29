package defpackage;

import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qdh$0k8y74C7ToDeuBM2oqv98Ih3Fns reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qdh$0k8y74C7ToDeuBM2oqv98Ih3Fns implements Function {
    private final /* synthetic */ lbi f$0;
    private final /* synthetic */ qcp f$1;
    private final /* synthetic */ qdi f$2;

    public /* synthetic */ $$Lambda$qdh$0k8y74C7ToDeuBM2oqv98Ih3Fns(lbi lbi, qcp qcp, qdi qdi) {
        this.f$0 = lbi;
        this.f$1 = qcp;
        this.f$2 = qdi;
    }

    public final Object apply(Object obj) {
        return this.f$0.a().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qdh$GGNZdHQoLXOBMxWunJUeiW2Y5M<Object,Object>(this.f$1, this.f$2), false);
    }
}
