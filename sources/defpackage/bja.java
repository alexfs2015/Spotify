package defpackage;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bja reason: default package */
final /* synthetic */ class bja implements cuq {
    private final duk a;
    private final String b;
    private final cti c;

    bja(duk duk, String str, cti cti) {
        this.a = duk;
        this.b = str;
        this.c = cti;
    }

    public final void a(boolean z) {
        duk duk = this.a;
        String str = this.b;
        cti cti = this.c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", duk.a());
            jSONObject.put("body", duk.e());
            jSONObject.put("call_to_action", duk.g());
            jSONObject.put("advertiser", duk.h());
            jSONObject.put("logo", biy.a(duk.f()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b2 = duk.b();
            if (b2 != null) {
                for (Object a2 : b2) {
                    jSONArray.put(biy.a(biy.a(a2)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", biy.a(duk.n(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            cti.b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException unused) {
            cpn.a(5);
        }
    }
}
