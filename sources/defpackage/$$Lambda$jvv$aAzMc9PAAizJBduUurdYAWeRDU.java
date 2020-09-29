package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: -$$Lambda$jvv$aAzMc9PAAizJB-duUurdYAWeRDU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jvv$aAzMc9PAAizJBduUurdYAWeRDU implements Callable {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ IntentFilter f$1;

    public /* synthetic */ $$Lambda$jvv$aAzMc9PAAizJBduUurdYAWeRDU(Context context, IntentFilter intentFilter) {
        this.f$0 = context;
        this.f$1 = intentFilter;
    }

    public final Object call() {
        return vvn.a(this.f$0, this.f$1).c((Function<? super T, ? extends R>) new $$Lambda$jvv$hz_xXVlXOuMXeveG4jKCmESLBEM<Object,Object>(this.f$0)).f((ObservableSource<? extends T>) Observable.b((Callable<? extends T>) new $$Lambda$jvv$XSmikllrWECbQQnnqqEzniXvqk<Object>(this.f$0))).a(Functions.a());
    }
}
