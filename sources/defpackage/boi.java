package defpackage;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: boi reason: default package */
public final class boi extends bxw {
    public static final Creator<boi> CREATOR = new brz();
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

    public boi() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    boi(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, int i9, int i10, String str2) {
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
        if (!(obj instanceof boi)) {
            return false;
        }
        boi boi = (boi) obj;
        if ((this.l == null) != (boi.l == null)) {
            return false;
        }
        JSONObject jSONObject = this.l;
        if (jSONObject != null) {
            JSONObject jSONObject2 = boi.l;
            if (jSONObject2 != null && !cae.a(jSONObject, jSONObject2)) {
                return false;
            }
        }
        return this.a == boi.a && this.b == boi.b && this.c == boi.c && this.d == boi.d && this.e == boi.e && this.f == boi.f && this.h == boi.h && eic.a(this.i, boi.i) && this.j == boi.j && this.k == boi.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, Integer.valueOf(this.j), Integer.valueOf(this.k), String.valueOf(this.l)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.l;
        this.m = jSONObject == null ? null : jSONObject.toString();
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a);
        bxx.b(parcel, 3, this.b);
        bxx.b(parcel, 4, this.c);
        bxx.b(parcel, 5, this.d);
        bxx.b(parcel, 6, this.e);
        bxx.b(parcel, 7, this.f);
        bxx.b(parcel, 8, this.g);
        bxx.b(parcel, 9, this.h);
        bxx.a(parcel, 10, this.i, false);
        bxx.b(parcel, 11, this.j);
        bxx.b(parcel, 12, this.k);
        bxx.a(parcel, 13, this.m, false);
        bxx.b(parcel, a2);
    }
}
