package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$upm$A4gX8DWXC5ZJi1OhkapqU_xSJCw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$A4gX8DWXC5ZJi1OhkapqU_xSJCw implements Function {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ ToastieManager f$1;
    private final /* synthetic */ Scheduler f$2;

    public /* synthetic */ $$Lambda$upm$A4gX8DWXC5ZJi1OhkapqU_xSJCw(Context context, ToastieManager toastieManager, Scheduler scheduler) {
        this.f$0 = context;
        this.f$1 = toastieManager;
        this.f$2 = scheduler;
    }

    public final Object apply(Object obj) {
        return upm.a(this.f$0, this.f$1, this.f$2, (h) obj);
    }
}
