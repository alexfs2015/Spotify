package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$qad$e-245pYFM6mgeqW2BBcGmqjKBCY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qad$e245pYFM6mgeqW2BBcGmqjKBCY implements ObservableTransformer {
    private final /* synthetic */ Scheduler f$0;

    public /* synthetic */ $$Lambda$qad$e245pYFM6mgeqW2BBcGmqjKBCY(Scheduler scheduler) {
        this.f$0 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c(10, TimeUnit.MINUTES, this.f$0).c((Function<? super T, ? extends R>) $$Lambda$qad$ZAkKvyUMK8xx4Gi7IybpUaICMmY.INSTANCE);
    }
}
