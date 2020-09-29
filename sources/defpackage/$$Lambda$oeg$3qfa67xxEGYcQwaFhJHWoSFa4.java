package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$oeg$3qfa67x-xE-GYcQwaFhJHWoSFa4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$oeg$3qfa67xxEGYcQwaFhJHWoSFa4 implements ObservableTransformer {
    private final /* synthetic */ vid f$0;

    public /* synthetic */ $$Lambda$oeg$3qfa67xxEGYcQwaFhJHWoSFa4(vid vid) {
        this.f$0 = vid;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$oeg$JFWrev2F6Cq6DocffrCLKXpppA<Object,Object>(this.f$0), false).e();
    }
}
