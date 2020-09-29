package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$mpq$LT1nb1nRZTiCRWSLXAHI1AItS70 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mpq$LT1nb1nRZTiCRWSLXAHI1AItS70 implements ObservableTransformer {
    private final /* synthetic */ lbi f$0;
    private final /* synthetic */ mot f$1;
    private final /* synthetic */ mpr f$2;

    public /* synthetic */ $$Lambda$mpq$LT1nb1nRZTiCRWSLXAHI1AItS70(lbi lbi, mot mot, mpr mpr) {
        this.f$0 = lbi;
        this.f$1 = mot;
        this.f$2 = mpr;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mpq$87DRPwl7zloslYT87IVbqhvGE<Object,Object>(this.f$0, this.f$1, this.f$2), false);
    }
}
