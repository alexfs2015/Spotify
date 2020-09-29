package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bnw reason: default package */
public final class bnw extends bxw {
    public static final Creator<bnw> CREATOR = new bsc();
    private final long a;
    private final long b;
    private final String c;
    private final String d;
    private final long e;

    bnw(long j, long j2, String str, String str2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
    }

    static bnw a(JSONObject jSONObject) {
        long j;
        JSONObject jSONObject2 = jSONObject;
        bnw bnw = null;
        if (jSONObject2 == null) {
            return null;
        }
        String str = "currentBreakTime";
        if (jSONObject2.has(str)) {
            String str2 = "currentBreakClipTime";
            if (jSONObject2.has(str2)) {
                try {
                    double d2 = (double) jSONObject2.getLong(str);
                    Double.isNaN(d2);
                    long j2 = (long) (d2 * 1000.0d);
                    double d3 = (double) jSONObject2.getLong(str2);
                    Double.isNaN(d3);
                    long j3 = (long) (d3 * 1000.0d);
                    String optString = jSONObject2.optString("breakId", null);
                    String optString2 = jSONObject2.optString("breakClipId", null);
                    long optLong = jSONObject2.optLong("whenSkippable", -1);
                    if (optLong != -1) {
                        double d4 = (double) optLong;
                        Double.isNaN(d4);
                        j = (long) (d4 * 1000.0d);
                    } else {
                        j = optLong;
                    }
                    bnw bnw2 = new bnw(j2, j3, optString, optString2, j);
                    return bnw2;
                } catch (JSONException e2) {
                    String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", new Object[]{e2.getMessage()});
                    bnw = null;
                }
            }
        }
        return bnw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnw)) {
            return false;
        }
        bnw bnw = (bnw) obj;
        return this.a == bnw.a && this.b == bnw.b && eic.a(this.c, bnw.c) && eic.a(this.d, bnw.d) && this.e == bnw.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a);
        bxx.a(parcel, 3, this.b);
        bxx.a(parcel, 4, this.c, false);
        bxx.a(parcel, 5, this.d, false);
        bxx.a(parcel, 6, this.e);
        bxx.b(parcel, a2);
    }
}
