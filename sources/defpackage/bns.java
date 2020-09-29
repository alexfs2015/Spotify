package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: bns reason: default package */
public final class bns extends bxf {
    public static final Creator<bns> CREATOR = new brj();
    private final String a;
    private final String b;

    bns(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bns)) {
            return false;
        }
        bns bns = (bns) obj;
        return ehl.a(this.a, bns.a) && ehl.a(this.b, bns.b);
    }

    public static bns a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new bns(jSONObject.optString("adTagUrl", null), jSONObject.optString("adsResponse", null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.a(parcel, 3, this.b, false);
        bxg.b(parcel, a2);
    }
}
