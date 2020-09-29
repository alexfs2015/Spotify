package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: hxo reason: default package */
public final class hxo implements hxh {
    private final RxResolver a;
    private final hxu b;

    public hxo(RxResolver rxResolver, hxu hxu) {
        this.b = hxu;
        this.a = rxResolver;
    }

    public final Observable<Response> a(Map<String, Object> map) {
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$hxo$cXgEb9r3RUY3sDdbU1BAc69Glc<Object>(this, map));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Map map) {
        return this.a.resolve(this.b.a(Request.POST, "sp://ads/v1/reward", map));
    }
}
