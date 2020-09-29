package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: cgr reason: default package */
public final class cgr extends bxw {
    public static final Creator<cgr> CREATOR = new cgs();
    public final boolean a;
    public final List<String> b;

    public cgr() {
        this(false, Collections.emptyList());
    }

    public cgr(boolean z, List<String> list) {
        this.a = z;
        this.b = list;
    }

    public static cgr a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new cgr();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException unused) {
                    cpn.a(5);
                }
            }
        }
        return new cgr(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a);
        bxx.a(parcel, 3, this.b, false);
        bxx.b(parcel, a2);
    }
}
