package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uoz$tklUf5kKJRownEqCTrbrcZgMhTg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uoz$tklUf5kKJRownEqCTrbrcZgMhTg implements ObservableTransformer {
    private final /* synthetic */ upa f$0;

    public /* synthetic */ $$Lambda$uoz$tklUf5kKJRownEqCTrbrcZgMhTg(upa upa) {
        this.f$0 = upa;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$uoz$zP0_f2VHQShNs9r70D_fLsPz32E<Object,Object>(this.f$0), false);
    }
}
