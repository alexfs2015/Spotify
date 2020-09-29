package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pxa$N87YxBhNj73-QJxXqyHVZwkJzFk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pxa$N87YxBhNj73QJxXqyHVZwkJzFk implements ObservableTransformer {
    private final /* synthetic */ hgy f$0;
    private final /* synthetic */ Consumer f$1;

    public /* synthetic */ $$Lambda$pxa$N87YxBhNj73QJxXqyHVZwkJzFk(hgy hgy, Consumer consumer) {
        this.f$0 = hgy;
        this.f$1 = consumer;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((ObservableSource<? extends U>) this.f$0.a().j(), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$5wk04QP_JFwrNBLHbdumOfUsonY.INSTANCE).b((Function<? super T, ? extends CompletableSource>) new $$Lambda$pxa$Y9x2EHXFTBUgFPWcul18K4Su6Q0<Object,Object>(this.f$1), false).e();
    }
}
