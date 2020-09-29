package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cfp
/* renamed from: chq reason: default package */
public final class chq extends bxw {
    public static final Creator<chq> CREATOR = new chr();
    String a;

    public chq(String str) {
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.b(parcel, a2);
    }
}
