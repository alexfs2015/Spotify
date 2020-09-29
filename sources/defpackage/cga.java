package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: cga reason: default package */
public final class cga extends bxf {
    public static final Creator<cga> CREATOR = new cgb();
    public final boolean a;
    public final List<String> b;

    public cga() {
        this(false, Collections.emptyList());
    }

    public cga(boolean z, List<String> list) {
        this.a = z;
        this.b = list;
    }

    public static cga a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new cga();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException unused) {
                    cow.a(5);
                }
            }
        }
        return new cga(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a);
        bxg.a(parcel, 3, this.b, false);
        bxg.b(parcel, a2);
    }
}
