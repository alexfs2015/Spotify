package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function3;
import java.util.concurrent.Callable;

/* renamed from: -$$Lambda$jvx$vf4pRo7Kx3ciHQjpcPwB2xVShVE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jvx$vf4pRo7Kx3ciHQjpcPwB2xVShVE implements Callable {
    private final /* synthetic */ jvq f$0;
    private final /* synthetic */ jvv f$1;
    private final /* synthetic */ jvz f$2;

    public /* synthetic */ $$Lambda$jvx$vf4pRo7Kx3ciHQjpcPwB2xVShVE(jvq jvq, jvv jvv, jvz jvz) {
        this.f$0 = jvq;
        this.f$1 = jvv;
        this.f$2 = jvz;
    }

    public final Object call() {
        return Observable.a((ObservableSource<? extends T1>) this.f$0.a(), (ObservableSource<? extends T2>) this.f$1.a, (ObservableSource<? extends T3>) this.f$2.a, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$jvx$IVa_9PS92SaenuqHa6TbY3ikfss.INSTANCE);
    }
}
