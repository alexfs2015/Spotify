package defpackage;

import android.content.Context;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$upm$ySxD4LjdDvb8GoiwfMG7p2qxA8w reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$ySxD4LjdDvb8GoiwfMG7p2qxA8w implements ObservableTransformer {
    private final /* synthetic */ lbs f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$upm$ySxD4LjdDvb8GoiwfMG7p2qxA8w(lbs lbs, Context context) {
        this.f$0 = lbs;
        this.f$1 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$upm$pKrdH0L2KpOxQKVvXRmChpi9u1E<Object,Object>(this.f$0, this.f$1), false);
    }
}
