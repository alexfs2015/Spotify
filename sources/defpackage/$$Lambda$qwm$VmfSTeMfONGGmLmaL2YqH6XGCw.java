package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qwm$VmfSTeM-fONGGmLmaL2YqH6XGCw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qwm$VmfSTeMfONGGmLmaL2YqH6XGCw implements ObservableTransformer {
    private final /* synthetic */ qyl f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$qwm$VmfSTeMfONGGmLmaL2YqH6XGCw(qyl qyl, Scheduler scheduler) {
        this.f$0 = qyl;
        this.f$1 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$qwm$hXRsIxgwqzK_bqnjNOkGbetYhD4(this.f$0)).c((Function<? super T, ? extends R>) $$Lambda$Butfk40RGAH9yCr1Yl3XA1qSY.INSTANCE).a(this.f$1);
    }
}
