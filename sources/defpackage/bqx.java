package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: bqx reason: default package */
public final class bqx extends bxf {
    public static final Creator<bqx> CREATOR = new bqw();
    private final bqv a;
    private final bqv b;

    public bqx(bqv bqv, bqv bqv2) {
        this.a = bqv;
        this.b = bqv2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqx)) {
            return false;
        }
        bqx bqx = (bqx) obj;
        return ehl.a(this.a, bqx.a) && ehl.a(this.b, bqx.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, (Parcelable) this.a, i, false);
        bxg.a(parcel, 3, (Parcelable) this.b, i, false);
        bxg.b(parcel, a2);
    }
}
