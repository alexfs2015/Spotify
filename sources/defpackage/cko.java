package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

@cfp
/* renamed from: cko reason: default package */
public final class cko extends bxw {
    public static final Creator<cko> CREATOR = new ckp();
    public final String a;
    public final int b;

    public cko(blu blu) {
        this(blu.a(), blu.b());
    }

    public cko(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static cko a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static cko a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new cko(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof cko)) {
            cko cko = (cko) obj;
            if (bxm.a(this.a, cko.a) && bxm.a(Integer.valueOf(this.b), Integer.valueOf(cko.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.b(parcel, 3, this.b);
        bxx.b(parcel, a2);
    }
}
