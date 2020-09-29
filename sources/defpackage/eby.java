package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@cey
/* renamed from: eby reason: default package */
public final class eby {
    public final String a;
    public final String b;
    public final List<String> c;
    public final String d;
    public final String e;
    public final List<String> f;
    public final List<String> g;
    public final List<String> h;
    public final List<String> i;
    public final List<String> j;
    public final String k;
    public final List<String> l;
    public final List<String> m;
    public final List<String> n;
    public final String o;
    public final String p;
    public final String q;
    public final List<String> r;
    public final String s;
    public final long t;
    private final String u;

    public eby(String str, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str2, List<String> list6, List<String> list7, List<String> list8, List<String> list9) {
        this.a = str;
        this.b = null;
        this.c = list;
        this.d = null;
        this.e = null;
        this.f = list2;
        this.g = list3;
        this.h = list4;
        this.i = list5;
        this.k = str2;
        this.l = list6;
        this.m = list7;
        this.n = list8;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.j = list9;
        this.u = null;
        this.t = -1;
    }

    public eby(JSONObject jSONObject) {
        List<String> list;
        this.b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        this.c = Collections.unmodifiableList(arrayList);
        this.d = jSONObject.optString("allocation_id", null);
        bjl.x();
        this.f = eci.a(jSONObject, "clickurl");
        bjl.x();
        this.g = eci.a(jSONObject, "imp_urls");
        bjl.x();
        this.h = eci.a(jSONObject, "downloaded_imp_urls");
        bjl.x();
        this.j = eci.a(jSONObject, "fill_urls");
        bjl.x();
        this.l = eci.a(jSONObject, "video_start_urls");
        bjl.x();
        this.n = eci.a(jSONObject, "video_complete_urls");
        bjl.x();
        List<String> a2 = eci.a(jSONObject, "video_reward_urls");
        if (!((Boolean) dpn.f().a(dsp.av)).booleanValue()) {
            a2 = this.n;
        }
        this.m = a2;
        JSONObject optJSONObject = jSONObject.optJSONObject(PlayerProviders.ADS);
        if (optJSONObject != null) {
            bjl.x();
            list = eci.a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.i = list;
        this.a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.o = jSONObject.optString("html_template", null);
        this.p = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.q = optJSONObject3 != null ? optJSONObject3.toString() : null;
        bjl.x();
        this.r = eci.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.s = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.u = jSONObject.optString("response_type", null);
        this.t = jSONObject.optLong("ad_network_timeout_millis", -1);
    }

    public final boolean a() {
        return "banner".equalsIgnoreCase(this.u);
    }

    public final boolean b() {
        return "native".equalsIgnoreCase(this.u);
    }
}
