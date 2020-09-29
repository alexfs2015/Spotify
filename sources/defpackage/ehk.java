package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: ehk reason: default package */
public final class ehk extends bxf {
    public static final Creator<ehk> CREATOR = new ehm();
    double a;
    boolean b;
    int c;
    bng d;
    int e;
    bqx f;
    double g;

    ehk(double d2, boolean z, int i, bng bng, int i2, bqx bqx, double d3) {
        this.a = d2;
        this.b = z;
        this.c = i;
        this.d = bng;
        this.e = i2;
        this.f = bqx;
        this.g = d3;
    }

    public ehk() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ehk)) {
            return false;
        }
        ehk ehk = (ehk) obj;
        if (this.a == ehk.a && this.b == ehk.b && this.c == ehk.c && ehl.a(this.d, ehk.d) && this.e == ehk.e) {
            bqx bqx = this.f;
            return ehl.a(bqx, bqx) && this.g == ehk.g;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.g)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a);
        bxg.a(parcel, 3, this.b);
        bxg.b(parcel, 4, this.c);
        bxg.a(parcel, 5, (Parcelable) this.d, i, false);
        bxg.b(parcel, 6, this.e);
        bxg.a(parcel, 7, (Parcelable) this.f, i, false);
        bxg.a(parcel, 8, this.g);
        bxg.b(parcel, a2);
    }
}
