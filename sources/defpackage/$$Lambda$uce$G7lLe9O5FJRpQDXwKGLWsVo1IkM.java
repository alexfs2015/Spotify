package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$uce$G7lLe9O5FJRpQDXwKGLWsVo1IkM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$uce$G7lLe9O5FJRpQDXwKGLWsVo1IkM implements Function {
    private final /* synthetic */ ucf f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$uce$G7lLe9O5FJRpQDXwKGLWsVo1IkM(ucf ucf, Scheduler scheduler) {
        this.f$0 = ucf;
        this.f$1 = scheduler;
    }

    public final Object apply(Object obj) {
        return this.f$0.c().f($$Lambda$ED7raG8m5narW_ACMOmo7wXk5w.INSTANCE).a(5000, TimeUnit.MILLISECONDS, this.f$1).g($$Lambda$uce$3zSOeTamlQLffuXghMVZfaWlPkc.INSTANCE);
    }
}
