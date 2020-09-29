package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: bqv reason: default package */
public final class bqv extends bxf {
    public static final Creator<bqv> CREATOR = new bqu();
    private final float a;
    private final float b;
    private final float c;

    public bqv(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqv)) {
            return false;
        }
        bqv bqv = (bqv) obj;
        return this.a == bqv.a && this.b == bqv.b && this.c == bqv.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a);
        bxg.a(parcel, 3, this.b);
        bxg.a(parcel, 4, this.c);
        bxg.b(parcel, a2);
    }
}
