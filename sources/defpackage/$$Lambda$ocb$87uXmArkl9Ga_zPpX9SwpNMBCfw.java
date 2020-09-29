package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ocb$87uXmArkl9Ga_zPpX9SwpNMBCfw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ocb$87uXmArkl9Ga_zPpX9SwpNMBCfw implements ObservableTransformer {
    private final /* synthetic */ ocj f$0;

    public /* synthetic */ $$Lambda$ocb$87uXmArkl9Ga_zPpX9SwpNMBCfw(ocj ocj) {
        this.f$0 = ocj;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$ocb$1gnLH4VUvwQwmoqzYiJGf5DhraE<Object,Object>(this.f$0), false).e();
    }
}
