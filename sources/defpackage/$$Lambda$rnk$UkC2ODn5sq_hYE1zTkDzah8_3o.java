package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$rnk$UkC2ODn5sq_-hYE1zTkDzah8_3o reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rnk$UkC2ODn5sq_hYE1zTkDzah8_3o implements ObservableTransformer {
    private final /* synthetic */ rmy f$0;

    public /* synthetic */ $$Lambda$rnk$UkC2ODn5sq_hYE1zTkDzah8_3o(rmy rmy) {
        this.f$0 = rmy;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$rnk$QKTysDm1ImrXrMIVDaOlirOKec(this.f$0));
    }
}
