package defpackage;

import com.spotify.searchview.proto.MainViewResponse;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import java.util.concurrent.TimeUnit;

/* renamed from: smw reason: default package */
public final class smw implements ObservableTransformer<h, slz> {
    private final slm a;
    private final ObservableTransformer<h, slk> b;

    public smw(slm slm, ObservableTransformer<h, slk> observableTransformer) {
        this.a = slm;
        this.b = observableTransformer;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(slk slk) {
        return this.a.c(slk.a(), slk.b()).f(new $$Lambda$smw$3i_DZYHdPVBoUCt5ThzLh6oOX4(slk)).f($$Lambda$smw$cOT9xchUTyAjuq8ybZShTcHNutQ.INSTANCE).g($$Lambda$smw$e7jTB3HtSJBQ8nmX9HdkSlcaRXk.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static slz a(smc smc) {
        return slz.a((smd) new e(smc));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ smc a(slk slk, MainViewResponse mainViewResponse) {
        return new slv((String) slk.b().get("requestId"), mainViewResponse);
    }

    public final ObservableSource<slz> apply(Observable<h> observable) {
        return observable.b(200, TimeUnit.MILLISECONDS).a(this.b).a((ObservableTransformer<? super T, ? extends R>) new sml<Object,Object>(new $$Lambda$smw$ZScl1s2jfOEFHsBVlPnoDk0GKQ(this), $$Lambda$jYTVLkNDiyqc00wfYWp12GCDrEs.INSTANCE));
    }
}
