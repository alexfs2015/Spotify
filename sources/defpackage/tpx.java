package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: tpx reason: default package */
final class tpx {
    private final Scheduler a;
    private final Scheduler b;

    public tpx(Scheduler scheduler, Scheduler scheduler2) {
        this.a = scheduler;
        this.b = scheduler2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Integer num) {
        return Observable.b(num).c(41, TimeUnit.MILLISECONDS, this.a);
    }

    public final Observable<Integer> a() {
        return Observable.a(1, 360).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$tpx$uGomrSovCPCmIw2qKUl7kaOoN8c<Object,Object>(this), 2).a(this.b);
    }
}
