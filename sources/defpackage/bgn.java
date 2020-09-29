package defpackage;

import org.json.JSONObject;

/* renamed from: bgn reason: default package */
final class bgn implements Runnable {
    private final /* synthetic */ JSONObject a;
    private final /* synthetic */ bgm b;

    bgn(bgm bgm, JSONObject jSONObject) {
        this.b = bgm;
        this.a = jSONObject;
    }

    public final void run() {
        this.b.a.a("fetchHttpRequestCompleted", this.a);
        cow.a(3);
    }
}
