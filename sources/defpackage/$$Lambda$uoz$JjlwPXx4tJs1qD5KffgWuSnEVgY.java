package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$uoz$JjlwPXx4tJs1qD5KffgWuSnEVgY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uoz$JjlwPXx4tJs1qD5KffgWuSnEVgY implements ObservableTransformer {
    private final /* synthetic */ upb f$0;

    public /* synthetic */ $$Lambda$uoz$JjlwPXx4tJs1qD5KffgWuSnEVgY(upb upb) {
        this.f$0 = upb;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.i(new $$Lambda$uoz$53vvg_keC4i0PtmGutSK6xC40_8(this.f$0)).a((ObservableSource<T>) Observable.c());
    }
}
