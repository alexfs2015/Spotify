package defpackage;

import com.spotify.music.libs.search.offline.model.OfflineResults;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: scn reason: default package */
public final class scn implements ObservableTransformer<g, sbs> {
    private final sal a;

    public scn(sal sal) {
        this.a = sal;
    }

    public final ObservableSource<sbs> apply(Observable<g> observable) {
        return observable.b(200, TimeUnit.MILLISECONDS).c((Function<? super T, ? extends R>) $$Lambda$UaGuPatvIQHZ6HBemmIW5RCSpHc.INSTANCE).a((ObservableTransformer<? super T, ? extends R>) new sce<Object,Object>(new $$Lambda$scn$2LB894zKgh0iRnWewngd4ie4Y(this), $$Lambda$EnzeePKHwo5DNT4oESRiLt7hSj0.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(String str) {
        return this.a.a(str).f($$Lambda$scn$tg5ZBtdVCY3gxd3t0a8ux84WrBE.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static sbs a(OfflineResults offlineResults) {
        return sbs.a((sbw) new d(offlineResults));
    }
}
