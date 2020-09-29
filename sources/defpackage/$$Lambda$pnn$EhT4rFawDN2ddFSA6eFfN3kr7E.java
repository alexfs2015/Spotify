package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$pnn$EhT4rFawDN2ddFSA-6eFfN3kr7E reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pnn$EhT4rFawDN2ddFSA6eFfN3kr7E implements Function {
    private final /* synthetic */ Scheduler f$0;

    public /* synthetic */ $$Lambda$pnn$EhT4rFawDN2ddFSA6eFfN3kr7E(Scheduler scheduler) {
        this.f$0 = scheduler;
    }

    public final Object apply(Object obj) {
        return Observable.b(new e()).c(((f) obj).a, TimeUnit.MILLISECONDS, this.f$0).h();
    }
}
