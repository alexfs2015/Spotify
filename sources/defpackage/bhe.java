package defpackage;

import org.json.JSONObject;

/* renamed from: bhe reason: default package */
final class bhe implements Runnable {
    private final /* synthetic */ JSONObject a;
    private final /* synthetic */ bhd b;

    bhe(bhd bhd, JSONObject jSONObject) {
        this.b = bhd;
        this.a = jSONObject;
    }

    public final void run() {
        this.b.a.a("fetchHttpRequestCompleted", this.a);
        cpn.a(3);
    }
}
