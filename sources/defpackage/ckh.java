package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@cey
/* renamed from: ckh reason: default package */
public final class ckh extends bxf {
    public static final Creator<ckh> CREATOR = new cki();
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List<String> e;
    public final boolean f;
    public final boolean g;
    public final List<String> h;

    public ckh(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
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

    public static ckh a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String str = "";
        ckh ckh = new ckh(jSONObject.optString("click_string", str), jSONObject.optString("report_url", str), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), cnw.a(jSONObject.optJSONArray("allowed_headers")), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), cnw.a(jSONObject.optJSONArray("webview_permissions")));
        return ckh;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.a(parcel, 3, this.b, false);
        bxg.a(parcel, 4, this.c);
        bxg.a(parcel, 5, this.d);
        bxg.a(parcel, 6, this.e, false);
        bxg.a(parcel, 7, this.f);
        bxg.a(parcel, 8, this.g);
        bxg.a(parcel, 9, this.h, false);
        bxg.b(parcel, a2);
    }
}
