package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: scw reason: default package */
public final class scw implements ObservableTransformer<h, sbd> {
    private final sbb a;

    public scw(sbb sbb) {
        this.a = sbb;
    }

    public final ObservableSource<sbd> apply(Observable<h> observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$scw$jDk9rWpBqGTegBUEIAwLbpK58<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ sbd a(h hVar) {
        sbz sbz = hVar.b;
        return new sas(hVar.a, this.a.a(sbz.a(), sbz.c(), sbz.b(), 4).a());
    }
}
