package defpackage;

import org.json.JSONObject;

/* renamed from: cek reason: default package */
final /* synthetic */ class cek implements cpb {
    private final ceh a;
    private final JSONObject b;

    cek(ceh ceh, JSONObject jSONObject) {
        this.a = ceh;
        this.b = jSONObject;
    }

    public final cpr a(Object obj) {
        ceh ceh = this.a;
        JSONObject jSONObject = this.b;
        csr csr = (csr) obj;
        jSONObject.put("ads_id", ceh.e);
        csr.b("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return cpg.a(new JSONObject());
    }
}
