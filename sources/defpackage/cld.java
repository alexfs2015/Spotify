package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: cld reason: default package */
public final class cld {
    public final long a;
    public final Map<String, ebz> b = new HashMap();
    public String c;
    public String d;
    public boolean e;
    private final List<String> f = new ArrayList();
    private final List<String> g = new ArrayList();

    public cld(String str, long j) {
        this.e = false;
        this.d = str;
        this.a = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("status", -1) != 1) {
                    this.e = false;
                    cow.a(5);
                    return;
                }
                this.e = true;
                this.c = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.g.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString)) {
                                    JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                                    if (optJSONObject != null) {
                                        this.b.put(optString2, new ebz(optJSONObject));
                                    }
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e2) {
                cow.a(5);
                bjl.i().a((Throwable) e2, "AppSettings.parseAppSettingsJson");
            }
        }
    }
}
