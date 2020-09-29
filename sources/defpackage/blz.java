package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: blz reason: default package */
public final class blz extends bxf {
    public static final Creator<blz> CREATOR = new bmc();
    public int a;
    private final int b;
    private Bundle c;

    blz(int i, int i2, Bundle bundle) {
        this.b = i;
        this.a = i2;
        this.c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.b);
        bxg.b(parcel, 2, this.a);
        bxg.a(parcel, 3, this.c, false);
        bxg.b(parcel, a2);
    }
}
