package defpackage;

import com.moat.analytics.mobile.MoatAdEvent;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@cey
/* renamed from: ceg reason: default package */
public final class ceg implements cdu<dtv> {
    private final boolean a;

    public ceg(boolean z) {
        this.a = z;
    }

    public final /* synthetic */ duf a(cdm cdm, JSONObject jSONObject) {
        dv dvVar = new dv();
        dv dvVar2 = new dv();
        cpr a2 = cdm.a(jSONObject);
        cpr a3 = cdm.a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString(MoatAdEvent.EVENT_TYPE);
            String str = "name";
            if ("string".equals(string)) {
                dvVar2.put(jSONObject2.getString(str), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                String string2 = jSONObject2.getString(str);
                boolean z = this.a;
                JSONObject jSONObject3 = jSONObject2.getJSONObject("image_value");
                boolean optBoolean = jSONObject3.optBoolean("require", true);
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                dvVar.put(string2, cdm.a(jSONObject3, optBoolean, z));
            } else {
                String str2 = "Unknown custom asset type: ";
                String valueOf = String.valueOf(string);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    new String(str2);
                }
                cow.a(5);
            }
        }
        csr a4 = cdm.a(a3);
        String string3 = jSONObject.getString("custom_template_id");
        dv dvVar3 = new dv();
        for (int i2 = 0; i2 < dvVar.size(); i2++) {
            dvVar3.put(dvVar.b(i2), ((Future) dvVar.c(i2)).get());
        }
        dtv dtv = new dtv(string3, dvVar3, dvVar2, (dtm) a2.get(), a4 != null ? a4.b() : null, a4 != null ? a4.o() : null);
        return dtv;
    }
}
