package defpackage;

import org.json.JSONObject;

/* renamed from: ceq reason: default package */
final class ceq implements cpd<csr> {
    private final /* synthetic */ String a;
    private final /* synthetic */ JSONObject b;

    ceq(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = jSONObject;
    }

    public final /* synthetic */ void a(Object obj) {
        ((csr) obj).a(this.a, this.b);
    }

    public final void a(Throwable th) {
    }
}
