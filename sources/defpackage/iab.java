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

/* renamed from: iab reason: default package */
public final class iab implements hzu {
    private final RxResolver a;
    private final gmm<AdSettingsModel> b;
    private final iag c;

    public iab(RxResolver rxResolver, gmm<AdSettingsModel> gmm, iag iag) {
        this.a = rxResolver;
        this.b = gmm;
        this.c = iag;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str, Map map) {
        return this.a.resolve(this.c.a(Request.DELETE, str, map));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(String str, Map map) {
        return this.a.resolve(this.c.a(Request.PUT, str, map));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource c(String str, Map map) {
        return this.a.resolve(this.c.a(Request.PUT, str, map));
    }

    public final Observable<AdSettingsModel> a(String str) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/settings/");
        sb.append(str);
        return wit.b(this.b.resolve(new Request(Request.GET, sb.toString())));
    }

    public final Observable<Response> a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/settings/");
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$iab$a7fXUhHgxW8ecpt5laVEC0g9u5g<Object>(this, sb.toString(), Collections.singletonMap("value", str3)));
    }

    public final Observable<Response> a(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/settings/request_header/");
        sb.append(str);
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("value", str2);
        hashMap.put("refresh_inventory", Boolean.TRUE);
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$iab$GHKyILRfKlIYJLBTytKXpP5tMCY<Object>(this, sb2, hashMap));
    }

    public final Observable<Response> a(String str, boolean z) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/settings/request_header/");
        sb.append(str);
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$iab$Qti_Rw3Fh0P2ihsAdTqut2fLGfk<Object>(this, sb.toString(), ImmutableMap.b("refresh_inventory", Boolean.toString(true))));
    }
}
