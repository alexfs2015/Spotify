package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.HashMap;
import java.util.Map;

/* renamed from: csu reason: default package */
final class csu implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ int c;
    private final /* synthetic */ int d;
    private final /* synthetic */ boolean e = false;
    private final /* synthetic */ cst f;

    csu(cst cst, String str, String str2, int i, int i2) {
        this.f = cst;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.a);
        hashMap.put("cachedSrc", this.b);
        hashMap.put("bytesLoaded", Integer.toString(this.c));
        hashMap.put("totalBytes", Integer.toString(this.d));
        hashMap.put("cacheReady", Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        cst.a(this.f, "onPrecacheEvent", (Map) hashMap);
    }
}
