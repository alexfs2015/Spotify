package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: hxs reason: default package */
public final class hxs implements hxk {
    private final hxu a;
    private final RxResolver b;

    public hxs(RxResolver rxResolver, hxu hxu) {
        this.b = rxResolver;
        this.a = hxu;
    }

    public final Observable<Response> a(String str, Map<String, String> map) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder("/");
            sb.append(str);
            str2 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("sp://ads/v2/state");
        sb2.append(str2);
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$hxs$Ai3pZhiDeEqSi2rxm5Bwi6WA2to<Object>(this, sb2.toString(), map));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(String str, Map map) {
        return this.b.resolve(this.a.a(Request.PUT, str, map));
    }
}
