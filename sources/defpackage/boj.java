package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: boj reason: default package */
public final class boj extends bxw {
    public static final Creator<boj> CREATOR = new bsa();
    private final String a;
    private final String b;

    boj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static boj a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new boj(jSONObject.optString("adTagUrl", null), jSONObject.optString("adsResponse", null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boj)) {
            return false;
        }
        boj boj = (boj) obj;
        return eic.a(this.a, boj.a) && eic.a(this.b, boj.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.a(parcel, 3, this.b, false);
        bxx.b(parcel, a2);
    }
}
