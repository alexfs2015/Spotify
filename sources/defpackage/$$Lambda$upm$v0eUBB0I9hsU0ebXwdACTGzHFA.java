package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$upm$v0eUBB0I9hsU0e-bXwdACTGzHFA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$v0eUBB0I9hsU0ebXwdACTGzHFA implements ObservableTransformer {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ ToastieManager f$1;
    private final /* synthetic */ Scheduler f$2;

    public /* synthetic */ $$Lambda$upm$v0eUBB0I9hsU0ebXwdACTGzHFA(Context context, ToastieManager toastieManager, Scheduler scheduler) {
        this.f$0 = context;
        this.f$1 = toastieManager;
        this.f$2 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$upm$A4gX8DWXC5ZJi1OhkapqU_xSJCw<Object,Object>(this.f$0, this.f$1, this.f$2), false);
    }
}
