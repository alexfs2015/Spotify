package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$jez$1c0Xp_c_FVX4LEmuUa_d1-tBxpQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jez$1c0Xp_c_FVX4LEmuUa_d1tBxpQ implements ObservableTransformer {
    private final /* synthetic */ jen f$0;

    public /* synthetic */ $$Lambda$jez$1c0Xp_c_FVX4LEmuUa_d1tBxpQ(jen jen) {
        this.f$0 = jen;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$jez$yV3U751ltgEuB8neRFEtzzVRQw(this.f$0));
    }
}
