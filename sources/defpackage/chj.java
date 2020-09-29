package defpackage;

import org.json.JSONObject;

/* renamed from: chj reason: default package */
final class chj implements Runnable {
    final /* synthetic */ JSONObject a;
    final /* synthetic */ String b;
    private final /* synthetic */ chh c;

    chj(chh chh, JSONObject jSONObject, String str) {
        this.c = chh;
        this.a = jSONObject;
        this.b = str;
    }

    public final void run() {
        this.c.m = chh.d.a();
        this.c.m.a(new chk(this), new chl(this));
    }
}
