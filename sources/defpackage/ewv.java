package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ewv reason: default package */
public final class ewv extends bxf {
    public static final Creator<ewv> CREATOR = new eww();
    private final int a;
    private final bwy b;

    ewv(int i, bwy bwy) {
        this.a = i;
        this.b = bwy;
    }

    public ewv(bwy bwy) {
        this(1, bwy);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.a);
        bxg.a(parcel, 2, (Parcelable) this.b, i, false);
        bxg.b(parcel, a2);
    }
}
