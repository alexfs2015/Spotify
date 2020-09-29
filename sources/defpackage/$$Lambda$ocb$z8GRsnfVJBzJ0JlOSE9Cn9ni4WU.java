package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ocb$z8GRsnfVJBzJ0JlOSE9Cn9ni4WU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ocb$z8GRsnfVJBzJ0JlOSE9Cn9ni4WU implements ObservableTransformer {
    private final /* synthetic */ obt f$0;

    public /* synthetic */ $$Lambda$ocb$z8GRsnfVJBzJ0JlOSE9Cn9ni4WU(obt obt) {
        this.f$0 = obt;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ocb$gBcZCDokl4qbyA9RWUbWTTQgw<Object,Object>(this.f$0), false);
    }
}
