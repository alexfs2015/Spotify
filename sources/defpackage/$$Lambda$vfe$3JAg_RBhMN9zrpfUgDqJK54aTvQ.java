package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$vfe$3JAg_RBhMN9zrpfUgDqJK54aTvQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vfe$3JAg_RBhMN9zrpfUgDqJK54aTvQ implements ObservableTransformer {
    private final /* synthetic */ Observable f$0;

    public /* synthetic */ $$Lambda$vfe$3JAg_RBhMN9zrpfUgDqJK54aTvQ(Observable observable) {
        this.f$0 = observable;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Predicate<? super T>) $$Lambda$TFz3yKaUvcUqS5DVfDZOtnxcBqQ.INSTANCE).h(new $$Lambda$vfe$UQvSIwlyNlGpdeuPeJEABdInghU(this.f$0)).c((Function<? super T, ? extends R>) $$Lambda$KowNdlp34U3yRHcS2roaY0SAjAk.INSTANCE);
    }
}
