package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: -$$Lambda$udg$k8jZCYPVIaYMabiE5h1eIhE6Flw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$udg$k8jZCYPVIaYMabiE5h1eIhE6Flw implements ObservableTransformer {
    private final /* synthetic */ uau f$0;
    private final /* synthetic */ Scheduler f$1;
    private final /* synthetic */ uwj f$2;
    private final /* synthetic */ ucy f$3;

    public /* synthetic */ $$Lambda$udg$k8jZCYPVIaYMabiE5h1eIhE6Flw(uau uau, Scheduler scheduler, uwj uwj, ucy ucy) {
        this.f$0 = uau;
        this.f$1 = scheduler;
        this.f$2 = uwj;
        this.f$3 = ucy;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$udg$2OmPT1uJzzAxcvn02bhpL0jQfE(this.f$0, this.f$1, this.f$2, this.f$3));
    }
}
