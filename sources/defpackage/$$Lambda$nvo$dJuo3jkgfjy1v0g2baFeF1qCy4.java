package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$nvo$dJuo3jkgfjy1v0-g2baFeF1qCy4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nvo$dJuo3jkgfjy1v0g2baFeF1qCy4 implements ObservableTransformer {
    private final /* synthetic */ nvg f$0;

    public /* synthetic */ $$Lambda$nvo$dJuo3jkgfjy1v0g2baFeF1qCy4(nvg nvg) {
        this.f$0 = nvg;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$nvo$t3LBaDs94BiPFSpMpF_IF3bxs4<Object,Object>(this.f$0), false);
    }
}
