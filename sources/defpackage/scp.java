package defpackage;

import com.spotify.searchview.proto.MainViewResponse;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import java.util.concurrent.TimeUnit;

/* renamed from: scp reason: default package */
public final class scp implements ObservableTransformer<h, sbs> {
    private final sbf a;
    private final ObservableTransformer<h, sbd> b;

    public scp(sbf sbf, ObservableTransformer<h, sbd> observableTransformer) {
        this.a = sbf;
        this.b = observableTransformer;
    }

    public final ObservableSource<sbs> apply(Observable<h> observable) {
        return observable.b(200, TimeUnit.MILLISECONDS).a(this.b).a((ObservableTransformer<? super T, ? extends R>) new sce<Object,Object>(new $$Lambda$scp$WkVufbwowbbDKss6tIYlfpLvbnY(this), $$Lambda$J4lY9LUR765OnRQpESWgnSuxL4.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(sbd sbd) {
        return this.a.c(sbd.a(), sbd.b()).f(new $$Lambda$scp$FPjhaAcKA90VaPPQfuR3B7pDrI(sbd)).f($$Lambda$scp$lT76sbofvGNhv15KayjBi2g717w.INSTANCE).g($$Lambda$scp$X5kz9eQqosCPyncXi7w9TygFhQ.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static sbs a(sbv sbv) {
        return sbs.a((sbw) new e(sbv));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ sbv a(sbd sbd, MainViewResponse mainViewResponse) {
        return new sbo((String) sbd.b().get("requestId"), mainViewResponse);
    }
}
