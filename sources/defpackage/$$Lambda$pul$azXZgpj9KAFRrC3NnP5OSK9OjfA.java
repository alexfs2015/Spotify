package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pul$azXZgpj9KAFRrC3NnP5OSK9OjfA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pul$azXZgpj9KAFRrC3NnP5OSK9OjfA implements ObservableTransformer {
    private final /* synthetic */ kxz f$0;
    private final /* synthetic */ ptt f$1;
    private final /* synthetic */ pum f$2;

    public /* synthetic */ $$Lambda$pul$azXZgpj9KAFRrC3NnP5OSK9OjfA(kxz kxz, ptt ptt, pum pum) {
        this.f$0 = kxz;
        this.f$1 = ptt;
        this.f$2 = pum;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$pul$1aPANdsaDcJtDxgGJyUsYFg3tqw<Object,Object>(this.f$0, this.f$1, this.f$2), false);
    }
}
