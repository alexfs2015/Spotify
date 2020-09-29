package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pqi$IwbuT_o9cxOtSW5qD04jDgQ0L6E reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pqi$IwbuT_o9cxOtSW5qD04jDgQ0L6E implements ObservableTransformer {
    private final /* synthetic */ ppx f$0;

    public /* synthetic */ $$Lambda$pqi$IwbuT_o9cxOtSW5qD04jDgQ0L6E(ppx ppx) {
        this.f$0 = ppx;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$pqi$LRpDuIig9q3H2OI23m2VxAPzRmU<Object,Object>(this.f$0), false);
    }
}
