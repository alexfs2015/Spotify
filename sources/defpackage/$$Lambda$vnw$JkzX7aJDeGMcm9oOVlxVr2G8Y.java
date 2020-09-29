package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vnw$Jkz-X7-aJDeGMcm9oOVlxVr2G8Y reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vnw$JkzX7aJDeGMcm9oOVlxVr2G8Y implements ObservableTransformer {
    private final /* synthetic */ vnj f$0;

    public /* synthetic */ $$Lambda$vnw$JkzX7aJDeGMcm9oOVlxVr2G8Y(vnj vnj) {
        this.f$0 = vnj;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$Ls7nBDDESY5c1vEvKOARB4azdXE.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vnw$kJFbSfQh4Rj75nvGPKc2ywIdPg<Object,Object>(this.f$0), false);
    }
}
