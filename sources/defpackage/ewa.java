package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ewa reason: default package */
public final class ewa extends bxw {
    public static final Creator<ewa> CREATOR = new ewb();
    public final String a;
    public final long b;
    public final String c;
    private final int d;
    private final Long e;
    private final Float f;
    private final String g;
    private final Double h;

    ewa(int i, String str, long j, Long l, Float f2, String str2, String str3, Double d2) {
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

    ewa(ewc ewc) {
        this(ewc.c, ewc.d, ewc.e, ewc.b);
    }

    ewa(String str, long j, Object obj, String str2) {
        bxo.a(str);
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
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.d);
        bxx.a(parcel, 2, this.a, false);
        bxx.a(parcel, 3, this.b);
        Long l = this.e;
        if (l != null) {
            bxx.a(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        bxx.a(parcel, 6, this.g, false);
        bxx.a(parcel, 7, this.c, false);
        Double d2 = this.h;
        if (d2 != null) {
            bxx.a(parcel, 8, 8);
            parcel.writeDouble(d2.doubleValue());
        }
        bxx.b(parcel, a2);
    }
}
