package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: iaa reason: default package */
public final class iaa implements hzt {
    private final RxResolver a;
    private final iag b;

    public iaa(RxResolver rxResolver, iag iag) {
        this.b = iag;
        this.a = rxResolver;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Map map) {
        return this.a.resolve(this.b.a(Request.POST, "sp://ads/v1/reward", map));
    }

    public final Observable<Response> a(Map<String, Object> map) {
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$iaa$Zb3jbISZVSsvltyQjFhdVFES_o<Object>(this, map));
    }
}
