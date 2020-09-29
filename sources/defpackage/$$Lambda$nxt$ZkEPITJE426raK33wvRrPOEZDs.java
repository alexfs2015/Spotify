package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$nxt$Z-kEPITJE426raK33wvRrPOEZDs reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nxt$ZkEPITJE426raK33wvRrPOEZDs implements ObservableTransformer {
    private final /* synthetic */ uwm f$0;

    public /* synthetic */ $$Lambda$nxt$ZkEPITJE426raK33wvRrPOEZDs(uwm uwm) {
        this.f$0 = uwm;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$nxt$peLGQFZ0ZPSdNM49pvEJeV4zu8I<Object,Object>(this.f$0), false).e();
    }
}
