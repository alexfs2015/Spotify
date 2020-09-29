package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: hzy reason: default package */
public final class hzy implements hzr {
    private final iag a;
    private final RxResolver b;

    public hzy(iag iag, RxResolver rxResolver) {
        this.a = iag;
        this.b = rxResolver;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(String str, Map map) {
        return this.b.resolveCompletable(this.a.a(Request.POST, str, map));
    }

    public final Completable a(String str, String str2) {
        return a(str, str2, -1, null);
    }

    public final Completable a(String str, String str2, long j, Map<String, String> map) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/events/");
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.put("event_data", map);
        }
        hashMap.put("playback_position", Long.valueOf(j));
        return Completable.a((Callable<? extends CompletableSource>) new $$Lambda$hzy$LucKQyUQY5eARGhgStI2P3tdaNM<Object>(this, sb2, hashMap));
    }
}
