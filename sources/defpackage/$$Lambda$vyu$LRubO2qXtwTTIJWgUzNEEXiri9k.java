package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$vyu$LRubO2qXtwTTIJWgUzNEEXiri9k reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vyu$LRubO2qXtwTTIJWgUzNEEXiri9k implements ObservableTransformer {
    private final /* synthetic */ vyw f$0;

    public /* synthetic */ $$Lambda$vyu$LRubO2qXtwTTIJWgUzNEEXiri9k(vyw vyw) {
        this.f$0 = vyw;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$vyu$1h041jR2wRGTIxJrWOyOP0LCGA(this.f$0));
    }
}
