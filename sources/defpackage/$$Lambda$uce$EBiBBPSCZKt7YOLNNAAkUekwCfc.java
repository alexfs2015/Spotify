package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$uce$EBiBBPSCZKt7YOLNNAAkUekwCfc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$uce$EBiBBPSCZKt7YOLNNAAkUekwCfc implements Function {
    private final /* synthetic */ ucf f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$uce$EBiBBPSCZKt7YOLNNAAkUekwCfc(ucf ucf, Scheduler scheduler) {
        this.f$0 = ucf;
        this.f$1 = scheduler;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(((e) obj).a).f($$Lambda$GuPrtBw3u00JSPeGGc5Fbn0GxVU.INSTANCE).a(5000, TimeUnit.MILLISECONDS, this.f$1).g($$Lambda$uce$lnnHCYSN09K9JBA5bdR4KWhDOFk.INSTANCE);
    }
}
