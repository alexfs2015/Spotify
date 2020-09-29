package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vym$TZt8RwP2L6MSra_QB6Mv0KeqFe8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vym$TZt8RwP2L6MSra_QB6Mv0KeqFe8 implements ObservableTransformer {
    private final /* synthetic */ waa f$0;

    public /* synthetic */ $$Lambda$vym$TZt8RwP2L6MSra_QB6Mv0KeqFe8(waa waa) {
        this.f$0 = waa;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$ChcWC5HkSJLnzIEqAwTQrbxMywQ.INSTANCE).a(this.f$0.a()).c((Function<? super T, ? extends R>) $$Lambda$JUG5fT8iHOHpv5kqqUnzLduTOcA.INSTANCE);
    }
}
