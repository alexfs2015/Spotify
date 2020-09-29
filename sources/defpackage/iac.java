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

/* renamed from: iac reason: default package */
public final class iac implements SlotApi {
    private final RxResolver a;
    private final iag b;

    public iac(RxResolver rxResolver, iag iag) {
        this.a = rxResolver;
        this.b = iag;
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

    public final Completable a(String str, Intent intent) {
        return a(str, intent, null);
    }

    public final Completable a(String str, Intent intent, Map<String, String> map) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/slots/");
        sb.append(str);
        sb.append('/');
        sb.append(intent.name().toLowerCase(Locale.ENGLISH));
        String sb2 = sb.toString();
        return Completable.a((Callable<? extends CompletableSource>) new $$Lambda$iac$8vkVMhXKmwXQ_dHYCBY6TGIxGLI<Object>(this, this.b.a(Request.POST, sb2, a(map))));
    }
}
