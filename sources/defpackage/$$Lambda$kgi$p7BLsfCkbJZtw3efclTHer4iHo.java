package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kgi$p7BLsfCkbJ-Ztw3efclTHer4iHo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kgi$p7BLsfCkbJZtw3efclTHer4iHo implements ObservableTransformer {
    private final /* synthetic */ kgt f$0;

    public /* synthetic */ $$Lambda$kgi$p7BLsfCkbJZtw3efclTHer4iHo(kgt kgt) {
        this.f$0 = kgt;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$_jwHtofhGszFXjTyOLDiNAntw.INSTANCE).a((ObservableTransformer<? super T, ? extends R>) new $$Lambda$kgi$w_K6y2CxPflJm29b28UW2FWx0HE<Object,Object>(this.f$0));
    }
}
