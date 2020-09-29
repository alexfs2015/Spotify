package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ucr$V1eqWnEDp0y26Sut4Wu-h4pNwWI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ucr$V1eqWnEDp0y26Sut4Wuh4pNwWI implements ObservableTransformer {
    private final /* synthetic */ ToastieManager f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$ucr$V1eqWnEDp0y26Sut4Wuh4pNwWI(ToastieManager toastieManager, Context context) {
        this.f$0 = toastieManager;
        this.f$1 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ucr$1zhEjtepxtXY5pgKFgvBYMrixo<Object,Object>(this.f$0, this.f$1), false);
    }
}
