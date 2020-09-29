package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ucr$jR0lFwK99BBTxx7q_K3Ppx34HGM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ucr$jR0lFwK99BBTxx7q_K3Ppx34HGM implements ObservableTransformer {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ ToastieManager f$1;
    private final /* synthetic */ Scheduler f$2;

    public /* synthetic */ $$Lambda$ucr$jR0lFwK99BBTxx7q_K3Ppx34HGM(Context context, ToastieManager toastieManager, Scheduler scheduler) {
        this.f$0 = context;
        this.f$1 = toastieManager;
        this.f$2 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ucr$kXWlCyNJSW_hSns1y6WeRx0Zws<Object,Object>(this.f$0, this.f$1, this.f$2), false);
    }
}
