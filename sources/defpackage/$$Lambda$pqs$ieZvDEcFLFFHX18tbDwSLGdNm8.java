package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: -$$Lambda$pqs$ieZvDEcFLFFHX1-8tbDwSLGdNm8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pqs$ieZvDEcFLFFHX18tbDwSLGdNm8 implements ObservableTransformer {
    private final /* synthetic */ pqw f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$pqs$ieZvDEcFLFFHX18tbDwSLGdNm8(pqw pqw, Scheduler scheduler) {
        this.f$0 = pqw;
        this.f$1 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$pqs$8Cc8ZcP4m_czRak2WmDuKbkqPg(this.f$0, this.f$1));
    }
}
