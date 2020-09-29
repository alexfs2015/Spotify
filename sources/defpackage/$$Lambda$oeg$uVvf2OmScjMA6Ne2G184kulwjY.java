package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$oeg$uVvf-2OmScjMA6Ne2G184kulwjY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$oeg$uVvf2OmScjMA6Ne2G184kulwjY implements ObservableTransformer {
    private final /* synthetic */ vid f$0;
    private final /* synthetic */ vic f$1;

    public /* synthetic */ $$Lambda$oeg$uVvf2OmScjMA6Ne2G184kulwjY(vid vid, vic vic) {
        this.f$0 = vid;
        this.f$1 = vic;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$oeg$4tHKIr6MGozXHAMyli2vHH3A4Y<Object,Object>(this.f$0, this.f$1), false).e();
    }
}
