package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: och reason: default package */
final class och {
    private final Scheduler a;
    private final Scheduler b;

    public och(Scheduler scheduler, Scheduler scheduler2) {
        this.a = scheduler;
        this.b = scheduler2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Integer num) {
        return Observable.b(num).c(30, TimeUnit.MILLISECONDS, this.a);
    }

    public final Observable<Integer> a() {
        return Observable.a(1, 360).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$och$G8B2LB_d3Ttfglc3UG_2emd16gg<Object,Object>(this), 2).a(this.b);
    }
}
