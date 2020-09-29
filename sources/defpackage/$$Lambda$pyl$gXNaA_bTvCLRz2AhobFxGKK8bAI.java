package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pyl$gXNaA_bTvCLRz2AhobFxGKK8bAI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pyl$gXNaA_bTvCLRz2AhobFxGKK8bAI implements ObservableTransformer {
    private final /* synthetic */ hgy f$0;
    private final /* synthetic */ qan f$1;
    private final /* synthetic */ qbe f$2;
    private final /* synthetic */ qbc f$3;

    public /* synthetic */ $$Lambda$pyl$gXNaA_bTvCLRz2AhobFxGKK8bAI(hgy hgy, qan qan, qbe qbe, qbc qbc) {
        this.f$0 = hgy;
        this.f$1 = qan;
        this.f$2 = qbe;
        this.f$3 = qbc;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$pyl$3faceXPLwPXd9iKmkiQZsdKbznA<Object,Object>(this.f$0, this.f$1, this.f$2, this.f$3), false);
    }
}
