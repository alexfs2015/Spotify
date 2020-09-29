package defpackage;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bij reason: default package */
final /* synthetic */ class bij implements ctz {
    private final dtt a;
    private final String b;
    private final csr c;

    bij(dtt dtt, String str, csr csr) {
        this.a = dtt;
        this.b = str;
        this.c = csr;
    }

    public final void a(boolean z) {
        dtt dtt = this.a;
        String str = this.b;
        csr csr = this.c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", dtt.a());
            jSONObject.put("body", dtt.e());
            jSONObject.put("call_to_action", dtt.g());
            jSONObject.put("advertiser", dtt.h());
            jSONObject.put("logo", bih.a(dtt.f()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b2 = dtt.b();
            if (b2 != null) {
                for (Object a2 : b2) {
                    jSONArray.put(bih.a(bih.a(a2)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", bih.a(dtt.n(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            csr.b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException unused) {
            cow.a(5);
        }
    }
}
