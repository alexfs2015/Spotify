package defpackage;

import android.os.IBinder;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: hhr reason: default package */
public final class hhr<T> implements ObservableTransformer<IBinder, T> {
    private final Function<hhx, T> a;

    public hhr(Function<hhx, T> function) {
        this.a = function;
    }

    public final /* synthetic */ ObservableSource apply(Observable observable) {
        return observable.a(hhx.class).c(this.a).a(1).a();
    }
}
