package defpackage;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: biz reason: default package */
final /* synthetic */ class biz implements cuq {
    private final dui a;
    private final String b;
    private final cti c;

    biz(dui dui, String str, cti cti) {
        this.a = dui;
        this.b = str;
        this.c = cti;
    }

    public final void a(boolean z) {
        dui dui = this.a;
        String str = this.b;
        cti cti = this.c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", dui.a());
            jSONObject.put("body", dui.c());
            jSONObject.put("call_to_action", dui.e());
            jSONObject.put("price", dui.h());
            jSONObject.put("star_rating", String.valueOf(dui.f()));
            jSONObject.put("store", dui.g());
            jSONObject.put("icon", biy.a(dui.d()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b2 = dui.b();
            if (b2 != null) {
                for (Object a2 : b2) {
                    jSONArray.put(biy.a(biy.a(a2)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", biy.a(dui.n(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            cti.b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException unused) {
            cpn.a(5);
        }
    }
}
