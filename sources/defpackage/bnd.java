package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bnd reason: default package */
public final class bnd extends bxf {
    public static final Creator<bnd> CREATOR = new bqt();
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final String f;
    private String g;
    private String h;
    private String i;
    private final long j;
    private final String k;
    private final bns l;
    private JSONObject m;

    bnd(String str, String str2, long j2, String str3, String str4, String str5, String str6, String str7, String str8, long j3, String str9, bns bns) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = j3;
        this.k = str9;
        this.l = bns;
        if (!TextUtils.isEmpty(this.g)) {
            try {
                this.m = new JSONObject(str6);
            } catch (JSONException e2) {
                String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", new Object[]{e2.getMessage()});
                this.g = null;
                this.m = new JSONObject();
            }
        } else {
            this.m = new JSONObject();
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, Long.valueOf(this.j), this.k, this.l});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnd)) {
            return false;
        }
        bnd bnd = (bnd) obj;
        return ehl.a(this.a, bnd.a) && ehl.a(this.b, bnd.b) && this.c == bnd.c && ehl.a(this.d, bnd.d) && ehl.a(this.e, bnd.e) && ehl.a(this.f, bnd.f) && ehl.a(this.g, bnd.g) && ehl.a(this.h, bnd.h) && ehl.a(this.i, bnd.i) && this.j == bnd.j && ehl.a(this.k, bnd.k) && ehl.a(this.l, bnd.l);
    }

    public static bnd a(JSONObject jSONObject) {
        long j2;
        String str;
        JSONObject jSONObject2 = jSONObject;
        String str2 = "whenSkippable";
        if (jSONObject2 == null) {
            return null;
        }
        String str3 = "id";
        if (!jSONObject2.has(str3)) {
            return null;
        }
        try {
            String string = jSONObject2.getString(str3);
            double optLong = (double) jSONObject2.optLong("duration");
            Double.isNaN(optLong);
            long j3 = (long) (optLong * 1000.0d);
            String optString = jSONObject2.optString("clickThroughUrl", null);
            String optString2 = jSONObject2.optString("contentUrl", null);
            String optString3 = jSONObject2.optString("mimeType", null);
            if (optString3 == null) {
                optString3 = jSONObject2.optString("contentType", null);
            }
            String str4 = optString3;
            String optString4 = jSONObject2.optString("title", null);
            JSONObject optJSONObject = jSONObject2.optJSONObject("customData");
            String optString5 = jSONObject2.optString("contentId", null);
            String optString6 = jSONObject2.optString("posterUrl", null);
            long j4 = -1;
            if (jSONObject2.has(str2)) {
                j2 = j3;
                double intValue = (double) ((Integer) jSONObject2.get(str2)).intValue();
                Double.isNaN(intValue);
                j4 = (long) (intValue * 1000.0d);
            } else {
                j2 = j3;
            }
            String optString7 = jSONObject2.optString("hlsSegmentFormat", null);
            bns a2 = bns.a(jSONObject2.optJSONObject("vastAdsRequest"));
            if (optJSONObject != null) {
                if (optJSONObject.length() != 0) {
                    str = optJSONObject.toString();
                    bnd bnd = new bnd(string, optString4, j2, optString2, str4, optString, str, optString5, optString6, j4, optString7, a2);
                    return bnd;
                }
            }
            str = null;
            bnd bnd2 = new bnd(string, optString4, j2, optString2, str4, optString, str, optString5, optString6, j4, optString7, a2);
            return bnd2;
        } catch (JSONException e2) {
            String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", new Object[]{e2.getMessage()});
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.a(parcel, 3, this.b, false);
        bxg.a(parcel, 4, this.c);
        bxg.a(parcel, 5, this.d, false);
        bxg.a(parcel, 6, this.e, false);
        bxg.a(parcel, 7, this.f, false);
        bxg.a(parcel, 8, this.g, false);
        bxg.a(parcel, 9, this.h, false);
        bxg.a(parcel, 10, this.i, false);
        bxg.a(parcel, 11, this.j);
        bxg.a(parcel, 12, this.k, false);
        bxg.a(parcel, 13, (Parcelable) this.l, i2, false);
        bxg.b(parcel, a2);
    }
}
