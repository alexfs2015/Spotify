package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bmq reason: default package */
public final class bmq extends bxw {
    public static final Creator<bmq> CREATOR = new bmt();
    public int a;
    private final int b;
    private Bundle c;

    bmq(int i, int i2, Bundle bundle) {
        this.b = i;
        this.a = i2;
        this.c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.b);
        bxx.b(parcel, 2, this.a);
        bxx.a(parcel, 3, this.c, false);
        bxx.b(parcel, a2);
    }
}
