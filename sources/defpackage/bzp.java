package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@Deprecated
/* renamed from: bzp reason: default package */
public final class bzp extends bxw {
    public static final Creator<bzp> CREATOR = new bzq();
    private final int a;

    bzp(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.a);
        bxx.b(parcel, a2);
    }
}
