package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@cey
/* renamed from: ebz reason: default package */
public final class ebz {
    public final List<eby> a;
    public final long b;
    public final List<String> c;
    public final List<String> d;
    public final List<String> e;
    public final List<String> f;
    public final List<String> g;
    public final boolean h;
    public final String i;
    public final long j;
    public final String k;
    public final int l;
    public final int m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public int r;
    public int s;
    public boolean t;

    public ebz(String str) {
        this(new JSONObject(str));
    }

    public ebz(List<eby> list, long j2, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, boolean z, String str) {
        this.a = list;
        this.b = j2;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = list6;
        this.h = z;
        this.i = str;
        this.j = -1;
        this.r = 0;
        this.s = 1;
        this.k = null;
        this.l = 0;
        this.m = -1;
        this.n = -1;
        this.o = false;
        this.p = false;
        this.q = false;
        this.t = false;
    }

    public ebz(JSONObject jSONObject) {
        if (clu.a(2)) {
            String str = "Mediation Response JSON: ";
            String valueOf = String.valueOf(jSONObject.toString(2));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            clu.a();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            eby eby = new eby(jSONArray.getJSONObject(i3));
            boolean z = true;
            if (eby.a()) {
                this.t = true;
            }
            arrayList.add(eby);
            if (i2 < 0) {
                Iterator it = eby.c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    i2 = i3;
                }
            }
        }
        this.r = i2;
        this.s = jSONArray.length();
        this.a = Collections.unmodifiableList(arrayList);
        this.i = jSONObject.optString("qdata");
        this.m = jSONObject.optInt("fs_model_type", -1);
        long j2 = -1;
        this.n = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            bjl.x();
            this.c = eci.a(optJSONObject, "click_urls");
            bjl.x();
            this.d = eci.a(optJSONObject, "imp_urls");
            bjl.x();
            this.e = eci.a(optJSONObject, "downloaded_imp_urls");
            bjl.x();
            this.f = eci.a(optJSONObject, "nofill_urls");
            bjl.x();
            this.g = eci.a(optJSONObject, "remote_ping_urls");
            this.h = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            if (optLong > 0) {
                j2 = 1000 * optLong;
            }
            this.j = j2;
            cjx a2 = cjx.a(optJSONObject.optJSONArray("rewards"));
            if (a2 == null) {
                this.k = null;
                this.l = 0;
            } else {
                this.k = a2.a;
                this.l = a2.b;
            }
            this.o = optJSONObject.optBoolean("use_displayed_impression", false);
            this.p = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.q = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            return;
        }
        this.b = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = -1;
        this.k = null;
        this.l = 0;
        this.o = false;
        this.h = false;
        this.p = false;
        this.q = false;
    }
}
