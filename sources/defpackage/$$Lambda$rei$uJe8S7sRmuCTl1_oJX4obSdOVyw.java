package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$rei$uJe8S7sRmuCTl1_oJX4obSdOVyw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$rei$uJe8S7sRmuCTl1_oJX4obSdOVyw implements ObservableTransformer {
    private final /* synthetic */ rdw f$0;

    public /* synthetic */ $$Lambda$rei$uJe8S7sRmuCTl1_oJX4obSdOVyw(rdw rdw) {
        this.f$0 = rdw;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$rei$sGqlJUSwJe4pgquhjQxln5PKHY(this.f$0));
    }
}
