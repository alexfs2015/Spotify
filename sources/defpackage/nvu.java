package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: nvu reason: default package */
final class nvu {
    private final Scheduler a;
    private final Scheduler b;

    public nvu(Scheduler scheduler, Scheduler scheduler2) {
        this.a = scheduler;
        this.b = scheduler2;
    }

    public final Observable<Integer> a() {
        return Observable.a(1, 360).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$nvu$DQTT2mefDiOsqwscqFbVwTDNI1g<Object,Object>(this), 2).a(this.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Integer num) {
        return Observable.b(num).c(30, TimeUnit.MILLISECONDS, this.a);
    }
}
