package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$krh$kcqOzaAm4dyJbxlQ8gkH70z8kgM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krh$kcqOzaAm4dyJbxlQ8gkH70z8kgM implements Function {
    private final /* synthetic */ Scheduler f$0;

    public /* synthetic */ $$Lambda$krh$kcqOzaAm4dyJbxlQ8gkH70z8kgM(Scheduler scheduler) {
        this.f$0 = scheduler;
    }

    public final Object apply(Object obj) {
        return Observable.b(new n(((i) obj).b)).c(((i) obj).a, TimeUnit.MILLISECONDS, this.f$0);
    }
}
