package defpackage;

import android.content.Context;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$ibl$eILSAfjxaf85l9qMQIbafaJZHmk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ibl$eILSAfjxaf85l9qMQIbafaJZHmk implements ObservableTransformer {
    private final /* synthetic */ hec f$0;
    private final /* synthetic */ Scheduler f$1;
    private final /* synthetic */ ibv f$2;
    private final /* synthetic */ Context f$3;

    public /* synthetic */ $$Lambda$ibl$eILSAfjxaf85l9qMQIbafaJZHmk(hec hec, Scheduler scheduler, ibv ibv, Context context) {
        this.f$0 = hec;
        this.f$1 = scheduler;
        this.f$2 = ibv;
        this.f$3 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((ObservableSource<? extends U>) this.f$0.a().j(), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$Z4eABFFpsyTMmSIOhclBPA2DtAw.INSTANCE).a((Predicate<? super T>) $$Lambda$ibl$Q6Y66ANxp14b0jmEeqgmAgbmVys.INSTANCE).a(this.f$1).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ibl$aDHWxGKyxgnlHuTKu27H13SPrXQ<Object,Object>(this.f$2, this.f$3), false);
    }
}
