package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kny$0k883eu_Wkryqrl6lfPCPWIdVYg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kny$0k883eu_Wkryqrl6lfPCPWIdVYg implements ObservableTransformer {
    private final /* synthetic */ kob f$0;

    public /* synthetic */ $$Lambda$kny$0k883eu_Wkryqrl6lfPCPWIdVYg(kob kob) {
        this.f$0 = kob;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$kny$_tHCTHxiSaMhYDsTRYiSzZngRTg(this.f$0)).e((Function<? super Throwable, ? extends T>) $$Lambda$kny$rpEMHnt5etgl4G_XjWsMbFI21g.INSTANCE);
    }
}
