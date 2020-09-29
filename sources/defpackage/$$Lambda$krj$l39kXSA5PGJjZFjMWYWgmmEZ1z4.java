package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$krj$l39kXSA5PGJjZFjMWYWgmmEZ1z4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krj$l39kXSA5PGJjZFjMWYWgmmEZ1z4 implements ObservableTransformer {
    private final /* synthetic */ krn f$0;

    public /* synthetic */ $$Lambda$krj$l39kXSA5PGJjZFjMWYWgmmEZ1z4(krn krn) {
        this.f$0 = krn;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$krj$P1rspTyZX0KnJoDfFRUO2NRYTMM(this.f$0));
    }
}
