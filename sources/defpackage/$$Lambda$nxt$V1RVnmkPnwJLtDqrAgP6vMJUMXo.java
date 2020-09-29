package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$nxt$V1RVnmkPnwJLtDqrAgP6vMJUMXo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nxt$V1RVnmkPnwJLtDqrAgP6vMJUMXo implements ObservableTransformer {
    private final /* synthetic */ uwm f$0;
    private final /* synthetic */ uwl f$1;

    public /* synthetic */ $$Lambda$nxt$V1RVnmkPnwJLtDqrAgP6vMJUMXo(uwm uwm, uwl uwl) {
        this.f$0 = uwm;
        this.f$1 = uwl;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$nxt$ev0aoO5LP0lhjCieGJze2wlol7w<Object,Object>(this.f$0, this.f$1), false).e();
    }
}
