package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: -$$Lambda$pjt$c5A99V6wXRxtacJs9-qzBs7Vyqs reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pjt$c5A99V6wXRxtacJs9qzBs7Vyqs implements ObservableTransformer {
    private final /* synthetic */ pju f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$pjt$c5A99V6wXRxtacJs9qzBs7Vyqs(pju pju, Scheduler scheduler) {
        this.f$0 = pju;
        this.f$1 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$pjt$Rls1RPGruPo70w4kr5FO3_Nx7mM(this.f$0, this.f$1));
    }
}
