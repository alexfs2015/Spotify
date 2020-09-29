package defpackage;

import org.json.JSONObject;

/* renamed from: cfb reason: default package */
final /* synthetic */ class cfb implements cps {
    private final cey a;
    private final JSONObject b;

    cfb(cey cey, JSONObject jSONObject) {
        this.a = cey;
        this.b = jSONObject;
    }

    public final cqi a(Object obj) {
        cey cey = this.a;
        JSONObject jSONObject = this.b;
        cti cti = (cti) obj;
        jSONObject.put("ads_id", cey.e);
        cti.b("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return cpx.a(new JSONObject());
    }
}
