package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cey
/* renamed from: cgz reason: default package */
public final class cgz extends bxf {
    public static final Creator<cgz> CREATOR = new cha();
    String a;

    public cgz(String str) {
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.b(parcel, a2);
    }
}
