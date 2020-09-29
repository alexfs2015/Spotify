package defpackage;

import org.json.JSONObject;

/* renamed from: cfh reason: default package */
final class cfh implements cpu<cti> {
    private final /* synthetic */ String a;
    private final /* synthetic */ JSONObject b;

    cfh(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = jSONObject;
    }

    public final /* synthetic */ void a(Object obj) {
        ((cti) obj).a(this.a, this.b);
    }

    public final void a(Throwable th) {
    }
}
