package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.ads.model.Targetings;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: iaf reason: default package */
public final class iaf implements hzx {
    private final gmm<Targetings> a;
    private final iag b;

    public iaf(gmm<Targetings> gmm, iag iag) {
        this.a = gmm;
        this.b = iag;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str, Map map) {
        return wit.b(this.a.resolve(this.b.a(Request.PUT, str, map)));
    }

    public final Observable<Targetings> a(String str, String str2) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/targeting/");
        sb.append(str);
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$iaf$8op9n5kDK5iiHNXwd7tukLePZHA<Object>(this, sb.toString(), Collections.singletonMap("value", str2)));
    }
}
