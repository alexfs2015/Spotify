package defpackage;

import com.moat.analytics.mobile.MoatAdEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@cfp
/* renamed from: cig reason: default package */
public final class cig {
    final List<String> a;
    final String b;
    final String c;
    final String d;
    final boolean e;
    final String f;
    final String g;
    String h;
    final int i;
    final boolean j;
    private final JSONObject k;

    public cig(int i2, Map<String, String> map) {
        this.h = (String) map.get("url");
        this.b = (String) map.get("base_uri");
        this.c = (String) map.get("post_parameters");
        this.e = a((String) map.get("drt_include"));
        this.f = (String) map.get("request_id");
        this.d = (String) map.get(MoatAdEvent.EVENT_TYPE);
        this.a = b((String) map.get("errors"));
        this.i = i2;
        this.g = (String) map.get("fetched_ad");
        this.j = a((String) map.get("render_test_ad_label"));
        this.k = new JSONObject();
    }

    public cig(JSONObject jSONObject) {
        this.h = jSONObject.optString("url");
        this.b = jSONObject.optString("base_uri");
        this.c = jSONObject.optString("post_parameters");
        this.e = a(jSONObject.optString("drt_include"));
        this.f = jSONObject.optString("request_id");
        this.d = jSONObject.optString(MoatAdEvent.EVENT_TYPE);
        this.a = b(jSONObject.optString("errors"));
        int i2 = 1;
        if (jSONObject.optInt("valid", 0) == 1) {
            i2 = -2;
        }
        this.i = i2;
        this.g = jSONObject.optString("fetched_ad");
        this.j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.k = optJSONObject;
    }

    private static boolean a(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    private static List<String> b(String str) {
        if (str == null) {
            return null;
        }
        return Arrays.asList(str.split(","));
    }
}
