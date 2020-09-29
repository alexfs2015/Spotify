package defpackage;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bii reason: default package */
final /* synthetic */ class bii implements ctz {
    private final dtr a;
    private final String b;
    private final csr c;

    bii(dtr dtr, String str, csr csr) {
        this.a = dtr;
        this.b = str;
        this.c = csr;
    }

    public final void a(boolean z) {
        dtr dtr = this.a;
        String str = this.b;
        csr csr = this.c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", dtr.a());
            jSONObject.put("body", dtr.c());
            jSONObject.put("call_to_action", dtr.e());
            jSONObject.put("price", dtr.h());
            jSONObject.put("star_rating", String.valueOf(dtr.f()));
            jSONObject.put("store", dtr.g());
            jSONObject.put("icon", bih.a(dtr.d()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b2 = dtr.b();
            if (b2 != null) {
                for (Object a2 : b2) {
                    jSONArray.put(bih.a(bih.a(a2)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", bih.a(dtr.n(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            csr.b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException unused) {
            cow.a(5);
        }
    }
}
