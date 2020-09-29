package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$uce$Dq1OXu-d9cIqGeHprPZ3TH9B9wc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$uce$Dq1OXud9cIqGeHprPZ3TH9B9wc implements Function {
    private final /* synthetic */ ucf f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$uce$Dq1OXud9cIqGeHprPZ3TH9B9wc(ucf ucf, Scheduler scheduler) {
        this.f$0 = ucf;
        this.f$1 = scheduler;
    }

    public final Object apply(Object obj) {
        return this.f$0.b().f($$Lambda$lqDCBj530Yzd84oLA71Xm0wVOdQ.INSTANCE).a(5000, TimeUnit.MILLISECONDS, this.f$1).g($$Lambda$uce$mUbkRZc2q8qu7Hsd5v4SZ7XJBVI.INSTANCE);
    }
}
