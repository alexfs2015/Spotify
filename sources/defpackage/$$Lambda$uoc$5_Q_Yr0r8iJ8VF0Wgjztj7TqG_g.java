package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uoc$5_Q_Yr0r8iJ8VF0Wgjztj7TqG_g reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uoc$5_Q_Yr0r8iJ8VF0Wgjztj7TqG_g implements Function {
    private final /* synthetic */ unp f$0;
    private final /* synthetic */ Scheduler f$1;
    private final /* synthetic */ via f$2;
    private final /* synthetic */ Context f$3;

    public /* synthetic */ $$Lambda$uoc$5_Q_Yr0r8iJ8VF0Wgjztj7TqG_g(unp unp, Scheduler scheduler, via via, Context context) {
        this.f$0 = unp;
        this.f$1 = scheduler;
        this.f$2 = via;
        this.f$3 = context;
    }

    public final Object apply(Object obj) {
        return uoc.a(this.f$0, this.f$1, this.f$2, this.f$3, (b) obj);
    }
}
