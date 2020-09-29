package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bne reason: default package */
public final class bne extends bxf {
    public static final Creator<bne> CREATOR = new brh();
    private final long a;
    private final String b;
    private final long c;
    private final boolean d;
    private String[] e;
    private final boolean f;

    public bne(long j, String str, long j2, boolean z, String[] strArr, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = strArr;
        this.f = z2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bne)) {
            return false;
        }
        bne bne = (bne) obj;
        return ehl.a(this.b, bne.b) && this.a == bne.a && this.c == bne.c && this.d == bne.d && Arrays.equals(this.e, bne.e) && this.f == bne.f;
    }

    public static bne a(JSONObject jSONObject) {
        String[] strArr;
        if (jSONObject == null) {
            return null;
        }
        String str = "id";
        if (jSONObject.has(str)) {
            String str2 = "position";
            if (jSONObject.has(str2)) {
                try {
                    String string = jSONObject.getString(str);
                    double d2 = (double) jSONObject.getLong(str2);
                    Double.isNaN(d2);
                    long j = (long) (d2 * 1000.0d);
                    boolean optBoolean = jSONObject.optBoolean("isWatched");
                    double optLong = (double) jSONObject.optLong("duration");
                    Double.isNaN(optLong);
                    long j2 = (long) (optLong * 1000.0d);
                    JSONArray optJSONArray = jSONObject.optJSONArray("breakClipIds");
                    if (optJSONArray != null) {
                        String[] strArr2 = new String[optJSONArray.length()];
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            strArr2[i] = optJSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } else {
                        strArr = null;
                    }
                    bne bne = new bne(j, string, j2, optBoolean, strArr, jSONObject.optBoolean("isEmbedded"));
                    return bne;
                } catch (JSONException e2) {
                    String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", new Object[]{e2.getMessage()});
                }
            }
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a);
        bxg.a(parcel, 3, this.b, false);
        bxg.a(parcel, 4, this.c);
        bxg.a(parcel, 5, this.d);
        bxg.a(parcel, 6, this.e, false);
        bxg.a(parcel, 7, this.f);
        bxg.b(parcel, a2);
    }
}
