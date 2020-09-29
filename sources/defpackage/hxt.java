package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.ads.model.Targetings;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: hxt reason: default package */
public final class hxt implements hxl {
    private final gky<Targetings> a;
    private final hxu b;

    public hxt(gky<Targetings> gky, hxu hxu) {
        this.a = gky;
        this.b = hxu;
    }

    public final Observable<Targetings> a(String str, String str2) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/targeting/");
        sb.append(str);
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$hxt$nXFNxRiDxQG35K8SQA9l1i6iXEk<Object>(this, sb.toString(), Collections.singletonMap("value", str2)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str, Map map) {
        return vun.b(this.a.resolve(this.b.a(Request.PUT, str, map)));
    }
}
