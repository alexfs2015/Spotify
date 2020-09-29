package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uce$xy2worieatZYpCkkzstsS5BA8kY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$uce$xy2worieatZYpCkkzstsS5BA8kY implements ObservableTransformer {
    private final /* synthetic */ ucf f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$uce$xy2worieatZYpCkkzstsS5BA8kY(ucf ucf, Scheduler scheduler) {
        this.f$0 = ucf;
        this.f$1 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$uce$G7lLe9O5FJRpQDXwKGLWsVo1IkM<Object,Object>(this.f$0, this.f$1), false);
    }
}
