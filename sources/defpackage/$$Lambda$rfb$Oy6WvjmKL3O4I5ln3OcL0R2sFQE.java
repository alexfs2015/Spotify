package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$rfb$Oy6WvjmKL3O4I5ln3OcL0R2sFQE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rfb$Oy6WvjmKL3O4I5ln3OcL0R2sFQE implements ObservableTransformer {
    private final /* synthetic */ rda f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$rfb$Oy6WvjmKL3O4I5ln3OcL0R2sFQE(rda rda, Scheduler scheduler) {
        this.f$0 = rda;
        this.f$1 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return this.f$0.a(observable.c((Function<? super T, ? extends R>) $$Lambda$Lm5ye78OusbczqS1SE_4fYqIw9E.INSTANCE)).c((Function<? super T, ? extends R>) $$Lambda$fjHyqv5pBhV4t8YlxBsQj2PMevE.INSTANCE).b(50, TimeUnit.MILLISECONDS, this.f$1).a(this.f$1);
    }
}
