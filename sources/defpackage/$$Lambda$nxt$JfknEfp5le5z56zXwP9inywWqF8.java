package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$nxt$JfknEfp5le5z56zXwP9inywWqF8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nxt$JfknEfp5le5z56zXwP9inywWqF8 implements ObservableTransformer {
    private final /* synthetic */ uwm f$0;

    public /* synthetic */ $$Lambda$nxt$JfknEfp5le5z56zXwP9inywWqF8(uwm uwm) {
        this.f$0 = uwm;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$nxt$Qtd_iMdUGtAnwKC7HyZeF8OwxA8<Object,Object>(this.f$0), false).e();
    }
}
