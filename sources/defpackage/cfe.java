package defpackage;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: cfe reason: default package */
final class cfe implements bhc<cti> {
    private final /* synthetic */ cti a;
    private final /* synthetic */ cqt b;
    private final /* synthetic */ cey c;

    cfe(cey cey, cti cti, cqt cqt) {
        this.c = cey;
        this.a = cti;
        this.b = cqt;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObject;
        boolean z;
        String str = "success";
        try {
            String str2 = (String) map.get(str);
            String str3 = (String) map.get("failure");
            if (!TextUtils.isEmpty(str3)) {
                jSONObject = new JSONObject(str3);
                z = false;
            } else {
                jSONObject = new JSONObject(str2);
                z = true;
            }
            if (this.c.e.equals(jSONObject.optString("ads_id", ""))) {
                this.a.b("/nativeAdPreProcess", this);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str, z);
                jSONObject2.put("json", jSONObject);
                this.b.b(jSONObject2);
            }
        } catch (Throwable th) {
            cml.a("Error while preprocessing json.", th);
            this.b.a(th);
        }
    }
}
