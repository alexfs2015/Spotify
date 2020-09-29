package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$upm$U2lcU9cuQ6OMOu2lJJthEZIEY2Q reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$U2lcU9cuQ6OMOu2lJJthEZIEY2Q implements ObservableTransformer {
    private final /* synthetic */ ToastieManager f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$upm$U2lcU9cuQ6OMOu2lJJthEZIEY2Q(ToastieManager toastieManager, Context context) {
        this.f$0 = toastieManager;
        this.f$1 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$upm$z12Ri_3cDEthXFrDGwN55udQeE<Object,Object>(this.f$0, this.f$1), false);
    }
}
