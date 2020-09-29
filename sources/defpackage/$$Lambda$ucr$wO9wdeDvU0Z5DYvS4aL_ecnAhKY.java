package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ucr$wO9wdeDvU0Z5DYvS4aL_ecnAhKY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ucr$wO9wdeDvU0Z5DYvS4aL_ecnAhKY implements ObservableTransformer {
    private final /* synthetic */ uau f$0;

    public /* synthetic */ $$Lambda$ucr$wO9wdeDvU0Z5DYvS4aL_ecnAhKY(uau uau) {
        this.f$0 = uau;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ucr$Uieu11l4O4xkgU8ctLURPqIKevg<Object,Object>(this.f$0), false);
    }
}
