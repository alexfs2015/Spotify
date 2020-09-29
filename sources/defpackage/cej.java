package defpackage;

import org.json.JSONObject;

/* renamed from: cej reason: default package */
final /* synthetic */ class cej implements cpb {
    private final ceh a;
    private final JSONObject b;

    cej(ceh ceh, JSONObject jSONObject) {
        this.a = ceh;
        this.b = jSONObject;
    }

    public final cpr a(Object obj) {
        ceh ceh = this.a;
        JSONObject jSONObject = this.b;
        csr csr = (csr) obj;
        jSONObject.put("ads_id", ceh.e);
        cqc cqc = new cqc();
        csr.a("/nativeAdPreProcess", (bgl<? super csr>) new cen<Object>(ceh, csr, cqc));
        csr.b("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return cqc;
    }
}
