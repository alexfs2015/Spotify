package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: eib reason: default package */
public final class eib extends bxw {
    public static final Creator<eib> CREATOR = new eid();
    double a;
    boolean b;
    int c;
    bnx d;
    int e;
    bro f;
    double g;

    public eib() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }

    eib(double d2, boolean z, int i, bnx bnx, int i2, bro bro, double d3) {
        this.a = d2;
        this.b = z;
        this.c = i;
        this.d = bnx;
        this.e = i2;
        this.f = bro;
        this.g = d3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eib)) {
            return false;
        }
        eib eib = (eib) obj;
        if (this.a == eib.a && this.b == eib.b && this.c == eib.c && eic.a(this.d, eib.d) && this.e == eib.e) {
            bro bro = this.f;
            return eic.a(bro, bro) && this.g == eib.g;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.g)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a);
        bxx.a(parcel, 3, this.b);
        bxx.b(parcel, 4, this.c);
        bxx.a(parcel, 5, (Parcelable) this.d, i, false);
        bxx.b(parcel, 6, this.e);
        bxx.a(parcel, 7, (Parcelable) this.f, i, false);
        bxx.a(parcel, 8, this.g);
        bxx.b(parcel, a2);
    }
}
