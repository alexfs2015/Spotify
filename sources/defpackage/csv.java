package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: csv reason: default package */
final class csv implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ int c;
    private final /* synthetic */ cst d;

    csv(cst cst, String str, String str2, int i) {
        this.d = cst;
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.a);
        hashMap.put("cachedSrc", this.b);
        hashMap.put("totalBytes", Integer.toString(this.c));
        cst.a(this.d, "onPrecacheEvent", (Map) hashMap);
    }
}
