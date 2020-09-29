package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cfp
/* renamed from: eff reason: default package */
public final class eff extends bxw {
    public static final Creator<eff> CREATOR = new efg();
    private final int a;
    private final int b;
    private final int c;

    eff(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static eff a(cvw cvw) {
        return new eff(cvw.a, cvw.b, cvw.c);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        String str = ".";
        sb.append(str);
        sb.append(i2);
        sb.append(str);
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.a);
        bxx.b(parcel, 2, this.b);
        bxx.b(parcel, 3, this.c);
        bxx.b(parcel, a2);
    }
}
