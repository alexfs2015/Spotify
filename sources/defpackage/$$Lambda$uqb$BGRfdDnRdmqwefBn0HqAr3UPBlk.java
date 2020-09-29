package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: -$$Lambda$uqb$BGRfdDnRdmqwefBn0HqAr3UPBlk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uqb$BGRfdDnRdmqwefBn0HqAr3UPBlk implements ObservableTransformer {
    private final /* synthetic */ unp f$0;
    private final /* synthetic */ Scheduler f$1;
    private final /* synthetic */ via f$2;
    private final /* synthetic */ upt f$3;

    public /* synthetic */ $$Lambda$uqb$BGRfdDnRdmqwefBn0HqAr3UPBlk(unp unp, Scheduler scheduler, via via, upt upt) {
        this.f$0 = unp;
        this.f$1 = scheduler;
        this.f$2 = via;
        this.f$3 = upt;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$uqb$k6gZvsYzt9ZwrK379pqoiCOCSk(this.f$0, this.f$1, this.f$2, this.f$3));
    }
}
