package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cey
/* renamed from: eeo reason: default package */
public final class eeo extends bxf {
    public static final Creator<eeo> CREATOR = new eep();
    private final int a;
    private final int b;
    private final int c;

    eeo(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static eeo a(cvf cvf) {
        return new eeo(cvf.a, cvf.b, cvf.c);
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
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.a);
        bxg.b(parcel, 2, this.b);
        bxg.b(parcel, 3, this.c);
        bxg.b(parcel, a2);
    }
}
