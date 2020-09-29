package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: byj reason: default package */
public final class byj extends bxf {
    public static final Creator<byj> CREATOR = new byk();
    Bundle a;
    brw[] b;

    byj(Bundle bundle, brw[] brwArr) {
        this.a = bundle;
        this.b = brwArr;
    }

    public byj() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 1, this.a, false);
        bxg.a(parcel, 2, (T[]) this.b, i, false);
        bxg.b(parcel, a2);
    }
}
