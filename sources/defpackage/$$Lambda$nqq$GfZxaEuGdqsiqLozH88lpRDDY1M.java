package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$nqq$GfZxaEuGdqsiqLozH88lpRDDY1M reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nqq$GfZxaEuGdqsiqLozH88lpRDDY1M implements ObservableTransformer {
    private final /* synthetic */ nqh f$0;
    private final /* synthetic */ jrp f$1;

    public /* synthetic */ $$Lambda$nqq$GfZxaEuGdqsiqLozH88lpRDDY1M(nqh nqh, jrp jrp) {
        this.f$0 = nqh;
        this.f$1 = jrp;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$nqq$_OIroGWqEDlcHv4fXJFj7q1RY<Object,Object>(this.f$0, this.f$1), false);
    }
}
