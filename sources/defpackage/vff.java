package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* renamed from: vff reason: default package */
public final class vff<T> implements ObservableTransformer<vez<T>, vez<T>> {
    private final long a;
    private final Scheduler b;

    public vff(long j) {
        this(10, Schedulers.a());
    }

    private vff(long j, Scheduler scheduler) {
        this.a = j;
        this.b = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.a((ObservableSource<U>) Observable.a(this.a, TimeUnit.MILLISECONDS, this.b), (Function<? super T, ? extends ObservableSource<V>>) $$Lambda$vff$LMWVjVrZsjkCUY_5IpjjoxCEU.INSTANCE, (ObservableSource<? extends T>) Observable.a((ObservableSource<? extends T>) Observable.b(vez.a()), (ObservableSource<? extends T>) observable));
    }

    public final ObservableSource<vez<T>> apply(Observable<vez<T>> observable) {
        return observable.f((Function<? super Observable<T>, ? extends ObservableSource<R>>) new $$Lambda$vff$_ax6SnO9tEvhRmlKk4P7Ii_S7BI<Object,Object>(this));
    }
}
