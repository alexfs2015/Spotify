package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$gqj$cmB5KdwkoavGpZlKAnviAatmkao reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gqj$cmB5KdwkoavGpZlKAnviAatmkao implements ObservableTransformer {
    private final /* synthetic */ gix f$0;
    private final /* synthetic */ Observable f$1;

    public /* synthetic */ $$Lambda$gqj$cmB5KdwkoavGpZlKAnviAatmkao(gix gix, Observable observable) {
        this.f$0 = gix;
        this.f$1 = observable;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$gqj$joF17w3H3Ixxa38ZEywlg9Gx2M<Object,Object>(this.f$0, this.f$1), false);
    }
}
