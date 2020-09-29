package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$upm$IRQoW1jyjaOEd2P3X_WqsEZHZHo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$IRQoW1jyjaOEd2P3X_WqsEZHZHo implements ObservableTransformer {
    private final /* synthetic */ ToastieManager f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$upm$IRQoW1jyjaOEd2P3X_WqsEZHZHo(ToastieManager toastieManager, Context context) {
        this.f$0 = toastieManager;
        this.f$1 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$upm$RH_5IesKmP_oHiO5wzaRcR5A2uU<Object,Object>(this.f$0, this.f$1), false);
    }
}
