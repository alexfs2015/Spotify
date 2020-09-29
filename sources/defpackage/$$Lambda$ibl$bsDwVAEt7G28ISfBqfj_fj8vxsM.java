package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$ibl$bsDwVAEt7G28ISfBqfj_fj8vxsM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ibl$bsDwVAEt7G28ISfBqfj_fj8vxsM implements ObservableTransformer {
    private final /* synthetic */ kxz f$0;
    private final /* synthetic */ hzy f$1;
    private final /* synthetic */ ids f$2;

    public /* synthetic */ $$Lambda$ibl$bsDwVAEt7G28ISfBqfj_fj8vxsM(kxz kxz, hzy hzy, ids ids) {
        this.f$0 = kxz;
        this.f$1 = hzy;
        this.f$2 = ids;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((ObservableSource<? extends U>) this.f$0.a(), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$sQgHIO4MoikdnUf67yWb3JTkhY.INSTANCE).a((Predicate<? super T>) $$Lambda$ibl$InRzw5lhFH7MDAr4h0t_o3ArWsU.INSTANCE).h(new $$Lambda$ibl$thr7RdeLIz6aBKBtPt7W3uAdHhE(this.f$1, this.f$2)).c((Function<? super T, ? extends R>) $$Lambda$ibl$hcL_pvcnAX4VJ_aoECW6hIpfmBs.INSTANCE);
    }
}
