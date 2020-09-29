package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qnw$8c4aUCj9K7HTCWJngGUtMisRyKE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qnw$8c4aUCj9K7HTCWJngGUtMisRyKE implements ObservableTransformer {
    private final /* synthetic */ RxResolver f$0;
    private final /* synthetic */ xil f$1;
    private final /* synthetic */ xil f$2;

    public /* synthetic */ $$Lambda$qnw$8c4aUCj9K7HTCWJngGUtMisRyKE(RxResolver rxResolver, xil xil, xil xil2) {
        this.f$0 = rxResolver;
        this.f$1 = xil;
        this.f$2 = xil2;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qnw$AdOl1lCI4TSnSADWgmBIa7Vfyrk<Object,Object>(this.f$0, this.f$1, this.f$2), false);
    }
}
