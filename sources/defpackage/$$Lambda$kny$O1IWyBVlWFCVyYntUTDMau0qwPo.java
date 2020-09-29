package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$kny$O1IWyBVlWFCVyYntUTDMau0qwPo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kny$O1IWyBVlWFCVyYntUTDMau0qwPo implements Function {
    private final /* synthetic */ Scheduler f$0;

    public /* synthetic */ $$Lambda$kny$O1IWyBVlWFCVyYntUTDMau0qwPo(Scheduler scheduler) {
        this.f$0 = scheduler;
    }

    public final Object apply(Object obj) {
        return Observable.b(new n(((i) obj).b)).c(((i) obj).a, TimeUnit.MILLISECONDS, this.f$0);
    }
}
