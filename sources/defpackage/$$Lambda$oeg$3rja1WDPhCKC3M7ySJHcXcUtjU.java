package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$oeg$3rja1WDPhCKC3M7ySJH-cXcUtjU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$oeg$3rja1WDPhCKC3M7ySJHcXcUtjU implements ObservableTransformer {
    private final /* synthetic */ vid f$0;

    public /* synthetic */ $$Lambda$oeg$3rja1WDPhCKC3M7ySJHcXcUtjU(vid vid) {
        this.f$0 = vid;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$oeg$pX10056dCMvf7GO1x2J6Wrks_Y<Object,Object>(this.f$0), false).e();
    }
}
