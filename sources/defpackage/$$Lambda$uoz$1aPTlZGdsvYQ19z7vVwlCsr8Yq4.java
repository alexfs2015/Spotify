package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uoz$1aPTlZGdsvYQ19z7vVwlCsr8Yq4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uoz$1aPTlZGdsvYQ19z7vVwlCsr8Yq4 implements ObservableTransformer {
    private final /* synthetic */ upa f$0;

    public /* synthetic */ $$Lambda$uoz$1aPTlZGdsvYQ19z7vVwlCsr8Yq4(upa upa) {
        this.f$0 = upa;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$uoz$UIx6Ac9qsuL7ORJaaXGFgybNWmY<Object,Object>(this.f$0), false);
    }
}
