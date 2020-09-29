package defpackage;

import android.os.IBinder;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: hkl reason: default package */
public final class hkl<T> implements ObservableTransformer<IBinder, T> {
    private final Function<hkr, T> a;

    public hkl(Function<hkr, T> function) {
        this.a = function;
    }

    public final /* synthetic */ ObservableSource apply(Observable observable) {
        return observable.a(hkr.class).c(this.a).a(1).a();
    }
}
