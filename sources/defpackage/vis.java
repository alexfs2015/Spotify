package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: vis reason: default package */
public class vis<T> implements ObservableTransformer<T, T> {
    private final int a;
    private final vik b;
    private final Scheduler c;

    public vis(int i, vik vik, Scheduler scheduler) {
        this.a = i;
        this.b = vik;
        this.c = scheduler;
    }

    public /* synthetic */ ObservableSource apply(Observable observable) {
        return observable.d((long) this.a, TimeUnit.SECONDS, this.c).g((Function<? super Observable<Throwable>, ? extends ObservableSource<?>>) this.b);
    }
}
