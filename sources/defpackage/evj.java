package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: evj reason: default package */
public final class evj extends bxf {
    public static final Creator<evj> CREATOR = new evk();
    public final String a;
    public final long b;
    public final String c;
    private final int d;
    private final Long e;
    private final Float f;
    private final String g;
    private final Double h;

    evj(evl evl) {
        this(evl.c, evl.d, evl.e, evl.b);
    }

    evj(String str, long j, Object obj, String str2) {
        bwx.a(str);
        this.d = 2;
        this.a = str;
        this.b = j;
        this.c = str2;
        if (obj == null) {
            this.e = null;
            this.f = null;
            this.h = null;
            this.g = null;
        } else if (obj instanceof Long) {
            this.e = (Long) obj;
            this.f = null;
            this.h = null;
            this.g = null;
        } else if (obj instanceof String) {
            this.e = null;
            this.f = null;
            this.h = null;
            this.g = (String) obj;
        } else if (obj instanceof Double) {
            this.e = null;
            this.f = null;
            this.h = (Double) obj;
            this.g = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    evj(int i, String str, long j, Long l, Float f2, String str2, String str3, Double d2) {
        this.d = i;
        this.a = str;
        this.b = j;
        this.e = l;
        Double d3 = null;
        this.f = null;
        if (i == 1) {
            if (f2 != null) {
                d3 = Double.valueOf(f2.doubleValue());
            }
            this.h = d3;
        } else {
            this.h = d2;
        }
        this.g = str2;
        this.c = str3;
    }

    public final Object a() {
        Long l = this.e;
        if (l != null) {
            return l;
        }
        Double d2 = this.h;
        if (d2 != null) {
            return d2;
        }
        String str = this.g;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.d);
        bxg.a(parcel, 2, this.a, false);
        bxg.a(parcel, 3, this.b);
        Long l = this.e;
        if (l != null) {
            bxg.a(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        bxg.a(parcel, 6, this.g, false);
        bxg.a(parcel, 7, this.c, false);
        Double d2 = this.h;
        if (d2 != null) {
            bxg.a(parcel, 8, 8);
            parcel.writeDouble(d2.doubleValue());
        }
        bxg.b(parcel, a2);
    }
}
