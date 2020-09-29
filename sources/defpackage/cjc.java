package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@cey
/* renamed from: cjc reason: default package */
public final class cjc extends bxf {
    public static final Creator<cjc> CREATOR = new cjd();
    public final doy a;
    public final String b;

    public cjc(doy doy, String str) {
        this.a = doy;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, (Parcelable) this.a, i, false);
        bxg.a(parcel, 3, this.b, false);
        bxg.b(parcel, a2);
    }
}
