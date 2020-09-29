package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qwm$DW4x6kYz6nEKnCOCCSuTX3st5K0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qwm$DW4x6kYz6nEKnCOCCSuTX3st5K0 implements ObservableTransformer {
    private final /* synthetic */ Scheduler f$0;
    private final /* synthetic */ uqw f$1;

    public /* synthetic */ $$Lambda$qwm$DW4x6kYz6nEKnCOCCSuTX3st5K0(Scheduler scheduler, uqw uqw) {
        this.f$0 = scheduler;
        this.f$1 = uqw;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a(this.f$0).c((Function<? super T, ? extends R>) new $$Lambda$qwm$CwtVQepJfl3iUlOuze5yEMPpFkM<Object,Object>(this.f$1));
    }
}
