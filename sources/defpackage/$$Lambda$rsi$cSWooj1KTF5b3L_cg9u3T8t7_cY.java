package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$rsi$cSWooj1KTF5b3L_cg9u3T8t7_cY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$rsi$cSWooj1KTF5b3L_cg9u3T8t7_cY implements ObservableTransformer {
    private final /* synthetic */ rsa f$0;

    public /* synthetic */ $$Lambda$rsi$cSWooj1KTF5b3L_cg9u3T8t7_cY(rsa rsa) {
        this.f$0 = rsa;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$rsi$UGO2NOSLNDOm8vedgF8quHCKt3U<Object,Object>(this.f$0), false);
    }
}
