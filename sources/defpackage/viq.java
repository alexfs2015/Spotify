package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: viq reason: default package */
public final class viq<T> implements ObservableTransformer<T, T> {
    private final int a;
    private final vip b;

    public viq(int i, int i2, long j) {
        this.a = i;
        this.b = new vip(i2, j);
    }

    public viq() {
        this(30, 5, 1000);
    }

    public final ObservableSource<T> apply(Observable<T> observable) {
        return observable.c((long) this.a, TimeUnit.SECONDS).g((Function<? super Observable<Throwable>, ? extends ObservableSource<?>>) this.b);
    }
}
