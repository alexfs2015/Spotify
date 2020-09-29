package defpackage;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bnr reason: default package */
public final class bnr extends bxf {
    public static final Creator<bnr> CREATOR = new bri();
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public int j;
    public int k;
    public JSONObject l;
    private String m;

    bnr(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, int i9, int i10, String str2) {
        this.a = f2;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = str;
        this.j = i9;
        this.k = i10;
        this.m = str2;
        String str3 = this.m;
        if (str3 != null) {
            try {
                this.l = new JSONObject(str3);
            } catch (JSONException unused) {
                this.l = null;
                this.m = null;
            }
        } else {
            this.l = null;
        }
    }

    public bnr() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public static int a(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnr)) {
            return false;
        }
        bnr bnr = (bnr) obj;
        if ((this.l == null) != (bnr.l == null)) {
            return false;
        }
        JSONObject jSONObject = this.l;
        if (jSONObject != null) {
            JSONObject jSONObject2 = bnr.l;
            if (jSONObject2 != null && !bzn.a(jSONObject, jSONObject2)) {
                return false;
            }
        }
        return this.a == bnr.a && this.b == bnr.b && this.c == bnr.c && this.d == bnr.d && this.e == bnr.e && this.f == bnr.f && this.h == bnr.h && ehl.a(this.i, bnr.i) && this.j == bnr.j && this.k == bnr.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, Integer.valueOf(this.j), Integer.valueOf(this.k), String.valueOf(this.l)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.l;
        this.m = jSONObject == null ? null : jSONObject.toString();
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a);
        bxg.b(parcel, 3, this.b);
        bxg.b(parcel, 4, this.c);
        bxg.b(parcel, 5, this.d);
        bxg.b(parcel, 6, this.e);
        bxg.b(parcel, 7, this.f);
        bxg.b(parcel, 8, this.g);
        bxg.b(parcel, 9, this.h);
        bxg.a(parcel, 10, this.i, false);
        bxg.b(parcel, 11, this.j);
        bxg.b(parcel, 12, this.k);
        bxg.a(parcel, 13, this.m, false);
        bxg.b(parcel, a2);
    }
}
