package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$idx$bvtDCNSgO8DybSCaCeDCOUfgaxI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$idx$bvtDCNSgO8DybSCaCeDCOUfgaxI implements ObservableTransformer {
    private final /* synthetic */ lbi f$0;
    private final /* synthetic */ ick f$1;
    private final /* synthetic */ igf f$2;

    public /* synthetic */ $$Lambda$idx$bvtDCNSgO8DybSCaCeDCOUfgaxI(lbi lbi, ick ick, igf igf) {
        this.f$0 = lbi;
        this.f$1 = ick;
        this.f$2 = igf;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((ObservableSource<? extends U>) this.f$0.a(), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$jLg2BrsglLIUWR8WhY9NYt8ApE.INSTANCE).a((Predicate<? super T>) $$Lambda$idx$IdIG37SRmnkVpwfK7pqDQi5cLM.INSTANCE).h(new $$Lambda$idx$4pgUM4IQcClWSCufiftnLpAoU(this.f$1, this.f$2)).c((Function<? super T, ? extends R>) $$Lambda$idx$1kKPRYRVVEUnmPMQQaJHipPnfA.INSTANCE);
    }
}
