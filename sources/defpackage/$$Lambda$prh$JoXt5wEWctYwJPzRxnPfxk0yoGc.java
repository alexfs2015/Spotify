package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$prh$JoXt5wEWctYwJPzRxnPfxk0yoGc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$prh$JoXt5wEWctYwJPzRxnPfxk0yoGc implements ObservableTransformer {
    private final /* synthetic */ pri f$0;
    private final /* synthetic */ pse f$1;

    public /* synthetic */ $$Lambda$prh$JoXt5wEWctYwJPzRxnPfxk0yoGc(pri pri, pse pse) {
        this.f$0 = pri;
        this.f$1 = pse;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$prh$9YxGPZnbAHBvIP8VZn8fxU95QnE<Object,Object>(this.f$0, this.f$1), false);
    }
}
