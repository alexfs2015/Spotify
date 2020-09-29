package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$rfb$ZdSeOoOTtxzBYJwoHmHLFrJJDTI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rfb$ZdSeOoOTtxzBYJwoHmHLFrJJDTI implements ObservableTransformer {
    private final /* synthetic */ Scheduler f$0;
    private final /* synthetic */ vcb f$1;

    public /* synthetic */ $$Lambda$rfb$ZdSeOoOTtxzBYJwoHmHLFrJJDTI(Scheduler scheduler, vcb vcb) {
        this.f$0 = scheduler;
        this.f$1 = vcb;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a(this.f$0).c((Function<? super T, ? extends R>) new $$Lambda$rfb$TtBd3f0m_eNs2sdaDsbAQMvP4U<Object,Object>(this.f$1));
    }
}
