package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uoz$ExKVfpqbITlmnoYZiFNXPx8qeS0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uoz$ExKVfpqbITlmnoYZiFNXPx8qeS0 implements ObservableTransformer {
    private final /* synthetic */ upa f$0;

    public /* synthetic */ $$Lambda$uoz$ExKVfpqbITlmnoYZiFNXPx8qeS0(upa upa) {
        this.f$0 = upa;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$uoz$9Ohk_rDL6QIyUZRUtXbuKqjBlNA<Object,Object>(this.f$0), false);
    }
}
