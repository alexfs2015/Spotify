package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$jho$fcqDZUN36f41rXvW84F5byY_zS8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jho$fcqDZUN36f41rXvW84F5byY_zS8 implements ObservableTransformer {
    private final /* synthetic */ jhs f$0;

    public /* synthetic */ $$Lambda$jho$fcqDZUN36f41rXvW84F5byY_zS8(jhs jhs) {
        this.f$0 = jhs;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$jho$nfCMUGAsknjrTJPKirYgh7H1vg(this.f$0));
    }
}
