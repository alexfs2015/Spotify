package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: iae reason: default package */
public final class iae implements hzw {
    private final iag a;
    private final RxResolver b;

    public iae(RxResolver rxResolver, iag iag) {
        this.b = rxResolver;
        this.a = iag;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(String str, Map map) {
        return this.b.resolve(this.a.a(Request.PUT, str, map));
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
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$iae$pie3kgvlp0lhNRM9i3XcEH_5p7c<Object>(this, sb2.toString(), map));
    }
}
