package defpackage;

import org.json.JSONObject;

/* renamed from: cfd reason: default package */
final /* synthetic */ class cfd implements cps {
    private final cey a;
    private final JSONObject b;

    cfd(cey cey, JSONObject jSONObject) {
        this.a = cey;
        this.b = jSONObject;
    }

    public final cqi a(Object obj) {
        cey cey = this.a;
        JSONObject jSONObject = this.b;
        cti cti = (cti) obj;
        jSONObject.put("ads_id", cey.e);
        cti.b("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return cpx.a(new JSONObject());
    }
}
