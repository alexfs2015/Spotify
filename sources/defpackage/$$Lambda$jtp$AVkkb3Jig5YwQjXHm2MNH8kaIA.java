package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function3;
import java.util.concurrent.Callable;

/* renamed from: -$$Lambda$jtp$AVkkb3Jig-5YwQjXHm2MNH8kaIA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jtp$AVkkb3Jig5YwQjXHm2MNH8kaIA implements Callable {
    private final /* synthetic */ jti f$0;
    private final /* synthetic */ jtn f$1;
    private final /* synthetic */ jtr f$2;

    public /* synthetic */ $$Lambda$jtp$AVkkb3Jig5YwQjXHm2MNH8kaIA(jti jti, jtn jtn, jtr jtr) {
        this.f$0 = jti;
        this.f$1 = jtn;
        this.f$2 = jtr;
    }

    public final Object call() {
        return Observable.a((ObservableSource<? extends T1>) this.f$0.a(), (ObservableSource<? extends T2>) this.f$1.a, (ObservableSource<? extends T3>) this.f$2.a, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$jtp$2d4iZNXrJlWlvJP1pti30gOnPQM.INSTANCE);
    }
}
