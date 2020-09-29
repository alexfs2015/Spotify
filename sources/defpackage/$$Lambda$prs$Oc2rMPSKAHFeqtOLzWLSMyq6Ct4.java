package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$prs$Oc2rMPSKAHFeqtOLzWLSMyq6Ct4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$prs$Oc2rMPSKAHFeqtOLzWLSMyq6Ct4 implements ObservableTransformer {
    private final /* synthetic */ pqi f$0;

    public /* synthetic */ $$Lambda$prs$Oc2rMPSKAHFeqtOLzWLSMyq6Ct4(pqi pqi) {
        this.f$0 = pqi;
    }

    public final ObservableSource apply(Observable observable) {
        return this.f$0.b().c((Function<? super T, ? extends R>) $$Lambda$tPHJ1ksS_WuuznG9uyqmfWiEw.INSTANCE);
    }
}
