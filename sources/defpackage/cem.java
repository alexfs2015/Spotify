package defpackage;

import org.json.JSONObject;

/* renamed from: cem reason: default package */
final /* synthetic */ class cem implements cpb {
    private final ceh a;
    private final JSONObject b;

    cem(ceh ceh, JSONObject jSONObject) {
        this.a = ceh;
        this.b = jSONObject;
    }

    public final cpr a(Object obj) {
        ceh ceh = this.a;
        JSONObject jSONObject = this.b;
        csr csr = (csr) obj;
        jSONObject.put("ads_id", ceh.e);
        csr.b("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return cpg.a(new JSONObject());
    }
}
