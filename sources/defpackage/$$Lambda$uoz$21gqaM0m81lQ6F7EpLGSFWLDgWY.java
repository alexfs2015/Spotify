package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uoz$21gqaM0m81lQ6F7EpLGSFWLDgWY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uoz$21gqaM0m81lQ6F7EpLGSFWLDgWY implements ObservableTransformer {
    private final /* synthetic */ upa f$0;

    public /* synthetic */ $$Lambda$uoz$21gqaM0m81lQ6F7EpLGSFWLDgWY(upa upa) {
        this.f$0 = upa;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$uoz$qfWB3WcyKvGuCTIANtb7FGx7YxI<Object,Object>(this.f$0), false);
    }
}
