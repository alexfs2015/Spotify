package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$qwm$1g8IoZwa92Wo_0MOGKVLJex_XT0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qwm$1g8IoZwa92Wo_0MOGKVLJex_XT0 implements ObservableTransformer {
    private final /* synthetic */ qul f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$qwm$1g8IoZwa92Wo_0MOGKVLJex_XT0(qul qul, Scheduler scheduler) {
        this.f$0 = qul;
        this.f$1 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return this.f$0.a(observable.c((Function<? super T, ? extends R>) $$Lambda$7sNsBd3HDsJxiMK6mY57tu0TLhc.INSTANCE)).c((Function<? super T, ? extends R>) $$Lambda$AeWfeQu8xUkD53CcYR0Xvw81pG8.INSTANCE).b(50, TimeUnit.MILLISECONDS, this.f$1).a(this.f$1);
    }
}
