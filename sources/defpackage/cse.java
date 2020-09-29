package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: cse reason: default package */
final class cse implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ int c;
    private final /* synthetic */ csc d;

    cse(csc csc, String str, String str2, int i) {
        this.d = csc;
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
        csc.a(this.d, "onPrecacheEvent", (Map) hashMap);
    }
}
