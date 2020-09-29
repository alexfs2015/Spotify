package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ucr$zntASkgZMDHO9gbit1KusS_uzhQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ucr$zntASkgZMDHO9gbit1KusS_uzhQ implements Function {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ ToastieManager f$1;
    private final /* synthetic */ Scheduler f$2;

    public /* synthetic */ $$Lambda$ucr$zntASkgZMDHO9gbit1KusS_uzhQ(Context context, ToastieManager toastieManager, Scheduler scheduler) {
        this.f$0 = context;
        this.f$1 = toastieManager;
        this.f$2 = scheduler;
    }

    public final Object apply(Object obj) {
        return ucr.a(this.f$0, this.f$1, this.f$2, (f) obj);
    }
}
