package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$rsi$tFqUm6V92GUMyEpg0cyFsEgBRbw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$rsi$tFqUm6V92GUMyEpg0cyFsEgBRbw implements ObservableTransformer {
    private final /* synthetic */ rsa f$0;

    public /* synthetic */ $$Lambda$rsi$tFqUm6V92GUMyEpg0cyFsEgBRbw(rsa rsa) {
        this.f$0 = rsa;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$rsi$WfGAfgsf6CT5ulNWuyKTJp7rjvU<Object,Object>(this.f$0), false);
    }
}
