package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uoz$AYWUa42xP6gNMNJMlyKWBB4pGYc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uoz$AYWUa42xP6gNMNJMlyKWBB4pGYc implements ObservableTransformer {
    private final /* synthetic */ upa f$0;

    public /* synthetic */ $$Lambda$uoz$AYWUa42xP6gNMNJMlyKWBB4pGYc(upa upa) {
        this.f$0 = upa;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$uoz$Yt5_2lViLMAi418Qp_dIls2CLbE<Object,Object>(this.f$0), false);
    }
}
