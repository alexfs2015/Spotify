package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$ggr$JCcj_BjJLudmb6_rnEEeWYNf3Fc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ggr$JCcj_BjJLudmb6_rnEEeWYNf3Fc implements ObservableTransformer {
    private final /* synthetic */ ggu f$0;
    private final /* synthetic */ ggt f$1;

    public /* synthetic */ $$Lambda$ggr$JCcj_BjJLudmb6_rnEEeWYNf3Fc(ggu ggu, ggt ggt) {
        this.f$0 = ggu;
        this.f$1 = ggt;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$ggr$PkYfxw8ivEEE0eH4XgcgYZxEilU(this.f$0, this.f$1));
    }
}
