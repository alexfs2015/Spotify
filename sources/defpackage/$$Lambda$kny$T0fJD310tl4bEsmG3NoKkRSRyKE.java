package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: -$$Lambda$kny$T0fJD310tl4bEsmG3NoKkRSRyKE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kny$T0fJD310tl4bEsmG3NoKkRSRyKE implements ObservableTransformer {
    private final /* synthetic */ Scheduler f$0;

    public /* synthetic */ $$Lambda$kny$T0fJD310tl4bEsmG3NoKkRSRyKE(Scheduler scheduler) {
        this.f$0 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$kny$O1IWyBVlWFCVyYntUTDMau0qwPo(this.f$0));
    }
}
