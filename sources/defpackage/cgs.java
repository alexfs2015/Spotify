package defpackage;

import org.json.JSONObject;

/* renamed from: cgs reason: default package */
final class cgs implements Runnable {
    final /* synthetic */ JSONObject a;
    final /* synthetic */ String b;
    private final /* synthetic */ cgq c;

    cgs(cgq cgq, JSONObject jSONObject, String str) {
        this.c = cgq;
        this.a = jSONObject;
        this.b = str;
    }

    public final void run() {
        this.c.m = cgq.d.a();
        this.c.m.a(new cgt(this), new cgu(this));
    }
}
