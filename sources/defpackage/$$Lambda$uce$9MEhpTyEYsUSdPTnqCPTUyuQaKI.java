package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$uce$9MEhpTyEYsUSdPTnqCPTUyuQaKI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$uce$9MEhpTyEYsUSdPTnqCPTUyuQaKI implements Function {
    private final /* synthetic */ ucf f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$uce$9MEhpTyEYsUSdPTnqCPTUyuQaKI(ucf ucf, Scheduler scheduler) {
        this.f$0 = ucf;
        this.f$1 = scheduler;
    }

    public final Object apply(Object obj) {
        return this.f$0.a().f($$Lambda$UzmilXU3cMaSAhIDAB1LiZhn8k.INSTANCE).a(5000, TimeUnit.MILLISECONDS, this.f$1).g($$Lambda$uce$zArwHCgR2b2YroHNrRjcJR5ALl4.INSTANCE);
    }
}
