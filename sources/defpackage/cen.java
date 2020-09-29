package defpackage;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: cen reason: default package */
final class cen implements bgl<csr> {
    private final /* synthetic */ csr a;
    private final /* synthetic */ cqc b;
    private final /* synthetic */ ceh c;

    cen(ceh ceh, csr csr, cqc cqc) {
        this.c = ceh;
        this.a = csr;
        this.b = cqc;
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
            clu.a("Error while preprocessing json.", th);
            this.b.a(th);
        }
    }
}
