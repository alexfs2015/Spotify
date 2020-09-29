package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@cfp
/* renamed from: cky reason: default package */
public final class cky extends bxw {
    public static final Creator<cky> CREATOR = new ckz();
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List<String> e;
    public final boolean f;
    public final boolean g;
    public final List<String> h;

    public cky(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = list;
        this.f = z3;
        this.g = z4;
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        this.h = list2;
    }

    public static cky a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String str = "";
        cky cky = new cky(jSONObject.optString("click_string", str), jSONObject.optString("report_url", str), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), con.a(jSONObject.optJSONArray("allowed_headers")), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), con.a(jSONObject.optJSONArray("webview_permissions")));
        return cky;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.a(parcel, 3, this.b, false);
        bxx.a(parcel, 4, this.c);
        bxx.a(parcel, 5, this.d);
        bxx.a(parcel, 6, this.e, false);
        bxx.a(parcel, 7, this.f);
        bxx.a(parcel, 8, this.g);
        bxx.a(parcel, 9, this.h, false);
        bxx.b(parcel, a2);
    }
}
