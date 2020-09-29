package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$uce$vN_k3wHgm9ogIR29yXfqIt03iO8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$uce$vN_k3wHgm9ogIR29yXfqIt03iO8 implements Function {
    private final /* synthetic */ ucf f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$uce$vN_k3wHgm9ogIR29yXfqIt03iO8(ucf ucf, Scheduler scheduler) {
        this.f$0 = ucf;
        this.f$1 = scheduler;
    }

    public final Object apply(Object obj) {
        return this.f$0.b(((f) obj).a).f($$Lambda$uce$HXOJmKkafSHuzKMGu91oXZyNl_0.INSTANCE).a(5000, TimeUnit.MILLISECONDS, this.f$1).g($$Lambda$uce$cZO7t3KlIaGvaITLKtNm9RceU.INSTANCE);
    }
}
