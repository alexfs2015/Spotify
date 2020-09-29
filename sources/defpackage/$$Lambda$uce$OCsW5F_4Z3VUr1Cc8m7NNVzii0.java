package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uce$OCsW5F_4-Z3VUr1Cc8m7NNVzii0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$uce$OCsW5F_4Z3VUr1Cc8m7NNVzii0 implements ObservableTransformer {
    private final /* synthetic */ ucf f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$uce$OCsW5F_4Z3VUr1Cc8m7NNVzii0(ucf ucf, Scheduler scheduler) {
        this.f$0 = ucf;
        this.f$1 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$uce$vN_k3wHgm9ogIR29yXfqIt03iO8<Object,Object>(this.f$0, this.f$1), false);
    }
}
