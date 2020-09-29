package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bnv reason: default package */
public final class bnv extends bxw {
    public static final Creator<bnv> CREATOR = new bry();
    private final long a;
    private final String b;
    private final long c;
    private final boolean d;
    private String[] e;
    private final boolean f;

    public bnv(long j, String str, long j2, boolean z, String[] strArr, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = strArr;
        this.f = z2;
    }

    public static bnv a(JSONObject jSONObject) {
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
                    bnv bnv = new bnv(j, string, j2, optBoolean, strArr, jSONObject.optBoolean("isEmbedded"));
                    return bnv;
                } catch (JSONException e2) {
                    String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", new Object[]{e2.getMessage()});
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnv)) {
            return false;
        }
        bnv bnv = (bnv) obj;
        return eic.a(this.b, bnv.b) && this.a == bnv.a && this.c == bnv.c && this.d == bnv.d && Arrays.equals(this.e, bnv.e) && this.f == bnv.f;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a);
        bxx.a(parcel, 3, this.b, false);
        bxx.a(parcel, 4, this.c);
        bxx.a(parcel, 5, this.d);
        bxx.a(parcel, 6, this.e, false);
        bxx.a(parcel, 7, this.f);
        bxx.b(parcel, a2);
    }
}
