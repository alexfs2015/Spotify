package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$kri$b-mVjcidUPVpOZaLD_7rihbNsRA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kri$bmVjcidUPVpOZaLD_7rihbNsRA implements ObservableTransformer {
    private final /* synthetic */ Flowable f$0;
    private final /* synthetic */ jtz f$1;
    private final /* synthetic */ iiw f$2;
    private final /* synthetic */ gfk f$3;

    public /* synthetic */ $$Lambda$kri$bmVjcidUPVpOZaLD_7rihbNsRA(Flowable flowable, jtz jtz, iiw iiw, gfk gfk) {
        this.f$0 = flowable;
        this.f$1 = jtz;
        this.f$2 = iiw;
        this.f$3 = gfk;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$kri$cebYJEQ6X7c2IowkP8TSWngHQWE(this.f$0, this.f$1, this.f$2, this.f$3));
    }
}
