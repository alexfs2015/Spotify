package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$uce$Tx4rZH0tXbmwlPSETxogGX_9PF4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$uce$Tx4rZH0tXbmwlPSETxogGX_9PF4 implements Function {
    private final /* synthetic */ ucf f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$uce$Tx4rZH0tXbmwlPSETxogGX_9PF4(ucf ucf, Scheduler scheduler) {
        this.f$0 = ucf;
        this.f$1 = scheduler;
    }

    public final Object apply(Object obj) {
        return this.f$0.c(((a) obj).a).f($$Lambda$uce$FgjQoOxp3cWjoRCiVOz3Afc6s.INSTANCE).a(5000, TimeUnit.MILLISECONDS, this.f$1).g($$Lambda$uce$Ve7pTekxiKaiwQtJlLuVJKmw_WQ.INSTANCE);
    }
}
