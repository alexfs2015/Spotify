package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vat$7DCHyWrtKNEPT8RCWQRHVhpd8zI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vat$7DCHyWrtKNEPT8RCWQRHVhpd8zI implements ObservableTransformer {
    private final /* synthetic */ vav f$0;

    public /* synthetic */ $$Lambda$vat$7DCHyWrtKNEPT8RCWQRHVhpd8zI(vav vav) {
        this.f$0 = vav;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$k3DCa9m61gnsN6wWRDCnrdA4MnY.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vat$euLo9MARq7ZXGvcanpHH5sGxNHg<Object,Object>(this.f$0), false);
    }
}
