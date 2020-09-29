package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

@cey
/* renamed from: cjx reason: default package */
public final class cjx extends bxf {
    public static final Creator<cjx> CREATOR = new cjy();
    public final String a;
    public final int b;

    public cjx(bld bld) {
        this(bld.a(), bld.b());
    }

    public cjx(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static cjx a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static cjx a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new cjx(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof cjx)) {
            cjx cjx = (cjx) obj;
            if (bwv.a(this.a, cjx.a) && bwv.a(Integer.valueOf(this.b), Integer.valueOf(cjx.b))) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.b(parcel, 3, this.b);
        bxg.b(parcel, a2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }
}
