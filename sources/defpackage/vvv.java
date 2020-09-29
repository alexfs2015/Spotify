package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: vvv reason: default package */
public final class vvv<T> implements ObservableTransformer<T, T> {
    private final int a;
    private final vvu b;

    public vvv() {
        this(30, 5, 1000);
    }

    public vvv(int i, int i2, long j) {
        this.a = i;
        this.b = new vvu(i2, j);
    }

    public final ObservableSource<T> apply(Observable<T> observable) {
        return observable.c((long) this.a, TimeUnit.SECONDS).g((Function<? super Observable<Throwable>, ? extends ObservableSource<?>>) this.b);
    }
}
