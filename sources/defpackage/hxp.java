package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.ads.model.AdSettingsModel;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: hxp reason: default package */
public final class hxp implements hxi {
    private final RxResolver a;
    private final gky<AdSettingsModel> b;
    private final hxu c;

    public hxp(RxResolver rxResolver, gky<AdSettingsModel> gky, hxu hxu) {
        this.a = rxResolver;
        this.b = gky;
        this.c = hxu;
    }

    public final Observable<AdSettingsModel> a(String str) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/settings/");
        sb.append(str);
        return vun.b(this.b.resolve(new Request(Request.GET, sb.toString())));
    }

    public final Observable<Response> a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/settings/");
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$hxp$jf3QiEqWOluwzMJE3ezsOfemUVM<Object>(this, sb.toString(), Collections.singletonMap("value", str3)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource c(String str, Map map) {
        return this.a.resolve(this.c.a(Request.PUT, str, map));
    }

    public final Observable<Response> a(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/settings/request_header/");
        sb.append(str);
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("value", str2);
        hashMap.put("refresh_inventory", Boolean.TRUE);
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$hxp$LkiJ650xupankQ3LyBAlSKH4VA<Object>(this, sb2, hashMap));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(String str, Map map) {
        return this.a.resolve(this.c.a(Request.PUT, str, map));
    }

    public final Observable<Response> a(String str, boolean z) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/settings/request_header/");
        sb.append(str);
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$hxp$Grkxn59aX2aWyaIX7PZPo8NWU4<Object>(this, sb.toString(), ImmutableMap.b("refresh_inventory", Boolean.toString(true))));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str, Map map) {
        return this.a.resolve(this.c.a(Request.DELETE, str, map));
    }
}
