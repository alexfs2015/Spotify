package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$prh$GXvJZcCIuNHZ9UVP-v0gSss0P-w reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$prh$GXvJZcCIuNHZ9UVPv0gSss0Pw implements ObservableTransformer {
    private final /* synthetic */ Scheduler f$0;

    public /* synthetic */ $$Lambda$prh$GXvJZcCIuNHZ9UVPv0gSss0Pw(Scheduler scheduler) {
        this.f$0 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c(10, TimeUnit.MINUTES, this.f$0).c((Function<? super T, ? extends R>) $$Lambda$prh$lIIe4OyC27nzIknbHLAWl2joNFQ.INSTANCE);
    }
}
