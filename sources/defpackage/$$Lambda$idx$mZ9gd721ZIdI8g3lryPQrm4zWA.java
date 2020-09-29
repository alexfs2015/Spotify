package defpackage;

import android.content.Context;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$idx$-mZ9gd721ZIdI8g3lryPQrm4zWA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$idx$mZ9gd721ZIdI8g3lryPQrm4zWA implements ObservableTransformer {
    private final /* synthetic */ hgy f$0;
    private final /* synthetic */ Scheduler f$1;
    private final /* synthetic */ ieh f$2;
    private final /* synthetic */ Context f$3;

    public /* synthetic */ $$Lambda$idx$mZ9gd721ZIdI8g3lryPQrm4zWA(hgy hgy, Scheduler scheduler, ieh ieh, Context context) {
        this.f$0 = hgy;
        this.f$1 = scheduler;
        this.f$2 = ieh;
        this.f$3 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((ObservableSource<? extends U>) this.f$0.a().j(), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$qAZ16EQe0u_jNgbxh94TZhquAFo.INSTANCE).a((Predicate<? super T>) $$Lambda$idx$5H6rm4QiaHebUBg09MJqUyJ56tY.INSTANCE).a(this.f$1).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$idx$Pk8Woz3g3Gjewdu9PnCZYNFNoSw<Object,Object>(this.f$2, this.f$3), false);
    }
}
