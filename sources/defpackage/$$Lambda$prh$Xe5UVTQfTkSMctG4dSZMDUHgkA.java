package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$prh$Xe5UVTQfTkSMctG4dSZMDUHgk-A reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$prh$Xe5UVTQfTkSMctG4dSZMDUHgkA implements ObservableTransformer {
    private final /* synthetic */ hec f$0;
    private final /* synthetic */ pox f$1;
    private final /* synthetic */ jro f$2;

    public /* synthetic */ $$Lambda$prh$Xe5UVTQfTkSMctG4dSZMDUHgkA(hec hec, pox pox, jro jro) {
        this.f$0 = hec;
        this.f$1 = pox;
        this.f$2 = jro;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$prh$FXr9zKOkvENutF20bKbB0Lf4e0<Object,Object>(this.f$0, this.f$1, this.f$2), false);
    }
}
