package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pgb$KeREBXKb1FQb1x4YxMUlLjpD7Qo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pgb$KeREBXKb1FQb1x4YxMUlLjpD7Qo implements ObservableTransformer {
    private final /* synthetic */ Scheduler f$0;

    public /* synthetic */ $$Lambda$pgb$KeREBXKb1FQb1x4YxMUlLjpD7Qo(Scheduler scheduler) {
        this.f$0 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$pgb$CVcN7krWo9aXM66d_Bx3zaoK1QM<Object,Object>(this.f$0), false);
    }
}
