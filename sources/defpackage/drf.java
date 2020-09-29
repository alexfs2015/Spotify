package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cey
/* renamed from: drf reason: default package */
public final class drf extends bxf {
    public static final Creator<drf> CREATOR = new drg();
    public final int a;

    public drf(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 2, this.a);
        bxg.b(parcel, a2);
    }
}
