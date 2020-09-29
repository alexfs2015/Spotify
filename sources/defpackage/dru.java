package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cey
/* renamed from: dru reason: default package */
public final class dru extends bxf {
    public static final Creator<dru> CREATOR = new drv();
    public final String a;

    dru(String str) {
        this.a = str;
    }

    public dru(blh blh) {
        this.a = blh.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 15, this.a, false);
        bxg.b(parcel, a2);
    }
}
