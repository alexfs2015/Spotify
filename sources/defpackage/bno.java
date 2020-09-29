package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bno reason: default package */
public final class bno extends bxf {
    public static final Creator<bno> CREATOR = new bre();
    public MediaInfo a;
    public int b;
    double c;
    double d;
    double e;
    private boolean f;
    private long[] g;
    private String h;
    private JSONObject i;

    /* renamed from: bno$a */
    public static class a {
        private final bno a;

        public a(MediaInfo mediaInfo) {
            this.a = new bno(mediaInfo, 0);
        }

        public a(JSONObject jSONObject) {
            this.a = new bno(jSONObject);
        }

        public final bno a() {
            bno bno = this.a;
            if (bno.a == null) {
                throw new IllegalArgumentException("media cannot be null.");
            } else if (!Double.isNaN(bno.c) && bno.c < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            } else if (Double.isNaN(bno.d)) {
                throw new IllegalArgumentException("playbackDuration cannot be NaN.");
            } else if (!Double.isNaN(bno.e) && bno.e >= 0.0d) {
                return this.a;
            } else {
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
        }
    }

    bno(MediaInfo mediaInfo, int i2, boolean z, double d2, double d3, double d4, long[] jArr, String str) {
        this.c = Double.NaN;
        this.a = mediaInfo;
        this.b = i2;
        this.f = z;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.g = jArr;
        this.h = str;
        String str2 = this.h;
        if (str2 != null) {
            try {
                this.i = new JSONObject(str2);
            } catch (JSONException unused) {
                this.i = null;
                this.h = null;
            }
        } else {
            this.i = null;
        }
    }

    private bno(MediaInfo mediaInfo) {
        this(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    bno(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        a(jSONObject);
    }

    public final boolean a(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        long[] jArr;
        String str = "media";
        boolean z3 = false;
        if (jSONObject.has(str)) {
            this.a = new MediaInfo(jSONObject.getJSONObject(str));
            z = true;
        } else {
            z = false;
        }
        String str2 = "itemId";
        if (jSONObject.has(str2)) {
            int i2 = jSONObject.getInt(str2);
            if (this.b != i2) {
                this.b = i2;
                z = true;
            }
        }
        String str3 = "autoplay";
        if (jSONObject.has(str3)) {
            boolean z4 = jSONObject.getBoolean(str3);
            if (this.f != z4) {
                this.f = z4;
                z = true;
            }
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) == Double.isNaN(this.c) && (Double.isNaN(optDouble) || Math.abs(optDouble - this.c) <= 1.0E-7d)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            this.c = optDouble;
            z = true;
        }
        String str4 = "playbackDuration";
        if (jSONObject.has(str4)) {
            double d2 = jSONObject.getDouble(str4);
            if (Math.abs(d2 - this.d) > 1.0E-7d) {
                this.d = d2;
                z = true;
            }
        }
        String str5 = "preloadTime";
        if (jSONObject.has(str5)) {
            double d3 = jSONObject.getDouble(str5);
            if (Math.abs(d3 - this.e) > 1.0E-7d) {
                this.e = d3;
                z = true;
            }
        }
        String str6 = "activeTrackIds";
        if (jSONObject.has(str6)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str6);
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i3 = 0; i3 < length; i3++) {
                jArr[i3] = jSONArray.getLong(i3);
            }
            long[] jArr2 = this.g;
            if (jArr2 != null && jArr2.length == length) {
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    } else if (this.g[i4] != jArr[i4]) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            z3 = true;
        } else {
            jArr = null;
        }
        if (z3) {
            this.g = jArr;
            z = true;
        }
        String str7 = "customData";
        if (!jSONObject.has(str7)) {
            return z;
        }
        this.i = jSONObject.getJSONObject(str7);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bno)) {
            return false;
        }
        bno bno = (bno) obj;
        if ((this.i == null) != (bno.i == null)) {
            return false;
        }
        JSONObject jSONObject = this.i;
        if (jSONObject != null) {
            JSONObject jSONObject2 = bno.i;
            if (jSONObject2 != null && !bzn.a(jSONObject, jSONObject2)) {
                return false;
            }
        }
        return ehl.a(this.a, bno.a) && this.b == bno.b && this.f == bno.f && ((Double.isNaN(this.c) && Double.isNaN(bno.c)) || this.c == bno.c) && this.d == bno.d && this.e == bno.e && Arrays.equals(this.g, bno.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.f), Double.valueOf(this.c), Double.valueOf(this.d), Double.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.g)), String.valueOf(this.i)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.i;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, (Parcelable) this.a, i2, false);
        bxg.b(parcel, 3, this.b);
        bxg.a(parcel, 4, this.f);
        bxg.a(parcel, 5, this.c);
        bxg.a(parcel, 6, this.d);
        bxg.a(parcel, 7, this.e);
        bxg.a(parcel, 8, this.g, false);
        bxg.a(parcel, 9, this.h, false);
        bxg.b(parcel, a2);
    }

    /* synthetic */ bno(MediaInfo mediaInfo, byte b2) {
        this(mediaInfo);
    }
}
