package defpackage;

import android.content.Context;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: -$$Lambda$uoc$Ay7yBZfoitDOhIpYEhpBy1jeA7s reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uoc$Ay7yBZfoitDOhIpYEhpBy1jeA7s implements ObservableTransformer {
    private final /* synthetic */ unp f$0;
    private final /* synthetic */ Scheduler f$1;
    private final /* synthetic */ via f$2;
    private final /* synthetic */ Context f$3;

    public /* synthetic */ $$Lambda$uoc$Ay7yBZfoitDOhIpYEhpBy1jeA7s(unp unp, Scheduler scheduler, via via, Context context) {
        this.f$0 = unp;
        this.f$1 = scheduler;
        this.f$2 = via;
        this.f$3 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$uoc$5_Q_Yr0r8iJ8VF0Wgjztj7TqG_g(this.f$0, this.f$1, this.f$2, this.f$3));
    }
}
