package defpackage;

import org.json.JSONObject;

/* renamed from: cfa reason: default package */
final /* synthetic */ class cfa implements cps {
    private final cey a;
    private final JSONObject b;

    cfa(cey cey, JSONObject jSONObject) {
        this.a = cey;
        this.b = jSONObject;
    }

    public final cqi a(Object obj) {
        cey cey = this.a;
        JSONObject jSONObject = this.b;
        cti cti = (cti) obj;
        jSONObject.put("ads_id", cey.e);
        cqt cqt = new cqt();
        cti.a("/nativeAdPreProcess", (bhc<? super cti>) new cfe<Object>(cey, cti, cqt));
        cti.b("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return cqt;
    }
}
