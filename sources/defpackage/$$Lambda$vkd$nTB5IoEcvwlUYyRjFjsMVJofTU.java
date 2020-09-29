package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$vkd$nTB5IoEcvwlUYyRj-FjsMVJofTU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vkd$nTB5IoEcvwlUYyRjFjsMVJofTU implements ObservableTransformer {
    private final /* synthetic */ fli f$0;

    public /* synthetic */ $$Lambda$vkd$nTB5IoEcvwlUYyRjFjsMVJofTU(fli fli) {
        this.f$0 = fli;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$vkd$Rg4WFi0de8EB3l2NimbOi4VwA2c(this.f$0));
    }
}
