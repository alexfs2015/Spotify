package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: brm reason: default package */
public final class brm extends bxw {
    public static final Creator<brm> CREATOR = new brl();
    private final float a;
    private final float b;
    private final float c;

    public brm(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brm)) {
            return false;
        }
        brm brm = (brm) obj;
        return this.a == brm.a && this.b == brm.b && this.c == brm.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a);
        bxx.a(parcel, 3, this.b);
        bxx.a(parcel, 4, this.c);
        bxx.b(parcel, a2);
    }
}
