package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$gou$WSAXtr7fI-JY7QwW4SSDj23S2Z8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$gou$WSAXtr7fIJY7QwW4SSDj23S2Z8 implements ObservableTransformer {
    private final /* synthetic */ ghm f$0;
    private final /* synthetic */ Observable f$1;

    public /* synthetic */ $$Lambda$gou$WSAXtr7fIJY7QwW4SSDj23S2Z8(ghm ghm, Observable observable) {
        this.f$0 = ghm;
        this.f$1 = observable;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$gou$Qg7c1aNKwxYlVRdxgVN4_PK2WQ<Object,Object>(this.f$0, this.f$1), false);
    }
}
