package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: hxq reason: default package */
public final class hxq implements SlotApi {
    private final RxResolver a;
    private final hxu b;

    public hxq(RxResolver rxResolver, hxu hxu) {
        this.a = rxResolver;
        this.b = hxu;
    }

    public final Completable a(String str, Intent intent) {
        return a(str, intent, null);
    }

    public final Completable a(String str, Intent intent, Map<String, String> map) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/slots/");
        sb.append(str);
        sb.append('/');
        sb.append(intent.name().toLowerCase(Locale.ENGLISH));
        String sb2 = sb.toString();
        return Completable.a((Callable<? extends CompletableSource>) new $$Lambda$hxq$yDHWl8uoGuOGFRL8xnEDv5oiRgo<Object>(this, this.b.a(Request.POST, sb2, a(map))));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(Request request) {
        return this.a.resolveCompletable(request);
    }

    private static Map<String, ?> a(Map<String, String> map) {
        if (map != null) {
            return Collections.singletonMap("targeting", map);
        }
        return null;
    }
}
