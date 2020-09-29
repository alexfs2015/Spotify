package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$krj$IDRpDEg2-SpbLrm1WaQ-ZQuKN8w reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krj$IDRpDEg2SpbLrm1WaQZQuKN8w implements ObservableTransformer {
    private final /* synthetic */ krn f$0;

    public /* synthetic */ $$Lambda$krj$IDRpDEg2SpbLrm1WaQZQuKN8w(krn krn) {
        this.f$0 = krn;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$krj$4E0_ehjbXyzLSa8Q33OWoUnris(this.f$0));
    }
}
