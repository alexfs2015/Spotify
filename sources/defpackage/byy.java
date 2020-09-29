package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@Deprecated
/* renamed from: byy reason: default package */
public final class byy extends bxf {
    public static final Creator<byy> CREATOR = new byz();
    private final int a;

    byy(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.a);
        bxg.b(parcel, a2);
    }
}
