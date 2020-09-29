package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$pgb$CVcN7krWo9aXM66d_Bx3zaoK1QM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pgb$CVcN7krWo9aXM66d_Bx3zaoK1QM implements Function {
    private final /* synthetic */ Scheduler f$0;

    public /* synthetic */ $$Lambda$pgb$CVcN7krWo9aXM66d_Bx3zaoK1QM(Scheduler scheduler) {
        this.f$0 = scheduler;
    }

    public final Object apply(Object obj) {
        return Observable.b(new e()).c(((f) obj).a, TimeUnit.MILLISECONDS, this.f$0).h();
    }
}
