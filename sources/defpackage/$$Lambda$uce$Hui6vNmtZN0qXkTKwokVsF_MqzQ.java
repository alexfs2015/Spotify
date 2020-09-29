package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uce$Hui6vNmtZN0qXkTKwokVsF_MqzQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$uce$Hui6vNmtZN0qXkTKwokVsF_MqzQ implements ObservableTransformer {
    private final /* synthetic */ ucf f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$uce$Hui6vNmtZN0qXkTKwokVsF_MqzQ(ucf ucf, Scheduler scheduler) {
        this.f$0 = ucf;
        this.f$1 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$uce$Dq1OXud9cIqGeHprPZ3TH9B9wc<Object,Object>(this.f$0, this.f$1), false);
    }
}
